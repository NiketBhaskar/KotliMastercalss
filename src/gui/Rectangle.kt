package gui

class Rectangle(val width: Int = 0, val height: Int = 0) {
 constructor(wth: Int): this(wth, wth)

    fun draw() {
        repeat(this.height){
            repeat(this.width){
                print("*")
            }
            println()
        }
    }

}