grammar PAFGrammar;

instructions returns [Instructions instrs]:
	a=instruction END {$instrs=new Instructions(new Instruction($a.instr));}
	| b=instruction END c=instructions {$instrs=new Instructions(new Instruction($b.instr),new Instructions($c.instrs));};
	
instruction returns [Instruction instr]:
	a=if_condition {$instr=new Instruction(new Condition($a.cond));}
	| b=for_loop {$instr=new Instruction(new For_loop($b.for);}
	| c=while_loop {$instr=new Instruction(new While_loop($c.while));}
	| d=dowhile_loop {$instr=new Instruction(new Dowhile_loop($d.dowhile));}
	| e=assigning {$instr=new Instruction(new Assigning($e.var));}
	| f=operation1 {$instr=new Instruction(new Operation($f.op));};
	
operation1 returns [Operation op]:
	a=operation2 {$op=new Operation($a.op);}
	| b=operation2 p=PLUS c=operation1 {$op=new Operation(new Operation($b.op),new Operation($c.op),$p.text);}
	| d=operation2 m=MINUS e=operation1 {$op=new Operation(new Operation($d.op),new Operation($e.op),$m.text);};
	
operation2 returns [Operation op]:
	a=term {$op=new Operation($a.tm);}
	| b=term t=TIMES c=operation2 {$op=new Operation(new Term($b.tm),new Operation($c.op),$t.text);};
	
term returns [Term tm]:
	lp=LP a=operation1 rp=RP {$tm=new Term(new Operation($a.op),$lp.text,$rp.text);}
	| n=Number {$tm=new Term($n.text);}
	| m=MINUS n=Number {$tm=new Term($n.text,$m.text);}
	| v=Variable {$tm=new Term($v.text);};
	
if_condition returns [Condition cond]:
	IF LP a=bool RP THEN Dollar b=instructions Dollar {$cond=new Condition(new Bool($a.value),new Instructions($b.instrs));}
	| IF LP c=bool RP THEN Dollar d=instructions Dollar e=else_condition  {$cond=new Condition(new Bool($c.value),new Instructions($d.instrs),new Condition($e.cond));};

else_condition returns [Condition cond]:
	ELSE LB a=instructions RB {$cond=new Condition(new Instructions($a.instrs));};
	
while_loop returns [While_loop while]:
	WHILE LP a=bool RP Dollar b=instructions Dollar {$while=new While_loop(new Bool($a.value),new Instructions($b.instrs));};
	
dowhile_loop returns [Dowhile_loop dowhile]:
	DO Dollar a=instructions Dollar WHILE LP b=bool RP {$dowhile=new Dowhile_loop(new Bool($b.value),new Instructions($a.instrs));};

for_loop returns [For_loop for]:
	FOR LP a=assigning '/' b=bool '/' c=Number RP Dollar d=instructions Dollar {$for=new For_loop(new Bool($b.value),new Assigning($a.var),$c.text,new Instructions($d.instrs));};

assigning returns [Assigning var]:
	a=Variable EQ b=operation1 {$var=new Assigning($a.text,new Operation($b.op));}
	| c=Variable EQ d=bool {$var=new Assigning($c.text,new Bool($d.value));};

bool returns [Bool value]:
	a=Boolean {$value=new Bool($a.text);}
	| b=operation1 c=Operator d=operation1 {$value=new Bool(new Operation($b.op),new Operation($d.op),$c.text);}
	| e=Variable f=Operator g=operation1 {$value=new Bool($e.text,new Operation($g.op),$f.text);}; 

Dollar : '$';
Number : [0-9]+;
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
WS : [ \t\r\n]+ -> skip ;
