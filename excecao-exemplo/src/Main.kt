

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

data class Person (val name: String?)
fun main() {
    val person = Person("Venilton")
    val s = person.name ?: throw IllegalArgumentException("Name required")
    println(s)
}