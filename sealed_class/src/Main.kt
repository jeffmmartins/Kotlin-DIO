
//Classes seladas são estruturas que permitem criar uma certa restrição em tremos de estensão e visibilidade
sealed class Mammal(val nome:String)

class Cat(val catName: String):Mammal(catName)
class Human(val humanName: String, val job: String):Mammal(humanName)

//Função generica
fun greetMammal(mammal: Mammal): String{
    when (mammal){
        is Human -> return "Hello ${mammal.nome}; You're working as a ${mammal.job}"
        is Cat -> return "Hello ${mammal.catName}"
    }

}


fun main() {
    val cat = Cat("snow")
    val human = Human("alex", "técnico")
    println(greetMammal(cat))
    println(greetMammal(human))
}