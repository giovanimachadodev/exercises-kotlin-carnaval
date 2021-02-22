package `exercises-carnaval`.exercise03

open class Employee(var id: Int, var office: String, var name: String, var cpf: String, var salaryCurrent: Double) {
    val employees: MutableList<Employee> = mutableListOf()

    fun saveEmployee(emp: Employee?) {
        when (emp?.office) {
            "Manager" -> "Funcionário Salvo! ${employees.add(Manager(id, office, name, cpf, salaryCurrent))}"
            "Programmer" -> "Funcionário Salvo! ${employees.add(Programmer(id, office, name, cpf, salaryCurrent))}"
        }
    }

    fun getEmployee(idConsult: Int?) {
        for (employee in employees) {
            if (idConsult == employee.id) {
                println("Id: ${employee.id}")
                println("Nome: ${employee.name}")
                println("CPF: ${employee.cpf}")
                println("Salário: ${employee.salaryCurrent}")
            }
        }
    }

    fun getAllEmployees(){
        println("Lista de Funcionários")
        for (employee in employees){
            println("${employee.id} - ${employee.name} - ${employee.cpf} - ${employee.salaryCurrent}\n")
        }
    }

    fun increaseSalary(idConsult: Int?) {
        for (employee in employees) {
            if (idConsult == employee.id) {
                if (employee.office == "Manager") {
                    Manager(id, office, name, cpf, salaryCurrent).increaseSalary()
                } else {
                    Programmer(id, office, name, cpf, salaryCurrent).increaseSalary()
                }
            }

        }
    }

}
