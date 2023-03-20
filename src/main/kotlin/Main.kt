fun sayHello(greeting: String, vararg peopleToGreet: String){
    peopleToGreet.forEach{person -> println("$greeting $person")}
}



fun main(){
    var people = arrayOf("Jean","Luc","Jude","Maricus","Haland")
    sayHello("Hello", "Jean Luc", "Haland")

    // the * is spread operator
    sayHello("Hi", *people)
}