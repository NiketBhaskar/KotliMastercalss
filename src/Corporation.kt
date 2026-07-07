fun main(){
    val director = Director("Andrey", 25)
    //    val assistance: Assisteant = Assisteant("Helen")
    //    director.takeCoffee(assistance)
    val consultant = Consultant("Max")
    director.getConsultantToWork(consultant)
}