class Director(val name: String, val age: Int) {
    fun takeCoffee(assisteant: Assisteant){
        val drinkName = assisteant.bringCoffee("mocha")
        println("thank you ${assisteant.name}, $drinkName was tasty")
    }
    fun getConsultantToWork(consultant: Consultant){
        val cooount = consultant.serveCustomers()
        println("Consultant ${consultant.name} served $cooount clients" )
    }
}