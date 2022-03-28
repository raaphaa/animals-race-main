class Race(val animals : List<Animal>) {
/* A cada volta dos animais somar e dividir pela quantidade de voltas dadas e ver qual animal teve a melhor média */

    fun start(){
        race()
        winner()
    }
     fun race(){
         for (laps in 1 .. 5){

             println("\n Lap # $laps! \n ")
             animals.forEach { it.run() }

             var fasterAnimalOfLap = 2147483647
             var animalName : String = "Ant"

             for(animal in animals){

                 animal.sumOfSpeeds += animal.velocity

                 if(animal.velocity < fasterAnimalOfLap ) {
                     fasterAnimalOfLap = animal.velocity
                     animalName = animal.toString()

                 }
             }
             println("\n Faster on lap is: ${animalName.toString()} with speed of: $fasterAnimalOfLap")
         }
    }

    fun winner(){
        var average = 0
        var winnerOfAll = 0
        var animalName : String = "Ant"

        for(animal in animals){

            average = animal.sumOfSpeeds/5

            if(average > winnerOfAll ) {
                winnerOfAll = average
                animalName = animal.toString()
            }

        }
        println("\n Winner is: $animalName with speed of: $winnerOfAll")
    }
}