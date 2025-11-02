//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

data class Person(var nome: String, var age: Int, var about:String ){
    constructor() : this("", 0, "")
}

fun main() {
    val jake = Person()
    val stringDescription = jake.apply {
        nome = "Jeff"
        age = 37
        about = "Android Developer"
    }.toString()

    println(stringDescription)
}