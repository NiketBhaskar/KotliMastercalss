import kotlin.random.Random

class Consultant(val name:String, val age: Int = 0) {
    fun serveCustomers(): Int{
        val count = Random.nextInt(0,100)
        repeat(count){
            println("The customer is served ...")

        }
        return count
    }
}