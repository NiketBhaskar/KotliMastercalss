package corporation

class FoodCard(name: String,
               brand: String,
               price: Int,
               val calories: Int
) : ProductCard(name, brand, price) {
    override fun printInfo() {
        super.printInfo()
        println(message = " Calories: ${calories}")

    }
}