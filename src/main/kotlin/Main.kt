fun main() {

    // Alertar a todos que estiverem acompanhado a corrida qual animal foi mais rapido
    val animals = listOf<Animal>(Tiger(), Lion(), Cheetah(),Tortoise())

    val laps = 5

    Race(animals, laps).start()
}