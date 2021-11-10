package generated.ticktalk.example.cellularAutomata.wator

class Cell (var identity: ticktalk.example.cellularAutomata.wator.watorCell) extends meta.runtime.Actor {

  var isReserved: Boolean = false;
  var peekNeighbors: List[meta.runtime.Future[(Long, ticktalk.example.cellularAutomata.wator.watorCell)]] = scala.collection.immutable.Nil;
  var tryMoving: meta.runtime.Future[Boolean] = null;
  var targetCell: generated.ticktalk.example.cellularAutomata.wator.Cell = null;
  private var  reflectionIR_14: Int = -1
  private var resetData_0: scala.Any = null;
  private val resetData_1 = scala.collection.mutable.ListBuffer.apply[scala.collection.immutable.List[scala.Tuple2[scala.Tuple2[scala.Int, scala.Int], scala.Int]]]();
  private var resetData_2: meta.runtime.ResponseMessage = null;
  private val x_3 = scala.collection.mutable.ListBuffer.apply[scala.Any]();
  private var methodArgsMut_4: ticktalk.example.cellularAutomata.wator.watorCell = null;
  private var bindingMut_5: scala.Any = null;
  private var listValMut_6: meta.runtime.RequestMessage = null;
  @transient private var iterMut_7: scala.collection.Iterator[meta.runtime.RequestMessage] = null;
  private var bindingMut_8: scala.Int = 0;
  private var bindingMut_9: scala.Int = 0;
  private var bindingMut_10: ticktalk.example.cellularAutomata.wator.watorCell = null;
  private var bindingMut_11: ticktalk.example.cellularAutomata.wator.watorCell = null;
  private var bindingMut_12: ticktalk.example.cellularAutomata.wator.watorCell = null;
  private var bindingMut_13: scala.Boolean = false;
  private var bindingMut_14: scala.Int = 0;
  private var bindingMut_15: ticktalk.example.cellularAutomata.wator.watorCell = null;
  private var bindingMut_16: ticktalk.example.cellularAutomata.wator.Water = null;
  private var bindingMut_17: scala.Int = 0;
  private var bindingMut_18: scala.Boolean = false;
  private var bindingMut_19: scala.Int = 0;
  private var bindingMut_20: ticktalk.example.cellularAutomata.wator.watorCell = null;
  private var bindingMut_21: scala.Int = 0;
  private var bindingMut_22: scala.Int = 0;
  private var bindingMut_23: ticktalk.example.cellularAutomata.wator.watorCell = null;
  private var bindingMut_24: ticktalk.example.cellularAutomata.wator.watorCell = null;
  private var bindingMut_25: ticktalk.example.cellularAutomata.wator.Water = null;
  private var bindingMut_26: scala.Int = 0;
  private var bindingMut_27: ticktalk.example.cellularAutomata.wator.Shark = null;
  private var bindingMut_28: scala.Int = 0;
  private var bindingMut_29: java.lang.String = null;
  private var bindingMut_30: scala.Long = 0L;
  private var bindingMut_31: scala.Boolean = false;
  private var bindingMut_32: scala.Boolean = false;
  private var bindingMut_33: scala.Boolean = false;
  private var bindingMut_34: scala.Boolean = false;
  private var bindingMut_35: scala.Option[scala.Boolean] = null;
  private var bindingMut_36: meta.runtime.Future[scala.Boolean] = null;
  private var bindingMut_37: meta.runtime.Future[scala.Boolean] = null;
  private var bindingMut_38: generated.ticktalk.example.cellularAutomata.wator.Cell = null;
  private var bindingMut_39: generated.ticktalk.example.cellularAutomata.wator.Cell = null;
  private var bindingMut_40: scala.Boolean = false;
  private var bindingMut_41: scala.Boolean = false;
  private var bindingMut_42: scala.Boolean = false;
  private var bindingMut_43: ticktalk.example.cellularAutomata.wator.Water = null;
  private var bindingMut_44: scala.Int = 0;
  private var bindingMut_45: ticktalk.example.cellularAutomata.wator.Fish = null;
  private var bindingMut_46: scala.Int = 0;
  private var bindingMut_47: java.lang.String = null;
  private var bindingMut_48: scala.Long = 0L;
  private var bindingMut_49: scala.Boolean = false;
  private var bindingMut_50: scala.Boolean = false;
  private var bindingMut_51: scala.Boolean = false;
  private var bindingMut_52: scala.Boolean = false;
  private var bindingMut_53: scala.Option[scala.Boolean] = null;
  private var bindingMut_54: meta.runtime.Future[scala.Boolean] = null;
  private var bindingMut_55: meta.runtime.Future[scala.Boolean] = null;
  private var bindingMut_56: generated.ticktalk.example.cellularAutomata.wator.Cell = null;
  private var bindingMut_57: scala.Boolean = false;
  private var bindingMut_58: scala.Boolean = false;
  private var bindingMut_59: ticktalk.example.cellularAutomata.wator.watorCell = null;
  private var bindingMut_60: scala.Int = 0;
  private var bindingMut_61: ticktalk.example.cellularAutomata.wator.watorCell = null;
  private var bindingMut_62: scala.Option[generated.ticktalk.example.cellularAutomata.wator.Cell] = null;
  private var bindingMut_63: generated.ticktalk.example.cellularAutomata.wator.Cell = null;
  private var bindingMut_64: meta.runtime.Actor = null;
  private var bindingMut_65: scala.Long = 0L;
  private var bindingMut_66: scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell] = null;
  private var bindingMut_67: scala.collection.immutable.Map[scala.Long, meta.runtime.Actor] = null;
  private var bindingMut_68: scala.Boolean = false;
  private var bindingMut_69: scala.Option[meta.runtime.Actor] = null;
  private var bindingMut_70: scala.Long = 0L;
  private var bindingMut_71: scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell] = null;
  private var bindingMut_72: scala.collection.immutable.Map[scala.Long, meta.runtime.Actor] = null;
  private var bindingMut_73: scala.Int = 0;
  private var bindingMut_74: scala.Int = 0;
  private var bindingMut_75: scala.Boolean = false;
  private var bindingMut_76: scala.collection.immutable.List[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]] = null;
  private var bindingMut_77: scala.Option[generated.ticktalk.example.cellularAutomata.wator.Cell] = null;
  private var bindingMut_78: generated.ticktalk.example.cellularAutomata.wator.Cell = null;
  private var bindingMut_79: meta.runtime.Actor = null;
  private var bindingMut_80: scala.Long = 0L;
  private var bindingMut_81: scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell] = null;
  private var bindingMut_82: scala.collection.immutable.Map[scala.Long, meta.runtime.Actor] = null;
  private var bindingMut_83: scala.Boolean = false;
  private var bindingMut_84: scala.Option[meta.runtime.Actor] = null;
  private var bindingMut_85: scala.Long = 0L;
  private var bindingMut_86: scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell] = null;
  private var bindingMut_87: scala.collection.immutable.Map[scala.Long, meta.runtime.Actor] = null;
  private var bindingMut_88: scala.Int = 0;
  private var bindingMut_89: scala.Int = 0;
  private var bindingMut_90: scala.Boolean = false;
  private var bindingMut_91: scala.collection.immutable.List[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]] = null;
  private var bindingMut_92: scala.collection.immutable.List[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]] = null;
  private var bindingMut_93: scala.collection.immutable.List[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]] = null;
  private var bindingMut_94: scala.collection.immutable.List[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]] = null;
  private var bindingMut_95: scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell] = null;
  private var bindingMut_96: scala.Option[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]] = null;
  private var listValMut_97: meta.runtime.Future[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]] = null;
  @transient private var iterMut_98: scala.collection.Iterator[meta.runtime.Future[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]] = null;
  private var bindingMut_99: scala.collection.immutable.List[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]] = null;
  @transient private var bindingMut_100: scala.collection.generic.CanBuildFrom[scala.collection.immutable.List[_], scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell], scala.collection.immutable.List[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]] = null;
  private var bindingMut_101: scala.collection.immutable.List[meta.runtime.Future[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]] = null;
  private var bindingMut_102: scala.Double = 0.0;
  private var bindingMut_103: scala.collection.immutable.List[meta.runtime.Future[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]] = null;
  private var bindingMut_104: scala.collection.immutable.List[meta.runtime.Future[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]] = null;
  private var bindingMut_105: meta.runtime.Future[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]] = null;
  private var bindingMut_106: scala.Boolean = false;
  private var listValMut_107: generated.ticktalk.example.cellularAutomata.wator.Cell = null;
  @transient private var iterMut_108: scala.collection.Iterator[generated.ticktalk.example.cellularAutomata.wator.Cell] = null;
  private var bindingMut_109: scala.collection.immutable.List[meta.runtime.Future[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]] = null;
  @transient private var bindingMut_110: scala.collection.generic.CanBuildFrom[scala.collection.immutable.List[_], meta.runtime.Future[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]], scala.collection.immutable.List[meta.runtime.Future[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]]] = null;
  private var bindingMut_111: scala.collection.immutable.List[generated.ticktalk.example.cellularAutomata.wator.Cell] = null;
  private var bindingMut_112: scala.collection.immutable.Iterable[generated.ticktalk.example.cellularAutomata.wator.Cell] = null;
  @transient private var bindingMut_113: scala.collection.generic.CanBuildFrom[scala.collection.immutable.Iterable[_], generated.ticktalk.example.cellularAutomata.wator.Cell, scala.collection.immutable.Iterable[generated.ticktalk.example.cellularAutomata.wator.Cell]] = null;
  private var bindingMut_114: scala.collection.immutable.Map[scala.Long, meta.runtime.Actor] = null;
  private var bindingMut_115: scala.Boolean = false;
  private var bindingMut_116: ticktalk.example.cellularAutomata.wator.watorCell = null;
  private var unblockFlag_117: scala.Boolean = true;
  private var positionVar_118: scala.Int = 0;
  
  val commands_846 = (() => {
  val data_119 = new scala.Array[scala.Function0[scala.Unit]](118);
  data_119.update(0, (() => positionVar_118 = 1));
  data_119.update(1, (() => {
    val x_120 = this.identity;
    resetData_0 = x_120;
    val x_121 = resetData_0;
    val x_122 = x_121.asInstanceOf[ticktalk.example.cellularAutomata.wator.watorCell];
    bindingMut_116 = x_122;
    val x_123 = bindingMut_116;
    val x_124 = x_123.isInstanceOf[ticktalk.example.cellularAutomata.wator.Water];
    resetData_0 = x_124;
    val x_125 = resetData_0;
    val x_126 = x_125.asInstanceOf[scala.Boolean];
    bindingMut_115 = x_126;
    positionVar_118 = 2
  }));
  data_119.update(2, (() => {
    val x_127 = bindingMut_115;
    squid.lib.`package`.IfThenElse[scala.Unit](x_127, positionVar_118 = 3, positionVar_118 = 109)
  }));
  data_119.update(3, (() => {
    resetData_0 = 0.0;
    val x_128 = resetData_0;
    val x_129 = x_128.asInstanceOf[scala.Double];
    bindingMut_102 = x_129;
    positionVar_118 = 4
  }));
  data_119.update(4, (() => {
    val x_130 = bindingMut_102;
    val x_131 = x_130.+(1);
    resetData_0 = x_131;
    val x_132 = resetData_0;
    val x_133 = x_132.asInstanceOf[scala.Double];
    bindingMut_102 = x_133;
    positionVar_118 = 5;
    unblockFlag_117 = false
  }));
  data_119.update(5, (() => {
    positionVar_118 = 6;
    val x_134 = scala.Tuple2.apply[scala.Int, scala.Int](-1, -1);
    val x_135 = scala.Tuple2.apply[scala.Tuple2[scala.Int, scala.Int], scala.Int](x_134, 24);
    val x_136 = scala.collection.immutable.Nil.::[scala.Tuple2[scala.Tuple2[scala.Int, scala.Int], scala.Int]](x_135);
    resetData_1.prepend(x_136)
  }));
  data_119.update(6, (() => {
    val x_137 = this.popRequestMessages;
    val x_138 = x_137.iterator;
    iterMut_7 = x_138;
    positionVar_118 = 7
  }));
  data_119.update(7, (() => {
    val x_139 = iterMut_7;
    val x_140 = x_139.hasNext;
    if (x_140)
      {
        val x_141 = iterMut_7;
        val x_142 = x_141.next();
        listValMut_6 = x_142;
        positionVar_118 = 8
      }
    else
      positionVar_118 = 23
  }));
  data_119.update(8, (() => {
    val x_143 = listValMut_6;
    val x_144 = x_143.methodInfo;
    val x_145 = scala.`package`.Right.apply[scala.Nothing, scala.Int](1);
    val x_146 = x_144.==(x_145);
    if (x_146)
      positionVar_118 = 9
    else
      positionVar_118 = 15
  }));
  data_119.update(9, (() => {
    val x_147 = listValMut_6;
    this.handleNonblockingMessage(x_147);
    resetData_0 = ();
    positionVar_118 = 10
  }));
  data_119.update(10, (() => positionVar_118 = 11));
  data_119.update(11, (() => positionVar_118 = 7));
  data_119.update(12, (() => positionVar_118 = 13));
  data_119.update(13, (() => {
    val x_148 = this.isReserved;
    val x_149 = x_148.`unary_!`;
    val x_157 = if (x_149)
      {
        this.`isReserved_=`(true);
        val x_150 = this.identity;
        val x_151 = x_150.energy;
        val x_152 = methodArgsMut_4;
        this.`identity_=`(x_152);
        val x_153 = this.identity;
        val x_154 = this.identity;
        val x_155 = x_154.energy;
        val x_156 = x_155.+(x_151);
        x_153.`energy_=`(x_156);
        true
      }
    else
      false;
    resetData_0 = x_157;
    positionVar_118 = 14
  }));
  data_119.update(14, (() => {
    x_3.remove(0);
    val x_158 = x_3.isEmpty;
    val x_159 = x_158.`unary_!`;
    if (x_159)
      {
        val x_160 = x_3(0);
        val x_161 = x_160.asInstanceOf[ticktalk.example.cellularAutomata.wator.watorCell];
        methodArgsMut_4 = x_161
      }
    else
      ();
    val x_162 = resetData_0;
    val x_163 = x_162.asInstanceOf[scala.Any];
    bindingMut_5 = x_163;
    val x_164 = bindingMut_5;
    val x_165 = listValMut_6;
    x_165.reply(this, x_164);
    resetData_0 = ();
    positionVar_118 = 10
  }));
  data_119.update(15, (() => {
    val x_166 = listValMut_6;
    val x_167 = x_166.methodInfo;
    val x_168 = scala.`package`.Right.apply[scala.Nothing, scala.Int](1);
    val x_169 = x_167.==(x_168);
    val x_170 = x_169.`unary_!`;
    if (x_170)
      positionVar_118 = 16
    else
      ()
  }));
  data_119.update(16, (() => {
    val x_171 = listValMut_6;
    val x_172 = x_171.methodInfo;
    val x_173 = scala.`package`.Right.apply[scala.Nothing, scala.Int](0);
    val x_174 = x_172.==(x_173);
    if (x_174)
      positionVar_118 = 17
    else
      positionVar_118 = 22
  }));
  data_119.update(17, (() => {
    val x_175 = listValMut_6;
    this.handleNonblockingMessage(x_175);
    resetData_0 = ();
    positionVar_118 = 18
  }));
  data_119.update(18, (() => positionVar_118 = 11));
  data_119.update(19, (() => positionVar_118 = 20));
  data_119.update(20, (() => {
    val x_176 = this.id;
    val x_177 = this.identity;
    val x_178 = scala.Tuple2.apply[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell](x_176, x_177);
    resetData_0 = x_178;
    positionVar_118 = 21
  }));
  data_119.update(21, (() => {
    val x_179 = resetData_0;
    val x_180 = x_179.asInstanceOf[scala.Any];
    bindingMut_5 = x_180;
    val x_181 = bindingMut_5;
    val x_182 = listValMut_6;
    x_182.reply(this, x_181);
    resetData_0 = ();
    positionVar_118 = 18
  }));
  data_119.update(22, (() => {
    val x_183 = listValMut_6;
    val x_184 = x_183.methodInfo;
    val x_185 = scala.`package`.Right.apply[scala.Nothing, scala.Int](0);
    val x_186 = x_184.==(x_185);
    val x_187 = x_186.`unary_!`;
    if (x_187)
      {
        val x_188 = listValMut_6;
        val x_189 = scala.collection.immutable.List.apply[meta.runtime.RequestMessage](x_188);
        val x_190 = this.addReceiveMessages(x_189);
        resetData_0 = x_190;
        positionVar_118 = 11
      }
    else
      ()
  }));
  data_119.update(23, (() => {
    val x_191 = iterMut_7;
    val x_192 = x_191.hasNext;
    val x_193 = x_192.`unary_!`;
    if (x_193)
      {
        val x_194 = resetData_1.remove(0);
        val x_198 = x_194.find(((x_195: scala.Tuple2[scala.Tuple2[scala.Int, scala.Int], scala.Int]) => {
          val x_196 = x_195._1;
          val x_197 = scala.Tuple2.apply[scala.Int, scala.Int](-1, -1);
          x_196.==(x_197)
        }));
        val x_199 = x_198.get;
        val x_200 = x_199._2;
        positionVar_118 = x_200
      }
    else
      ()
  }));
  data_119.update(24, (() => positionVar_118 = 25));
  data_119.update(25, (() => {
    val x_201 = bindingMut_102;
    val x_202 = x_201.<(1.0);
    if (x_202)
      positionVar_118 = 4
    else
      positionVar_118 = 26
  }));
  data_119.update(26, (() => {
    val x_203 = bindingMut_102;
    val x_204 = x_203.<(1.0);
    val x_205 = x_204.`unary_!`;
    if (x_205)
      {
        this.`isReserved_=`(false);
        resetData_0 = ();
        positionVar_118 = 27
      }
    else
      ()
  }));
  data_119.update(27, (() => positionVar_118 = 1));
  data_119.update(28, (() => positionVar_118 = 29));
  data_119.update(29, (() => {
    positionVar_118 = 30;
    unblockFlag_117 = false
  }));
  data_119.update(30, (() => positionVar_118 = 29));
  data_119.update(31, (() => positionVar_118 = 32));
  data_119.update(32, (() => {
    val x_206 = bindingMut_102;
    val x_207 = x_206.<(1.0);
    if (x_207)
      positionVar_118 = 33
    else
      positionVar_118 = 35
  }));
  data_119.update(33, (() => {
    val x_208 = bindingMut_102;
    val x_209 = x_208.+(1);
    resetData_0 = x_209;
    val x_210 = resetData_0;
    val x_211 = x_210.asInstanceOf[scala.Double];
    bindingMut_102 = x_211;
    positionVar_118 = 34;
    unblockFlag_117 = false
  }));
  data_119.update(34, (() => {
    positionVar_118 = 6;
    val x_212 = scala.Tuple2.apply[scala.Int, scala.Int](-1, -1);
    val x_213 = scala.Tuple2.apply[scala.Tuple2[scala.Int, scala.Int], scala.Int](x_212, 31);
    val x_214 = scala.collection.immutable.Nil.::[scala.Tuple2[scala.Tuple2[scala.Int, scala.Int], scala.Int]](x_213);
    resetData_1.prepend(x_214)
  }));
  data_119.update(35, (() => {
    val x_215 = bindingMut_102;
    val x_216 = x_215.<(1.0);
    val x_217 = x_216.`unary_!`;
    if (x_217)
      positionVar_118 = 36
    else
      ()
  }));
  data_119.update(36, (() => {
    val x_218 = this.tryMoving;
    val x_219 = x_218.isCompleted;
    val x_220 = x_219.`unary_!`;
    if (x_220)
      positionVar_118 = 37
    else
      positionVar_118 = 38
  }));
  data_119.update(37, (() => {
    resetData_0 = 0.0;
    val x_221 = resetData_0;
    val x_222 = x_221.asInstanceOf[scala.Double];
    bindingMut_102 = x_222;
    positionVar_118 = 33
  }));
  data_119.update(38, (() => {
    val x_223 = this.tryMoving;
    val x_224 = x_223.isCompleted;
    val x_225 = x_224.`unary_!`;
    val x_226 = x_225.`unary_!`;
    if (x_226)
      positionVar_118 = 39
    else
      ()
  }));
  data_119.update(39, (() => {
    val x_227 = this.tryMoving;
    resetData_0 = x_227;
    val x_228 = resetData_0;
    val x_229 = x_228.asInstanceOf[meta.runtime.Future[scala.Boolean]];
    bindingMut_36 = x_229;
    val x_230 = bindingMut_36;
    val x_231 = x_230.popValue;
    resetData_0 = x_231;
    val x_232 = resetData_0;
    val x_233 = x_232.asInstanceOf[scala.Option[scala.Boolean]];
    bindingMut_35 = x_233;
    val x_234 = bindingMut_35;
    val x_235 = x_234.get;
    resetData_0 = x_235;
    val x_236 = resetData_0;
    val x_237 = x_236.asInstanceOf[scala.Boolean];
    bindingMut_34 = x_237;
    positionVar_118 = 40
  }));
  data_119.update(40, (() => {
    val x_238 = bindingMut_34;
    val x_239 = x_238.`unary_!`;
    if (x_239)
      {
        resetData_0 = false;
        positionVar_118 = 41
      }
    else
      positionVar_118 = 56
  }));
  data_119.update(41, (() => {
    val x_240 = resetData_0;
    val x_241 = x_240.asInstanceOf[scala.Boolean];
    bindingMut_32 = x_241;
    positionVar_118 = 42
  }));
  data_119.update(42, (() => {
    val x_242 = bindingMut_32;
    val x_243 = x_242.`unary_!`;
    if (x_243)
      positionVar_118 = 43
    else
      positionVar_118 = 52
  }));
  data_119.update(43, (() => positionVar_118 = 44));
  data_119.update(44, (() => {
    val x_244 = this.identity;
    resetData_0 = x_244;
    val x_245 = resetData_0;
    val x_246 = x_245.asInstanceOf[ticktalk.example.cellularAutomata.wator.watorCell];
    bindingMut_24 = x_246;
    val x_247 = this.identity;
    resetData_0 = x_247;
    val x_248 = resetData_0;
    val x_249 = x_248.asInstanceOf[ticktalk.example.cellularAutomata.wator.watorCell];
    bindingMut_23 = x_249;
    val x_250 = bindingMut_23;
    val x_251 = x_250.energy;
    resetData_0 = x_251;
    val x_252 = resetData_0;
    val x_253 = x_252.asInstanceOf[scala.Int];
    bindingMut_22 = x_253;
    val x_254 = bindingMut_22;
    val x_255 = x_254.-(1);
    resetData_0 = x_255;
    val x_256 = resetData_0;
    val x_257 = x_256.asInstanceOf[scala.Int];
    bindingMut_21 = x_257;
    val x_258 = bindingMut_21;
    val x_259 = bindingMut_24;
    x_259.`energy_=`(x_258);
    resetData_0 = ();
    positionVar_118 = 45
  }));
  data_119.update(45, (() => {
    val x_260 = this.identity;
    resetData_0 = x_260;
    val x_261 = resetData_0;
    val x_262 = x_261.asInstanceOf[ticktalk.example.cellularAutomata.wator.watorCell];
    bindingMut_20 = x_262;
    val x_263 = bindingMut_20;
    val x_264 = x_263.energy;
    resetData_0 = x_264;
    val x_265 = resetData_0;
    val x_266 = x_265.asInstanceOf[scala.Int];
    bindingMut_19 = x_266;
    val x_267 = bindingMut_19;
    val x_268 = x_267.<=(0);
    resetData_0 = x_268;
    val x_269 = resetData_0;
    val x_270 = x_269.asInstanceOf[scala.Boolean];
    bindingMut_18 = x_270;
    positionVar_118 = 46
  }));
  data_119.update(46, (() => {
    val x_271 = bindingMut_18;
    val x_272 = x_271.`unary_!`;
    if (x_272)
      positionVar_118 = 47
    else
      positionVar_118 = 51
  }));
  data_119.update(47, (() => {
    val x_273 = this.identity;
    resetData_0 = x_273;
    val x_274 = resetData_0;
    val x_275 = x_274.asInstanceOf[ticktalk.example.cellularAutomata.wator.watorCell];
    bindingMut_15 = x_275;
    val x_276 = bindingMut_15;
    val x_277 = x_276.age;
    resetData_0 = x_277;
    val x_278 = resetData_0;
    val x_279 = x_278.asInstanceOf[scala.Int];
    bindingMut_14 = x_279;
    val x_280 = bindingMut_14;
    val x_281 = x_280.>(10);
    resetData_0 = x_281;
    val x_282 = resetData_0;
    val x_283 = x_282.asInstanceOf[scala.Boolean];
    bindingMut_13 = x_283;
    positionVar_118 = 48
  }));
  data_119.update(48, (() => {
    val x_284 = bindingMut_13;
    val x_285 = x_284.`unary_!`;
    if (x_285)
      positionVar_118 = 49
    else
      positionVar_118 = 50
  }));
  data_119.update(49, (() => {
    val x_286 = this.identity;
    resetData_0 = x_286;
    val x_287 = resetData_0;
    val x_288 = x_287.asInstanceOf[ticktalk.example.cellularAutomata.wator.watorCell];
    bindingMut_11 = x_288;
    val x_289 = this.identity;
    resetData_0 = x_289;
    val x_290 = resetData_0;
    val x_291 = x_290.asInstanceOf[ticktalk.example.cellularAutomata.wator.watorCell];
    bindingMut_10 = x_291;
    val x_292 = bindingMut_10;
    val x_293 = x_292.age;
    resetData_0 = x_293;
    val x_294 = resetData_0;
    val x_295 = x_294.asInstanceOf[scala.Int];
    bindingMut_9 = x_295;
    val x_296 = bindingMut_9;
    val x_297 = x_296.+(1);
    resetData_0 = x_297;
    val x_298 = resetData_0;
    val x_299 = x_298.asInstanceOf[scala.Int];
    bindingMut_8 = x_299;
    val x_300 = bindingMut_8;
    val x_301 = bindingMut_11;
    x_301.`age_=`(x_300);
    resetData_0 = ();
    positionVar_118 = 3
  }));
  data_119.update(50, (() => {
    val x_302 = bindingMut_13;
    squid.lib.`package`.IfThenElse[scala.Unit](x_302, {
      val x_303 = this.identity;
      resetData_0 = x_303;
      val x_304 = resetData_0;
      val x_305 = x_304.asInstanceOf[ticktalk.example.cellularAutomata.wator.watorCell];
      bindingMut_12 = x_305;
      val x_306 = bindingMut_12;
      x_306.`age_=`(0);
      resetData_0 = ();
      positionVar_118 = 49
    }, ())
  }));
  data_119.update(51, (() => {
    val x_307 = bindingMut_18;
    squid.lib.`package`.IfThenElse[scala.Unit](x_307, {
      val x_308 = ticktalk.example.cellularAutomata.wator.Water.apply$default$2;
      resetData_0 = x_308;
      val x_309 = resetData_0;
      val x_310 = x_309.asInstanceOf[scala.Int];
      bindingMut_17 = x_310;
      val x_311 = bindingMut_17;
      val x_312 = ticktalk.example.cellularAutomata.wator.Water.apply(0, x_311);
      resetData_0 = x_312;
      val x_313 = resetData_0;
      val x_314 = x_313.asInstanceOf[ticktalk.example.cellularAutomata.wator.Water];
      bindingMut_16 = x_314;
      val x_315 = bindingMut_16;
      this.`identity_=`(x_315);
      resetData_0 = ();
      positionVar_118 = 47
    }, ())
  }));
  data_119.update(52, (() => {
    val x_316 = bindingMut_32;
    squid.lib.`package`.IfThenElse[scala.Unit](x_316, {
      val x_317 = bindingMut_60;
      val x_318 = x_317.>=(10);
      resetData_0 = x_318;
      val x_319 = resetData_0;
      val x_320 = x_319.asInstanceOf[scala.Boolean];
      bindingMut_31 = x_320;
      positionVar_118 = 53
    }, ())
  }));
  data_119.update(53, (() => {
    val x_321 = bindingMut_31;
    squid.lib.`package`.IfThenElse[scala.Unit](x_321, {
      val x_322 = this.id;
      resetData_0 = x_322;
      val x_323 = resetData_0;
      val x_324 = x_323.asInstanceOf[scala.Long];
      bindingMut_30 = x_324;
      val x_325 = bindingMut_30;
      val x_326 = x_325.+(" produces new sharks!");
      resetData_0 = x_326;
      val x_327 = resetData_0;
      val x_328 = x_327.asInstanceOf[java.lang.String];
      bindingMut_29 = x_328;
      val x_329 = bindingMut_29;
      scala.Predef.println(x_329);
      resetData_0 = ();
      val x_330 = ticktalk.example.cellularAutomata.wator.Shark.apply$default$2;
      resetData_0 = x_330;
      val x_331 = resetData_0;
      val x_332 = x_331.asInstanceOf[scala.Int];
      bindingMut_28 = x_332;
      val x_333 = bindingMut_28;
      val x_334 = ticktalk.example.cellularAutomata.wator.Shark.apply(10, x_333);
      resetData_0 = x_334;
      val x_335 = resetData_0;
      val x_336 = x_335.asInstanceOf[ticktalk.example.cellularAutomata.wator.Shark];
      bindingMut_27 = x_336;
      val x_337 = bindingMut_27;
      this.`identity_=`(x_337);
      resetData_0 = ();
      positionVar_118 = 54
    }, positionVar_118 = 55)
  }));
  data_119.update(54, (() => positionVar_118 = 43));
  data_119.update(55, (() => {
    val x_338 = bindingMut_31;
    val x_339 = x_338.`unary_!`;
    if (x_339)
      {
        val x_340 = ticktalk.example.cellularAutomata.wator.Water.apply$default$2;
        resetData_0 = x_340;
        val x_341 = resetData_0;
        val x_342 = x_341.asInstanceOf[scala.Int];
        bindingMut_26 = x_342;
        val x_343 = bindingMut_26;
        val x_344 = ticktalk.example.cellularAutomata.wator.Water.apply(0, x_343);
        resetData_0 = x_344;
        val x_345 = resetData_0;
        val x_346 = x_345.asInstanceOf[ticktalk.example.cellularAutomata.wator.Water];
        bindingMut_25 = x_346;
        val x_347 = bindingMut_25;
        this.`identity_=`(x_347);
        resetData_0 = ();
        positionVar_118 = 54
      }
    else
      ()
  }));
  data_119.update(56, (() => {
    val x_348 = bindingMut_34;
    squid.lib.`package`.IfThenElse[scala.Unit](x_348, {
      val x_349 = this.isReserved;
      resetData_0 = x_349;
      val x_350 = resetData_0;
      val x_351 = x_350.asInstanceOf[scala.Boolean];
      bindingMut_33 = x_351;
      val x_352 = bindingMut_33;
      val x_353 = x_352.`unary_!`;
      resetData_0 = x_353;
      positionVar_118 = 41
    }, ())
  }));
  data_119.update(57, (() => positionVar_118 = 58));
  data_119.update(58, (() => {
    val x_354 = bindingMut_102;
    val x_355 = x_354.<(1.0);
    if (x_355)
      positionVar_118 = 59
    else
      positionVar_118 = 61
  }));
  data_119.update(59, (() => {
    val x_356 = bindingMut_102;
    val x_357 = x_356.+(1);
    resetData_0 = x_357;
    val x_358 = resetData_0;
    val x_359 = x_358.asInstanceOf[scala.Double];
    bindingMut_102 = x_359;
    positionVar_118 = 60;
    unblockFlag_117 = false
  }));
  data_119.update(60, (() => {
    positionVar_118 = 6;
    val x_360 = scala.Tuple2.apply[scala.Int, scala.Int](-1, -1);
    val x_361 = scala.Tuple2.apply[scala.Tuple2[scala.Int, scala.Int], scala.Int](x_360, 57);
    val x_362 = scala.collection.immutable.Nil.::[scala.Tuple2[scala.Tuple2[scala.Int, scala.Int], scala.Int]](x_361);
    resetData_1.prepend(x_362)
  }));
  data_119.update(61, (() => {
    val x_363 = bindingMut_102;
    val x_364 = x_363.<(1.0);
    val x_365 = x_364.`unary_!`;
    if (x_365)
      positionVar_118 = 62
    else
      ()
  }));
  data_119.update(62, (() => {
    val x_366 = this.tryMoving;
    val x_367 = x_366.isCompleted;
    val x_368 = x_367.`unary_!`;
    if (x_368)
      positionVar_118 = 63
    else
      positionVar_118 = 64
  }));
  data_119.update(63, (() => {
    resetData_0 = 0.0;
    val x_369 = resetData_0;
    val x_370 = x_369.asInstanceOf[scala.Double];
    bindingMut_102 = x_370;
    positionVar_118 = 59
  }));
  data_119.update(64, (() => {
    val x_371 = this.tryMoving;
    val x_372 = x_371.isCompleted;
    val x_373 = x_372.`unary_!`;
    val x_374 = x_373.`unary_!`;
    if (x_374)
      positionVar_118 = 65
    else
      ()
  }));
  data_119.update(65, (() => {
    val x_375 = this.tryMoving;
    resetData_0 = x_375;
    val x_376 = resetData_0;
    val x_377 = x_376.asInstanceOf[meta.runtime.Future[scala.Boolean]];
    bindingMut_54 = x_377;
    val x_378 = bindingMut_54;
    val x_379 = x_378.popValue;
    resetData_0 = x_379;
    val x_380 = resetData_0;
    val x_381 = x_380.asInstanceOf[scala.Option[scala.Boolean]];
    bindingMut_53 = x_381;
    val x_382 = bindingMut_53;
    val x_383 = x_382.get;
    resetData_0 = x_383;
    val x_384 = resetData_0;
    val x_385 = x_384.asInstanceOf[scala.Boolean];
    bindingMut_52 = x_385;
    positionVar_118 = 66
  }));
  data_119.update(66, (() => {
    val x_386 = bindingMut_52;
    val x_387 = x_386.`unary_!`;
    if (x_387)
      {
        resetData_0 = false;
        positionVar_118 = 67
      }
    else
      positionVar_118 = 75
  }));
  data_119.update(67, (() => {
    val x_388 = resetData_0;
    val x_389 = x_388.asInstanceOf[scala.Boolean];
    bindingMut_50 = x_389;
    positionVar_118 = 68
  }));
  data_119.update(68, (() => {
    val x_390 = bindingMut_50;
    val x_391 = x_390.`unary_!`;
    if (x_391)
      positionVar_118 = 69
    else
      positionVar_118 = 71
  }));
  data_119.update(69, (() => positionVar_118 = 70));
  data_119.update(70, (() => positionVar_118 = 45));
  data_119.update(71, (() => {
    val x_392 = bindingMut_50;
    squid.lib.`package`.IfThenElse[scala.Unit](x_392, {
      val x_393 = bindingMut_60;
      val x_394 = x_393.>=(10);
      resetData_0 = x_394;
      val x_395 = resetData_0;
      val x_396 = x_395.asInstanceOf[scala.Boolean];
      bindingMut_49 = x_396;
      positionVar_118 = 72
    }, ())
  }));
  data_119.update(72, (() => {
    val x_397 = bindingMut_49;
    squid.lib.`package`.IfThenElse[scala.Unit](x_397, {
      val x_398 = this.id;
      resetData_0 = x_398;
      val x_399 = resetData_0;
      val x_400 = x_399.asInstanceOf[scala.Long];
      bindingMut_48 = x_400;
      val x_401 = bindingMut_48;
      val x_402 = x_401.+(" produces new fish!");
      resetData_0 = x_402;
      val x_403 = resetData_0;
      val x_404 = x_403.asInstanceOf[java.lang.String];
      bindingMut_47 = x_404;
      val x_405 = bindingMut_47;
      scala.Predef.println(x_405);
      resetData_0 = ();
      val x_406 = ticktalk.example.cellularAutomata.wator.Fish.apply$default$2;
      resetData_0 = x_406;
      val x_407 = resetData_0;
      val x_408 = x_407.asInstanceOf[scala.Int];
      bindingMut_46 = x_408;
      val x_409 = bindingMut_46;
      val x_410 = ticktalk.example.cellularAutomata.wator.Fish.apply(10, x_409);
      resetData_0 = x_410;
      val x_411 = resetData_0;
      val x_412 = x_411.asInstanceOf[ticktalk.example.cellularAutomata.wator.Fish];
      bindingMut_45 = x_412;
      val x_413 = bindingMut_45;
      this.`identity_=`(x_413);
      resetData_0 = ();
      positionVar_118 = 73
    }, positionVar_118 = 74)
  }));
  data_119.update(73, (() => positionVar_118 = 69));
  data_119.update(74, (() => {
    val x_414 = bindingMut_49;
    val x_415 = x_414.`unary_!`;
    if (x_415)
      {
        val x_416 = ticktalk.example.cellularAutomata.wator.Water.apply$default$2;
        resetData_0 = x_416;
        val x_417 = resetData_0;
        val x_418 = x_417.asInstanceOf[scala.Int];
        bindingMut_44 = x_418;
        val x_419 = bindingMut_44;
        val x_420 = ticktalk.example.cellularAutomata.wator.Water.apply(0, x_419);
        resetData_0 = x_420;
        val x_421 = resetData_0;
        val x_422 = x_421.asInstanceOf[ticktalk.example.cellularAutomata.wator.Water];
        bindingMut_43 = x_422;
        val x_423 = bindingMut_43;
        this.`identity_=`(x_423);
        resetData_0 = ();
        positionVar_118 = 73
      }
    else
      ()
  }));
  data_119.update(75, (() => {
    val x_424 = bindingMut_52;
    squid.lib.`package`.IfThenElse[scala.Unit](x_424, {
      val x_425 = this.isReserved;
      resetData_0 = x_425;
      val x_426 = resetData_0;
      val x_427 = x_426.asInstanceOf[scala.Boolean];
      bindingMut_51 = x_427;
      val x_428 = bindingMut_51;
      val x_429 = x_428.`unary_!`;
      resetData_0 = x_429;
      positionVar_118 = 67
    }, ())
  }));
  data_119.update(76, (() => positionVar_118 = 77));
  data_119.update(77, (() => {
    val x_430 = bindingMut_102;
    val x_431 = x_430.<(1.0);
    if (x_431)
      positionVar_118 = 78
    else
      positionVar_118 = 80
  }));
  data_119.update(78, (() => {
    val x_432 = bindingMut_102;
    val x_433 = x_432.+(1);
    resetData_0 = x_433;
    val x_434 = resetData_0;
    val x_435 = x_434.asInstanceOf[scala.Double];
    bindingMut_102 = x_435;
    positionVar_118 = 79;
    unblockFlag_117 = false
  }));
  data_119.update(79, (() => {
    positionVar_118 = 6;
    val x_436 = scala.Tuple2.apply[scala.Int, scala.Int](-1, -1);
    val x_437 = scala.Tuple2.apply[scala.Tuple2[scala.Int, scala.Int], scala.Int](x_436, 76);
    val x_438 = scala.collection.immutable.Nil.::[scala.Tuple2[scala.Tuple2[scala.Int, scala.Int], scala.Int]](x_437);
    resetData_1.prepend(x_438)
  }));
  data_119.update(80, (() => {
    val x_439 = bindingMut_102;
    val x_440 = x_439.<(1.0);
    val x_441 = x_440.`unary_!`;
    if (x_441)
      positionVar_118 = 81
    else
      ()
  }));
  data_119.update(81, (() => {
    val x_442 = this.peekNeighbors;
    val x_443 = x_442.nonEmpty;
    val x_446 = x_443.&&({
      val x_444 = this.peekNeighbors;
      x_444.forall(((x_445: meta.runtime.Future[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]) => x_445.isCompleted))
    });
    val x_447 = x_446.`unary_!`;
    if (x_447)
      positionVar_118 = 82
    else
      positionVar_118 = 83
  }));
  data_119.update(82, (() => {
    resetData_0 = 0.0;
    val x_448 = resetData_0;
    val x_449 = x_448.asInstanceOf[scala.Double];
    bindingMut_102 = x_449;
    positionVar_118 = 78
  }));
  data_119.update(83, (() => {
    val x_450 = this.peekNeighbors;
    val x_451 = x_450.nonEmpty;
    val x_454 = x_451.&&({
      val x_452 = this.peekNeighbors;
      x_452.forall(((x_453: meta.runtime.Future[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]) => x_453.isCompleted))
    });
    val x_455 = x_454.`unary_!`;
    val x_456 = x_455.`unary_!`;
    if (x_456)
      positionVar_118 = 84
    else
      ()
  }));
  data_119.update(84, (() => {
    val x_457 = this.peekNeighbors;
    resetData_0 = x_457;
    val x_458 = resetData_0;
    val x_459 = x_458.asInstanceOf[scala.collection.immutable.List[meta.runtime.Future[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]]];
    bindingMut_101 = x_459;
    val x_460 = scala.collection.immutable.List.canBuildFrom[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]];
    resetData_0 = x_460;
    val x_461 = resetData_0;
    val x_462 = x_461.asInstanceOf[scala.collection.generic.CanBuildFrom[scala.collection.immutable.List[_], scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell], scala.collection.immutable.List[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]]];
    bindingMut_100 = x_462;
    resetData_0 = scala.collection.immutable.Nil;
    val x_463 = resetData_0;
    val x_464 = x_463.asInstanceOf[scala.collection.immutable.List[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]];
    bindingMut_99 = x_464;
    val x_465 = bindingMut_101;
    val x_466 = x_465.iterator;
    iterMut_98 = x_466;
    positionVar_118 = 85
  }));
  data_119.update(85, (() => {
    val x_467 = iterMut_98;
    val x_468 = x_467.hasNext;
    if (x_468)
      {
        val x_469 = iterMut_98;
        val x_470 = x_469.next();
        listValMut_97 = x_470;
        val x_471 = listValMut_97;
        val x_472 = x_471.popValue;
        resetData_0 = x_472;
        val x_473 = resetData_0;
        val x_474 = x_473.asInstanceOf[scala.Option[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]];
        bindingMut_96 = x_474;
        val x_475 = bindingMut_96;
        val x_476 = x_475.get;
        resetData_0 = x_476;
        val x_477 = resetData_0;
        val x_478 = x_477.asInstanceOf[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]];
        bindingMut_95 = x_478;
        val x_479 = bindingMut_95;
        val x_480 = scala.collection.immutable.List.apply[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]](x_479);
        resetData_0 = x_480;
        val x_481 = resetData_0;
        val x_482 = x_481.asInstanceOf[scala.collection.immutable.List[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]];
        bindingMut_94 = x_482;
        val x_483 = bindingMut_94;
        val x_484 = bindingMut_99;
        val x_485 = x_483.:::[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]](x_484);
        resetData_0 = x_485;
        val x_486 = resetData_0;
        val x_487 = x_486.asInstanceOf[scala.collection.immutable.List[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]];
        bindingMut_99 = x_487;
        positionVar_118 = 85
      }
    else
      positionVar_118 = 86
  }));
  data_119.update(86, (() => {
    val x_488 = iterMut_98;
    val x_489 = x_488.hasNext;
    val x_490 = x_489.`unary_!`;
    if (x_490)
      {
        val x_491 = resetData_0;
        val x_492 = x_491.asInstanceOf[scala.collection.immutable.List[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]];
        bindingMut_93 = x_492;
        val x_493 = bindingMut_93;
        val x_494 = x_493.asInstanceOf[scala.collection.immutable.List[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]];
        resetData_0 = x_494;
        val x_495 = resetData_0;
        val x_496 = x_495.asInstanceOf[scala.collection.immutable.List[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]];
        bindingMut_92 = x_496;
        val x_497 = bindingMut_92;
        val x_500 = x_497.filter(((x_498: scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]) => {
          val x_499 = x_498._2;
          x_499.isInstanceOf[ticktalk.example.cellularAutomata.wator.Water]
        }));
        resetData_0 = x_500;
        val x_501 = resetData_0;
        val x_502 = x_501.asInstanceOf[scala.collection.immutable.List[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]];
        bindingMut_91 = x_502;
        val x_503 = bindingMut_91;
        val x_504 = x_503.isEmpty;
        resetData_0 = x_504;
        val x_505 = resetData_0;
        val x_506 = x_505.asInstanceOf[scala.Boolean];
        bindingMut_90 = x_506;
        positionVar_118 = 87
      }
    else
      ()
  }));
  data_119.update(87, (() => {
    val x_507 = bindingMut_90;
    squid.lib.`package`.IfThenElse[scala.Unit](x_507, {
      resetData_0 = scala.None;
      positionVar_118 = 88
    }, positionVar_118 = 108)
  }));
  data_119.update(88, (() => {
    val x_508 = resetData_0;
    val x_509 = x_508.asInstanceOf[scala.Option[generated.ticktalk.example.cellularAutomata.wator.Cell]];
    bindingMut_77 = x_509;
    val x_510 = bindingMut_92;
    val x_513 = x_510.filter(((x_511: scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]) => {
      val x_512 = x_511._2;
      x_512.isInstanceOf[ticktalk.example.cellularAutomata.wator.Fish]
    }));
    resetData_0 = x_513;
    val x_514 = resetData_0;
    val x_515 = x_514.asInstanceOf[scala.collection.immutable.List[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]];
    bindingMut_76 = x_515;
    val x_516 = bindingMut_76;
    val x_517 = x_516.isEmpty;
    resetData_0 = x_517;
    val x_518 = resetData_0;
    val x_519 = x_518.asInstanceOf[scala.Boolean];
    bindingMut_75 = x_519;
    positionVar_118 = 89
  }));
  data_119.update(89, (() => {
    val x_520 = bindingMut_75;
    squid.lib.`package`.IfThenElse[scala.Unit](x_520, {
      resetData_0 = scala.None;
      positionVar_118 = 90
    }, positionVar_118 = 107)
  }));
  data_119.update(90, (() => {
    val x_521 = resetData_0;
    val x_522 = x_521.asInstanceOf[scala.Option[generated.ticktalk.example.cellularAutomata.wator.Cell]];
    bindingMut_62 = x_522;
    val x_523 = this.identity;
    resetData_0 = x_523;
    val x_524 = resetData_0;
    val x_525 = x_524.asInstanceOf[ticktalk.example.cellularAutomata.wator.watorCell];
    bindingMut_61 = x_525;
    val x_526 = bindingMut_61;
    val x_527 = x_526.age;
    resetData_0 = x_527;
    val x_528 = resetData_0;
    val x_529 = x_528.asInstanceOf[scala.Int];
    bindingMut_60 = x_529;
    val x_530 = this.identity;
    resetData_0 = x_530;
    val x_531 = resetData_0;
    val x_532 = x_531.asInstanceOf[ticktalk.example.cellularAutomata.wator.watorCell];
    bindingMut_59 = x_532;
    val x_533 = bindingMut_59;
    val x_534 = x_533.isInstanceOf[ticktalk.example.cellularAutomata.wator.Fish];
    resetData_0 = x_534;
    val x_535 = resetData_0;
    val x_536 = x_535.asInstanceOf[scala.Boolean];
    bindingMut_58 = x_536;
    positionVar_118 = 91
  }));
  data_119.update(91, (() => {
    val x_537 = bindingMut_58;
    squid.lib.`package`.IfThenElse[scala.Unit](x_537, {
      val x_538 = bindingMut_77;
      val x_539 = x_538.isDefined;
      resetData_0 = x_539;
      val x_540 = resetData_0;
      val x_541 = x_540.asInstanceOf[scala.Boolean];
      bindingMut_57 = x_541;
      positionVar_118 = 92
    }, positionVar_118 = 96)
  }));
  data_119.update(92, (() => {
    val x_542 = bindingMut_57;
    val x_543 = x_542.`unary_!`;
    if (x_543)
      positionVar_118 = 70
    else
      positionVar_118 = 93
  }));
  data_119.update(93, (() => {
    val x_544 = bindingMut_57;
    squid.lib.`package`.IfThenElse[scala.Unit](x_544, {
      val x_545 = bindingMut_77;
      val x_546 = x_545.get;
      resetData_0 = x_546;
      val x_547 = resetData_0;
      val x_548 = x_547.asInstanceOf[generated.ticktalk.example.cellularAutomata.wator.Cell];
      bindingMut_56 = x_548;
      val x_549 = bindingMut_56;
      this.`targetCell_=`(x_549);
      resetData_0 = ();
      val x_550 = bindingMut_77;
      val x_551 = x_550.get;
      val x_552 = ((this): meta.runtime.Actor).id;
      val x_553 = ((x_551): meta.runtime.Actor).id;
      val x_554 = scala.`package`.Right.apply[scala.Nothing, scala.Int](1);
      val x$1_555 = this.identity;
      val x_556 = scala.collection.immutable.Nil.::[scala.Any](x$1_555);
      val x_557 = scala.collection.immutable.Nil.::[scala.collection.immutable.List[scala.Any]](x_556);
      val x_558 = meta.runtime.RequestMessage.apply(x_552, x_553, false, x_554, x_557);
      val x_559 = x_558.sessionId;
      val x_560 = meta.runtime.Future.apply$default$2[scala.Boolean];
      val x_561 = meta.runtime.Future.apply[scala.Boolean](x_559, x_560);
      var v_562: meta.runtime.Future[scala.Boolean] = x_561;
      ((this): meta.runtime.Actor).sendMessage(x_558);
      val x_563 = x_558.sessionId;
      ((this): meta.runtime.Actor).setMessageResponseHandler(x_563, ((response_564: meta.runtime.Message) => {
        val x_565 = v_562;
        val x_566 = response_564.asInstanceOf[meta.runtime.ResponseMessage];
        val x_567 = x_566.arg;
        val x_568 = x_567.asInstanceOf[scala.Boolean];
        x_565.setValue(x_568)
      }));
      val x_569 = v_562;
      resetData_0 = x_569;
      val x_570 = resetData_0;
      val x_571 = x_570.asInstanceOf[meta.runtime.Future[scala.Boolean]];
      bindingMut_55 = x_571;
      val x_572 = bindingMut_55;
      this.`tryMoving_=`(x_572);
      resetData_0 = ();
      positionVar_118 = 94
    }, ())
  }));
  data_119.update(94, (() => {
    val x_573 = this.tryMoving;
    val x_574 = x_573.isCompleted;
    val x_575 = x_574.`unary_!`;
    if (x_575)
      positionVar_118 = 63
    else
      positionVar_118 = 95
  }));
  data_119.update(95, (() => {
    val x_576 = this.tryMoving;
    val x_577 = x_576.isCompleted;
    val x_578 = x_577.`unary_!`;
    val x_579 = x_578.`unary_!`;
    if (x_579)
      positionVar_118 = 65
    else
      ()
  }));
  data_119.update(96, (() => {
    val x_580 = bindingMut_58;
    val x_581 = x_580.`unary_!`;
    if (x_581)
      {
        val x_582 = bindingMut_62;
        val x_583 = x_582.isDefined;
        resetData_0 = x_583;
        val x_584 = resetData_0;
        val x_585 = x_584.asInstanceOf[scala.Boolean];
        bindingMut_42 = x_585;
        positionVar_118 = 97
      }
    else
      ()
  }));
  data_119.update(97, (() => {
    val x_586 = bindingMut_42;
    val x_587 = x_586.`unary_!`;
    if (x_587)
      {
        val x_588 = bindingMut_77;
        val x_589 = x_588.isDefined;
        resetData_0 = x_589;
        positionVar_118 = 98
      }
    else
      positionVar_118 = 106
  }));
  data_119.update(98, (() => {
    val x_590 = resetData_0;
    val x_591 = x_590.asInstanceOf[scala.Boolean];
    bindingMut_41 = x_591;
    positionVar_118 = 99
  }));
  data_119.update(99, (() => {
    val x_592 = bindingMut_41;
    val x_593 = x_592.`unary_!`;
    if (x_593)
      positionVar_118 = 44
    else
      positionVar_118 = 100
  }));
  data_119.update(100, (() => {
    val x_594 = bindingMut_41;
    squid.lib.`package`.IfThenElse[scala.Unit](x_594, {
      val x_595 = bindingMut_62;
      val x_596 = x_595.isDefined;
      resetData_0 = x_596;
      val x_597 = resetData_0;
      val x_598 = x_597.asInstanceOf[scala.Boolean];
      bindingMut_40 = x_598;
      positionVar_118 = 101
    }, ())
  }));
  data_119.update(101, (() => {
    val x_599 = bindingMut_40;
    squid.lib.`package`.IfThenElse[scala.Unit](x_599, {
      val x_600 = bindingMut_62;
      val x_601 = x_600.get;
      resetData_0 = x_601;
      val x_602 = resetData_0;
      val x_603 = x_602.asInstanceOf[generated.ticktalk.example.cellularAutomata.wator.Cell];
      bindingMut_39 = x_603;
      val x_604 = bindingMut_39;
      this.`targetCell_=`(x_604);
      resetData_0 = ();
      positionVar_118 = 102
    }, positionVar_118 = 105)
  }));
  data_119.update(102, (() => {
    val receiver_605 = this.targetCell;
    val x_606 = ((this): meta.runtime.Actor).id;
    val x_607 = receiver_605.id;
    val x_608 = scala.`package`.Right.apply[scala.Nothing, scala.Int](1);
    val x$1_609 = this.identity;
    val x_610 = scala.collection.immutable.Nil.::[scala.Any](x$1_609);
    val x_611 = scala.collection.immutable.Nil.::[scala.collection.immutable.List[scala.Any]](x_610);
    val x_612 = meta.runtime.RequestMessage.apply(x_606, x_607, false, x_608, x_611);
    val x_613 = x_612.sessionId;
    val x_614 = meta.runtime.Future.apply$default$2[scala.Boolean];
    val x_615 = meta.runtime.Future.apply[scala.Boolean](x_613, x_614);
    var v_616: meta.runtime.Future[scala.Boolean] = x_615;
    ((this): meta.runtime.Actor).sendMessage(x_612);
    val x_617 = x_612.sessionId;
    ((this): meta.runtime.Actor).setMessageResponseHandler(x_617, ((response_618: meta.runtime.Message) => {
      val x_619 = v_616;
      val x_620 = response_618.asInstanceOf[meta.runtime.ResponseMessage];
      val x_621 = x_620.arg;
      val x_622 = x_621.asInstanceOf[scala.Boolean];
      x_619.setValue(x_622)
    }));
    val x_623 = v_616;
    resetData_0 = x_623;
    val x_624 = resetData_0;
    val x_625 = x_624.asInstanceOf[meta.runtime.Future[scala.Boolean]];
    bindingMut_37 = x_625;
    val x_626 = bindingMut_37;
    this.`tryMoving_=`(x_626);
    resetData_0 = ();
    positionVar_118 = 103
  }));
  data_119.update(103, (() => {
    val x_627 = this.tryMoving;
    val x_628 = x_627.isCompleted;
    val x_629 = x_628.`unary_!`;
    if (x_629)
      positionVar_118 = 37
    else
      positionVar_118 = 104
  }));
  data_119.update(104, (() => {
    val x_630 = this.tryMoving;
    val x_631 = x_630.isCompleted;
    val x_632 = x_631.`unary_!`;
    val x_633 = x_632.`unary_!`;
    if (x_633)
      positionVar_118 = 39
    else
      ()
  }));
  data_119.update(105, (() => {
    val x_634 = bindingMut_40;
    val x_635 = x_634.`unary_!`;
    if (x_635)
      {
        val x_636 = bindingMut_77;
        val x_637 = x_636.get;
        resetData_0 = x_637;
        val x_638 = resetData_0;
        val x_639 = x_638.asInstanceOf[generated.ticktalk.example.cellularAutomata.wator.Cell];
        bindingMut_38 = x_639;
        val x_640 = bindingMut_38;
        this.`targetCell_=`(x_640);
        resetData_0 = ();
        positionVar_118 = 102
      }
    else
      ()
  }));
  data_119.update(106, (() => {
    val x_641 = bindingMut_42;
    squid.lib.`package`.IfThenElse[scala.Unit](x_641, {
      resetData_0 = true;
      positionVar_118 = 98
    }, ())
  }));
  data_119.update(107, (() => {
    val x_642 = bindingMut_75;
    val x_643 = x_642.`unary_!`;
    if (x_643)
      {
        val x_644 = bindingMut_76;
        val x_645 = x_644.length;
        resetData_0 = x_645;
        val x_646 = resetData_0;
        val x_647 = x_646.asInstanceOf[scala.Int];
        bindingMut_74 = x_647;
        val x_648 = bindingMut_74;
        val x_649 = scala.util.Random.nextInt(x_648);
        resetData_0 = x_649;
        val x_650 = resetData_0;
        val x_651 = x_650.asInstanceOf[scala.Int];
        bindingMut_73 = x_651;
        val x_652 = this.connectedAgents;
        resetData_0 = x_652;
        val x_653 = resetData_0;
        val x_654 = x_653.asInstanceOf[scala.collection.immutable.Map[scala.Long, meta.runtime.Actor]];
        bindingMut_72 = x_654;
        val x_655 = bindingMut_73;
        val x_656 = bindingMut_76;
        val x_657 = x_656.apply(x_655);
        resetData_0 = x_657;
        val x_658 = resetData_0;
        val x_659 = x_658.asInstanceOf[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]];
        bindingMut_71 = x_659;
        val x_660 = bindingMut_71;
        val x_661 = x_660._1;
        resetData_0 = x_661;
        val x_662 = resetData_0;
        val x_663 = x_662.asInstanceOf[scala.Long];
        bindingMut_70 = x_663;
        val x_664 = bindingMut_70;
        val x_665 = bindingMut_72;
        val x_666 = x_665.get(x_664);
        resetData_0 = x_666;
        val x_667 = resetData_0;
        val x_668 = x_667.asInstanceOf[scala.Option[meta.runtime.Actor]];
        bindingMut_69 = x_668;
        val x_669 = bindingMut_69;
        val x_670 = x_669.isDefined;
        resetData_0 = x_670;
        val x_671 = resetData_0;
        val x_672 = x_671.asInstanceOf[scala.Boolean];
        bindingMut_68 = x_672;
        val x_673 = bindingMut_68;
        scala.Predef.assert(x_673);
        resetData_0 = ();
        val x_674 = this.connectedAgents;
        resetData_0 = x_674;
        val x_675 = resetData_0;
        val x_676 = x_675.asInstanceOf[scala.collection.immutable.Map[scala.Long, meta.runtime.Actor]];
        bindingMut_67 = x_676;
        val x_677 = bindingMut_73;
        val x_678 = bindingMut_76;
        val x_679 = x_678.apply(x_677);
        resetData_0 = x_679;
        val x_680 = resetData_0;
        val x_681 = x_680.asInstanceOf[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]];
        bindingMut_66 = x_681;
        val x_682 = bindingMut_66;
        val x_683 = x_682._1;
        resetData_0 = x_683;
        val x_684 = resetData_0;
        val x_685 = x_684.asInstanceOf[scala.Long];
        bindingMut_65 = x_685;
        val x_686 = bindingMut_65;
        val x_687 = bindingMut_67;
        val x_688 = x_687.apply(x_686);
        resetData_0 = x_688;
        val x_689 = resetData_0;
        val x_690 = x_689.asInstanceOf[meta.runtime.Actor];
        bindingMut_64 = x_690;
        val x_691 = bindingMut_64;
        val x_692 = x_691.asInstanceOf[generated.ticktalk.example.cellularAutomata.wator.Cell];
        resetData_0 = x_692;
        val x_693 = resetData_0;
        val x_694 = x_693.asInstanceOf[generated.ticktalk.example.cellularAutomata.wator.Cell];
        bindingMut_63 = x_694;
        val x_695 = bindingMut_63;
        val x_696 = scala.Some.apply[generated.ticktalk.example.cellularAutomata.wator.Cell](x_695);
        resetData_0 = x_696;
        positionVar_118 = 90
      }
    else
      ()
  }));
  data_119.update(108, (() => {
    val x_697 = bindingMut_90;
    val x_698 = x_697.`unary_!`;
    if (x_698)
      {
        val x_699 = bindingMut_91;
        val x_700 = x_699.length;
        resetData_0 = x_700;
        val x_701 = resetData_0;
        val x_702 = x_701.asInstanceOf[scala.Int];
        bindingMut_89 = x_702;
        val x_703 = bindingMut_89;
        val x_704 = scala.util.Random.nextInt(x_703);
        resetData_0 = x_704;
        val x_705 = resetData_0;
        val x_706 = x_705.asInstanceOf[scala.Int];
        bindingMut_88 = x_706;
        val x_707 = this.connectedAgents;
        resetData_0 = x_707;
        val x_708 = resetData_0;
        val x_709 = x_708.asInstanceOf[scala.collection.immutable.Map[scala.Long, meta.runtime.Actor]];
        bindingMut_87 = x_709;
        val x_710 = bindingMut_88;
        val x_711 = bindingMut_91;
        val x_712 = x_711.apply(x_710);
        resetData_0 = x_712;
        val x_713 = resetData_0;
        val x_714 = x_713.asInstanceOf[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]];
        bindingMut_86 = x_714;
        val x_715 = bindingMut_86;
        val x_716 = x_715._1;
        resetData_0 = x_716;
        val x_717 = resetData_0;
        val x_718 = x_717.asInstanceOf[scala.Long];
        bindingMut_85 = x_718;
        val x_719 = bindingMut_85;
        val x_720 = bindingMut_87;
        val x_721 = x_720.get(x_719);
        resetData_0 = x_721;
        val x_722 = resetData_0;
        val x_723 = x_722.asInstanceOf[scala.Option[meta.runtime.Actor]];
        bindingMut_84 = x_723;
        val x_724 = bindingMut_84;
        val x_725 = x_724.isDefined;
        resetData_0 = x_725;
        val x_726 = resetData_0;
        val x_727 = x_726.asInstanceOf[scala.Boolean];
        bindingMut_83 = x_727;
        val x_728 = bindingMut_83;
        scala.Predef.assert(x_728);
        resetData_0 = ();
        val x_729 = this.connectedAgents;
        resetData_0 = x_729;
        val x_730 = resetData_0;
        val x_731 = x_730.asInstanceOf[scala.collection.immutable.Map[scala.Long, meta.runtime.Actor]];
        bindingMut_82 = x_731;
        val x_732 = bindingMut_88;
        val x_733 = bindingMut_91;
        val x_734 = x_733.apply(x_732);
        resetData_0 = x_734;
        val x_735 = resetData_0;
        val x_736 = x_735.asInstanceOf[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]];
        bindingMut_81 = x_736;
        val x_737 = bindingMut_81;
        val x_738 = x_737._1;
        resetData_0 = x_738;
        val x_739 = resetData_0;
        val x_740 = x_739.asInstanceOf[scala.Long];
        bindingMut_80 = x_740;
        val x_741 = bindingMut_80;
        val x_742 = bindingMut_82;
        val x_743 = x_742.apply(x_741);
        resetData_0 = x_743;
        val x_744 = resetData_0;
        val x_745 = x_744.asInstanceOf[meta.runtime.Actor];
        bindingMut_79 = x_745;
        val x_746 = bindingMut_79;
        val x_747 = x_746.asInstanceOf[generated.ticktalk.example.cellularAutomata.wator.Cell];
        resetData_0 = x_747;
        val x_748 = resetData_0;
        val x_749 = x_748.asInstanceOf[generated.ticktalk.example.cellularAutomata.wator.Cell];
        bindingMut_78 = x_749;
        val x_750 = bindingMut_78;
        val x_751 = scala.Some.apply[generated.ticktalk.example.cellularAutomata.wator.Cell](x_750);
        resetData_0 = x_751;
        positionVar_118 = 88
      }
    else
      ()
  }));
  data_119.update(109, (() => {
    val x_752 = bindingMut_115;
    val x_753 = x_752.`unary_!`;
    if (x_753)
      {
        val x_754 = this.connectedAgents;
        resetData_0 = x_754;
        val x_755 = resetData_0;
        val x_756 = x_755.asInstanceOf[scala.collection.immutable.Map[scala.Long, meta.runtime.Actor]];
        bindingMut_114 = x_756;
        val x_757 = scala.collection.immutable.Iterable.canBuildFrom[generated.ticktalk.example.cellularAutomata.wator.Cell];
        resetData_0 = x_757;
        val x_758 = resetData_0;
        val x_759 = x_758.asInstanceOf[scala.collection.generic.CanBuildFrom[scala.collection.immutable.Iterable[_], generated.ticktalk.example.cellularAutomata.wator.Cell, scala.collection.immutable.Iterable[generated.ticktalk.example.cellularAutomata.wator.Cell]]];
        bindingMut_113 = x_759;
        val x_760 = bindingMut_113;
        val x_761 = bindingMut_114;
        val x_764 = x_761.map[generated.ticktalk.example.cellularAutomata.wator.Cell, scala.collection.immutable.Iterable[generated.ticktalk.example.cellularAutomata.wator.Cell]](((x_762: scala.Tuple2[scala.Long, meta.runtime.Actor]) => {
          val x_763 = x_762._2;
          x_763.asInstanceOf[generated.ticktalk.example.cellularAutomata.wator.Cell]
        }))(x_760);
        resetData_0 = x_764;
        val x_765 = resetData_0;
        val x_766 = x_765.asInstanceOf[scala.collection.immutable.Iterable[generated.ticktalk.example.cellularAutomata.wator.Cell]];
        bindingMut_112 = x_766;
        val x_767 = bindingMut_112;
        val x_768 = x_767.toList;
        resetData_0 = x_768;
        val x_769 = resetData_0;
        val x_770 = x_769.asInstanceOf[scala.collection.immutable.List[generated.ticktalk.example.cellularAutomata.wator.Cell]];
        bindingMut_111 = x_770;
        val x_771 = scala.collection.immutable.List.canBuildFrom[meta.runtime.Future[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]];
        resetData_0 = x_771;
        val x_772 = resetData_0;
        val x_773 = x_772.asInstanceOf[scala.collection.generic.CanBuildFrom[scala.collection.immutable.List[_], meta.runtime.Future[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]], scala.collection.immutable.List[meta.runtime.Future[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]]]];
        bindingMut_110 = x_773;
        resetData_0 = scala.collection.immutable.Nil;
        val x_774 = resetData_0;
        val x_775 = x_774.asInstanceOf[scala.collection.immutable.List[meta.runtime.Future[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]]];
        bindingMut_109 = x_775;
        val x_776 = bindingMut_111;
        val x_777 = x_776.iterator;
        iterMut_108 = x_777;
        positionVar_118 = 110
      }
    else
      ()
  }));
  data_119.update(110, (() => {
    val x_778 = iterMut_108;
    val x_779 = x_778.hasNext;
    if (x_779)
      {
        val x_780 = iterMut_108;
        val x_781 = x_780.next();
        listValMut_107 = x_781;
        val x_782 = this._container;
        val x_783 = x_782.!=(null);
        val x_788 = if (x_783)
          {
            val x_784 = this._container;
            val x_785 = x_784.proxyIds;
            val x_786 = listValMut_107;
            val x_787 = x_786.id;
            x_785.contains[scala.Long](x_787)
          }
        else
          false;
        resetData_0 = x_788;
        val x_789 = resetData_0;
        val x_790 = x_789.asInstanceOf[scala.Boolean];
        bindingMut_106 = x_790;
        positionVar_118 = 111
      }
    else
      positionVar_118 = 114
  }));
  data_119.update(111, (() => {
    val x_791 = bindingMut_106;
    val x_792 = x_791.`unary_!`;
    if (x_792)
      {
        val x_793 = ((this): meta.runtime.Actor).id;
        val x_794 = listValMut_107;
        val x_795 = x_794.id;
        val x_796 = scala.`package`.Right.apply[scala.Nothing, scala.Int](0);
        val x_797 = scala.collection.immutable.Nil.::[scala.collection.immutable.List[scala.Any]](((scala.collection.immutable.Nil): scala.collection.immutable.List[scala.Any]));
        val x_798 = meta.runtime.RequestMessage.apply(x_793, x_795, false, x_796, x_797);
        val x_799 = x_798.sessionId;
        val x_800 = meta.runtime.Future.apply$default$2[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]];
        val x_801 = meta.runtime.Future.apply[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]](x_799, x_800);
        var v_802: meta.runtime.Future[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]] = x_801;
        ((this): meta.runtime.Actor).sendMessage(x_798);
        val x_803 = x_798.sessionId;
        ((this): meta.runtime.Actor).setMessageResponseHandler(x_803, ((response_804: meta.runtime.Message) => {
          val x_805 = v_802;
          val x_806 = response_804.asInstanceOf[meta.runtime.ResponseMessage];
          val x_807 = x_806.arg;
          val x_808 = x_807.asInstanceOf[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]];
          x_805.setValue(x_808)
        }));
        val x_809 = v_802;
        resetData_0 = x_809;
        positionVar_118 = 112
      }
    else
      positionVar_118 = 113
  }));
  data_119.update(112, (() => {
    val x_810 = resetData_0;
    val x_811 = x_810.asInstanceOf[meta.runtime.Future[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]];
    bindingMut_105 = x_811;
    val x_812 = bindingMut_105;
    val x_813 = scala.collection.immutable.List.apply[meta.runtime.Future[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]](x_812);
    resetData_0 = x_813;
    val x_814 = resetData_0;
    val x_815 = x_814.asInstanceOf[scala.collection.immutable.List[meta.runtime.Future[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]]];
    bindingMut_104 = x_815;
    val x_816 = bindingMut_104;
    val x_817 = bindingMut_109;
    val x_818 = x_816.:::[meta.runtime.Future[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]](x_817);
    resetData_0 = x_818;
    val x_819 = resetData_0;
    val x_820 = x_819.asInstanceOf[scala.collection.immutable.List[meta.runtime.Future[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]]];
    bindingMut_109 = x_820;
    positionVar_118 = 110
  }));
  data_119.update(113, (() => {
    val x_821 = bindingMut_106;
    squid.lib.`package`.IfThenElse[scala.Unit](x_821, {
      val x_822 = listValMut_107;
      val x_823 = x_822.getIdentity();
      val x_824 = scala.Some.apply[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]](x_823);
      val x$8_825 = meta.runtime.Future.apply$default$1[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]];
      val x_826 = meta.runtime.Future.apply[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]](x$8_825, x_824);
      resetData_0 = x_826;
      positionVar_118 = 112
    }, ())
  }));
  data_119.update(114, (() => {
    val x_827 = iterMut_108;
    val x_828 = x_827.hasNext;
    val x_829 = x_828.`unary_!`;
    if (x_829)
      {
        val x_830 = resetData_0;
        val x_831 = x_830.asInstanceOf[scala.collection.immutable.List[meta.runtime.Future[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]]];
        bindingMut_103 = x_831;
        val x_832 = bindingMut_103;
        this.`peekNeighbors_=`(x_832);
        resetData_0 = ();
        positionVar_118 = 115
      }
    else
      ()
  }));
  data_119.update(115, (() => {
    val x_833 = this.peekNeighbors;
    val x_834 = x_833.nonEmpty;
    val x_837 = x_834.&&({
      val x_835 = this.peekNeighbors;
      x_835.forall(((x_836: meta.runtime.Future[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]) => x_836.isCompleted))
    });
    val x_838 = x_837.`unary_!`;
    if (x_838)
      positionVar_118 = 82
    else
      positionVar_118 = 116
  }));
  data_119.update(116, (() => {
    val x_839 = this.peekNeighbors;
    val x_840 = x_839.nonEmpty;
    val x_843 = x_840.&&({
      val x_841 = this.peekNeighbors;
      x_841.forall(((x_842: meta.runtime.Future[scala.Tuple2[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell]]) => x_842.isCompleted))
    });
    val x_844 = x_843.`unary_!`;
    val x_845 = x_844.`unary_!`;
    if (x_845)
      positionVar_118 = 84
    else
      ()
  }));
  data_119.update(117, (() => positionVar_118 = 29));
  data_119
}).apply();
  

  def getIdentity(): (Long, ticktalk.example.cellularAutomata.wator.watorCell) = 
      {
  val x_0 = this.id;
  val x_1 = this.identity;
  scala.Tuple2.apply[scala.Long, ticktalk.example.cellularAutomata.wator.watorCell](x_0, x_1)
}
  
  def wrapper_getIdentity(args: List[Any]): (Long, ticktalk.example.cellularAutomata.wator.watorCell) = {
    
          
          getIdentity()
          
  }
  
  def relocate(newId: ticktalk.example.cellularAutomata.wator.watorCell): Boolean = 
      {
  val x_0 = this.isReserved;
  val x_1 = x_0.`unary_!`;
  if (x_1)
    {
      this.`isReserved_=`(true);
      val x_2 = this.identity;
      val x_3 = x_2.energy;
      this.`identity_=`(newId);
      val x_4 = this.identity;
      val x_5 = this.identity;
      val x_6 = x_5.energy;
      val x_7 = x_6.+(x_3);
      x_4.`energy_=`(x_7);
      true
    }
  else
    false
}
  
  def wrapper_relocate(args: List[Any]): Boolean = {
    
          val newId: ticktalk.example.cellularAutomata.wator.watorCell = args(0).asInstanceOf[ticktalk.example.cellularAutomata.wator.watorCell]
          relocate(newId)
          
  }
  
  override def deepClone(): meta.runtime.Actor = {
    val cloner = new Cell(identity)
    cloner.connectedAgents = connectedAgents
    cloner
  }
  
  override def run(msgs: List[meta.runtime.Message]): List[meta.runtime.Message] = {
    addReceiveMessages(msgs)
    sendMessages.clear()
    unblockFlag_117 = true
    while (unblockFlag_117 && (positionVar_118 < 118)) {
      commands_846(positionVar_118)()
    }
    sendMessages.toList
  }
  
  override def getInstructionPointer: Int = {
    positionVar_118
  }
  
  override def setInstructionPointer(new_ir: Int) = {
    if (new_ir >= 118 || new_ir <0) {
      throw new Exception("Invalid address pointer " + new_ir + " for agent " + id)
    }
    val prev_ir: Int = positionVar_118
    positionVar_118 = new_ir
    this
  }
  
  override def handleNonblockingMessage(m: meta.runtime.RequestMessage): Unit = {
    val args = m.argss.flatten
    val response = m.methodInfo match {
      case Right(x) => {
        x match {
          case 0 => wrapper_getIdentity(args)
        case 1 => wrapper_relocate(args)
        }
      }
      case Left(x) => println("For staged implementation only")
    }
    m.reply(this, response)
  }
  
    override def gotoHandleMessages(new_ir: Int = 5): meta.runtime.Actor = {
      // first entry, save the current IR to reflectionIR
      unblockFlag_117 = true

      if (reflectionIR_14 == -1){
        reflectionIR_14 = positionVar_118
        positionVar_118 = new_ir
      }

      while (positionVar_118 <= 22 && unblockFlag_117) {
        commands_846(positionVar_118)()
      }

      // reset instruction register when finishes processing
      if (positionVar_118 > 22) {
        positionVar_118 = reflectionIR_14
        reflectionIR_14 = -1
      }
      this
    }
    
}
