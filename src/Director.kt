class Director(val name: String, val age: Int) {
    fun takeCoffee(assisteant: Assisteant){
        val drinkName = assisteant.bringCoffee("mocha")
        println("thank you ${assisteant.name}, $drinkName was tasty")
    }
}