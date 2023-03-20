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


// adding property and method to a class you don't control
fun Entity.Medium.printInfo(){
    println("Medium class: $id")
}

val Entity.Medium.info: String
    get() ="some info"
fun main(){
//    val message = when(EntityFactory.create(EntityType.EASY)){
//        is Entity.Easy -> "Easy class"
//        is Entity.Hard -> "Hard class"
//        Entity.Helper -> "Help class"
//        is Entity.Medium -> "Meidum class"
//    }
//    println(message)
    val entity1 = Entity.Easy(UUID.randomUUID().toString(), "name")
    val entity2 = EntityFactory.create(EntityType.MEDIUM)
    val entities = arrayOf(entity1, entity2)
    entities.forEach { entity ->
        if(entity is Entity.Medium){
            entity.printInfo()
            println(entity.info)
        }
    }
}