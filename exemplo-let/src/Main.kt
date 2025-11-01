
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun customPrinte(s: String){
    print(s.toUpperCase());
}

fun main() {
    val empty = "louco".let {
        customPrinte(it)
        it.isEmpty()
    }
    println(" is empty: $empty")
}