class New3 extends New2{
 
 def Start(){println "in extends class"}
 static void main(args){
     New3 n = new New3()

     n.m1("Retail","Assembler",5); n.Start()
 }
}