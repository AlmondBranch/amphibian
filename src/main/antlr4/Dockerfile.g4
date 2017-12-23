grammar Dockerfile;

fromLine     : 'FROM' image (':' imageTag | '@' imageDigest)? (AS imageName)?;

image    : Identifier;
imageTag     : Identifier;
imageDigest  : LetterOrDigit+;
imageName    : Identifier;

fragment
Letter : ('a'..'z'|'A'..'Z');

fragment
Digit : ('0'..'9');

fragment
LetterOrDigit : Letter | Digit;

fragment
Identifier : Letter LetterOrDigit*;




