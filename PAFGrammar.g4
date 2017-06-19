grammar PAFGrammar;

s : Instructions;

Dollar : '$';
Number : '-'?[0-9]+;
fragment String : [A-Za-z0-9]*;
Variable : [A-Za-z][A-Za-z0-9]*;
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



Instructions : Instruction END
       | Instruction END Instructions;
Instruction : If_condition
       | While_loop
       | For_loop
       | Assigning
       | Operation1;
Operation1  : Operation2
       | Operation2 '+' Operation1
       | Operation2 '-' Operation1;
Operation2 : Term
       | Term '*' Operation2;
Term : LP Operation1 RP
       | Number
       | Variable;
If_condition : IF LP Condition RP THEN Dollar Instructions Dollar (Else_condition?);
Else_condition : ELSE LB Instructions RB;
While_loop : WHILE LP Condition RP Dollar Instructions Dollar;
Dowhile_loop : DO Dollar Instructions Dollar WHILE LP Condition RP;
For_loop : FOR LP  Assigning '/' Condition '/' Assigning RP Dollar Instructions Dollar;
Assigning : Variable EQ Operation1
       | Variable EQ Boolean;
Condition : Operation1 Operator Operation2
       | Operation1 Operator Boolean;
