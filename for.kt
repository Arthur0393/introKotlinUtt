fun main() {
    var i = 1
    println("Valores de i: ")
    for (i in 1..10) {
        println(i)
    }

    println()
    println("letras: ")
    for (caracter in 'a'..'g' step 2) {
        println(caracter)
    }

    println()
    println("letras en reversa: ")
    for (caracter in 'g' downTo 'a') {
        println(caracter)
    }

    println()
    val mascotas = arrayOf("Perro", "Gato", "Tiburon", "Huron")
    println()
    println("mascotas: ")
    for (i in mascotas.indices) {
        println("[$i, ${mascotas[i]}]")
    }

    println()
    println("Dividiendo un String en caracteres: ")
    for (letra in "||| Hola mundo Kotlin |||") {
        println(letra)
    }
}
