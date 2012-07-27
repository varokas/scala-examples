// Run me with: scala <filename>


//**** Simple Class ****
//public by default
class AClass {
	def publicMethod(a:Int):String = { return null }
	private def privateMethod(a:Int):String = { return null }
}

//**** Inheritance ****

//A trait is approximately a Java "Interface"
trait DataAccess { 
	def update():Unit //Unit is approximately "void" in scala
}

abstract class AbstractDataAccess extends DataAccess { 
	//An abstract class don't need to override a thing
}

//Note: Note that we use "extends" for trait
class DataAccessImpl extends DataAccess {
	//Note the overide keyword
	override def update():Unit = { 
	}
}

//Note: Extends <abstract class> with <trait>
class DataAccessImpl2 extends AbstractDataAccess with DataAccess {
	//Note the overide keyword
	override def update():Unit = { 
	}
}

//***** Constructor *****

//You need at least one
class ConstructorExample(var one:Int,val two:Int) {
}

//init
var c = new ConstructorExample(1,2)

//init with var name
new ConstructorExample( one = 1, two = 2 )


//**** Classes with main method ****
//1. object keyword == "static class"
object MainClass { 
  //Main method
  //1. Unit is approximately "void" in Scala
  //2. Note that we use [String] for generics
  //3. Note how we declare an array
  def main(args:Array[String]):Unit = {
  	println("Nice to meet you")
  }
}


//***** Case class *****
case class Person(val firstname:String, val lastname:String)

val person1 = new Person("First", "Last")
val person2 = new Person("First", "Last")

//equals() is auto generated
assert(person1.equals(person2))
//toString() is auto-gen
println(person1)