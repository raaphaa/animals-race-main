abstract class Animal(var velocity : Int = 0) {

    open var sumOfSpeeds : Int = 0

    abstract fun run() : Int
}