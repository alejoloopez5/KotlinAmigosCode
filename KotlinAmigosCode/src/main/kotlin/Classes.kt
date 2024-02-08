fun main() {
    val tv = SmartDevice(brand = "samsung", price = 800.0)
    val phone = SmartDevice("xiaomi", 600.0)

    println("${tv.brand} and ${tv.price}")
}

class SmartDevice constructor(brand: String, price: Double) {
    var brand = brand
    get() = field
    set(value) {
        field = value
    }
    var price = price
}