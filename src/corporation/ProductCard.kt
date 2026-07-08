package corporation

class ProductCard {
    val name: String
    val brand: String
    val Size: Float
    val Price: Int

    constructor(name:String, brand: String, size: Float, price: Int){
        this.name = name
        this.brand = brand
        this.Size = size
        this.Price = price
    }

    fun printInfo(){
        println(message = "Name: ${this.name} Brand : ${this.brand} Size: ${this.Size} Price: ${this.Price}")
    }

}