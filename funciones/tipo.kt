// Usando funciones que regresan valores
// y funciones que no regresan valores

fun main() {
    var n1 = 5
    var n2 = 6
    borde("=", 20)
    // var resultado = sum(n1, n2)
    borde("*", 35)
}

fun borde(caracter: String, veces: Int) {
    for (i in 1..veces) {
        print("$caracter")
    }
    println()

    // Ejemplo 1 de funcion anonima
    val slogan = { r: Int -> println("Tu puedes con $r problemas y mas") }
}
// Invocar funcion anonima - forma 1
slogan(resultado)

    val resta = (n1 : Int, n2 : Int -> n1 -n2)
 
fun sum(n1: Int, n2: Int): Int {
    return n1 + n2
}
