grammar Dockerfile;

fromLine     : 'FROM' image (':' imageTag | '@' imageDigest)? ('AS' imageName)?;

image    : Identifier;
imageTag     : Identifier;
imageDigest  : LetterOrDigit+;
imageName    : Identifier;

WS : [ \t\r\n] -> skip;

fragment
Letter : ('a'..'z'|'A'..'Z');

fragment
Digit : ('0'..'9');

LetterOrDigit : Letter | Digit;

Identifier : Letter LetterOrDigit*;




