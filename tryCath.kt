fun main() {
    var nombre: String? = null
    println("Imprimiendo el valor nulo de nombre: ")
    println(nombre)
    // var nombre: String = ""
    // println(nombre)
    // nombre = "Habara"
    // println(nombre!!.length)
    // var longitud = nombre?.length ?: 0
    // println("Longitud de nombre: ")
    // println(longitud)

    // try {
    //     println("nombre: $nombre")
    // } catch (excepcion: NullPointerException) {
    //     println("Ha ocurrido un error")
    //     println(excepcion)
    // } finally {
    //     println("Lo que este en finally, se ejecutara siempre")
    // }
    println("------------------- try --------------------")
        var longitud = -1
        try{
            longitud = nombre?:length
        } cath(error : NullPointerException){
            // hubo un error, no se pudo obtener la logitud
            longitud = 0
        } finally{
            println("Valor de logitud: $logitud")
        }
        println("Termina prueba de try")
}
