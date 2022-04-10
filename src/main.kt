fun main(){
var y=names(listOf("Judy","Wanjiru","Wainaina","Hayes","Solo","Frank","John","Nancy","Verite","Mercy"))
println(y)
    var doctor=People("Emmanuel",32,2.0,56.0)
    var trainer=People("Laura",45,4.3,70.5)
    var farmer=People("Patrick",67,3.5,56.5)

    var mySomeone= listOf(doctor,trainer,farmer)
    var mS=mySomeone.sortedByDescending { people -> people.age }
    println(mS)
    var twiga=heights(listOf(6.2,5.5,4.7,5.8))
    println(twiga)

    var one=People("Jane",25,5.6,75.0)
    var two=People("Kirigo",56,4.2,42.0)
    var all= mutableListOf(one,two)
    println(all.plus(mySomeone))
var audi=Car("kbw230",45.76)
    var toyota=Car("kcsa321",56.4)
    var mazda=Car("bmwn2786",90.5)
var vehicle= listOf(audi,toyota,mazda)
    println(carArrange(vehicle))
}
fun names(name:List<String>):List<String>{
    var even= mutableListOf<String>()
    name.forEachIndexed { index, s ->
        if (index %2==0){
            even.add(s)
        }

    }
   return even
}
//Given a list of people's heights in meters.write a function that returns
//the average height and the total height
fun heights(refu:List<Double>):String{
    var total=refu.sum()
    var average=refu.average()
    var combination="$total,$average"
    return combination
}


// given a list of Person objects,each with the attributes,name,age,height,and weight.Sort the list in
//order of descending age
data class People(var name:String,var age:Int, var height:Double,var weight:Double){

}
//4.  Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
fun peps(personsecond:List<Any>):List<Any>{

    return listOf()
}

//. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.      (3 points)
data class Car(var registration:String,var mileage:Double)
fun carArrange(car: List<Car>):Double{
    var total=0.0
    car.forEach { carz->
        total+=carz.mileage
    }
    return total/car.count()

}
