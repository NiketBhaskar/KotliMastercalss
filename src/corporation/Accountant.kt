package corporation

import kotlin.system.exitProcess

class Accountant(name: String, age: Int) : Worker(name, age) {
    var items = mutableListOf<ProductCard>()
    override fun work() {
        while(true) {
            val operationTypes = OperationType.entries
            println("I'm answering the phone now...")
            println("Enter the operation code. 0 - ${operationTypes[0].title}, 1- ${operationTypes[1].title}: , 2- ${operationTypes[2].title}")
            var operationTypeIndex: Int = readln().toInt()
            val operationType: OperationType = operationTypes[operationTypeIndex]
            when (operationType) {
                OperationType.EXIT -> break
                OperationType.REGISTERNEWITEM -> registerNewItem()
                OperationType.SHOWALLITEMS -> showAllItems()
                else -> {}
            }
        }
    }

    fun registerNewItem(){
        val productTypes = ProductType.entries
        println("Enter the product type.")
        for((index,type) in productTypes.withIndex()){
            print("$index - ${type.title}")
            if(index < productTypes.size - 1){
                print(", ")
            }else{
                print(":")
            }
        }
//        println("Enter the product type : 0 - ${productTypes[0].title}, 1 - ${productTypes[1].title}, 2 - ${productTypes[2].title}: ")
        val productTypeIndex = readln().toInt()
        val productType: ProductType = productTypes[productTypeIndex]
        println("Enter the product name: ")
        var prodName = readln()
        println("Enter the product brand: ")
        var prodBrand = readln()
        println("Enter the product price: ")
        var prodPrice = readln().toInt()
        val card = when(productType){
            ProductType.FOOD -> {
                println("Enter the product Calorie: ")
                var prodCalorie = readln().toInt()
                FoodCard(prodName, prodBrand, prodPrice, prodCalorie)
                            }
            ProductType.APPLIANCE -> {
                            println("Enter the product Watt: ")
            var prodWatt = readln().toInt()
            ApplianceCard(prodName, prodBrand, prodPrice, prodWatt)
            }
            ProductType.SHOE -> {
                            println("Enter the product size: ")
            var prodSize = readln().toInt()
            ShoeCard(prodName, prodBrand, prodPrice, prodSize)
}
        }

        items.add(card)
        card.printInfo()
    }
    fun showAllItems(){
        for (item in items){
            item.printInfo()
        }
    }
}