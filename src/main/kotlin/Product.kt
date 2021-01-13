data class Product(val length: Double, val width: Double, val height: Double, val weight: Double) {

    fun getSize(): Double {
        return length * width * height
    }
}
