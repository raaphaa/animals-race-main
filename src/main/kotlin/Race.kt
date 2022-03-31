class Race(val animals : List<Animal>, val laps : Int) {
/* A cada volta dos animais somar e dividir pela quantidade de voltas dadas e ver qual animal teve a melhor média */

    fun start(){
        race()
        winner()
    }

     fun race(){
         for (lap in 1 ..laps){

             println("\n Lap #$lap! \n ")

             var fasterAnimalOfLap = Int.MAX_VALUE
             var animalName : String? = null

             animals.forEach {
                 it.run()

                 it.sumOfSpeeds += it.velocity

                 if(it.velocity < fasterAnimalOfLap ) {
                     fasterAnimalOfLap = it.velocity
                     animalName = it.toString()
                 }
             }
             println("\n Faster on lap is: $animalName with speed of: $fasterAnimalOfLap")
         }
    }

    fun winner(){
        var average : Int
        var winnerOfAll = Int.MAX_VALUE
        var animalName = "Ant"

        for(animal in animals){

            average = animal.sumOfSpeeds / laps

            if(average < winnerOfAll ) {
                winnerOfAll = average
                animalName = animal.toString()
            }

        }
        println("\n Winner is: $animalName with speed of: $winnerOfAll")
    }
}