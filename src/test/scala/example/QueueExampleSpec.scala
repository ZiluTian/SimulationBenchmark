// package ticktalk.benchmark
// package QueueExample

// import scala.collection.mutable.ListBuffer
// import meta.deep.IR
// import meta.deep.IR.TopLevel._
// import meta.compile.compileSims
// import meta.runtime.Actor
// import scala.util.Random

// class QueueExample extends org.scalatest.FlatSpec {
//     import meta.API._

//     "queue example" should "run and print the average wait time" in {

//         val totalCustomers: Int = 5
//         val totalTellers: Int = 1

//         val customers: List[Customer] = (1 to totalCustomers).map(_ => new Customer(10)).toList
//         val tellers: List[Teller] = (1 to totalTellers). map(_ => new Teller(3)).toList
        
//         val c = new SimulationConfig(customers ::: tellers, totalTurn = 10)

//         StartSimulation[BaseStaged.type](c)
//     }
// }