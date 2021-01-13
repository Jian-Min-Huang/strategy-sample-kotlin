class Cart {
    var shippers = mapOf<String, Shipper>(
        "black cat" to BlackCat(),
        "hsinchu" to Hsinchu(),
        "post office" to PostOffice(),
    )

    fun shippingFee(shipperName: String, product: Product): Double {
        return getShipper(shipperName)!!.calculateFee(product)
    }

    private fun getShipper(shipperName: String): Shipper? {
        return shippers[shipperName]
    }
}