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



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Instanciando o yorkshire
    val dog: Dog = Yorkishire();
    dog.sayHello();
}