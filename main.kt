// Primer programa en Kotlin
fun main() {
    // Variables
    // Un val es un valor inmutable
    val veces = 35
    val borde = "&"

    printBorder(1, 30)
    println("hola mundo Kotlin")
    printBorder(3, 40)
    println()
    println("En este programa, el caracter de borde es: ${borde}")
    println("Y se imprime ${veces} veces")
}

// fun printBorder(numero: Int, caracter: String) {
//     repeat(numero) { print(caracter) }
//     println()
// }

fun printBorder(tipoCaracter: Int, numero: Int) {
    when (tipoCaracter) {
        1 -> {
            repeat(numero) { print('+') }
        }
        2 -> {
            repeat(numero) { print('-') }
        }
        3 -> {
            repeat(numero) { print('%') }
        }
        else -> {
            println("Error en tipo de caracter")
        }
    }
    println()
}
