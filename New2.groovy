abstract class New2{
    String Domain
    String Skill
    int Exp
    def m1(Domain,Skill,Exp){
        this.Domain=Domain
        this.Skill=Skill
        this.Exp=Exp
        println "In abstract class"
        println "$Domain:$Skill:$Exp"}
    abstract def Start()
}