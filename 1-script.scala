// Run me with: scala <filename>
//***** Print ******
println("Hello world")

//***** Variable Assignment ******
var a:String = "Hello" 
val b:String = "World" //val == "final var"

a = "Hola" 
//b = "Earth" // !! Cannot reassign final variable

//****** Basic Type Inference ******
var c = "A String" // C will have a type of String
// c = 1 // !! Compiles error

//****** Methods Def ******
def addition(a:Int, b:Int):Int = { 
	return a + b 
}

//**** if/else ****
if(a == "Hola") {
	a = "Hello"
} else {
	a = "ABCD"
}

//**** while ****
while(true != true) {
	println("You should not be here")
}

//**** For is a little strange
//     In matter of fact, you only have for-each ****
println("Lets do some loop!")
for( i <- 0 until 5) {
	println(i)
}