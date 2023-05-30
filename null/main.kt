fun main() {
    var nombre: String? = null
    println("Imprimiendo el valor nulo de nombre: ")
    println(nombre)
    // var nombre: String = ""
    // println(nombre)
    nombre = "Habara"
    // println(nombre!!.length)
    var longitud = nombre?.length ?: 0
    println("Longitud de nombre: ")
    println(longitud)
}
