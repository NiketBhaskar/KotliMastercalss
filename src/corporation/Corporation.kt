package corporation

fun main(){
    val director = Director("Andrey", 25)
    val consultant= Consultant("Max")
    val assisteant = Assisteant("Helen", 20)
    val accountant = Accountant("Chri", 30)
    val employees = listOf<Worker>(director, consultant, assisteant, accountant)
    for(employee in employees){
        employee.work()
    }

}