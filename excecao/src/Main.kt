//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Lançar exceção quando tem um fluxo inesperado um fluxo alternativo
    val a = 10
    val b =  0

    try {
        val divisao = a/b;
    } catch (e: Throwable){
        //mostra exatamente a mensagem
        println(e.message)
    }
}