fun main() {
    val names = listOf("manu", "Alejo", "eli")
    val numbers = intArrayOf(2, 1, 3, 4, 5, 6, 7)

    for (name in names) {
        val newName = name.replaceFirstChar { it.uppercase() }
        println(newName)
    }

    val letters = charArrayOf('A', 'B', 'C', 'D')
    for (index in letters.indices) {
        println("$index - ${letters[index]}")
    }

    for (i in 1..5) println(i)

    for (l in names.first()) println(l)

    names.forEach {
        println(it)
    }

    var number = 1

    while (number <=5){
        println("Number: $number")
        ++number
    }
    continuoExample()
}

fun continuoExample(){
    val nums = intArrayOf(1,2,3,4,5,6,7,8)
    for(num in nums){
        if(num % 2 == 0){
            continue
        }
        if(num >=7) break
        println(num)
    }
}