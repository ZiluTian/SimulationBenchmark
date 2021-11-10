package generated.ticktalk.example.gameOfLife

object InitData  {
    def apply(width: scala.Int, height: scala.Int): scala.`package`.List[ticktalk.example.`package`.Actor] = {
      val totalPoints: scala.Int = width.*(height);
      val neighborRadius: scala.Int = 1;
      val points = scala.Predef.intWrapper(1).to(totalPoints).map[generated.ticktalk.example.gameOfLife.Cell, scala.collection.immutable.IndexedSeq[generated.ticktalk.example.gameOfLife.Cell]](((x: Int) => new Cell(ticktalk.example.`package`.Random.nextBoolean())))(scala.collection.immutable.IndexedSeq.canBuildFrom[generated.ticktalk.example.gameOfLife.Cell]);
      scala.Predef.intWrapper(1).to(totalPoints).foreach[Unit](((i: Int) => points.apply(i.-(1)).`connectedAgents_=`(lib.Grid.Torus2D.getNeighborCells(width, height)(i.-(1), neighborRadius).map[generated.ticktalk.example.gameOfLife.Cell, List[generated.ticktalk.example.gameOfLife.Cell]](((j: Int) => points.apply(j)))(scala.collection.immutable.List.canBuildFrom[generated.ticktalk.example.gameOfLife.Cell]).map[(meta.runtime.Actor.AgentId, generated.ticktalk.example.gameOfLife.Cell), List[(meta.runtime.Actor.AgentId, generated.ticktalk.example.gameOfLife.Cell)]](((x: generated.ticktalk.example.gameOfLife.Cell) => scala.Tuple2.apply[meta.runtime.Actor.AgentId, generated.ticktalk.example.gameOfLife.Cell](x.id, x)))(scala.collection.immutable.List.canBuildFrom[(meta.runtime.Actor.AgentId, generated.ticktalk.example.gameOfLife.Cell)]).toMap[meta.runtime.Actor.AgentId, meta.runtime.Actor](scala.Predef.$conforms[(meta.runtime.Actor.AgentId, generated.ticktalk.example.gameOfLife.Cell)]))));
      points.toList
    }
}