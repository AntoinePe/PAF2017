grammar PAFGrammar;

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
NEG : '-';
Number : [0-9]+;
fragment String : [A-Za-z0-9]*;
Variable : [A-Za-z] String;

instructions : instruction END
       | instruction END instructions;
instruction : if_condition
       | while_loop
       | for_loop
       | assigning
       | dowhile_loop
       | operation1;
operation1  : operation2
       | operation2 PLUS operation1
       | operation2 MINUS operation1;
operation2 : term
       | term TIMES operation2;
term : LP operation1 RP
       | Number
       | MINUS Number
       | Variable;
if_condition : IF LP condition RP THEN Dollar instructions Dollar (else_condition?);
else_condition : ELSE LB instructions RB;
while_loop : WHILE LP condition RP Dollar instructions Dollar;
dowhile_loop : DO Dollar instructions Dollar WHILE LP condition RP;
for_loop : FOR LP  assigning '/' condition '/' assigning RP Dollar instructions Dollar;
assigning : Variable EQ operation1
       | Variable EQ Boolean;
condition : operation1 Operator operation1
       | operation1 Operator Boolean;
