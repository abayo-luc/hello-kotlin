class FancyInfoProvider : BasicInfoProvider() {
    override val providerInfo: String
        get() = "fancyInfoProvider"
    override val sessionIdPrefix: String
        get() = "FancySession"
    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("fancy info")
    }

}



fun main(){
    val provider = FancyInfoProvider()
    provider.printInfo(Person())
}