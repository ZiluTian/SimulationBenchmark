package generated.ticktalk.example.gameOfLife

class Cell (var alive: Boolean) extends meta.runtime.Actor {

  var futures: List[meta.runtime.Future[Boolean]] = scala.collection.immutable.Nil;
  private var  reflectionIR_61: Int = -1
  private var resetData_0: scala.Any = null;
  private val resetData_1 = scala.collection.mutable.ListBuffer.apply[scala.collection.immutable.List[scala.Tuple2[scala.Tuple2[scala.Int, scala.Int], scala.Int]]]();
  private var resetData_2: meta.runtime.ResponseMessage = null;
  private val x_3 = scala.collection.mutable.ListBuffer.apply[scala.Any]();
  private var methodArgsMut_4: scala.collection.immutable.List[scala.Boolean] = null;
  private var bindingMut_5: scala.Any = null;
  private var listValMut_6: meta.runtime.RequestMessage = null;
  @transient private var iterMut_7: scala.collection.Iterator[meta.runtime.RequestMessage] = null;
  private var bindingMut_8: scala.collection.immutable.List[scala.Boolean] = null;
  private var bindingMut_9: scala.collection.immutable.List[scala.Boolean] = null;
  private var bindingMut_10: scala.collection.immutable.List[scala.Boolean] = null;
  private var bindingMut_11: scala.Boolean = false;
  private var bindingMut_12: scala.Option[scala.Boolean] = null;
  private var listValMut_13: meta.runtime.Future[scala.Boolean] = null;
  @transient private var iterMut_14: scala.collection.Iterator[meta.runtime.Future[scala.Boolean]] = null;
  private var bindingMut_15: scala.collection.immutable.List[scala.Boolean] = null;
  @transient private var bindingMut_16: scala.collection.generic.CanBuildFrom[scala.collection.immutable.List[_], scala.Boolean, scala.collection.immutable.List[scala.Boolean]] = null;
  private var bindingMut_17: scala.collection.immutable.List[meta.runtime.Future[scala.Boolean]] = null;
  private var bindingMut_18: scala.Boolean = false;
  private var bindingMut_19: scala.Boolean = false;
  private var bindingMut_20: scala.Double = 0.0;
  private var syncOneTurn_21: scala.Boolean = false;
  private var bindingMut_22: scala.collection.immutable.List[meta.runtime.Future[scala.Boolean]] = null;
  private var bindingMut_23: scala.collection.immutable.List[meta.runtime.Future[scala.Boolean]] = null;
  private var bindingMut_24: meta.runtime.Future[scala.Boolean] = null;
  private var bindingMut_25: scala.Boolean = false;
  private var listValMut_26: generated.ticktalk.example.gameOfLife.Cell = null;
  @transient private var iterMut_27: scala.collection.Iterator[generated.ticktalk.example.gameOfLife.Cell] = null;
  private var bindingMut_28: scala.collection.immutable.List[meta.runtime.Future[scala.Boolean]] = null;
  @transient private var bindingMut_29: scala.collection.generic.CanBuildFrom[scala.collection.immutable.List[_], meta.runtime.Future[scala.Boolean], scala.collection.immutable.List[meta.runtime.Future[scala.Boolean]]] = null;
  private var bindingMut_30: scala.collection.immutable.List[generated.ticktalk.example.gameOfLife.Cell] = null;
  private var bindingMut_31: scala.collection.immutable.Iterable[generated.ticktalk.example.gameOfLife.Cell] = null;
  @transient private var bindingMut_32: scala.collection.generic.CanBuildFrom[scala.collection.immutable.Iterable[_], generated.ticktalk.example.gameOfLife.Cell, scala.collection.immutable.Iterable[generated.ticktalk.example.gameOfLife.Cell]] = null;
  private var bindingMut_33: scala.collection.immutable.Map[scala.Long, meta.runtime.Actor] = null;
  private var bindingMut_34: java.lang.String = null;
  private var bindingMut_35: scala.Long = 0L;
  private var bindingMut_36: scala.Boolean = false;
  private var unblockFlag_37: scala.Boolean = true;
  private var positionVar_38: scala.Int = 0;
  
  val commands_315 = (() => {
  val data_39 = new scala.Array[scala.Function0[scala.Unit]](59);
  data_39.update(0, (() => positionVar_38 = 1));
  data_39.update(1, (() => {
    val x_40 = this.alive;
    resetData_0 = x_40;
    val x_41 = resetData_0;
    val x_42 = x_41.asInstanceOf[scala.Boolean];
    bindingMut_36 = x_42;
    positionVar_38 = 2
  }));
  data_39.update(2, (() => {
    val x_43 = bindingMut_36;
    val x_44 = x_43.`unary_!`;
    if (x_44)
      positionVar_38 = 3
    else
      positionVar_38 = 57
  }));
  data_39.update(3, (() => {
    val x_45 = this.connectedAgents;
    resetData_0 = x_45;
    val x_46 = resetData_0;
    val x_47 = x_46.asInstanceOf[scala.collection.immutable.Map[scala.Long, meta.runtime.Actor]];
    bindingMut_33 = x_47;
    val x_48 = scala.collection.immutable.Iterable.canBuildFrom[generated.ticktalk.example.gameOfLife.Cell];
    resetData_0 = x_48;
    val x_49 = resetData_0;
    val x_50 = x_49.asInstanceOf[scala.collection.generic.CanBuildFrom[scala.collection.immutable.Iterable[_], generated.ticktalk.example.gameOfLife.Cell, scala.collection.immutable.Iterable[generated.ticktalk.example.gameOfLife.Cell]]];
    bindingMut_32 = x_50;
    val x_51 = bindingMut_32;
    val x_52 = bindingMut_33;
    val x_55 = x_52.map[generated.ticktalk.example.gameOfLife.Cell, scala.collection.immutable.Iterable[generated.ticktalk.example.gameOfLife.Cell]](((x_53: scala.Tuple2[scala.Long, meta.runtime.Actor]) => {
      val x_54 = x_53._2;
      x_54.asInstanceOf[generated.ticktalk.example.gameOfLife.Cell]
    }))(x_51);
    resetData_0 = x_55;
    val x_56 = resetData_0;
    val x_57 = x_56.asInstanceOf[scala.collection.immutable.Iterable[generated.ticktalk.example.gameOfLife.Cell]];
    bindingMut_31 = x_57;
    val x_58 = bindingMut_31;
    val x_59 = x_58.toList;
    resetData_0 = x_59;
    val x_60 = resetData_0;
    val x_61 = x_60.asInstanceOf[scala.collection.immutable.List[generated.ticktalk.example.gameOfLife.Cell]];
    bindingMut_30 = x_61;
    val x_62 = scala.collection.immutable.List.canBuildFrom[meta.runtime.Future[scala.Boolean]];
    resetData_0 = x_62;
    val x_63 = resetData_0;
    val x_64 = x_63.asInstanceOf[scala.collection.generic.CanBuildFrom[scala.collection.immutable.List[_], meta.runtime.Future[scala.Boolean], scala.collection.immutable.List[meta.runtime.Future[scala.Boolean]]]];
    bindingMut_29 = x_64;
    resetData_0 = scala.collection.immutable.Nil;
    val x_65 = resetData_0;
    val x_66 = x_65.asInstanceOf[scala.collection.immutable.List[meta.runtime.Future[scala.Boolean]]];
    bindingMut_28 = x_66;
    val x_67 = bindingMut_30;
    val x_68 = x_67.iterator;
    iterMut_27 = x_68;
    positionVar_38 = 4
  }));
  data_39.update(4, (() => {
    val x_69 = iterMut_27;
    val x_70 = x_69.hasNext;
    if (x_70)
      {
        val x_71 = iterMut_27;
        val x_72 = x_71.next();
        listValMut_26 = x_72;
        val x_73 = this._container;
        val x_74 = x_73.!=(null);
        val x_79 = if (x_74)
          {
            val x_75 = this._container;
            val x_76 = x_75.proxyIds;
            val x_77 = listValMut_26;
            val x_78 = x_77.id;
            x_76.contains[scala.Long](x_78)
          }
        else
          false;
        resetData_0 = x_79;
        val x_80 = resetData_0;
        val x_81 = x_80.asInstanceOf[scala.Boolean];
        bindingMut_25 = x_81;
        positionVar_38 = 5
      }
    else
      positionVar_38 = 8
  }));
  data_39.update(5, (() => {
    val x_82 = bindingMut_25;
    val x_83 = x_82.`unary_!`;
    if (x_83)
      {
        val x_84 = ((this): meta.runtime.Actor).id;
        val x_85 = listValMut_26;
        val x_86 = x_85.id;
        val x_87 = scala.`package`.Right.apply[scala.Nothing, scala.Int](0);
        val x_88 = meta.runtime.RequestMessage.apply(x_84, x_86, false, x_87, scala.collection.immutable.Nil);
        val x_89 = x_88.sessionId;
        val x_90 = meta.runtime.Future.apply$default$2[scala.Boolean];
        val x_91 = meta.runtime.Future.apply[scala.Boolean](x_89, x_90);
        var v_92: meta.runtime.Future[scala.Boolean] = x_91;
        ((this): meta.runtime.Actor).sendMessage(x_88);
        val x_93 = x_88.sessionId;
        ((this): meta.runtime.Actor).setMessageResponseHandler(x_93, ((response_94: meta.runtime.Message) => {
          val x_95 = v_92;
          val x_96 = response_94.asInstanceOf[meta.runtime.ResponseMessage];
          val x_97 = x_96.arg;
          val x_98 = x_97.asInstanceOf[scala.Boolean];
          x_95.setValue(x_98)
        }));
        val x_99 = v_92;
        resetData_0 = x_99;
        positionVar_38 = 6
      }
    else
      positionVar_38 = 7
  }));
  data_39.update(6, (() => {
    val x_100 = resetData_0;
    val x_101 = x_100.asInstanceOf[meta.runtime.Future[scala.Boolean]];
    bindingMut_24 = x_101;
    val x_102 = bindingMut_24;
    val x_103 = scala.collection.immutable.List.apply[meta.runtime.Future[scala.Boolean]](x_102);
    resetData_0 = x_103;
    val x_104 = resetData_0;
    val x_105 = x_104.asInstanceOf[scala.collection.immutable.List[meta.runtime.Future[scala.Boolean]]];
    bindingMut_23 = x_105;
    val x_106 = bindingMut_23;
    val x_107 = bindingMut_28;
    val x_108 = x_106.:::[meta.runtime.Future[scala.Boolean]](x_107);
    resetData_0 = x_108;
    val x_109 = resetData_0;
    val x_110 = x_109.asInstanceOf[scala.collection.immutable.List[meta.runtime.Future[scala.Boolean]]];
    bindingMut_28 = x_110;
    positionVar_38 = 4
  }));
  data_39.update(7, (() => {
    val x_111 = bindingMut_25;
    squid.lib.`package`.IfThenElse[scala.Unit](x_111, {
      val x_112 = listValMut_26;
      val x_113 = x_112.getValue;
      val x_114 = scala.Some.apply[scala.Boolean](x_113);
      val x$8_115 = meta.runtime.Future.apply$default$1[scala.Boolean];
      val x_116 = meta.runtime.Future.apply[scala.Boolean](x$8_115, x_114);
      resetData_0 = x_116;
      positionVar_38 = 6
    }, ())
  }));
  data_39.update(8, (() => {
    val x_117 = iterMut_27;
    val x_118 = x_117.hasNext;
    val x_119 = x_118.`unary_!`;
    if (x_119)
      {
        val x_120 = resetData_0;
        val x_121 = x_120.asInstanceOf[scala.collection.immutable.List[meta.runtime.Future[scala.Boolean]]];
        bindingMut_22 = x_121;
        val x_122 = bindingMut_22;
        this.`futures_=`(x_122);
        resetData_0 = ();
        resetData_0 = false;
        val x_123 = resetData_0;
        val x_124 = x_123.asInstanceOf[scala.Boolean];
        syncOneTurn_21 = x_124;
        positionVar_38 = 9
      }
    else
      ()
  }));
  data_39.update(9, (() => {
    val x_125 = this.futures;
    val x_126 = x_125.nonEmpty;
    val x_129 = x_126.&&({
      val x_127 = this.futures;
      x_127.forall(((x_128: meta.runtime.Future[scala.Boolean]) => x_128.isCompleted))
    });
    val x_130 = x_129.`unary_!`;
    if (x_130)
      positionVar_38 = 10
    else
      positionVar_38 = 56
  }));
  data_39.update(10, (() => {
    syncOneTurn_21 = true;
    resetData_0 = ();
    resetData_0 = 0.0;
    val x_131 = resetData_0;
    val x_132 = x_131.asInstanceOf[scala.Double];
    bindingMut_20 = x_132;
    positionVar_38 = 11
  }));
  data_39.update(11, (() => {
    val x_133 = bindingMut_20;
    val x_134 = x_133.+(1);
    resetData_0 = x_134;
    val x_135 = resetData_0;
    val x_136 = x_135.asInstanceOf[scala.Double];
    bindingMut_20 = x_136;
    positionVar_38 = 12;
    unblockFlag_37 = false
  }));
  data_39.update(12, (() => {
    positionVar_38 = 13;
    val x_137 = scala.Tuple2.apply[scala.Int, scala.Int](-1, -1);
    val x_138 = scala.Tuple2.apply[scala.Tuple2[scala.Int, scala.Int], scala.Int](x_137, 48);
    val x_139 = scala.collection.immutable.Nil.::[scala.Tuple2[scala.Tuple2[scala.Int, scala.Int], scala.Int]](x_138);
    resetData_1.prepend(x_139)
  }));
  data_39.update(13, (() => {
    val x_140 = this.popRequestMessages;
    val x_141 = x_140.iterator;
    iterMut_7 = x_141;
    positionVar_38 = 14
  }));
  data_39.update(14, (() => {
    val x_142 = iterMut_7;
    val x_143 = x_142.hasNext;
    if (x_143)
      {
        val x_144 = iterMut_7;
        val x_145 = x_144.next();
        listValMut_6 = x_145;
        positionVar_38 = 15
      }
    else
      positionVar_38 = 30
  }));
  data_39.update(15, (() => {
    val x_146 = listValMut_6;
    val x_147 = x_146.methodInfo;
    val x_148 = scala.`package`.Right.apply[scala.Nothing, scala.Int](1);
    val x_149 = x_147.==(x_148);
    if (x_149)
      positionVar_38 = 16
    else
      positionVar_38 = 22
  }));
  data_39.update(16, (() => {
    val x_150 = listValMut_6;
    this.handleNonblockingMessage(x_150);
    resetData_0 = ();
    positionVar_38 = 17
  }));
  data_39.update(17, (() => positionVar_38 = 18));
  data_39.update(18, (() => positionVar_38 = 14));
  data_39.update(19, (() => positionVar_38 = 20));
  data_39.update(20, (() => {
    val x_151 = methodArgsMut_4;
    val x_153 = x_151.filter(((x_152: scala.Boolean) => x_152.==(true)));
    val x_154 = x_153.size;
    val x_155 = this.alive;
    val x_157 = x_155.&&({
      val x_156 = x_154.>(3);
      x_156.||(x_154.<(2))
    });
    if (x_157)
      this.`alive_=`(false)
    else
      ();
    val x_158 = this.alive;
    val x_159 = x_158.`unary_!`;
    val x_160 = x_159.&&(x_154.==(3));
    if (x_160)
      this.`alive_=`(true)
    else
      ();
    resetData_0 = ();
    positionVar_38 = 21
  }));
  data_39.update(21, (() => {
    x_3.remove(0);
    val x_161 = x_3.isEmpty;
    val x_162 = x_161.`unary_!`;
    if (x_162)
      {
        val x_163 = x_3(0);
        val x_164 = x_163.asInstanceOf[scala.collection.immutable.List[scala.Boolean]];
        methodArgsMut_4 = x_164
      }
    else
      ();
    val x_165 = resetData_0;
    val x_166 = x_165.asInstanceOf[scala.Any];
    bindingMut_5 = x_166;
    val x_167 = bindingMut_5;
    val x_168 = listValMut_6;
    x_168.reply(this, x_167);
    resetData_0 = ();
    positionVar_38 = 17
  }));
  data_39.update(22, (() => {
    val x_169 = listValMut_6;
    val x_170 = x_169.methodInfo;
    val x_171 = scala.`package`.Right.apply[scala.Nothing, scala.Int](1);
    val x_172 = x_170.==(x_171);
    val x_173 = x_172.`unary_!`;
    if (x_173)
      positionVar_38 = 23
    else
      ()
  }));
  data_39.update(23, (() => {
    val x_174 = listValMut_6;
    val x_175 = x_174.methodInfo;
    val x_176 = scala.`package`.Right.apply[scala.Nothing, scala.Int](0);
    val x_177 = x_175.==(x_176);
    if (x_177)
      positionVar_38 = 24
    else
      positionVar_38 = 29
  }));
  data_39.update(24, (() => {
    val x_178 = listValMut_6;
    this.handleNonblockingMessage(x_178);
    resetData_0 = ();
    positionVar_38 = 25
  }));
  data_39.update(25, (() => positionVar_38 = 18));
  data_39.update(26, (() => positionVar_38 = 27));
  data_39.update(27, (() => {
    val x_179 = this.alive;
    resetData_0 = x_179;
    positionVar_38 = 28
  }));
  data_39.update(28, (() => {
    val x_180 = resetData_0;
    val x_181 = x_180.asInstanceOf[scala.Any];
    bindingMut_5 = x_181;
    val x_182 = bindingMut_5;
    val x_183 = listValMut_6;
    x_183.reply(this, x_182);
    resetData_0 = ();
    positionVar_38 = 25
  }));
  data_39.update(29, (() => {
    val x_184 = listValMut_6;
    val x_185 = x_184.methodInfo;
    val x_186 = scala.`package`.Right.apply[scala.Nothing, scala.Int](0);
    val x_187 = x_185.==(x_186);
    val x_188 = x_187.`unary_!`;
    if (x_188)
      {
        val x_189 = listValMut_6;
        val x_190 = scala.collection.immutable.List.apply[meta.runtime.RequestMessage](x_189);
        val x_191 = this.addReceiveMessages(x_190);
        resetData_0 = x_191;
        positionVar_38 = 18
      }
    else
      ()
  }));
  data_39.update(30, (() => {
    val x_192 = iterMut_7;
    val x_193 = x_192.hasNext;
    val x_194 = x_193.`unary_!`;
    if (x_194)
      {
        val x_195 = resetData_1.remove(0);
        val x_199 = x_195.find(((x_196: scala.Tuple2[scala.Tuple2[scala.Int, scala.Int], scala.Int]) => {
          val x_197 = x_196._1;
          val x_198 = scala.Tuple2.apply[scala.Int, scala.Int](-1, -1);
          x_197.==(x_198)
        }));
        val x_200 = x_199.get;
        val x_201 = x_200._2;
        positionVar_38 = x_201
      }
    else
      ()
  }));
  data_39.update(31, (() => positionVar_38 = 32));
  data_39.update(32, (() => {
    val x_202 = bindingMut_20;
    val x_203 = x_202.<(1.0);
    if (x_203)
      positionVar_38 = 33
    else
      positionVar_38 = 35
  }));
  data_39.update(33, (() => {
    val x_204 = bindingMut_20;
    val x_205 = x_204.+(1);
    resetData_0 = x_205;
    val x_206 = resetData_0;
    val x_207 = x_206.asInstanceOf[scala.Double];
    bindingMut_20 = x_207;
    positionVar_38 = 34;
    unblockFlag_37 = false
  }));
  data_39.update(34, (() => {
    positionVar_38 = 13;
    val x_208 = scala.Tuple2.apply[scala.Int, scala.Int](-1, -1);
    val x_209 = scala.Tuple2.apply[scala.Tuple2[scala.Int, scala.Int], scala.Int](x_208, 31);
    val x_210 = scala.collection.immutable.Nil.::[scala.Tuple2[scala.Tuple2[scala.Int, scala.Int], scala.Int]](x_209);
    resetData_1.prepend(x_210)
  }));
  data_39.update(35, (() => {
    val x_211 = bindingMut_20;
    val x_212 = x_211.<(1.0);
    val x_213 = x_212.`unary_!`;
    if (x_213)
      positionVar_38 = 36
    else
      ()
  }));
  data_39.update(36, (() => positionVar_38 = 1));
  data_39.update(37, (() => positionVar_38 = 38));
  data_39.update(38, (() => {
    positionVar_38 = 39;
    unblockFlag_37 = false
  }));
  data_39.update(39, (() => positionVar_38 = 38));
  data_39.update(40, (() => positionVar_38 = 41));
  data_39.update(41, (() => {
    val x_214 = bindingMut_20;
    val x_215 = x_214.<(1.0);
    if (x_215)
      positionVar_38 = 42
    else
      positionVar_38 = 44
  }));
  data_39.update(42, (() => {
    val x_216 = bindingMut_20;
    val x_217 = x_216.+(1);
    resetData_0 = x_217;
    val x_218 = resetData_0;
    val x_219 = x_218.asInstanceOf[scala.Double];
    bindingMut_20 = x_219;
    positionVar_38 = 43;
    unblockFlag_37 = false
  }));
  data_39.update(43, (() => {
    positionVar_38 = 13;
    val x_220 = scala.Tuple2.apply[scala.Int, scala.Int](-1, -1);
    val x_221 = scala.Tuple2.apply[scala.Tuple2[scala.Int, scala.Int], scala.Int](x_220, 40);
    val x_222 = scala.collection.immutable.Nil.::[scala.Tuple2[scala.Tuple2[scala.Int, scala.Int], scala.Int]](x_221);
    resetData_1.prepend(x_222)
  }));
  data_39.update(44, (() => {
    val x_223 = bindingMut_20;
    val x_224 = x_223.<(1.0);
    val x_225 = x_224.`unary_!`;
    if (x_225)
      positionVar_38 = 45
    else
      ()
  }));
  data_39.update(45, (() => {
    val x_226 = this.futures;
    resetData_0 = x_226;
    val x_227 = resetData_0;
    val x_228 = x_227.asInstanceOf[scala.collection.immutable.List[meta.runtime.Future[scala.Boolean]]];
    bindingMut_17 = x_228;
    val x_229 = scala.collection.immutable.List.canBuildFrom[scala.Boolean];
    resetData_0 = x_229;
    val x_230 = resetData_0;
    val x_231 = x_230.asInstanceOf[scala.collection.generic.CanBuildFrom[scala.collection.immutable.List[_], scala.Boolean, scala.collection.immutable.List[scala.Boolean]]];
    bindingMut_16 = x_231;
    resetData_0 = scala.collection.immutable.Nil;
    val x_232 = resetData_0;
    val x_233 = x_232.asInstanceOf[scala.collection.immutable.List[scala.Boolean]];
    bindingMut_15 = x_233;
    val x_234 = bindingMut_17;
    val x_235 = x_234.iterator;
    iterMut_14 = x_235;
    positionVar_38 = 46
  }));
  data_39.update(46, (() => {
    val x_236 = iterMut_14;
    val x_237 = x_236.hasNext;
    if (x_237)
      {
        val x_238 = iterMut_14;
        val x_239 = x_238.next();
        listValMut_13 = x_239;
        val x_240 = listValMut_13;
        val x_241 = x_240.popValue;
        resetData_0 = x_241;
        val x_242 = resetData_0;
        val x_243 = x_242.asInstanceOf[scala.Option[scala.Boolean]];
        bindingMut_12 = x_243;
        val x_244 = bindingMut_12;
        val x_245 = x_244.get;
        resetData_0 = x_245;
        val x_246 = resetData_0;
        val x_247 = x_246.asInstanceOf[scala.Boolean];
        bindingMut_11 = x_247;
        val x_248 = bindingMut_11;
        val x_249 = scala.collection.immutable.List.apply[scala.Boolean](x_248);
        resetData_0 = x_249;
        val x_250 = resetData_0;
        val x_251 = x_250.asInstanceOf[scala.collection.immutable.List[scala.Boolean]];
        bindingMut_10 = x_251;
        val x_252 = bindingMut_10;
        val x_253 = bindingMut_15;
        val x_254 = x_252.:::[scala.Boolean](x_253);
        resetData_0 = x_254;
        val x_255 = resetData_0;
        val x_256 = x_255.asInstanceOf[scala.collection.immutable.List[scala.Boolean]];
        bindingMut_15 = x_256;
        positionVar_38 = 46
      }
    else
      positionVar_38 = 47
  }));
  data_39.update(47, (() => {
    val x_257 = iterMut_14;
    val x_258 = x_257.hasNext;
    val x_259 = x_258.`unary_!`;
    if (x_259)
      {
        val x_260 = resetData_0;
        val x_261 = x_260.asInstanceOf[scala.collection.immutable.List[scala.Boolean]];
        bindingMut_9 = x_261;
        val x_262 = bindingMut_9;
        val x_263 = x_262.asInstanceOf[scala.collection.immutable.List[scala.Boolean]];
        resetData_0 = x_263;
        val x_264 = resetData_0;
        val x_265 = x_264.asInstanceOf[scala.collection.immutable.List[scala.Boolean]];
        bindingMut_8 = x_265;
        val x_266 = bindingMut_8;
        this.rule(x_266);
        resetData_0 = ();
        resetData_0 = 0.0;
        val x_267 = resetData_0;
        val x_268 = x_267.asInstanceOf[scala.Double];
        bindingMut_20 = x_268;
        positionVar_38 = 33
      }
    else
      ()
  }));
  data_39.update(48, (() => positionVar_38 = 49));
  data_39.update(49, (() => {
    val x_269 = bindingMut_20;
    val x_270 = x_269.<(1.0);
    if (x_270)
      positionVar_38 = 11
    else
      positionVar_38 = 50
  }));
  data_39.update(50, (() => {
    val x_271 = bindingMut_20;
    val x_272 = x_271.<(1.0);
    val x_273 = x_272.`unary_!`;
    if (x_273)
      positionVar_38 = 51
    else
      ()
  }));
  data_39.update(51, (() => {
    val x_274 = this.futures;
    val x_275 = x_274.nonEmpty;
    val x_278 = x_275.&&({
      val x_276 = this.futures;
      x_276.forall(((x_277: meta.runtime.Future[scala.Boolean]) => x_277.isCompleted))
    });
    val x_279 = x_278.`unary_!`;
    if (x_279)
      positionVar_38 = 10
    else
      positionVar_38 = 52
  }));
  data_39.update(52, (() => {
    val x_280 = this.futures;
    val x_281 = x_280.nonEmpty;
    val x_284 = x_281.&&({
      val x_282 = this.futures;
      x_282.forall(((x_283: meta.runtime.Future[scala.Boolean]) => x_283.isCompleted))
    });
    val x_285 = x_284.`unary_!`;
    val x_286 = x_285.`unary_!`;
    if (x_286)
      positionVar_38 = 53
    else
      ()
  }));
  data_39.update(53, (() => {
    val x_287 = syncOneTurn_21;
    resetData_0 = x_287;
    val x_288 = resetData_0;
    val x_289 = x_288.asInstanceOf[scala.Boolean];
    bindingMut_19 = x_289;
    val x_290 = bindingMut_19;
    val x_291 = x_290.`unary_!`;
    resetData_0 = x_291;
    val x_292 = resetData_0;
    val x_293 = x_292.asInstanceOf[scala.Boolean];
    bindingMut_18 = x_293;
    positionVar_38 = 54
  }));
  data_39.update(54, (() => {
    val x_294 = bindingMut_18;
    val x_295 = x_294.`unary_!`;
    if (x_295)
      positionVar_38 = 45
    else
      positionVar_38 = 55
  }));
  data_39.update(55, (() => {
    val x_296 = bindingMut_18;
    squid.lib.`package`.IfThenElse[scala.Unit](x_296, {
      resetData_0 = 0.0;
      val x_297 = resetData_0;
      val x_298 = x_297.asInstanceOf[scala.Double];
      bindingMut_20 = x_298;
      positionVar_38 = 42
    }, ())
  }));
  data_39.update(56, (() => {
    val x_299 = this.futures;
    val x_300 = x_299.nonEmpty;
    val x_303 = x_300.&&({
      val x_301 = this.futures;
      x_301.forall(((x_302: meta.runtime.Future[scala.Boolean]) => x_302.isCompleted))
    });
    val x_304 = x_303.`unary_!`;
    val x_305 = x_304.`unary_!`;
    if (x_305)
      positionVar_38 = 53
    else
      ()
  }));
  data_39.update(57, (() => {
    val x_306 = bindingMut_36;
    squid.lib.`package`.IfThenElse[scala.Unit](x_306, {
      val x_307 = this.id;
      resetData_0 = x_307;
      val x_308 = resetData_0;
      val x_309 = x_308.asInstanceOf[scala.Long];
      bindingMut_35 = x_309;
      val x_310 = bindingMut_35;
      val x_311 = x_310.+(" is alive!");
      resetData_0 = x_311;
      val x_312 = resetData_0;
      val x_313 = x_312.asInstanceOf[java.lang.String];
      bindingMut_34 = x_313;
      val x_314 = bindingMut_34;
      scala.Predef.println(x_314);
      resetData_0 = ();
      positionVar_38 = 3
    }, ())
  }));
  data_39.update(58, (() => positionVar_38 = 38));
  data_39
}).apply();
  

  def getValue: Boolean =
      this.alive

  
  def wrapper_getValue(args: List[Any]): Boolean = {
    getValue
  }
  
  def rule(neighbors: List[Boolean]): Unit = 
      {
  val x_1 = neighbors.filter(((x_0: scala.Boolean) => x_0.==(true)));
  val x_2 = x_1.size;
  val x_3 = this.alive;
  val x_5 = x_3.&&({
    val x_4 = x_2.>(3);
    x_4.||(x_2.<(2))
  });
  if (x_5)
    this.`alive_=`(false)
  else
    ();
  val x_6 = this.alive;
  val x_7 = x_6.`unary_!`;
  val x_8 = x_7.&&(x_2.==(3));
  if (x_8)
    this.`alive_=`(true)
  else
    ()
}
  
  def wrapper_rule(args: List[Any]): Unit = {
    
          val neighbors: List[Boolean] = args(0).asInstanceOf[List[Boolean]]
          rule(neighbors)
          
  }
  
  override def deepClone(): meta.runtime.Actor = {
    val cloner = new Cell(alive)
    cloner.connectedAgents = connectedAgents
    cloner
  }
  
  override def run(msgs: List[meta.runtime.Message]): List[meta.runtime.Message] = {
    addReceiveMessages(msgs)
    sendMessages.clear()
    unblockFlag_37 = true
    while (unblockFlag_37 && (positionVar_38 < 59)) {
      commands_315(positionVar_38)()
    }
    sendMessages.toList
  }
  
  override def getInstructionPointer: Int = {
    positionVar_38
  }
  
  override def setInstructionPointer(new_ir: Int) = {
    if (new_ir >= 59 || new_ir <0) {
      throw new Exception("Invalid address pointer " + new_ir + " for agent " + id)
    }
    val prev_ir: Int = positionVar_38
    positionVar_38 = new_ir
    this
  }
  
  override def handleNonblockingMessage(m: meta.runtime.RequestMessage): Unit = {
    val args = m.argss.flatten
    val response = m.methodInfo match {
      case Right(x) => {
        x match {
          case 0 => wrapper_getValue(args)
        case 1 => wrapper_rule(args)
        }
      }
      case Left(x) => println("For staged implementation only")
    }
    m.reply(this, response)
  }
  
    override def gotoHandleMessages(new_ir: Int = 12): meta.runtime.Actor = {
      // first entry, save the current IR to reflectionIR
      unblockFlag_37 = true

      if (reflectionIR_61 == -1){
        reflectionIR_61 = positionVar_38
        positionVar_38 = new_ir
      }

      while (positionVar_38 <= 29 && unblockFlag_37) {
        commands_315(positionVar_38)()
      }

      // reset instruction register when finishes processing
      if (positionVar_38 > 29) {
        positionVar_38 = reflectionIR_61
        reflectionIR_61 = -1
      }
      this
    }
    
}
