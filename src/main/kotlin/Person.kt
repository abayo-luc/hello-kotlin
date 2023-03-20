//class Person(val firstName:String, val lastName:String){
//    // here we gonna create a secondary constructor
//   init {
//       println("Init 1")
//   }
//    constructor() : this("John", "Doe"){
//        println("secondary constructor")
//    }
//
//    init{
//        println("Init 2")
//    }
//}

// we can applay visibility rule: public, internal, or private
class Person (val firstName:String = "John", val lastName:String = "Doe"){
  var nickName:String? = null
      set(value) {
       field = value
       println("the new nickname is $value")
      }

   get(){
     println("the return value is $field")
     return field
   }

    fun printInfo(){
        val nickNameToPrint = nickName ?: "no nickname"
        println("$firstName $lastName $nickNameToPrint")
    }
}