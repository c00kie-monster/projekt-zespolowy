/*
[The "BSD licence"]
Copyright (c) 2013 Sam Harwell
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:
1. Redistributions of source code must retain the above copyright
notice, this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright
notice, this list of conditions and the following disclaimer in the
documentation and/or other materials provided with the distribution.
3. The name of the author may not be used to endorse or promote products
derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

/** C 2011 grammar built from the C11 Spec */
grammar C;

@header {
	package com.rocketscience;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;
	import java.util.HashSet;
}

@members {
	
	private ArrayList<String> listOfErrorsGlobal=new ArrayList<String>();
	private ArrayList<Integer> arrayDemention=new ArrayList<Integer>();
	private ArrayList<String> setOfFields=new ArrayList<String>();
	private ArrayList< ArrayList<String>>globalLists=new ArrayList<ArrayList<String>>();
	private boolean isFirst=false;
	private boolean ifUp=false; 
	private boolean endExp=false;
	private boolean isInit=false;
	private boolean errorInit=false;
	private boolean declarationOfArray=false;
	private boolean multiEx=false;
	private boolean leftMulti=false;
	
	
	
	
}

includeDef
:
	'#include <' Identifier '.h>'
;

primaryExpression
:
	Identifier
	| Constant
	| StringLiteral+
	| '(' expression ')'
	| genericSelection
	| '__extension__'? '(' compoundStatement ')' // Blocks (GCC extension)

	| '__builtin_va_arg' '(' unaryExpression ',' typeName ')'
	| '__builtin_offsetof' '(' typeName ',' unaryExpression ')'
;

genericSelection
:
	'_Generic' '(' assignmentExpression ',' genericAssocList ')'
;

genericAssocList
:
	genericAssociation
	| genericAssocList ',' genericAssociation
;

genericAssociation
:
	typeName ':' assignmentExpression
	| 'default' ':' assignmentExpression
;

postfixExpression
:
	primaryExpression
	| postfixExpression '[' expression ']'
	| postfixExpression '.' Identifier
	| postfixExpression '->' Identifier
	| postfixExpression '++'
	| postfixExpression '--'
	| '(' typeName ')' '{' initializerList '}'
	| '(' typeName ')' '{' initializerList ',' '}'
	| '__extension__' '(' typeName ')' '{' initializerList '}'
	| '__extension__' '(' typeName ')' '{' initializerList ',' '}'
;

argumentExpressionList
:
	assignmentExpression
	| argumentExpressionList ',' assignmentExpression
;

moreLessMethodExpression
:
	lessMethodExpression
;

lessMethodExpression
:
	methodExpression
;

methodExpression
:
	primaryExpression '(' argumentExpressionList ')'
	{if(!isFirst){
		globalLists.get(0).add(_input.getTokenSource().getLine()+"|IF001");
		isFirst=true;
	}
	
	}

	| primaryExpression '(' ')'
	{
	
	if(!isFirst){
			globalLists.get(0).add(_input.getTokenSource().getLine()+"|IF001");
		isFirst=true;
	}
	
	
	
}

;

unaryExpression
:
	{isFirst=true;}

	postfixExpression
	| moreLessMethodExpression
	| '++' unaryExpression
	| '--' unaryExpression
	| unaryOperator castExpression
	| 'sizeof' unaryExpression
	| 'sizeof' '(' typeName ')'
	| '_Alignof' '(' typeName ')'
	| '&&' Identifier // GCC extension address of label

;

unaryOperator
:
	'&'
	| '*'
	| '+'
	| '-'
	| '~'
	| '!'
;

castExpression
:
	unaryExpression
	{
 	if(multiEx||leftMulti){
	try{
		
		int multiplay=Integer.valueOf(_localctx.getText());
			if((multiplay & -multiplay) == multiplay){
				globalLists.get(0).add(_input.getTokenSource().getLine()+"|M001");
			}		
		}
		catch(NumberFormatException exp){
			/*System.out.println(exp.getStackTrace());*/
			
		try{			
		int multiplay=Integer.valueOf(_localctx.getParent().getText().substring(0, _localctx.getParent().getText().indexOf('*')));
			if((multiplay & -multiplay) == multiplay){
				globalLists.get(0).add(_input.getTokenSource().getLine()+"|M001");
			}		
		}
		catch(NumberFormatException exp1){
			/*System.out.println(exp1.getStackTrace());*/
		}
						
		}
		
	}
}

	| '(' typeName ')' castExpression
	| '__extension__' '(' typeName ')' castExpression
;

multiplicativeExpression
:
	castExpression
	{if(multiEx){leftMulti=true;}}

	| multiplicativeExpression '*'
	{ multiEx=true;}

	castExpression
	| multiplicativeExpression '/' castExpression
	| multiplicativeExpression '%' castExpression
;

additiveExpression
:
	multiplicativeExpression
	| additiveExpression '+' multiplicativeExpression
	{if(isInit&&!errorInit){ globalLists.get(0).add(_input.getTokenSource().getLine()+"|D001"); errorInit=true; 
	
}}

	| additiveExpression '-' multiplicativeExpression
	{if(isInit&&!errorInit){ globalLists.get(0).add(_input.getTokenSource().getLine()+"|D001"); errorInit=true; 
}}

;

shiftExpression
:
	additiveExpression
	| shiftExpression '<<' additiveExpression
	| shiftExpression '>>' additiveExpression
;

relationalExpression
:
	shiftExpression
	| relationalExpression '<' shiftExpression
	| relationalExpression '>' shiftExpression
	| relationalExpression '<=' shiftExpression
	| relationalExpression '>=' shiftExpression
;

equalityExpression
:
	relationalExpression
	| equalityExpression '==' relationalExpression
	| equalityExpression '!=' relationalExpression
;

andExpression
:
	equalityExpression
	| andExpression '&' equalityExpression
;

exclusiveOrExpression
:
	andExpression
	| exclusiveOrExpression '^' andExpression
;

inclusiveOrExpression
:
	exclusiveOrExpression
	{/*isFirst=true;*/}

	| inclusiveOrExpression '|' exclusiveOrExpression
;

logicalAndExpression
:
	inclusiveOrExpression
	{if(endExp)isFirst=true;} //sprawdzenie czy logicalAnd jest wywoływany 2raz czyli sprawdzamy jeden z warunków

	| logicalAndExpression '&&' inclusiveOrExpression
	{ 
	endExp=true; 
}

;

logicalOrExpression
:
	logicalAndExpression
	| logicalOrExpression '||' logicalAndExpression
;

conditionalExpression
:
	logicalOrExpression
	(
		'?' expression ':' conditionalExpression
	)?
;

assignmentExpression
:
	conditionalExpression
	{
	
if(declarationOfArray){
	try{
	if(!_localctx.getText().equals(""))  /* error */
	arrayDemention.add(Integer.valueOf(_localctx.getText()));
	if(arrayDemention.size()>1){
		for(int i=1;i<arrayDemention.size();i++){	
			if((arrayDemention.get(i) & -arrayDemention.get(i))!=arrayDemention.get(i)){
				globalLists.get(0).add(_input.getTokenSource().getLine()+"|ARD001");
			}
		}
	}
	}
	catch(NumberFormatException exp){
			/*System.out.println(exp.getStackTrace());*/
		}
	
}

}

	| unaryExpression assignmentOperator assignmentExpression
;

assignmentOperator
:
	'='
	| '*='
	| '/='
	| '%='
	| '+='
	| '-='
	| '<<='
	| '>>='
	| '&='
	| '^='
	| '|='
;

expression
:
	assignmentExpression
	{multiEx=false;leftMulti=false;}

	| expression ',' assignmentExpression
;

constantExpression
:
	conditionalExpression
;

declaration
:
	declarationSpecifiers initDeclaratorList? ';'
	| staticAssertDeclaration
;

declarationSpecifiers
:
	declarationSpecifier+
;

declarationSpecifiers2
:
	declarationSpecifier+
;

declarationSpecifier
:
	storageClassSpecifier
	| typeSpecifier
	| typeQualifier
	| functionSpecifier
	| alignmentSpecifier
;

initDeclaratorList
:
	{declarationOfArray=true;arrayDemention=new ArrayList<Integer>();}

	initDeclarator
	| initDeclaratorList ',' initDeclarator
;

initDeclarator
:
	declarator
	| declarator '='
	{isInit=true; errorInit=false;}

	initializer
;

storageClassSpecifier
:
	'typedef'
	| 'extern'
	| 'static'
	| '_Thread_local'
	| 'auto'
	| 'register'
;

typeSpecifier
:
	(
		'void'
		| 'char'
		| 'short'
		| 'int'
		| 'long'
		| 'float'
		| 'double'
		| 'signed'
		| 'unsigned'
		| '_Bool'
		| '_Complex'
		| '__m128'
		| '__m128d'
		| '__m128i'
	)
	| '__extension__' '('
	(
		'__m128'
		| '__m128d'
		| '__m128i'
	) ')'
	| atomicTypeSpecifier
	| structOrUnionSpecifier
	| enumSpecifier
	| typedefName
	| '__typeof__' '(' constantExpression ')' 

;

structOrUnionSpecifier
:
	structOrUnion Identifier? '{' structDeclarationList '}'
	| structOrUnion Identifier
;

structOrUnion
:
	'struct'
	| 'union'
;

structDeclarationList
:
	structDeclaration
	| structDeclarationList structDeclaration
;

structDeclaration
:
	specifierQualifierList structDeclaratorList? ';'
	| staticAssertDeclaration
;

specifierQualifierList
:
	typeSpecifier specifierQualifierList?
	| typeQualifier specifierQualifierList?
;

structDeclaratorList
:
	structDeclarator
	| structDeclaratorList ',' structDeclarator
;

structDeclarator
:
	declarator
	| declarator? ':' constantExpression
;

enumSpecifier
:
	'enum' Identifier? '{' enumeratorList '}'
	| 'enum' Identifier? '{' enumeratorList ',' '}'
	| 'enum' Identifier
;

enumeratorList
:
	enumerator
	| enumeratorList ',' enumerator
;

enumerator
:
	enumerationConstant
	| enumerationConstant '=' constantExpression
;

enumerationConstant
:
	Identifier
;

atomicTypeSpecifier
:
	'_Atomic' '(' typeName ')'
;

typeQualifier
:
	'const'
	| 'restrict'
	| 'volatile'
	| '_Atomic'
;

functionSpecifier
:
	(
		'inline'
		| '_Noreturn'
		| '__inline__' // GCC extension

		| '__stdcall'
	)
	| gccAttributeSpecifier
	| '__declspec' '(' Identifier ')'
;

alignmentSpecifier
:
	'_Alignas' '(' typeName ')'
	| '_Alignas' '(' constantExpression ')'
;

declarator
:
	pointer? directDeclarator
	
	
	{ 
		String name=_localctx.getText();
		
			
		if(name.indexOf('(')==-1&& name.indexOf('[')==-1){
		
			if(!globalLists.get(1).contains(name))
			globalLists.get(1).add(name);
		}
		else{
			if(name.indexOf('(')!=-1){
				name=name.substring(0,name.indexOf('('));
				if(!globalLists.get(1).contains(name))
				globalLists.get(1).add(name);
			}else{
				name=name.substring(0,name.indexOf('['));
				if(!globalLists.get(1).contains(name))
				
				globalLists.get(1).add(name);
			}
			
		}
		
	
	}

	gccDeclaratorExtension*
;

directDeclarator
:
	Identifier
	| '(' declarator ')'
	| directDeclarator '[' typeQualifierList? assignmentExpression? ']'
	| directDeclarator '[' 'static' typeQualifierList? assignmentExpression ']'
	| directDeclarator '[' typeQualifierList 'static' assignmentExpression ']'
	| directDeclarator '[' typeQualifierList? '*' ']'
	| directDeclarator '(' parameterTypeList ')'
	| directDeclarator '(' identifierList? ')'
;

gccDeclaratorExtension
:
	'__asm' '(' StringLiteral+ ')'
	| gccAttributeSpecifier
;

gccAttributeSpecifier
:
	'__attribute__' '(' '(' gccAttributeList ')' ')'
;

gccAttributeList
:
	gccAttribute
	(
		',' gccAttribute
	)*
	| // empty

;

gccAttribute
:
	~( ',' | '(' | ')' ) // relaxed def for "identifier or reserved word"

	(
		'(' argumentExpressionList? ')'
	)?
	| // empty

;

nestedParenthesesBlock
:
	(
		~( '(' | ')' )
		| '(' nestedParenthesesBlock ')'
	)*
;

pointer
:
	'*' typeQualifierList?
	| '*' typeQualifierList? pointer
	| '^' typeQualifierList? // Blocks language extension

	| '^' typeQualifierList? pointer // Blocks language extension

;

typeQualifierList
:
	typeQualifier
	| typeQualifierList typeQualifier
;

parameterTypeList
:
	parameterList
	| parameterList ',' '...'
;

parameterList
:
	parameterDeclaration
	| parameterList ',' parameterDeclaration
;

parameterDeclaration
:
	declarationSpecifiers declarator
	| declarationSpecifiers2 abstractDeclarator?
;

identifierList
:
	Identifier
	| identifierList ',' Identifier
;

typeName
:
	specifierQualifierList abstractDeclarator?
;

abstractDeclarator
:
	pointer
	| pointer? directAbstractDeclarator gccDeclaratorExtension*
;

directAbstractDeclarator
:
	'(' abstractDeclarator ')' gccDeclaratorExtension*
	| '[' typeQualifierList? assignmentExpression? ']'
	| '[' 'static' typeQualifierList? assignmentExpression ']'
	| '[' typeQualifierList 'static' assignmentExpression ']'
	| '[' '*' ']'
	| '(' parameterTypeList? ')' gccDeclaratorExtension*
	| directAbstractDeclarator '[' typeQualifierList? assignmentExpression? ']'
	| directAbstractDeclarator '[' 'static' typeQualifierList?
	assignmentExpression ']'
	| directAbstractDeclarator '[' typeQualifierList 'static'
	assignmentExpression ']'
	| directAbstractDeclarator '[' '*' ']'
	| directAbstractDeclarator '(' parameterTypeList? ')' gccDeclaratorExtension*
;

typedefName
:
	Identifier
;

initializer
:
	assignmentExpression
	| '{' initializerList '}'
	| '{' initializerList ',' '}'
;

initializerList
:
	designation? initializer
	| initializerList ',' designation? initializer
;

designation
:
	designatorList '='
;

designatorList
:
	designator
	| designatorList designator
;

designator
:
	'[' constantExpression ']'
	| '.' Identifier
;

staticAssertDeclaration
:
	'_Static_assert' '(' constantExpression ',' StringLiteral+ ')' ';'
;

statement
:
	labeledStatement
	| compoundStatement
	| expressionStatement
	| selectionStatement
	| iterationStatement
	| jumpStatement
	|
	(
		'__asm'
		| '__asm__'
	)
	(
		'volatile'
		| '__volatile__'
	) '('
	(
		logicalOrExpression
		(
			',' logicalOrExpression
		)*
	)?
	(
		':'
		(
			logicalOrExpression
			(
				',' logicalOrExpression
			)*
		)?
	)* ')' ';'
;

labeledStatement
:
	Identifier ':' statement
	| 'case' constantExpression ':' statement
	| 'default' ':' statement
;

compoundStatement
:
	'{' blockItemList? '}'
;

blockItemList
:
	{declarationOfArray=false;}

	blockItem
	| blockItemList blockItem
;

blockItem
:
	{isInit=false; errorInit=false; declarationOfArray=false;}

	declaration
	| statement
;

expressionStatement
:
	expression? ';'
;

ifGood
:
	expression
	{
	
}

;

testExpresstion
:
	ifGood
	{ isFirst=false; declarationOfArray=false;
	endExp=false;
}

;

initStatement
:
	statement
	{ifUp=false; declarationOfArray=false;}

;

selectionStatement
:
	'if' '(' testExpresstion ')' initStatement
	(
		'else' initStatement
	)?
	{ifUp=true; declarationOfArray=false; }

	| 'switch' '(' expression ')' statement
;

iterationStatement
:
	'while' '(' expression ')' statement
	| 'do' statement 'while' '(' expression ')' ';'
	| 'for' '(' expression? ';' expression? ';' expression? ')' statement
	| 'for' '(' declaration expression? ';' expression? ')' statement
;

jumpStatement
:
	'goto' Identifier ';'
	| 'continue' ';'
	| 'break' ';'
	| 'return'
	{declarationOfArray=false;}

	expression? ';'
	| 'goto' unaryExpression ';' // GCC extension

;

compilationUnit returns [ArrayList<ArrayList<String>>resultLists] @init {
	ArrayList<ArrayList<String>>resultLists=new ArrayList<ArrayList<String>>();
	
	globalLists.add(listOfErrorsGlobal);
	globalLists.add(setOfFields);
	
	$resultLists=globalLists;	
}
:
	translationUnit? EOF
;

translationUnit
:
	includeDef+
	| externalDeclaration
	| translationUnit externalDeclaration
;

externalDeclaration
:
	functionDefinition
	| declaration
	| ';' // stray ;

;

functionDefinition
:
	declarationSpecifiers? declarator declarationList? compoundStatement
;

declarationList
:
	declaration
	| declarationList declaration
;

Auto
:
	'auto'
;

Break
:
	'break'
;

Case
:
	'case'
;

Char
:
	'char'
;

Const
:
	'const'
;

Continue
:
	'continue'
;

Default
:
	'default'
;

Do
:
	'do'
;

Double
:
	'double'
;

Else
:
	'else'
;

Enum
:
	'enum'
;

Extern
:
	'extern'
;

Float
:
	'float'
;

For
:
	'for'
;

Goto
:
	'goto'
;

If
:
	'if'
;

Inline
:
	'inline'
;

Int
:
	'int'
;

Long
:
	'long'
;

Register
:
	'register'
;

Restrict
:
	'restrict'
;

Return
:
	'return'
;

Short
:
	'short'
;

Signed
:
	'signed'
;

Sizeof
:
	'sizeof'
;

Static
:
	'static'
;

Struct
:
	'struct'
;

Switch
:
	'switch'
;

Typedef
:
	'typedef'
;

Union
:
	'union'
;

Unsigned
:
	'unsigned'
;

Void
:
	'void'
;

Volatile
:
	'volatile'
;

While
:
	'while'
;

Alignas
:
	'_Alignas'
;

Alignof
:
	'_Alignof'
;

Atomic
:
	'_Atomic'
;

Bool
:
	'_Bool'
;

Complex
:
	'_Complex'
;

Generic
:
	'_Generic'
;

Imaginary
:
	'_Imaginary'
;

Noreturn
:
	'_Noreturn'
;

StaticAssert
:
	'_Static_assert'
;

ThreadLocal
:
	'_Thread_local'
;

LeftParen
:
	'('
;

RightParen
:
	')'
;

LeftBracket
:
	'['
;

RightBracket
:
	']'
;

LeftBrace
:
	'{'
;

RightBrace
:
	'}'
;

Less
:
	'<'
;

LessEqual
:
	'<='
;

Greater
:
	'>'
;

GreaterEqual
:
	'>='
;

LeftShift
:
	'<<'
;

RightShift
:
	'>>'
;

Plus
:
	'+'
;

PlusPlus
:
	'++'
;

Minus
:
	'-'
;

MinusMinus
:
	'--'
;

Star
:
	'*'
;

Div
:
	'/'
;

Mod
:
	'%'
;

And
:
	'&'
;

Or
:
	'|'
;

AndAnd
:
	'&&'
;

OrOr
:
	'||'
;

Caret
:
	'^'
;

Not
:
	'!'
;

Tilde
:
	'~'
;

Question
:
	'?'
;

Colon
:
	':'
;

Semi
:
	';'
;

Comma
:
	','
;

Assign
:
	'='
;
// '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|='

StarAssign
:
	'*='
;

DivAssign
:
	'/='
;

ModAssign
:
	'%='
;

PlusAssign
:
	'+='
;

MinusAssign
:
	'-='
;

LeftShiftAssign
:
	'<<='
;

RightShiftAssign
:
	'>>='
;

AndAssign
:
	'&='
;

XorAssign
:
	'^='
;

OrAssign
:
	'|='
;

Equal
:
	'=='
;

NotEqual
:
	'!='
;

Arrow
:
	'->'
;

Dot
:
	'.'
;

Ellipsis
:
	'...'
;

Identifier
:
	IdentifierNondigit
	(
		IdentifierNondigit
		| Digit
	)*
;

fragment
IdentifierNondigit
:
	Nondigit
	| UniversalCharacterName
	//| // other implementation-defined characters...

;

fragment
Nondigit
:
	[a-zA-Z_]
;

fragment
Digit
:
	[0-9]
;

fragment
UniversalCharacterName
:
	'\\u' HexQuad
	| '\\U' HexQuad HexQuad
;

fragment
HexQuad
:
	HexadecimalDigit HexadecimalDigit HexadecimalDigit HexadecimalDigit
;

Constant
:
	IntegerConstant
	| FloatingConstant
	//| EnumerationConstant

	| CharacterConstant
;

fragment
IntegerConstant
:
	DecimalConstant IntegerSuffix?
	| OctalConstant IntegerSuffix?
	| HexadecimalConstant IntegerSuffix?
;

fragment
DecimalConstant
:
	NonzeroDigit Digit*
;

fragment
OctalConstant
:
	'0' OctalDigit*
;

fragment
HexadecimalConstant
:
	HexadecimalPrefix HexadecimalDigit+
;

fragment
HexadecimalPrefix
:
	'0' [xX]
;

fragment
NonzeroDigit
:
	[1-9]
;

fragment
OctalDigit
:
	[0-7]
;

fragment
HexadecimalDigit
:
	[0-9a-fA-F]
;

fragment
IntegerSuffix
:
	UnsignedSuffix LongSuffix?
	| UnsignedSuffix LongLongSuffix
	| LongSuffix UnsignedSuffix?
	| LongLongSuffix UnsignedSuffix?
;

fragment
UnsignedSuffix
:
	[uU]
;

fragment
LongSuffix
:
	[lL]
;

fragment
LongLongSuffix
:
	'll'
	| 'LL'
;

fragment
FloatingConstant
:
	DecimalFloatingConstant
	| HexadecimalFloatingConstant
;

fragment
DecimalFloatingConstant
:
	FractionalConstant ExponentPart? FloatingSuffix?
	| DigitSequence ExponentPart FloatingSuffix?
;

fragment
HexadecimalFloatingConstant
:
	HexadecimalPrefix HexadecimalFractionalConstant BinaryExponentPart
	FloatingSuffix?
	| HexadecimalPrefix HexadecimalDigitSequence BinaryExponentPart
	FloatingSuffix?
;

fragment
FractionalConstant
:
	DigitSequence? '.' DigitSequence
	| DigitSequence '.'
;

fragment
ExponentPart
:
	'e' Sign? DigitSequence
	| 'E' Sign? DigitSequence
;

fragment
Sign
:
	'+'
	| '-'
;

fragment
DigitSequence
:
	Digit+
;

fragment
HexadecimalFractionalConstant
:
	HexadecimalDigitSequence? '.' HexadecimalDigitSequence
	| HexadecimalDigitSequence '.'
;

fragment
BinaryExponentPart
:
	'p' Sign? DigitSequence
	| 'P' Sign? DigitSequence
;

fragment
HexadecimalDigitSequence
:
	HexadecimalDigit+
;

fragment
FloatingSuffix
:
	'f'
	| 'l'
	| 'F'
	| 'L'
;

fragment
CharacterConstant
:
	'\'' CCharSequence '\''
	| 'L\'' CCharSequence '\''
	| 'u\'' CCharSequence '\''
	| 'U\'' CCharSequence '\''
;

fragment
CCharSequence
:
	CChar+
;

fragment
CChar
:
	~['\\\r\n]
	| EscapeSequence
;

fragment
EscapeSequence
:
	SimpleEscapeSequence
	| OctalEscapeSequence
	| HexadecimalEscapeSequence
	| UniversalCharacterName
;

fragment
SimpleEscapeSequence
:
	'\\' ['"?abfnrtv\\]
;

fragment
OctalEscapeSequence
:
	'\\' OctalDigit
	| '\\' OctalDigit OctalDigit
	| '\\' OctalDigit OctalDigit OctalDigit
;

fragment
HexadecimalEscapeSequence
:
	'\\x' HexadecimalDigit+
;

StringLiteral
:
	EncodingPrefix? '"' SCharSequence? '"'
;

fragment
EncodingPrefix
:
	'u8'
	| 'u'
	| 'U'
	| 'L'
;

fragment
SCharSequence
:
	SChar+
;

fragment
SChar
:
	~["\\\r\n]
	| EscapeSequence
;

//LineDirective
//: '#' Whitespace? DecimalConstant Whitespace? StringLiteral ~[\r\n]*
//-> skip
//;

//PragmaDirective
//: '#' Whitespace? 'pragma' Whitespace ~[\r\n]*
//-> skip
//;

Whitespace
:
	[ \t]+ -> skip
;

Newline
:
	(
		'\r' '\n'?
		| '\n'
	) -> skip
;

BlockComment
:
	'/*' .*? '*/' -> skip
;

LineComment
:
	'//' ~[\r\n]* -> skip
;