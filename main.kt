fun main(args: Array<String>) {
    val person = Person("Bob", true)

    println(person.name)
    println(person.isMarried)
}

class Person(
    val name: String,

    var isMarried: Boolean
)