class Hsinchu : Shipper {
    override fun calculateFee(product: Product): Double {
        if (product.length > 100 || product.width > 100 || product.height > 100) {
            return product.getSize() * 0.00002 * 1100 + 500;
        } else {
            return product.getSize() * 0.00002 * 1200;
        }
    }
}
