// map come ins form ov key value pair  ( in javascript is an object).
fun main(){
    val person = mutableMapOf("name" to "Jean Luc", "age" to 25, "location" to "Kigali")
    for (entry in person) {
        println(entry)
    }

    // you can use lambda function
    person.forEach{(key, value) ->
        println("$key -> $value")
    }

    person["skills"] = "Javascript"

    println(person["skills"])
}