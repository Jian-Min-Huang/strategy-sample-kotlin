class Cart {
    fun shippingFee(shipperName: String, product: Product): Double {
        return getShipper(shipperName).calculateFee(product)
    }

    private fun getShipper(shipperName: String): Shipper {
        var shipper: Shipper
        when (shipperName) {
            "black cat" -> {
                shipper = BlackCat()
            }
            "hsinchu" -> {
                shipper = Hsinchu()
            }
            "post office" -> {
                shipper = PostOffice()
            }
            else -> {
                throw IllegalArgumentException("shipper not exist")
            }
        }
        return shipper
    }
}