import kotlin.random.Random

abstract class Animal(
    var velocity : Int = 0,
    val baseVelocity : Int
) {

    open var sumOfSpeeds : Int = 0

    fun run() : Int{
        val time = Random.nextLong(until = 2147483647L, from = 1L)
        Thread.sleep(100)
        velocity = (time / this.baseVelocity).toInt()
        println("${toString()} velocity is: $velocity")
        return velocity
    }
}