import kotlin.random.Random

class Tiger : Animal() {

    override fun run() : Int {
        val time = Random.nextLong(until = 2147483647L, from = 1L)
        println("Waiting for $time")
        Thread.sleep(100)
        velocity = (time /4).toInt()
        println("Tiger velocity is: $velocity")
        return velocity
    }
    override fun toString(): String {
        return "Tiger"
    }
}