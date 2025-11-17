//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val upperCase1: (String) -> String = {str: String -> str.uppercase()};
    val upperCase2: (String) -> String = String::uppercase;

    println(upperCase1("Hello"));
    println(upperCase2("Hello"));
    println(upperCase2("Casa"));

}