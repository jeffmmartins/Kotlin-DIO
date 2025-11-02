//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class Configuration(val host: String, val port: Int)

fun main() {
    val configuration = Configuration("12346798.99", 90000)

    with(configuration){
        println("$host:$port")
    }
}