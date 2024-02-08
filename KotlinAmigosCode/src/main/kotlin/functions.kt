fun main() {
    defaultArguments("manuel",36)
    defaultArguments(name = "Alejo")
    functionasArgumet(bar = { println("bar as a function") })
}

fun defaultArguments(name: String, age: Int = 18){
    println("Hola $name tu edad es: $age")
}

fun functionasArgumet(bar: () -> Unit){
    println("bar function")
    bar()
}