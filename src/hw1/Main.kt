package hw1

fun main() {
    var pointA = Point(5, 6)
    var pointB = Point(1, 3)
    var pointC = Point(5, 6)
    println(pointA)
    println(pointA)
    println(pointB)
    println(pointC)
    println(pointA.equals(pointC))
    pointA.moveSymetricX()
    println(pointA)
    println(pointA.equals(pointB))
}