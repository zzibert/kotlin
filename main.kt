fun main(args: Array<String>) {
    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)
}

class Person(
    val name: String,

    var isMarried: Boolean
)

class Rectangle(val height: Int, val width: Int){
    val isSquare: Boolean

    get() {
        return height == width
    }
}