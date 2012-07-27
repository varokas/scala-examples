// Run me with: scala <filename>

//*** Closure ****
def calculate(

	a:Int, 
	b:Int, 
	operation:(Int,Int) => Int

) = operation(a,b)

//Think: anonymous class
val add = (a:Int, b:Int) => { a + b }
val subtract = (a:Int, b:Int) => { a - b }
val multiply = (a:Int, b:Int) => { a * b }

println(calculate(1,2,add))
println(calculate(1,2,subtract))

//*** Inline Closure ****
calculate(2,1, (a:Int,b:Int) => a + b )

calculate(2,1, (a,b) => a + b ) //Type inference


//*** Using closure in collections 
val aList = List(1,2,3,4)

//*** foreach ****
println("Foreach")
aList.foreach( item => println(item) )

//*** Map ***
println( 
	aList.map( item => item * 2 ) 
)

//*** Reduce ***
println( 
	aList.reduce( (acc,n) => acc + n ) 
)

//*** Compose ****
case class Product(name:String, price:Int)

val products = List(
	new Product("A", 1),
	new Product("B", 2),
	new Product("C", 3)
)

// Old school
var total:Int = 0
for(product <- products) {
	total += product.price
}
println("total = " + total)

// Closure
println(
	"total = " + 
	products
		.map( p => p.price )
		.reduce( (acc,n) => acc + n )
)

println( "total = " + products.map( p => p.price ).reduce( (acc,n) => acc + n ) )
