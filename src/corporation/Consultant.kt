package corporation

import kotlin.random.Random

class Consultant(name:String, age: Int = 0): Worker(name, age) {
    fun serveCustomers(): Int{
        val count = Random.nextInt(0,100)
        repeat(count){
            println("The customer is served ...")

        }
        return count
    }
}