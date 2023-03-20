
fun main(){
    val interestingThings = arrayOf("Orange","Programing", "Comic Books")
    println(interestingThings.size)
    println(interestingThings[0])
   for (item in interestingThings){
       println(item)
   }
    println(">>>>>>>>>>>>>>>>>Use for each method on array>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
    interestingThings.forEach { item: String -> println(item) }

    interestingThings.forEachIndexed {index, item ->
        println("$item is at index $index")
    }
    // interestingThings[3] ="Jean Luc" this line would throw an error as we would be adding value to an array with a defined length.
}
