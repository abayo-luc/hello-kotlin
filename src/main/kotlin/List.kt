
// the difference between array and list ins kotlin is that
// array are mutable in nature (which means if we want to change an item at a specific index we can do it)
// list are immutable in nature, means you can't update the List<T> values, in order to update them you need
// to use MutableList<T>
// for more details, refer to this link: https://blog.mindorks.com/difference-between-list-and-array-types-in-kotlin/
fun main(){
    val interestingThings = mutableListOf<String>("Kotlin", "Programming", "Comic Book")
    println(interestingThings[0])

    interestingThings.forEachIndexed{index, item ->
        println("$item is of index $index")
    }

    interestingThings.add("Eating") // we should be able to add another item since this is a mutable list.
}