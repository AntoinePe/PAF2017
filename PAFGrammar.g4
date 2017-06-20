grammar PAFGrammar;

instructions returns [Instructions instrs]:
	a=instruction END {$instrs=new Instructions($a.instr);}
	| b=instruction END c=instructions {$instrs=new Instructions($b.instr,$c.instrs);};
	
instruction returns [Instruction instr]:
	a=if_condition {$instr=new Instruction($a.cond);}
	| b=for_loop {$instr=new Instruction($b.forLoop);}
	| c=while_loop {$instr=new Instruction($c.whileLoop);}
	| d=dowhile_loop {$instr=new Instruction($d.dowhileLoop);}
	| e=assigning {$instr=new Instruction($e.var);}
	| f=operation1 {$instr=new Instruction($f.op);};
	
operation1 returns [Operation op]:
	a=operation2 {$op=$a.op;}
	| b=operation2 p=PLUS c=operation1 {$op=new Operation($b.op,$c.op,$p.text);}
	| d=operation2 m=MINUS e=operation1 {$op=new Operation($d.op,$e.op,$m.text);};
	
operation2 returns [Operation op]:
	a=term {$op=new Operation($a.tm);}
	| b=term t=TIMES c=operation2 {$op=new Operation($b.tm,$c.op,$t.text);};
	
term returns [Term tm]:
	lp=LP a=operation1 rp=RP {$tm=new Term($a.op,$lp.text,$rp.text);}
	| n=Number {$tm=new Term($n.text);}
	| m=MINUS n=Number {$tm=new Term($n.text,$m.text);}
	| v=Variable {$tm=new Term(new Variable($v.text));};
	
if_condition returns [Condition cond]:
	IF LP a=bool RP THEN Dollar b=instructions Dollar {$cond=new Condition($a.value,$b.instrs);}
	| IF LP c=bool RP THEN Dollar d=instructions Dollar e=else_condition  {$cond=new Condition($c.value,$d.instrs,$e.cond);};

else_condition returns [Condition cond]:
	ELSE LB a=instructions RB {$cond=new Condition($a.instrs);};
	
while_loop returns [While_loop whileLoop]:
	WHILE LP a=bool RP Dollar b=instructions Dollar {$whileLoop=new While_loop($a.value,$b.instrs);};
	
dowhile_loop returns [Dowhile_loop dowhileLoop]:
	DO Dollar a=instructions Dollar WHILE LP b=bool RP {$dowhileLoop=new Dowhile_loop($b.value,$a.instrs);};

for_loop returns [For_loop forLoop]:
	FOR LP a=assigning '/' b=bool '/' c=Number RP Dollar d=instructions Dollar {$forLoop=new For_loop($b.value,$a.var,$c.text,$d.instrs);};

assigning returns [Assigning var]:
	a=Variable EQ b=operation1 {$var=new Assigning(new Variable($a.text),$b.op);}
	| c=Variable EQ d=bool {$var=new Assigning(new Variable($c.text),$d.value);};

bool returns [Bool value]:
	a=Boolean {$value=new Bool($a.text);}
	| b=operation1 c=Operator d=operation1 {$value=new Bool($b.op,$d.op,$c.text);}
	| e=Variable f=Operator g=operation1 {$value=new Bool(new Variable($e.text),$g.op,$f.text);}; 

Dollar : '$';
Boolean : 'True' | 'False';
Operator : EQ EQ | NOT EQ | INF | INF EQ | SUP | SUP EQ;
LB : '[';
RB : ']';
LP : '(';
RP : ')';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
DO : 'do';
FOR : 'for';
THEN : 'then';
AND : '&';
OR : '||';
NOT : '!';
END : ';';
EQ : '=';
INF : '<';
SUP : '>';
PLUS : '+';
MINUS : '-';
TIMES : '*';
Variable : [A-Za-z][A-Za-z0-9]*;
Number : [0-9]+;
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) -> skip
    ;
