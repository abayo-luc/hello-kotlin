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
open class BasicInfoProvider: PersonInfoProvider, SessionInfoProvider{
    override val providerInfo: String
        get() = "BasicInfoProvider"
    // protected will not expose it as an instance property
    protected open val sessionIdPrefix = "session"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional logic")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
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