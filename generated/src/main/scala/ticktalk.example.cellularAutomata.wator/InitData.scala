package generated.ticktalk.example.cellularAutomata.wator

object InitData  {
    def apply(width: scala.Int, height: scala.Int): scala.`package`.List[ticktalk.example.`package`.Actor] = {
      val totalPoints: scala.Int = width.*(height);
      val neighborRadius: scala.Int = 1;
      val points = scala.Predef.intWrapper(1).to(totalPoints).map[generated.ticktalk.example.cellularAutomata.wator.Cell, scala.collection.immutable.IndexedSeq[generated.ticktalk.example.cellularAutomata.wator.Cell]](((x: Int) => {
        val r = scala.util.Random.nextInt(10);
        if (r.==(1))
          new Cell(ticktalk.example.cellularAutomata.wator.Shark.apply(10, ticktalk.example.cellularAutomata.wator.Shark.apply$default$2))
        else
          if (r.<(7))
            new Cell(ticktalk.example.cellularAutomata.wator.Fish.apply(10, ticktalk.example.cellularAutomata.wator.Fish.apply$default$2))
          else
            new Cell(ticktalk.example.cellularAutomata.wator.Water.apply(0, ticktalk.example.cellularAutomata.wator.Water.apply$default$2))
      }))(scala.collection.immutable.IndexedSeq.canBuildFrom[generated.ticktalk.example.cellularAutomata.wator.Cell]);
      scala.Predef.intWrapper(1).to(totalPoints).foreach[Unit](((i: Int) => points.apply(i.-(1)).`connectedAgents_=`(lib.Grid.Torus2D.getNeighborCells(width, height)(i.-(1), neighborRadius).map[generated.ticktalk.example.cellularAutomata.wator.Cell, List[generated.ticktalk.example.cellularAutomata.wator.Cell]](((j: Int) => points.apply(j)))(scala.collection.immutable.List.canBuildFrom[generated.ticktalk.example.cellularAutomata.wator.Cell]).map[(meta.runtime.Actor.AgentId, generated.ticktalk.example.cellularAutomata.wator.Cell), List[(meta.runtime.Actor.AgentId, generated.ticktalk.example.cellularAutomata.wator.Cell)]](((x: generated.ticktalk.example.cellularAutomata.wator.Cell) => scala.Tuple2.apply[meta.runtime.Actor.AgentId, generated.ticktalk.example.cellularAutomata.wator.Cell](x.id, x)))(scala.collection.immutable.List.canBuildFrom[(meta.runtime.Actor.AgentId, generated.ticktalk.example.cellularAutomata.wator.Cell)]).toMap[meta.runtime.Actor.AgentId, meta.runtime.Actor](scala.Predef.$conforms[(meta.runtime.Actor.AgentId, generated.ticktalk.example.cellularAutomata.wator.Cell)]))));
      points.toList
    }
}