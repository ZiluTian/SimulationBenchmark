package ticktalk.example.cellularAutomata.wator

trait watorCell {
    var energy: Int
    var age: Int
}

case class Fish(var energy: Int, var age: Int = 0) extends watorCell

case class Water(var energy: Int=0, var age: Int = 0) extends watorCell

case class Shark(var energy: Int, var age: Int = 0) extends watorCell
