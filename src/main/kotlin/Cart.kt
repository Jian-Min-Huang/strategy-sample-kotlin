class Cart {
    fun shippingFee(shipper: String, product: Product): Double {
        when (shipper) {
            "black cat" -> {
                val blackCat = BlackCat()
                return blackCat.calculateFee(product)
            }
            "hsinchu" -> {
                val hsinchu = Hsinchu()
                return hsinchu.calculateFee(product)
            }
            "post office" -> {
                val postOffice = PostOffice()
                return postOffice.calculateFee(product)
            }
            else -> {
                throw IllegalArgumentException("shipper not exist")
            }
        }
    }
}