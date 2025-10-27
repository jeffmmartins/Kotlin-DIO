open class Dog{
    open fun sayHello(){
        println("Wow WOw");
    }
}

class Yorkishire : Dog (){
    override fun sayHello() {
        println("Ola eu sou um dog");
    }
}

open class Tigger(val origin: String) {
    fun sayHello(){
        println("O tiger da $origin ")
    }
}

//Herdando uma classe passando um parametro no construtor
//lendo como subertigger é um tigre da siberia
class SuberTigger : Tigger("Siberia")

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Instanciando o yorkshire
    val dog: Dog = Yorkishire();
    dog.sayHello();

    val tigger: Tigger = SuberTigger()
    tigger.sayHello()
}