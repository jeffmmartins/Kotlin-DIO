

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    fun getNullableLength (ns: String?){
        println("For \"$ns\ ":")
        //Função de escopo
        ns?.run{
            println("\tis empty?" + isEmpty())
        }
    }
}