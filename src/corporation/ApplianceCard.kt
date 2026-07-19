package corporation

class ApplianceCard (name: String,
                     brand: String,
                     price: Int,
                     val watt: Int
) : ProductCard(name, brand, price) {
    override fun printInfo() {
        super.printInfo()
        println(message = " Calories: ${watt}")

    }
}