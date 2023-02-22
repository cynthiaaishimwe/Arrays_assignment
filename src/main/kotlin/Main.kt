fun main() {
country()
    cities()
    numbers()
 println(names("Cynthia","Cedrick","Bruce"))
}
fun country(){
    var country = arrayOf("Rwanda","Kenya","uganda","Tanzania")
    println(country.contentToString())

}
fun cities(){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    println("harare".capitalize())
    println("mumbai".capitalize())
    println("dodoma".capitalize())
    println("jarta".capitalize())
println(cities.contentToString())
}
fun numbers(){
    var number =arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = number[1]+number[4]
    println(sum)
println(number.indexOf(158))
println(number.sortedArray().contentToString())

}
fun names(firstborn:String,secondborn:String,thirdborn:String):String{
    var siblings= arrayOf(firstborn,secondborn,thirdborn)
    return siblings.contentToString()
}



