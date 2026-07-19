package corporation

class ShoeCard(name: String,
               brand: String,
               price: Int,
               val size: Int
) : ProductCard(name, brand, price) {
    override fun printInfo() {
        super.printInfo()
        print(message = " Calories: ${size}")

    }
}