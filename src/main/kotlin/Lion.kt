import kotlin.random.Random

class Lion : Animal() {

    override fun run() : Int {
        val time = Random.nextLong(until = 2147483647L, from = 1L)
        println("Waiting for $time")
        Thread.sleep(100)
        velocity = (time / 5).toInt()
        println("Lion velocity is: $velocity")
        return velocity
    }

    override fun toString(): String {
        return "Lion"
    }
}