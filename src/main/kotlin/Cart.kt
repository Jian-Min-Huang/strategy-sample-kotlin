class Cart {
    var shippers = mapOf(
        "black cat" to BlackCat(),
        "hsinchu" to Hsinchu(),
        "post office" to PostOffice(),
    )

    fun shippingFee(shipperName: String, product: Product): Double {
        return shippers[shipperName]?.calculateFee(product) ?: error("not such shipper name : $shipperName")
    }
}