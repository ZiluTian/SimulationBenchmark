package generated.ticktalk.example.segregation

class WorldMap (val width: Int, val height: Int) extends meta.runtime.Actor {

  val similarities: scala.collection.mutable.Map[Int,Double] = scala.collection.mutable.Map.apply[scala.Int, scala.Double]();
  val world: scala.collection.mutable.Map[Int,Long] = scala.collection.mutable.Map.apply[scala.Int, scala.Long]();
  val freeSpots: scala.collection.mutable.ListBuffer[Int] = scala.collection.mutable.ListBuffer.apply[scala.Int]();
  var totalReports: Int = 0;
  var segregationLevel: Double = 0.0;
  private var  reflectionIR_58: Int = -1
  private var resetData_0: scala.Any = null;
  private val resetData_1 = scala.collection.mutable.ListBuffer.apply[scala.collection.immutable.List[scala.Tuple2[scala.Tuple2[scala.Int, scala.Int], scala.Int]]]();
  private var resetData_2: meta.runtime.ResponseMessage = null;
  private val x_3 = scala.collection.mutable.ListBuffer.apply[scala.Any]();
  private val x_4 = scala.collection.mutable.ListBuffer.apply[scala.Any]();
  private val x_5 = scala.collection.mutable.ListBuffer.apply[scala.Any]();
  private val x_6 = scala.collection.mutable.ListBuffer.apply[scala.Any]();
  private val x_7 = scala.collection.mutable.ListBuffer.apply[scala.Any]();
  private val x_8 = scala.collection.mutable.ListBuffer.apply[scala.Any]();
  private var methodArgsMut_9: scala.Long = 0L;
  private var methodArgsMut_10: scala.Int = 0;
  private var methodArgsMut_11: scala.Int = 0;
  private var methodArgsMut_12: scala.Int = 0;
  private var methodArgsMut_13: scala.Double = 0.0;
  private var methodArgsMut_14: scala.Int = 0;
  private var bindingMut_15: scala.Any = null;
  private var listValMut_16: meta.runtime.RequestMessage = null;
  @transient private var iterMut_17: scala.collection.Iterator[meta.runtime.RequestMessage] = null;
  private var bindingMut_18: scala.Double = 0.0;
  private var bindingMut_19: java.lang.String = null;
  private var bindingMut_20: scala.Double = 0.0;
  private var bindingMut_21: scala.Double = 0.0;
  private var bindingMut_22: scala.Int = 0;
  private var bindingMut_23: scala.collection.mutable.Map[scala.Int, scala.Double] = null;
  private var bindingMut_24: scala.Double = 0.0;
  private var bindingMut_25: scala.collection.Iterable[scala.Double] = null;
  private var bindingMut_26: scala.collection.mutable.Map[scala.Int, scala.Double] = null;
  private var bindingMut_27: scala.Boolean = false;
  private var bindingMut_28: scala.Int = 0;
  private var bindingMut_29: scala.collection.mutable.Map[scala.Int, scala.Double] = null;
  private var bindingMut_30: scala.collection.immutable.List[scala.Int] = null;
  private var bindingMut_31: scala.collection.immutable.Range = null;
  private var bindingMut_32: scala.Int = 0;
  private var bindingMut_33: scala.Int = 0;
  private var bindingMut_34: scala.Int = 0;
  private var bindingMut_35: scala.collection.mutable.ListBuffer[scala.Int] = null;
  private var unblockFlag_36: scala.Boolean = true;
  private var positionVar_37: scala.Int = 0;
  
  val commands_247 = (() => {
  val data_38 = new scala.Array[scala.Function0[scala.Unit]](48);
  data_38.update(0, (() => {
    val x_39 = this.freeSpots;
    resetData_0 = x_39;
    val x_40 = resetData_0;
    val x_41 = x_40.asInstanceOf[scala.collection.mutable.ListBuffer[scala.Int]];
    bindingMut_35 = x_41;
    val x_42 = this.width;
    resetData_0 = x_42;
    val x_43 = resetData_0;
    val x_44 = x_43.asInstanceOf[scala.Int];
    bindingMut_34 = x_44;
    val x_45 = this.height;
    resetData_0 = x_45;
    val x_46 = resetData_0;
    val x_47 = x_46.asInstanceOf[scala.Int];
    bindingMut_33 = x_47;
    val x_48 = bindingMut_33;
    val x_49 = bindingMut_34;
    val x_50 = x_49.*(x_48);
    resetData_0 = x_50;
    val x_51 = resetData_0;
    val x_52 = x_51.asInstanceOf[scala.Int];
    bindingMut_32 = x_52;
    val x_53 = bindingMut_32;
    val x_54 = scala.`package`.Range.apply(0, x_53);
    resetData_0 = x_54;
    val x_55 = resetData_0;
    val x_56 = x_55.asInstanceOf[scala.collection.immutable.Range];
    bindingMut_31 = x_56;
    val x_57 = bindingMut_31;
    val x_58 = x_57.toList;
    resetData_0 = x_58;
    val x_59 = resetData_0;
    val x_60 = x_59.asInstanceOf[scala.collection.immutable.List[scala.Int]];
    bindingMut_30 = x_60;
    val x_61 = bindingMut_30;
    val x_62 = bindingMut_35;
    x_62.appendAll(x_61);
    resetData_0 = ();
    positionVar_37 = 1
  }));
  data_38.update(1, (() => positionVar_37 = 2));
  data_38.update(2, (() => {
    val x_63 = this.similarities;
    resetData_0 = x_63;
    val x_64 = resetData_0;
    val x_65 = x_64.asInstanceOf[scala.collection.mutable.Map[scala.Int, scala.Double]];
    bindingMut_29 = x_65;
    val x_66 = bindingMut_29;
    val x_67 = x_66.size;
    resetData_0 = x_67;
    val x_68 = resetData_0;
    val x_69 = x_68.asInstanceOf[scala.Int];
    bindingMut_28 = x_69;
    val x_70 = bindingMut_28;
    val x_71 = x_70.>(0);
    resetData_0 = x_71;
    val x_72 = resetData_0;
    val x_73 = x_72.asInstanceOf[scala.Boolean];
    bindingMut_27 = x_73;
    positionVar_37 = 3
  }));
  data_38.update(3, (() => {
    val x_74 = bindingMut_27;
    val x_75 = x_74.`unary_!`;
    if (x_75)
      positionVar_37 = 4
    else
      positionVar_37 = 46
  }));
  data_38.update(4, (() => {
    resetData_0 = 0.0;
    val x_76 = resetData_0;
    val x_77 = x_76.asInstanceOf[scala.Double];
    bindingMut_18 = x_77;
    positionVar_37 = 5
  }));
  data_38.update(5, (() => {
    val x_78 = bindingMut_18;
    val x_79 = x_78.+(1);
    resetData_0 = x_79;
    val x_80 = resetData_0;
    val x_81 = x_80.asInstanceOf[scala.Double];
    bindingMut_18 = x_81;
    positionVar_37 = 6;
    unblockFlag_36 = false
  }));
  data_38.update(6, (() => positionVar_37 = 7));
  data_38.update(7, (() => {
    val x_82 = this.popRequestMessages;
    val x_83 = x_82.iterator;
    iterMut_17 = x_83;
    positionVar_37 = 8
  }));
  data_38.update(8, (() => {
    val x_84 = iterMut_17;
    val x_85 = x_84.hasNext;
    if (x_85)
      {
        val x_86 = iterMut_17;
        val x_87 = x_86.next();
        listValMut_16 = x_87;
        positionVar_37 = 9
      }
    else
      positionVar_37 = 38
  }));
  data_38.update(9, (() => {
    val x_88 = listValMut_16;
    val x_89 = x_88.methodInfo;
    val x_90 = scala.`package`.Right.apply[scala.Nothing, scala.Int](6);
    val x_91 = x_89.==(x_90);
    if (x_91)
      positionVar_37 = 10
    else
      positionVar_37 = 16
  }));
  data_38.update(10, (() => {
    val x_92 = listValMut_16;
    this.handleNonblockingMessage(x_92);
    resetData_0 = ();
    positionVar_37 = 11
  }));
  data_38.update(11, (() => positionVar_37 = 12));
  data_38.update(12, (() => positionVar_37 = 8));
  data_38.update(13, (() => positionVar_37 = 14));
  data_38.update(14, (() => {
    val x_93 = this.totalReports;
    val x_94 = x_93.+(1);
    this.`totalReports_=`(x_94);
    val x_95 = this.similarities;
    val x_96 = methodArgsMut_13;
    val x_97 = methodArgsMut_14;
    x_95.update(x_97, x_96);
    resetData_0 = ();
    positionVar_37 = 15
  }));
  data_38.update(15, (() => {
    x_8.remove(0);
    val x_98 = x_8.isEmpty;
    val x_99 = x_98.`unary_!`;
    if (x_99)
      {
        val x_100 = x_8(0);
        val x_101 = x_100.asInstanceOf[scala.Int];
        methodArgsMut_14 = x_101
      }
    else
      ();
    x_7.remove(0);
    val x_102 = x_7.isEmpty;
    val x_103 = x_102.`unary_!`;
    if (x_103)
      {
        val x_104 = x_7(0);
        val x_105 = x_104.asInstanceOf[scala.Double];
        methodArgsMut_13 = x_105
      }
    else
      ();
    val x_106 = resetData_0;
    val x_107 = x_106.asInstanceOf[scala.Any];
    bindingMut_15 = x_107;
    val x_108 = bindingMut_15;
    val x_109 = listValMut_16;
    x_109.reply(this, x_108);
    resetData_0 = ();
    positionVar_37 = 11
  }));
  data_38.update(16, (() => {
    val x_110 = listValMut_16;
    val x_111 = x_110.methodInfo;
    val x_112 = scala.`package`.Right.apply[scala.Nothing, scala.Int](6);
    val x_113 = x_111.==(x_112);
    val x_114 = x_113.`unary_!`;
    if (x_114)
      positionVar_37 = 17
    else
      ()
  }));
  data_38.update(17, (() => {
    val x_115 = listValMut_16;
    val x_116 = x_115.methodInfo;
    val x_117 = scala.`package`.Right.apply[scala.Nothing, scala.Int](5);
    val x_118 = x_116.==(x_117);
    if (x_118)
      positionVar_37 = 18
    else
      positionVar_37 = 23
  }));
  data_38.update(18, (() => {
    val x_119 = listValMut_16;
    this.handleNonblockingMessage(x_119);
    resetData_0 = ();
    positionVar_37 = 19
  }));
  data_38.update(19, (() => positionVar_37 = 12));
  data_38.update(20, (() => positionVar_37 = 21));
  data_38.update(21, (() => {
    val x_120 = this.freeSpots;
    val x_121 = x_120.isEmpty;
    val x_122 = x_121.`unary_!`;
    val x_129 = if (x_122)
      {
        val x_123 = this.freeSpots;
        val x_124 = x_123.head;
        val x_125 = this.freeSpots;
        val x_126 = methodArgsMut_12;
        x_125.append(x_126);
        val x_127 = this.similarities;
        val x_128 = methodArgsMut_12;
        x_127.remove(x_128);
        x_124
      }
    else
      methodArgsMut_12;
    resetData_0 = x_129;
    positionVar_37 = 22
  }));
  data_38.update(22, (() => {
    x_6.remove(0);
    val x_130 = x_6.isEmpty;
    val x_131 = x_130.`unary_!`;
    if (x_131)
      {
        val x_132 = x_6(0);
        val x_133 = x_132.asInstanceOf[scala.Int];
        methodArgsMut_12 = x_133
      }
    else
      ();
    val x_134 = resetData_0;
    val x_135 = x_134.asInstanceOf[scala.Any];
    bindingMut_15 = x_135;
    val x_136 = bindingMut_15;
    val x_137 = listValMut_16;
    x_137.reply(this, x_136);
    resetData_0 = ();
    positionVar_37 = 19
  }));
  data_38.update(23, (() => {
    val x_138 = listValMut_16;
    val x_139 = x_138.methodInfo;
    val x_140 = scala.`package`.Right.apply[scala.Nothing, scala.Int](5);
    val x_141 = x_139.==(x_140);
    val x_142 = x_141.`unary_!`;
    if (x_142)
      positionVar_37 = 24
    else
      ()
  }));
  data_38.update(24, (() => {
    val x_143 = listValMut_16;
    val x_144 = x_143.methodInfo;
    val x_145 = scala.`package`.Right.apply[scala.Nothing, scala.Int](4);
    val x_146 = x_144.==(x_145);
    if (x_146)
      positionVar_37 = 25
    else
      positionVar_37 = 30
  }));
  data_38.update(25, (() => {
    val x_147 = listValMut_16;
    this.handleNonblockingMessage(x_147);
    resetData_0 = ();
    positionVar_37 = 26
  }));
  data_38.update(26, (() => positionVar_37 = 12));
  data_38.update(27, (() => positionVar_37 = 28));
  data_38.update(28, (() => {
    val x_148 = this.width;
    val x_149 = this.height;
    val x_150 = methodArgsMut_11;
    val x_151 = lib.Grid.Torus2D.getNeighborCells(x_148, x_149)(x_150, 1);
    val x_155 = x_151.filter(((x_152: scala.Int) => {
      val x_153 = this.world;
      val x_154 = x_153.get(x_152);
      x_154.isDefined
    }));
    val x_156 = scala.collection.immutable.List.canBuildFrom[scala.Long];
    val x_159 = x_155.map[scala.Long, scala.collection.immutable.List[scala.Long]](((x_157: scala.Int) => {
      val x_158 = this.world;
      x_158(x_157)
    }))(x_156);
    resetData_0 = x_159;
    positionVar_37 = 29
  }));
  data_38.update(29, (() => {
    x_5.remove(0);
    val x_160 = x_5.isEmpty;
    val x_161 = x_160.`unary_!`;
    if (x_161)
      {
        val x_162 = x_5(0);
        val x_163 = x_162.asInstanceOf[scala.Int];
        methodArgsMut_11 = x_163
      }
    else
      ();
    val x_164 = resetData_0;
    val x_165 = x_164.asInstanceOf[scala.Any];
    bindingMut_15 = x_165;
    val x_166 = bindingMut_15;
    val x_167 = listValMut_16;
    x_167.reply(this, x_166);
    resetData_0 = ();
    positionVar_37 = 26
  }));
  data_38.update(30, (() => {
    val x_168 = listValMut_16;
    val x_169 = x_168.methodInfo;
    val x_170 = scala.`package`.Right.apply[scala.Nothing, scala.Int](4);
    val x_171 = x_169.==(x_170);
    val x_172 = x_171.`unary_!`;
    if (x_172)
      positionVar_37 = 31
    else
      ()
  }));
  data_38.update(31, (() => {
    val x_173 = listValMut_16;
    val x_174 = x_173.methodInfo;
    val x_175 = scala.`package`.Right.apply[scala.Nothing, scala.Int](3);
    val x_176 = x_174.==(x_175);
    if (x_176)
      positionVar_37 = 32
    else
      positionVar_37 = 37
  }));
  data_38.update(32, (() => {
    val x_177 = listValMut_16;
    this.handleNonblockingMessage(x_177);
    resetData_0 = ();
    positionVar_37 = 33
  }));
  data_38.update(33, (() => positionVar_37 = 12));
  data_38.update(34, (() => positionVar_37 = 35));
  data_38.update(35, (() => {
    val x_178 = this.world;
    val x_179 = methodArgsMut_10;
    val x_180 = scala.Predef.ArrowAssoc[scala.Int](x_179);
    val x_181 = methodArgsMut_9;
    val x_182 = x_180.->[scala.Long](x_181);
    x_178.+=(x_182);
    val x_183 = this.freeSpots;
    val x_184 = methodArgsMut_10;
    val x_185 = scala.collection.immutable.List.apply[scala.Int](x_184);
    x_183.--=(x_185);
    resetData_0 = ();
    positionVar_37 = 36
  }));
  data_38.update(36, (() => {
    x_4.remove(0);
    val x_186 = x_4.isEmpty;
    val x_187 = x_186.`unary_!`;
    if (x_187)
      {
        val x_188 = x_4(0);
        val x_189 = x_188.asInstanceOf[scala.Int];
        methodArgsMut_10 = x_189
      }
    else
      ();
    x_3.remove(0);
    val x_190 = x_3.isEmpty;
    val x_191 = x_190.`unary_!`;
    if (x_191)
      {
        val x_192 = x_3(0);
        val x_193 = x_192.asInstanceOf[scala.Long];
        methodArgsMut_9 = x_193
      }
    else
      ();
    val x_194 = resetData_0;
    val x_195 = x_194.asInstanceOf[scala.Any];
    bindingMut_15 = x_195;
    val x_196 = bindingMut_15;
    val x_197 = listValMut_16;
    x_197.reply(this, x_196);
    resetData_0 = ();
    positionVar_37 = 33
  }));
  data_38.update(37, (() => {
    val x_198 = listValMut_16;
    val x_199 = x_198.methodInfo;
    val x_200 = scala.`package`.Right.apply[scala.Nothing, scala.Int](3);
    val x_201 = x_199.==(x_200);
    val x_202 = x_201.`unary_!`;
    if (x_202)
      {
        val x_203 = listValMut_16;
        val x_204 = scala.collection.immutable.List.apply[meta.runtime.RequestMessage](x_203);
        val x_205 = this.addReceiveMessages(x_204);
        resetData_0 = x_205;
        positionVar_37 = 12
      }
    else
      ()
  }));
  data_38.update(38, (() => {
    val x_206 = iterMut_17;
    val x_207 = x_206.hasNext;
    val x_208 = x_207.`unary_!`;
    if (x_208)
      positionVar_37 = 39
    else
      ()
  }));
  data_38.update(39, (() => positionVar_37 = 40));
  data_38.update(40, (() => {
    val x_209 = bindingMut_18;
    val x_210 = x_209.<(1.0);
    if (x_210)
      positionVar_37 = 5
    else
      positionVar_37 = 41
  }));
  data_38.update(41, (() => {
    val x_211 = bindingMut_18;
    val x_212 = x_211.<(1.0);
    val x_213 = x_212.`unary_!`;
    if (x_213)
      positionVar_37 = 42
    else
      ()
  }));
  data_38.update(42, (() => positionVar_37 = 2));
  data_38.update(43, (() => positionVar_37 = 44));
  data_38.update(44, (() => {
    positionVar_37 = 45;
    unblockFlag_36 = false
  }));
  data_38.update(45, (() => positionVar_37 = 44));
  data_38.update(46, (() => {
    val x_214 = bindingMut_27;
    squid.lib.`package`.IfThenElse[scala.Unit](x_214, {
      val x_215 = this.similarities;
      resetData_0 = x_215;
      val x_216 = resetData_0;
      val x_217 = x_216.asInstanceOf[scala.collection.mutable.Map[scala.Int, scala.Double]];
      bindingMut_26 = x_217;
      val x_218 = bindingMut_26;
      val x_219 = x_218.values;
      resetData_0 = x_219;
      val x_220 = resetData_0;
      val x_221 = x_220.asInstanceOf[scala.collection.Iterable[scala.Double]];
      bindingMut_25 = x_221;
      val x_222 = bindingMut_25;
      val x_223 = x_222.sum[scala.Double](scala.math.Numeric.DoubleIsFractional);
      resetData_0 = x_223;
      val x_224 = resetData_0;
      val x_225 = x_224.asInstanceOf[scala.Double];
      bindingMut_24 = x_225;
      val x_226 = this.similarities;
      resetData_0 = x_226;
      val x_227 = resetData_0;
      val x_228 = x_227.asInstanceOf[scala.collection.mutable.Map[scala.Int, scala.Double]];
      bindingMut_23 = x_228;
      val x_229 = bindingMut_23;
      val x_230 = x_229.size;
      resetData_0 = x_230;
      val x_231 = resetData_0;
      val x_232 = x_231.asInstanceOf[scala.Int];
      bindingMut_22 = x_232;
      val x_233 = bindingMut_22;
      val x_234 = bindingMut_24;
      val x_235 = x_234./(x_233);
      resetData_0 = x_235;
      val x_236 = resetData_0;
      val x_237 = x_236.asInstanceOf[scala.Double];
      bindingMut_21 = x_237;
      val x_238 = bindingMut_21;
      this.`segregationLevel_=`(x_238);
      resetData_0 = ();
      val x_239 = this.segregationLevel;
      resetData_0 = x_239;
      val x_240 = resetData_0;
      val x_241 = x_240.asInstanceOf[scala.Double];
      bindingMut_20 = x_241;
      val x_242 = bindingMut_20;
      val x_243 = "Segregation level ".+(x_242);
      resetData_0 = x_243;
      val x_244 = resetData_0;
      val x_245 = x_244.asInstanceOf[java.lang.String];
      bindingMut_19 = x_245;
      val x_246 = bindingMut_19;
      scala.Predef.println(x_246);
      resetData_0 = ();
      positionVar_37 = 4
    }, ())
  }));
  data_38.update(47, (() => positionVar_37 = 44));
  data_38
}).apply();
  

  def move(currentLoc: Int): Int = 
      {
  val x_0 = this.freeSpots;
  val x_1 = x_0.isEmpty;
  val x_2 = x_1.`unary_!`;
  if (x_2)
    {
      val x_3 = this.freeSpots;
      val x_4 = x_3.head;
      val x_5 = this.freeSpots;
      x_5.append(currentLoc);
      val x_6 = this.similarities;
      x_6.remove(currentLoc);
      x_4
    }
  else
    currentLoc
}
  
  def wrapper_move(args: List[Any]): Int = {
    
          val currentLoc: Int = args(0).asInstanceOf[Int]
          move(currentLoc)
          
  }
  
  def getNeighbors(loc: Int): List[Long] = 
      {
  val x_0 = this.width;
  val x_1 = this.height;
  val x_2 = lib.Grid.Torus2D.getNeighborCells(x_0, x_1)(loc, 1);
  val x_6 = x_2.filter(((x_3: scala.Int) => {
    val x_4 = this.world;
    val x_5 = x_4.get(x_3);
    x_5.isDefined
  }));
  val x_7 = scala.collection.immutable.List.canBuildFrom[scala.Long];
  x_6.map[scala.Long, scala.collection.immutable.List[scala.Long]](((x_8: scala.Int) => {
    val x_9 = this.world;
    x_9(x_8)
  }))(x_7)
}
  
  def wrapper_getNeighbors(args: List[Any]): List[Long] = {
    
          val loc: Int = args(0).asInstanceOf[Int]
          getNeighbors(loc)
          
  }
  
  def placeAgent(location: Int,aid: Long): Unit = 
      {
  val x_0 = this.world;
  val x_1 = scala.Predef.ArrowAssoc[scala.Int](location);
  val x_2 = x_1.->[scala.Long](aid);
  x_0.+=(x_2);
  val x_3 = this.freeSpots;
  val x_4 = scala.collection.immutable.List.apply[scala.Int](location);
  x_3.--=(x_4);
  ()
}
  
  def wrapper_placeAgent(args: List[Any]): Unit = {
    
          val location: Int = args(0).asInstanceOf[Int]
    val aid: Long = args(1).asInstanceOf[Long]
          placeAgent(location,aid)
          
  }
  
  def report(loc: Int,similarity: Double): Unit = 
      {
  val x_0 = this.totalReports;
  val x_1 = x_0.+(1);
  this.`totalReports_=`(x_1);
  val x_2 = this.similarities;
  x_2.update(loc, similarity)
}
  
  def wrapper_report(args: List[Any]): Unit = {
    
          val loc: Int = args(0).asInstanceOf[Int]
    val similarity: Double = args(1).asInstanceOf[Double]
          report(loc,similarity)
          
  }
  
  override def deepClone(): meta.runtime.Actor = {
    val cloner = new WorldMap(width, height)
    cloner.connectedAgents = connectedAgents
    cloner
  }
  
  override def run(msgs: List[meta.runtime.Message]): List[meta.runtime.Message] = {
    addReceiveMessages(msgs)
    sendMessages.clear()
    unblockFlag_36 = true
    while (unblockFlag_36 && (positionVar_37 < 48)) {
      commands_247(positionVar_37)()
    }
    sendMessages.toList
  }
  
  override def getInstructionPointer: Int = {
    positionVar_37
  }
  
  override def setInstructionPointer(new_ir: Int) = {
    if (new_ir >= 48 || new_ir <0) {
      throw new Exception("Invalid address pointer " + new_ir + " for agent " + id)
    }
    val prev_ir: Int = positionVar_37
    positionVar_37 = new_ir
    this
  }
  
  override def handleNonblockingMessage(m: meta.runtime.RequestMessage): Unit = {
    val args = m.argss.flatten
    val response = m.methodInfo match {
      case Right(x) => {
        x match {
          case 5 => wrapper_move(args)
        case 4 => wrapper_getNeighbors(args)
        case 3 => wrapper_placeAgent(args)
        case 6 => wrapper_report(args)
        }
      }
      case Left(x) => println("For staged implementation only")
    }
    m.reply(this, response)
  }
  
    override def gotoHandleMessages(new_ir: Int = 6): meta.runtime.Actor = {
      // first entry, save the current IR to reflectionIR
      unblockFlag_36 = true

      if (reflectionIR_58 == -1){
        reflectionIR_58 = positionVar_37
        positionVar_37 = new_ir
      }

      while (positionVar_37 <= 37 && unblockFlag_36) {
        commands_247(positionVar_37)()
      }

      // reset instruction register when finishes processing
      if (positionVar_37 > 37) {
        positionVar_37 = reflectionIR_58
        reflectionIR_58 = -1
      }
      this
    }
    
}
