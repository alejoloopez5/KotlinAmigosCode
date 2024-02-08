fun main() {
    val names = arrayOf("Alejo","Manuel","Eli")
    println(names.contentToString())
    println(names.first())

    val names2: List<String> = listOf(
        "Manu",
        "Alejo",
        "Eli",
        "Luciana"
    )

    println(names2)
    println(names2.get(1))
    println(names2.contains("Manu"))

    val names3 = mutableListOf<String>(
        "uno",
        "dos",
        "tres"
    )
    println(names3.indexOf("dos"))
    names3.remove("dos")
    println(names3)
    names3.add("cuatro")
    println(names3)

    //Destructuring
    val (one, two,three) = names3
    println("$one $two $three")
}