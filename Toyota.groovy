class Toyota implements Car{
    def startEngine(){println "starting engine"}
    def stopEngine(){println "stoping engine"}
    static void main(args){
        println "In Implements class"
        Toyota t = new Toyota()
        t.startEngine()
        t.stopEngine()
    }
}