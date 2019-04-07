import Utils
import UtilsJava
import Person

fun main(args: Array<String>) {

   //val sum = Utils.sumNumber(number1 = 4, number2 = 2)

    //println(sum)

    testeAddList()
}

fun newArray(){
    val peoples = arrayListOf<String>("Daniel", "Andre", "Meg")

    for (people in peoples){
        println(people)
    }
}

fun testeList(){

    val person = Person(name = "Daniel", age = "29")

    println("${person.name}")
}

fun testeAddList(){

    val listPerson = ArrayList<Person>()

    listPerson.add(Person(name = "Daniel", age = "29"))
    listPerson.add(Person(name = "Daniel2", age = "30"))

    for(person in listPerson){

        println(person.name)
        println(person.age)
    }
}