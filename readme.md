##Receiving command line input


###21100297 박진열 / 21200029 고요한 / 21300072 김남균 / 21400270 문세미

---

***We assume that User may invoke only one input file.
Every document file type is available. 

If user invokes several files, there are ambiguities about classifying document name and document style.
However we can classify through file name extension, but we don’t have conviction. So we assume like that.

The construction of method for implement file has visitCommand, which is way to implement this program, visitDocument, which is way to receive File(Document), and VisitNode, which is way to what style will be implanted


 The process is next to:

1. Move to source path where the program is stored. This path has to show the folder(src) which java file stored.
2. The command input line form is java+pakagename.classname+filename.extension+style. (figure.2)
 1.  User must add only one file name + style. After we should add more function.
 2.   If user input has wrong file names, program execute NotFoundFileException and notice wrong file name.
 3. If user add to input except style, program will interpret as plain(default) style.
 4. Classifying style type implemented by if-else statements and analyzes string
 5. Style(Node) string is separated by the ‘if-else’ statement.
 6. commands are ‘-help’(show help message) and ‘-read’(show read message).
 7. please md file input src folder.

3. If command line are entered by each format, notify the  file name and style.
 1. Print the output of HTML file which was transformed from markdown file.
 2. Implementation for md parser is constructed at a later.
 3. Use try-catch statement, make the exeption for confirming the normal input. 