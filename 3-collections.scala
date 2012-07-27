// Run me with: scala <filename>

//**** Scala has its own collections ****
val aList = scala.collection.immutable.List()

//*** List ****
val emptyList = List()
val listOfInts = List(1,2,3)
val anotherList = List(4)

val joinedList = listOfInts ::: anotherList //Immutable
println(joinedList)

//*** Mutable List ****
val lb = new scala.collection.mutable.ListBuffer[Int]
lb.append(1)
lb += 2       //Overloaded parameter

println(lb.toList)

//*** Map ***
val map = Map("a" -> 1, "b" -> 2)
println(map)

//*** Set ***
val set = Set("a","b")
println(set)

//*** Convert from Java

//This import will automatically convert Java to Scala
import scala.collection.JavaConversions._ //Can import anywhere

val a = new java.util.ArrayList[Int]()
println(a.distinct) //Distinct defenitely is not a member of java.util.List