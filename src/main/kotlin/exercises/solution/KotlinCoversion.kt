package demo

open class Vehicle(protected val brand: String) {
    fun startEngine() =
        println("Starting the engine of $brand")

    open fun isFourWheeler() = false
}

class Car(brand: String, private val isAutomatic: Boolean) : Vehicle(brand) {
    override fun isFourWheeler() = true
}

class Motorcycle(brand: String, private val hasSidecar: Boolean) : Vehicle(brand)
