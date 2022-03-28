fun main() {

    // Alertar a todos que estiverem acompanhado a corrida qual animal foi mais rapido
    val animals = listOf<Animal>(Tiger(), Lion(), Cheetah(),Tortoise())

    Race(animals).start()
}