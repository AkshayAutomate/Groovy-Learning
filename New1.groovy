class New1 extends New{
    String Employee;
    def setEmployee(Employee){this.Employee=Employee}
    def getEmployee(){println Employee}
    def getName(){println "not Akshay"}
    static void main(args){
        New1 n = new New1()
        n.setName("Akshay")
        n.setAge(28)
        n.getName()
        n.getAge()
        n.setEmployee("SopraSteria")
        n.getEmployee()
    }
}