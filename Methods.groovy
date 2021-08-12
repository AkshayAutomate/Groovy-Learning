// def printHello(){
//     println "Hello Akshay"
// }
// def sum(int a,int b){ return (a+b)}
// def sub(int a,int b){ return (a-b)}
// printHello()

// print("Enter 1st number:")
//  def a=System.console().readLine().toInteger();
// print("Enter 2nd number:")
// def b=System.console().readLine().toInteger();
// println "Addition or Subtraction"
// String s = System.console().readLine();
// s=s.toUpperCase()
// println s 
// if(s=="ADDITION"){println "Addition is "+sum(a,b)}
// else{println "Subtraction is "+sub(a,b)}



/**reading files**/
// def sum(int a,int b){ return (a+b)}
// File newfile1 = new File("C:/Users/atarun/VSCode/file1.txt");
// println newfile1.text
// File newfile2 = new File("C:/Users/atarun/VSCode/file2.txt");
// println newfile2.text
//  def a , b 
//  newfile1.withReader{reader -> a = reader.readLine().toInteger()}
//  newfile2.withReader{reader -> b = reader.readLine().toInteger()}
//  println "$a and $b"
// //  def outfile1 = "file4.txt"
// //  new File(outfile1).append(sum(a,b))
// //  File outfile1read = new File(outfile1)
// //  println outfile1read.text

// File outfile1 = new File("file4.txt")
// outfile1 << sum(a,b)
// println outfile1.text
// outfile1.text = (sum(a,b))
// println outfile1.text 



// File newfile3 = new File("file3.txt")
// println newfile3.text
// def list = newfile3.collect{ it}
// println list
// def arr = newfile3 as String[]
// println arr 
// def lines = newfile3.readLines()
// println lines
// newfile3.eachLine{line,lineno -> println "$lineno:$line"}
// def range = 2..4; def linelist =[]
// newfile3.eachLine{line,lineno -> if(range.contains(lineno)){linelist.add(line)}}
// println linelist
// def line
// newfile3.withReader{reader -> while((line = reader.readLine()) != null){println line}}
//read with new reader -- useful when we want to keep the input file stream open
// def outfile2 =  "file5.txt"
// def reader = newfile3.newReader()
// new File(outfile2).append(reader)
// reader.close()
// println newfile3.bytes
// println newfile3.length()
// println newfile3.isFile()
// println newfile3.isDirectory()
// // to get list of files from a directory
// new File("C:/Users/atarun/VSCode").eachFile{files -> println files.getAbsolutePath()}
// //recursively display all files in a directory and its sub-directory//
// new File("C:/Users/atarun/VSCode").eachFileRecurse{files -> println files.getAbsolutePath()}

// def newfile4= new File("file6.txt")
// newfile4 << newfile3.text

// newfile4.delete()

//  File myfile = new File("file5.txt")
//  myfile.withWriter{writer -> writer.writeLine("write and withWriter will overrites the data")}
//  myfile.append("this is appended")
//  println myfile.isHidden()