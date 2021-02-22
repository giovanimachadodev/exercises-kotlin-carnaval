package `exercises-carnaval`.exercise03

class Manager(id: Int, office: String, name: String, cpf: String, salaryCurrent: Double) : Employee(id, office, name, cpf, salaryCurrent) {
     fun increaseSalary() {
         println("Salário com aumento: ${salaryCurrent * 1.10}")
    }
}