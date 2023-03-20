fun greatPerson (greeting: String = "Hello", name:String) = println("$greeting $name")
fun main(){
    greatPerson(greeting = "Hi", name="Jean Luc")
    greatPerson(name="Luc", greeting = "Hello Mr.")

    // since there is a default value for greeting
    greatPerson(name="Abayo")
}