grammar PAFGrammar;

functions returns [Functions funcs]:
	a=function END {$funcs=new Functions($a.func);}
	| b=function END c=functions EOF {$funcs=new Functions($b.func,$c.funcs);};

function returns [Function func]:
	DEFINE VOID a=Variable LP RP Dollar b=instructions Dollar {$func=new Function($a.text,$b.instrs);}
	| DEFINE c=RETURNTYPES d=Variable LP RP Dollar e=instructions RETURN f=(Variable | Number) END Dollar {$func=new Function($d.text,$c.text,$e.instrs,$f.text);}
	| DEFINE VOID f=Variable LP g=parameters2 RP Dollar h=instructions Dollar {$func=new Function($f.text,$h.instrs,$g.param);}
	| DEFINE i=RETURNTYPES j=Variable LP k=parameters2 RP Dollar l=instructions RETURN m=(Variable | Number) END Dollar {$func=new Function($j.text,$i.text,$l.instrs,$m.text,$k.param);};
	
call_function returns [CallFunction funcCall]:
	a=Variable LP RP {$funcCall=new CallFunction($a.text);}
	| b=Variable LP c=parameters RP {$funcCall=new CallFunction($b.text,$c.param);};
	
parameters returns [Parameter param]:
	a=operation1 {$param=new Parameter($a.op);}
	| b=operation1 COMMA c=parameters {$param=new Parameter($b.op,$c.param);};
	
parameters2 returns [Parameter2 param]:
	a=RETURNTYPES b=Variable {$param=new Parameter2(new Variable($b.text),$a.text);}
	| c=RETURNTYPES d=Variable COMMA e=parameters2 {$param=new Parameter2(new Variable($d.text),$c.text,$e.param);};

instructions returns [Instructions instrs]:
	a=instruction END {$instrs=new Instructions($a.instr);}
	| b=instruction END c=instructions {$instrs=new Instructions($b.instr,$c.instrs);};
	
instruction returns [Instruction instr]:
	a=if_condition {$instr=new Instruction($a.cond);}
	| b=for_loop {$instr=new Instruction($b.forLoop);}
	| c=while_loop {$instr=new Instruction($c.whileLoop);}
	| d=dowhile_loop {$instr=new Instruction($d.dowhileLoop);}
	| e=assigning {$instr=new Instruction($e.var);}
	| PRINT POPERATOR f=operation1 {$instr=new Instruction($f.op);}
	| SCAN SOPERATOR g=String SOPERATOR h=Variable {$instr=new Instruction($g.text,$h.text);};
	
operation1 returns [Operation op]:
	a=operation2 {$op=$a.op;}
	| b=operation1 p=PLUS c=term {$op=new Operation($c.tm,$b.op,$p.text);}
	| d=operation1 m=MINUS e=term {$op=new Operation($e.tm,$d.op,$m.text);};
	
operation2 returns [Operation op]:
	a=term {$op=new Operation($a.tm);}
	| c=operation2 t=TIMES b=term {$op=new Operation($b.tm,$c.op,$t.text);}
	| f=operation2 e=DIV d=term {$op=new Operation($d.tm,$f.op,$e.text);}
	| i=operation2 h=REM g=term {$op=new Operation($g.tm,$i.op,$h.text);};
	
term returns [Term tm]:
	lp=LP a=operation1 rp=RP {$tm=new Term($a.op,$lp.text,$rp.text);}
	| n=Number {$tm=new Term($n.text);}
	| m=MINUS n=Number {$tm=new Term($n.text,$m.text);}
	| o=call_function {$tm=new Term($o.funcCall);}
	| v=Variable {$tm=new Term(new Variable($v.text));}
	| LB b=bool QUES c=term QUES d=term RB {$tm=new Term($b.value,$c.tm,$d.tm);};
	
if_condition returns [Condition cond]:
	IF a=bool THEN Dollar b=instructions Dollar {$cond=new Condition($a.value,$b.instrs);}
	| IF c=bool THEN Dollar d=instructions Dollar e=else_condition  {$cond=new Condition($c.value,$d.instrs,$e.cond);};

else_condition returns [Condition cond]:
	ELSE Dollar a=instructions Dollar {$cond=new Condition($a.instrs);}
	| ELIF b=bool THEN Dollar c=instructions Dollar d=else_condition {$cond=new Condition($b.value,$c.instrs,$d.cond);};
	
while_loop returns [While_loop whileLoop]:
	WHILE a=bool  Dollar b=instructions Dollar {$whileLoop=new While_loop($a.value,$b.instrs);};
	
dowhile_loop returns [Dowhile_loop dowhileLoop]:
	DO Dollar a=instructions Dollar WHILE b=bool {$dowhileLoop=new Dowhile_loop($b.value,$a.instrs);};

for_loop returns [For_loop forLoop]:
	FOR LP a=assigning SLASH b=bool SLASH c=assigning RP Dollar d=instructions Dollar {$forLoop=new For_loop($b.value,$a.var,$c.var,$d.instrs);};

assigning returns [Assigning var]:
	a=Variable AOPERATOR b=operation1 {$var=new Assigning(new Variable($a.text),$b.op);}
	| c=Variable AOPERATOR d=bool {$var=new Assigning(new Variable($c.text),$d.value);}
	| n=AUTO e=Variable AOPERATOR LB RB Dollar f=instructions RETURN r=(Variable | Number) END Dollar {$var=new Assigning(new Function($e.text,$n.text,$f.instrs,$r.text));}
	| m=AUTO g=Variable AOPERATOR LB RB LP h=parameters2 RP Dollar i=instructions RETURN q=(Variable | Number) END Dollar {$var=new Assigning(new Function($g.text,$m.text,$i.instrs,$q.text,$h.param));}|
	| STRING k=Variable AOPERATOR l=String {$var=new Assigning(new Variable($k.text),$l.text);}
	| STRING o=Variable {$var=new Assigning(new Variable($o.text));};

bool returns [Bool value]:
	LP? a=Boolean RP? {$value=new Bool($a.text);}
	| LP b=operation1 c=Operator d=operation1 RP {$value=new Bool($b.op,$d.op,$c.text);}
	| LP e=Variable f=Operator g=operation1 RP {$value=new Bool(new Variable($e.text),$g.op,$f.text);}; 

Dollar : '$';
Boolean : 'True' | 'False';
Operator : EQ EQ | NOT EQ | INF | INF EQ | SUP | SUP EQ;
SLASH : '/';
LB : '[';
RB : ']';
LP : '(';
RP : ')';
PRINT : 'print';
SCAN : 'scan';
POPERATOR : '<<';
SOPERATOR : '>>';
AOPERATOR : '<-';
QUES : '?';
IF : 'if';
ELSE : 'else';
ELIF : 'elif';
WHILE : 'while';
DO : 'do';
FOR : 'for';
THEN : 'then';
AND : '&';
OR : '||';
NOT : '!';
END : ';';
COMMA : ',';
EQ : '=';
INF : '<';
SUP : '>';
PLUS : '+';
MINUS : '-';
TIMES : '*';
DIV : ':';
REM : '%';
VOID : 'void';
RETURNTYPES : INTEGER;
INTEGER : 'integer';
STRING : 'String';
DEFINE : 'define';
RETURN : 'return';
AUTO : 'auto';
Variable : [A-Za-z][A-Za-z0-9]*;
String : '"' ([A-Za-z0-9] | ' ' | ',' | ':' | '?' | '!' | ';' | '%')* '"';
Number : [0-9]+;
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) -> skip
    ;
