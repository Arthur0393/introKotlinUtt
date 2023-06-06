// trabajando con mapas

fun main() {
    // mapa inmutable
    val ladas: Map<Int, String> = mapOf(1 to "USA", 34 to "España", 52 to "Mexico", 233 to "Ghana")

    // imprimimos el conjunto de pares clave valor
    println(ladas)

    // imprimiendo el mapa usando un for
    for ((key, value) in ladas) {
        println("La clave lada de $value es $key")
    }

    // Imprimiendo el mapa usando lambda
    ladas.forEach((k , v) -> println("${k} -> ${v}"));
    
    // recuperar un solo elemento del mapa
    // Forma 1
    println(ladas.get(52))
    // Forma 2
    println(ladas[52])

    // recuperar su tamaño, cuantos pares hay en el mapa
    println("Tamaño: ${ladas.size}")

    // Recuperar solo las claves
    println("Claves del mapa: ${ladas.keys}")

    // Recuperar solo los valores
    println("Claves del mapa: ${ladas.values}")

    // Recuperar las entradas
    println("Entrada del mapa: ${ladas.entries}")

    // Recuperar un valor si existe, sino, envia el default
    println("Valor de la lada 1: ${ladas.getOrDefault(1, "Pais Desconocido")}")

    // COmprobar si el mapa esta vacio
    println("Mapa vacio: ${ladas.isEmpty()}")

    // Comprobar si existe una clave especifica en el mapa
    println("Existe la clave lada 86: ${86 in ladas}")

    // Comprobar si existe un valor en el mapa
    println("Existe el valor Mexico en el mapa: ${"Mexico" in ladas.values}")

    // Mapa mutable
    var nums = mutableMapOf(
        "one" to 1, 
        "two" to 2, 
        "three" to 3, 
        "four" to  4
    )
    println("Mapa de numeros: $nums")
    // elimina valores del mapa
    nums.remove("two")
    // agregando par al mapa
    nums["six"] = 6
    println("Mapa nuevo de numero: $nums")

    var sortedNums = nums.toSortedMap()
    println("MApa ordenado: $sortedNums")

    // RETO
    // Crear un adicionario español - ingles usando un mapa
    // 1.- Funcion para crear o cargar el diccionario
    // 2.- Funcion para consulta, reciba una palabras en español y devueva su trduccion, sino existe traduccion, un valor por default
    // 3.- Imprimir todo el diccionario
}
