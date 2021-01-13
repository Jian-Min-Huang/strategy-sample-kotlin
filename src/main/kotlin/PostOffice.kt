import kotlin.math.min

class PostOffice {
    fun calculateFee(product: Product): Double {
        val feeByWeight = 80 + product.weight * 10
        val feeBySize = product.getSize() * 0.00002 * 1100
        return min(feeByWeight, feeBySize)
    }
}
