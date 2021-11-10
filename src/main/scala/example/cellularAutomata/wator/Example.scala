package ticktalk.example
package cellularAutomata.wator

object Example extends App {
    
    val liftedMain = meta.classLifting.liteLift {
        def apply(width: Int, height: Int): List[Actor] = {

            val totalPoints: Int = width * height
            // 2D space
            val neighborRadius: Int = 1

            val points = (1 to totalPoints).map(x => {
                val r = scala.util.Random.nextInt(10)
                if (r==1) {
                    new Cell(ticktalk.example.cellularAutomata.wator.Shark(10))
                } else if (r < 7) {
                    new Cell(ticktalk.example.cellularAutomata.wator.Fish(10))
                } else {
                    new Cell(ticktalk.example.cellularAutomata.wator.Water(0))
                }
            })

            (1 to totalPoints).foreach(i =>
                points(i-1).connectedAgents = lib.Grid.Torus2D.getNeighborCells(width, height)(i-1, neighborRadius).map(j => points(j)).map(x => (x.id, x)).toMap
            )

            points.toList

        }
    }
    
    val cls1: ClassWithObject[Cell] = Cell.reflect(IR)

    compileSims(List(cls1), Some(liftedMain))
}