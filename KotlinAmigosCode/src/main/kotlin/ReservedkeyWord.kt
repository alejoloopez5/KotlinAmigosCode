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
}