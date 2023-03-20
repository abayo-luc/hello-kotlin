interface PersonInfoProvider{
    val providerInfo: String
    fun printInfo(person:Person){
        println(providerInfo)
        person.printInfo()
    }
}


interface SessionInfoProvider {
    fun getSessionId(): String
}
class BasicInfoProvider: PersonInfoProvider, SessionInfoProvider{
    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional logic")
    }

    override fun getSessionId(): String {
        return "session-id"
    }
}

fun main(){
    val provider = BasicInfoProvider()
    provider.printInfo(Person())
    println(provider.getSessionId())
    checkTypes(provider)
}

fun checkTypes(infoProvider: PersonInfoProvider){
    if(infoProvider !is SessionInfoProvider){
        println("is not a session info provider")
    } else {
        println("is a session info provider")
        infoProvider.getSessionId()
    }
}