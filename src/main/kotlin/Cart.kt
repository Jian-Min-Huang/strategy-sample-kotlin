import kotlin.math.min

class Cart {
    fun shippingFee(shipper: String, product: Product): Double {
        when (shipper) {
            "black cat" -> {
                if (product.weight > 20) {
                    return 500.0
                } else {
                    return 100 + product.weight * 10
                }
            }
            "hsinchu" -> {
                if (product.length > 100 || product.width > 100 || product.height > 100) {
                    return product.getSize() * 0.00002 * 1100 + 500;
                } else {
                    return product.getSize() * 0.00002 * 1200;
                }
            }
            "post office" -> {
                val feeByWeight = 80 + product.weight * 10
                val feeBySize = product.getSize() * 0.00002 * 1100
                return min(feeByWeight, feeBySize)
            }
            else -> {
                throw IllegalArgumentException("shipper not exist")
            }
        }
    }
}