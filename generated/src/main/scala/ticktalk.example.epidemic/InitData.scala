package generated.ticktalk.example.epidemic

object InitData  {
    def apply(populationSize: scala.Int): scala.`package`.List[ticktalk.example.`package`.Actor] = {
      val infectiousSeed = 4;
      val perCapitaContacts = 6;
      val seed = scala.Predef.intWrapper(1).to(infectiousSeed).map[generated.ticktalk.example.epidemic.Person, scala.collection.immutable.IndexedSeq[generated.ticktalk.example.epidemic.Person]](((x$1: Int) => {
      val p = new Person(perCapitaContacts, scala.util.Random.nextInt(90).+(1));
      p.`health_=`(ticktalk.example.epidemic.Infectious);
      p
    }))(scala.collection.immutable.IndexedSeq.canBuildFrom[generated.ticktalk.example.epidemic.Person]).toList;
      val people = {
        val x$2 = scala.Predef.intWrapper(1).to(populationSize.-(infectiousSeed)).map[generated.ticktalk.example.epidemic.Person, scala.collection.immutable.IndexedSeq[generated.ticktalk.example.epidemic.Person]](((x: Int) => new Person(ticktalk.example.`package`.Random.nextInt(perCapitaContacts), scala.util.Random.nextInt(90).+(1))))(scala.collection.immutable.IndexedSeq.canBuildFrom[generated.ticktalk.example.epidemic.Person]).toList;
        seed.:::[generated.ticktalk.example.epidemic.Person](x$2)
      };
      scala.Predef.intWrapper(1).to(populationSize).foreach[Unit](((i: Int) => people.apply(i.-(1)).`connection_=`(people.toList)));
      people.toList
    }
}