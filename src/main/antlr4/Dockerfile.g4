grammar Dockerfile;

fromLine     : FROM image (':' imageTag | '@' imageDigest)? (AS imageName)?;

image    : Identifier;
imageTag     : Identifier;
imageDigest  : LetterOrDigit+;
imageName    : Identifier;

FROM : F R O M;
AS   : A S;

WS : [ \t\r\n] -> skip;

fragment
Letter : ('a'..'z'|'A'..'Z');

fragment
Digit : ('0'..'9');

LetterOrDigit : Letter | Digit;

Identifier : Letter LetterOrDigit*;

fragment A: [aA];
fragment B: [bB];
fragment C: [cC];
fragment D: [dD];
fragment E: [eE];
fragment F: [fF];
fragment G: [gG];
fragment H: [hH];
fragment I: [iI];
fragment J: [jJ];
fragment K: [kK];
fragment L: [lL];
fragment M: [mM];
fragment N: [nN];
fragment O: [oO];
fragment P: [pP];
fragment Q: [qQ];
fragment R: [rR];
fragment S: [sS];
fragment T: [tT];
fragment U: [uU];
fragment V: [vV];
fragment W: [wW];
fragment X: [xX];
fragment Y: [yY];
fragment Z: [zZ];




