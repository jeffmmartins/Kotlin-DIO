import javax.print.attribute.standard.MediaSize.Other

//classe dataclasse faz com que o tostring já venha bem montado, importante para transportar os dados
data class User(val name: String, val id: Int){
    override fun equals(other: Any?)=
        other is User && other.id == this.id
}



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val user = User("Alex", 1)
    println(user)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Jota",2)

    println("user == secondUser:  ${user == secondUser}")
    println("user == thirdUser:  ${user == thirdUser}")

    //HashCode - ger aum valor para verificar a comparação se são iguais
    println(user.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    //Copy cria uma nova instancia com os mesmos valores da primeira
    println(user.copy()) // criando uma cópia do user
    println(user === user.copy()) // comparar em termos de endereço de memória vai ser endereços diferentes
    println(user.copy("Max")) // posso passar um outro argumento
    println(user.copy(id = 3))

    //componente na ordem das propriedades
    println("name: ${user.component1()}")
    println("name: ${user.component2()}")
}