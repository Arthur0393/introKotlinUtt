// Hecho por C.Arturo

// RETO
// Crear un diccionario español - ingles usando un mapa
// 1.- Funcion para crear o cargar el diccionario
// 2.- Funcion para consulta, reciba una palabras en español y devueva su traduccion, sino existe
// traduccion, un valor por default
// 3.- Imprimir todo el diccionario

fun main() {
    val diccionario = mutableMapOf<String, String>()

    // Función para crear o cargar el diccionario
    fun cargarDiccionario() {
        diccionario["hola"] = "hello"
        diccionario["adiós"] = "goodbye"
        diccionario["perro"] = "dog"
        diccionario["gato"] = "cat"
    }

    // Función para consulta, recibe una palabra en español y devuelve su traducción
    fun consultarTraduccion(palabra: String): String {
        return diccionario[palabra.toLowerCase()] ?: "Traducción no encontrada"
    }

    // Imprimir todo el diccionario
    fun imprimirDiccionario() {
        for ((espanol, ingles) in diccionario) {
            println("$espanol - $ingles")
        }
    }

    // Cargar el diccionario
    cargarDiccionario()

    // Ejemplo de consultas
    println(consultarTraduccion("hola")) // Output: hello
    println(consultarTraduccion("gato")) // Output: cat
    println(consultarTraduccion("casa")) // Output: Traducción no encontrada

    // Imprimir todo el diccionario
    imprimirDiccionario()
}
