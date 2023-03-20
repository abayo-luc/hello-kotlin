import java.util.UUID

enum class EntityType {
    HELP, EASY, MEDIUM, HARD;
    fun getFormattedName() = name.lowercase().replaceFirstChar{it.uppercase()}
}
object EntityFactory {
    fun create(type: EntityType): Entity {
        val id = UUID.randomUUID().toString()
        val name = type.getFormattedName()
        return when (type){
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name, 2f)
            EntityType.HELP -> Entity.Helper
        }
    }
}
sealed class Entity {
    object  Helper: Entity() {
        val name = "Helper"
    }
    data class Easy(val id: String, val name: String): Entity()
    data class Medium(val id: String, val name: String): Entity()

    data class  Hard(val id: String, val name: String, val multiplier: Float): Entity()
}


fun main(){
    val message = when(EntityFactory.create(EntityType.EASY)){
        is Entity.Easy -> "Easy class"
        is Entity.Hard -> "Hard class"
        Entity.Helper -> "Help class"
        is Entity.Medium -> "Meidum class"
    }
    println(message)

}