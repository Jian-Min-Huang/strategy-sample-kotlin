class Cart {
    fun shippingFee(shipperName: String, product: Product): Double {
        var shipper: Shipper
        when (shipperName) {
            "black cat" -> {
                shipper = BlackCat()
                return shipper.calculateFee(product)
            }
            "hsinchu" -> {
                shipper = Hsinchu()
                return shipper.calculateFee(product)
            }
            "post office" -> {
                shipper = PostOffice()
                return shipper.calculateFee(product)
            }
            else -> {
                throw IllegalArgumentException("shipper not exist")
            }
        }
    }
}