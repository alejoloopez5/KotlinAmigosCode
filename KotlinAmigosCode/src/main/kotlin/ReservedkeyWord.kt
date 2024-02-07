const val PI = 3.14 //static final

fun main(){
    //this is a comment
    /*
    * this is a other comment
    * */
    var name = "Alejo"
    name = "Manuel"
    println(name)
    //the variables type val does can't change
    val lastname = "Lopez"
    var anyVariable: Any = "4523"
    println(anyVariable)
    println(PI)

    //null safety
    var brand: String? = null
    println(brand?.uppercase())

    //interpolaret string
    var msg = "Name: ${name.uppercase()} and lastName: $lastname"
    println(msg)

    val email = """
        this is
        my
        email %s
        alejoloopez5
    """.trimIndent()
    println(email.format("people"))
    converData("20")
    operadorTernarioKotlin()
    whenExpression()
}

fun converData(value: String) {
    println(10 + value.toInt())
    println(10 + value.toDouble())
}

fun operadorTernarioKotlin(){
    var result = if (1>2) "one" else "two"
    println(result)
}

fun whenExpression() {
    val gender = "F"
    val g = when(gender) {
        "F" -> "Female"
        "M" -> "Male"
        else -> {
            "Unknow Gender"
        }
    }
    println(g)

    val age = 35
    val a = when(age) {
        in 13..18 -> "TEENAGER"
        !in 0..12 -> "ADULT"
        else -> {
            "Baby"
        }
    }
    println(a)
}