// Run me with: scala <filename>
// ported from XTend examples: http://www.eclipse.org/xtend/documentation.html#_0

case class Movie(
  val title:String,
  val year:Int,
  val rating:Double,
  val numberOfVotes:Long,
  val categories:Set[String]
)

val movieLines = scala.io.Source.fromFile("data.csv").getLines.toList
val movies = movieLines.map( line => {
	val segments = line.split("  ").iterator
	new Movie(
	  segments.next, 
	  segments.next.toInt, 
	  segments.next.toDouble, 
	  segments.next.toLong, 
	  segments.toSet
	)
})

//Question 1 : What Is The Number Of Action Movies?
println( 
	movies
		.filter( m => m.categories.contains("Action"))
		.size
)

//Question 2 : What Is The Year The Best Movie From The 80's Was Released?
println(
	movies
		.filter( m => (1980 until 1989).contains(m.year) )
		.sortBy( m => m.rating ) 
		.last
		.year
)

//Question 3 : What Is The The Sum Of All Votes Of The Top Two Movies?
println(
	movies
		.sortBy( m => m.rating )
		.take(2)
		.map( m => m.numberOfVotes )
		.reduce( (acc,v) => acc + v )
)