class BlackCat {
    fun calculateFee(product: Product): Double {
        if (product.weight > 20) {
            return 500.0
        } else {
            return 100 + product.weight * 10
        }
    }
}
