import `exercises-carnaval`.exercise01.People
import `exercises-carnaval`.exercise02.Contact
import `exercises-carnaval`.exercise02.Diary
import `exercises-carnaval`.exercise03.Employee
import `exercises-carnaval`.exercise03.Manager
import `exercises-carnaval`.exercise03.Programmer

fun main(args: Array<String>) {
/*
//    exercise 01
      val p1 = People()

      println(p1.getString())
*/


//    exercise 02
    val d1 = Diary()
    var c1 = Contact("123", "Giovani")
    val c2 = Contact("456", "Priscila")
    val c3 = Contact("789", "Jéssica")
    val c4 = Contact("789", "Jéssica")
//    put
    d1.saveContact(c1)
    d1.saveContact(c2)
    d1.saveContact(c3)
    d1.saveContact(c4)
    d1.saveContact(c1)

//    get
      d1.getContact("Giovani")
      d1.getAllContacts()

//    delete
      d1.removeContact(c1)

/*
    //exercise 03
    var e = Employee(0, "", "", "", 0.0)

    var option: Int? = 1
    var id: Int = 0

    fun fillData() {
        var salaryCurrent: Double
        var office: String
        var option1: String
        var name: String
        var cpf: String


        do {
            print("Insira o nome do(a) funcionário(a): ")
            name = readLine().toString()
            print("Insira o CPF do(a) funcionário(a): ")
            cpf = readLine().toString()
            print("Insira o salário do(a) funcionário(a): ")
            salaryCurrent = readLine()!!.toDouble()
            print("Insira o cargo do funcionário <Manager/Programmer>: ")
            office = readLine().toString()
            e = Employee(id, office, name, cpf, salaryCurrent)
            e.saveEmployee(e)
            id++
            println("Deseja cadastrar outro(a) funcionário(a)? S/N")
            option1 = readLine().toString()
        } while (option1 == "s")
    }

    fun consultData() {
        e.getAllEmployees()
        var idConsult: Int?
        println("Insira o id que deseja consultar: ")
        idConsult = readLine()!!.toInt()

        println("1 - Mostrar os dados do Funcionário")
        println("2 - Aumentar salário Funcionário")

        print("Insira o número de acordo com a opção desejada: ")
        option = readLine()?.toInt()
        when (option) {
            1 -> e.getEmployee(idConsult)
            2 -> print(e.increaseSalary(idConsult))
        }

    }


    fun menu() {
        println("1 - Cadastrar Funcionário")
        println("2 - Consultar Funcionário\n")

        print("Insira o número de acordo com a opção desejada: ")
        option = readLine()?.toInt()

        when (option) {
            1 -> println(fillData())
            2 -> consultData()
            else -> "Obrigado por usar o programa!"
        }
        println()

    }

    while (option == 1 || option == 2) {
        menu()
    }

 */

}


