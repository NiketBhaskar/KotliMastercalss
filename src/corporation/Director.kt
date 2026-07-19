package corporation

class Director(name: String, age: Int): Worker(name, age) {

    override fun work(){
        println("I am drinking coffee..")
    }


    fun takeCoffee(assisteant: Assisteant){
        val drinkName = assisteant.bringCoffee("mocha")
        println("thank you ${assisteant.name}, $drinkName was tasty")
    }
    fun getConsultantToWork(consultant: Consultant){
        val cooount = consultant.serveCustomers()
        println("corporation.Consultant ${consultant.name} served $cooount clients" )
    }
}