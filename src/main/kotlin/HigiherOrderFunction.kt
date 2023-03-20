import sun.invoke.empty.Empty

// high order function are functions that either return another function or take functions as paramter values

fun printFilteredString(list: List<String>, predicate:((String) -> Boolean)?){
    list.forEach {
        if(predicate?.invoke(it) === true){
            println(it)
        }
    }
}

fun getPrintPredicate(): (String) -> Boolean {
    return { it.startsWith("J")}
}
fun main(){
    val list = listOf("Kitlin", "Java", "JavaScript", "C++")

//    printFilteredString(list, {it.startsWith("K")})
//
//    // we can convert the above into lambda function to look like this:
//    printFilteredString(list) {
//        it.startsWith("K")
//    }
//
//    printFilteredString(list, getPrintPredicate())

    list.filterNotNull().filter{it.startsWith("J")}
        .map{
            it.length
        }
        .forEach{
        println(it)
    }

    val language = list.filterNotNull().findLast { it.startsWith("Foo") }.orEmpty()
    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>$language>>>>>>>>>>>>>>>>>>>>>>>>")
}