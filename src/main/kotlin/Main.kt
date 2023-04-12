//Session One (Lists)
fun main() {
    println(listStrings(listOf("Me", "bag", "gate", " bottle", "chair", "water")))
    println(calculate(listOf(40.00, 58.03, 1.89)))
    arrange(info = listOf(PersonObject("Christelle", 23, 1.79, 50.00),
        PersonObject("Aniso", 34, 3.89, 56.02),
        PersonObject("Bebe", 1, 10.03, 0.56)
    ))
 println(car(listOf(
         Car("RAG56", 20.09),
         Car("kdf", 56.78),
         Car("kcd45", 67.08)
 )))


    println()
    println(sortList(listOf(3, 90, 56, 20, 0)))
    println(reverseList(listOf(3, 90, 56, 20, 0)))
    println(removeDuplicate(listOf(4, 6, 87, 4, 6)))
    println(averageList(listOf(4, 6, 87, 4, 6)))
    println(maxList(listOf(4, 6, 87, 4, 6)))
    println(minList(listOf(4, 6, 87, 4, 6)))
    numbers()
    println(namesArray(arrayOf("Chair", "Sofa", "Imodoka", "Pullover", "Jumpsuit")))
    age(23)


}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun listStrings(names: List<String>): List<String>{
    var emptyList = listOf<String>()
    for (a in names)
        if (names.indexOf(a) % 2 == 0) {
            emptyList += a

        }
        return emptyList

}

//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
data class Peopleinfo (var height: Double, var weight: Double)
fun calculate (measure : List<Double>): Peopleinfo{
    val average = measure.average()
    val total = measure.sum()
    var info = Peopleinfo(average, total)
    return info

}

//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age

data class PersonObject (var name: String, var age: Byte, var height: Double, var weight: Double)
fun arrange (info: List<PersonObject>){
    println (info.sortedByDescending { info ->info.age })
//    fun createdPerson(person:List<Person>) {
//    println(person.sortedByDescending {person ->person.age  })
}
//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
fun twoMore(): List<PersonObject>{
    val person1 = PersonObject("Clever", 23, 1.70, 98.03)
    val person2 = PersonObject ("Joshua", 12, 1.98, 65.05)
    return mutableListOf(person1,person2)
}
//Question 5
//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.

data class Car (var registration: String, var mileage: Double)
fun car(carr: List<Car>): Double{
    var sum = carr.sumOf { mile-> mile.mileage }
    var average = sum/ carr.size
    return average
}





//Write a function sortList that takes a list of integers and returns a sorted list of integers.
fun sortList(numbers: List<Int>): List<Int>{
   return (numbers.sorted())
}
//Write a function reverseList that takes a list of integers and returns a reversed list of integers
fun reverseList(num: List<Int>): List<Int>{
    return (num.reversed())
}
//Write a function removeDuplicates that takes a list of integers and returns
// a list of integers with all duplicates removed
fun removeDuplicate( number: List<Int>): List<Int>{
    return (number. toSet().toList())
//    .toSet gives a list the properties of a set( which does not allow duplications)
//    .toList returns the list from a set back to the list format
}

//Write a function filterList that takes a list of integers and a predicate function, and returns a
// list of integers that satisfy the predicate function.
fun filterList(num: List<Int>, predicate: (Int)-> Boolean): List<Int>{
    return (num.filter(predicate))
}
//Write a function sumList that takes a list of integers and
// returns the sum of all the integers in the list.
fun sumList(num: List<Int>): Int{
    return (num.sum())
}
//Write a function averageList that takes a list of integers
// and returns the average of all the integers in the list
fun averageList(num: List<Int>): Double{
    return (num.average())
}
//Write a function maxList that takes a list of integers and returns the maximum integer in the list.
fun maxList(num: List<Int>): Int{
    return (num.max())
}
//Write a function minList that takes a list of integers and returns the minimum integer in the list.
fun minList(num: List<Int>): Int{
    return (num.min())
}
// Part 2 (Flow Control)
//Create a function that prints out all the odd numbers between 1 and 100
fun numbers(){
    for (num in 1..100)
        if(num%2==1){
            println( num)
        }
}
//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters
fun namesArray(names: Array<String>): Int{
    var u = 0
    for (name in names)
        if( name.length>5){
            u ++
        }
    return  u
}
//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age.
fun age(age: Byte){
    when (age){
        in 0..7 -> println("Milk")
        in 7..15 -> println ("Orange")
        else -> println("Coca-cola")
    }

}
//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.
