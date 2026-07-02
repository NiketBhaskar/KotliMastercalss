class Person {
    val name: String
    val age: Int
    val height: Double
    val weight: Double

    constructor(name:String, age: Int, height: Double, weight: Double){
        this.name = name
        this.age = age
        this.height = height
        this.weight = weight
    }

    fun printinfo(){
        println("${this.name}, ${this.age}, ${this.height}, ${this.weight}")
    }
    fun sayHello(){
        println("Hello! my name is ${this.name}")
    }
    fun run(){
        repeat(10){
            println("running")
        }
    }
}