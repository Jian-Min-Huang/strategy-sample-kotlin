import kotlin.math.min

class Cart {
    fun shippingFee(shipper: String, length: Double, width: Double, height: Double, weight: Double): Double {
        when (shipper) {
            "black cat" -> {
                if (weight > 20) {
                    return 500.0
                } else {
                    return 100 + weight * 10
                }
            }
            "hsinchu" -> {
                val size = length * width * height
                if (length > 100 || width > 100 || height > 100) {
                    return size * 0.00002 * 1100 + 500;
                } else {
                    return size * 0.00002 * 1200;
                }
            }
            "post office" -> {
                val feeByWeight = 80 + weight * 10
                val size = length * width * height
                val feeBySize = size * 0.00002 * 1100
                return min(feeByWeight, feeBySize)
            }
            else -> {
                throw IllegalArgumentException("shipper not exist")
            }
        }
    }
}