fun main() {

    val a = 10
    val b = 5
    var c = 0

    println("Operadores:")

    println("SUMA")
    // c = a + b
    c = a.plus(b)
    println("$c = $a + $b")
    println("==================")

    println("RESTA")
    // c = a - b
    c = a.minus(b)
    println("$c = $a - $b")
    println("==================")

    println("COMPARACIONES")
    // a > b
    println(b.compareTo(a) < 0)
    println("$a > $b = " + (a > b))
    println("==================")

    // b > a
    println(b.compareTo(a) < 0)
    println("$b > $a = " + (b > a))
    println("==================")

    //
    println("a == b :" ))
    println(a.equals(b))
    println("==================")

    //
    println("a != b :" ))
    println(a.equals(b))
    println("==================")

    //
    println("a & b :" ))
    println(a.equals(b))
    println("==================")

}


