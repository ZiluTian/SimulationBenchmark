package generated.ticktalk.example.segregation

object InitData  {
    def apply(width: scala.Int, height: scala.Int, population: scala.Int): scala.`package`.List[ticktalk.example.`package`.Actor] = {
      val world: WorldMap = new WorldMap(width, height);
      val populationSize: scala.Int = population;
      val toleranceThreshold: scala.Double = 0.5;
      val people = scala.Predef.intWrapper(1).to(populationSize).map[generated.ticktalk.example.segregation.Person, scala.collection.immutable.IndexedSeq[generated.ticktalk.example.segregation.Person]](((i: Int) => {
        val p = if (scala.util.Random.nextBoolean())
          new Person(world, 0, toleranceThreshold)
        else
          new Person(world, 1, toleranceThreshold);
        p.`location_=`(i.-(1));
        p
      }))(scala.collection.immutable.IndexedSeq.canBuildFrom[generated.ticktalk.example.segregation.Person]);
      people.foreach[Unit](((x: generated.ticktalk.example.segregation.Person) => x.`connectedAgents_=`(people.map[(meta.runtime.Actor.AgentId, generated.ticktalk.example.segregation.Person), scala.collection.immutable.IndexedSeq[(meta.runtime.Actor.AgentId, generated.ticktalk.example.segregation.Person)]](((x: generated.ticktalk.example.segregation.Person) => scala.Tuple2.apply[meta.runtime.Actor.AgentId, generated.ticktalk.example.segregation.Person](x.id, x)))(scala.collection.immutable.IndexedSeq.canBuildFrom[(meta.runtime.Actor.AgentId, generated.ticktalk.example.segregation.Person)]).toMap[meta.runtime.Actor.AgentId, meta.runtime.Actor](scala.Predef.$conforms[(meta.runtime.Actor.AgentId, generated.ticktalk.example.segregation.Person)]))));
      {
        val x$1 = world;
        people.toList.::[meta.runtime.Actor](x$1)
      }
    }
}