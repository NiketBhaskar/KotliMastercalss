package corporation

open class ProductCard (val name: String,
                   val brand: String,
                   val price: Int){
    open fun printInfo(){
        println(message = "Name: ${this.name} Brand : ${this.brand} Price: ${this.price}")
    }

}