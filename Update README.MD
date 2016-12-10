##MD File Paser Program

21100297 박진열 / 21200029 고요한 / 21300072 김남균 / 21400270 문세미

---
* Precondition  
	1. Assume that only one MD file is given as input at a time.
	2. No need to support embedded HTML code that spans multiple lines.  
	3. Use command line input program.  
	
-----

* How to use:  
>	`<Pakagename/java_filename> <-option> <MDFile Name> <Style>`
>	  
>	**The process is next to**:

>1. Move to source path where the program is stored. This path has to show the folder(src) which java file stored.
>2. The command input line form is java+pakagename.classname+filename.extension+style. (figure.2)
>3. User must add only one file name + style. After we should add more function.
>4. If user input has wrong file names, program execute NotFoundFileException and notice wrong file name.
>5. If user add to input except style, program will interpret as plain(default) style.
6. Classifying style type implemented by if-else statements and analyzes string
7. Style(Node) string is separated by the ‘if-else’ statement.
8. commands are ‘-help’(show help message) and ‘-read’(show read message).
9. please md file input src folder.
10. If command line are entered by each format, notify the  file name and style.
11. Print the output of HTML file which was transformed from markdown file.
13. Use try-catch statement, make the exeption for confirming the normal input.

---

<h4> Supported Function </h4>
**<Node\>**  

+ Headers
	1. Setext :  Any number of underlining = ’s or - ’s will work.
    `This is an H1 + ========= or This is an H2 + ------`
	2. atx : Atx-style headers use 1-6 hash characters at the start of the line, corresponding to header levels 1-6. 
	`# This is an H1`  
    `## This is an H2 ... `   
+ BlockQuote : Markdown uses email-style > characters for blockquoting.  
`> This is the first level of quoting .`  
`>> This is nested blockquote.`  
`> Back to the first level.`

+ ItemList :supports ordered (numbered) and unordered (bulleted) lists.  
	1. ordered(numbered) List.
	2. unordered (bulleted) List.

+ CodeBlock : simply indent every line of the block by at least 4 spaces or 1 tab.

+ Horizontal : You can produce a horizontal rule tag ( `<hr />` ) by placing three or more hyphens or asterisks on a line by themselves.
 
+ Block : if you don't use any 기능, it return '<p\> ... </p\>' format. 

**<Style\>**  

+ Emphasis: This type supports these two styles.
	1. the *italic* style
	2. the **bold** style

	This type is up to the number of symbols(asterisk or underscore) which are at the fornt(A) and back(B) of sentence. 

	######There are 7 cases:
	`1. If both A and B is 1, the result has only the italic style sentence.`
 	`2. If A>B and the B is 1, the result has only the italic style sentence.` 
 	`3. If A>B and the B is odd and up to 2, the result has both the italic style and bold style sentence.`
 	`4. If A>B and the B is even, the result has only the bold style sentence.`
	`5. If A<B and the A is 1, the result has only the italic style sentece.`
	`6. if A<B and the A is odd and up to 2, the result has both the italic and bold style sentence.`
	`7. if A<B and the A is even, the result has only the bold style sentence.`

	The case 2,3,4,5, 6 and 7 have leftovers of symbol, and If there are words after symbols B, these leftovers can effect to the words which are back of B by the same manner of front. Lastly, it doesn`t matter, how long the sentence, how many groups of symbols and groups of words, and how composed the sentence by these groups likes (symbol)(words)(symbol)(words) etc. 


**<Token\>**

+ Link: It supports the Link and there are two case in this function:

		1. With title
		2. Without title
if you want to use the title, adding "title", 'title', or (title) before the address. 

+ Image: inline function.   
	![ Alt text ](/ path / to / img . jpg )  
	![ Alt text ](/ path / to / img . jpg " Optional title ")

