import kotlin.random.Random

class Tortoise : Animal() {

    override fun run() : Int {
        val time = Random.nextLong(until = 2147483647L, from = 1L)
        println("Waiting for $time")
        Thread.sleep(100)
        velocity = (time / 2).toInt()
        println("Tortoise velocity is: $velocity")
        return velocity
    }
    override fun toString(): String {
        return "Tortoise"
    }
}