package generated.ticktalk.example.segregation

class Person (val world: generated.ticktalk.example.segregation.WorldMap, val view: Int, val toleranceThreshold: Double) extends meta.runtime.Actor {

  var location: Int = 0;
  var similarity: Double = 1.0;
  val neighborRadius: Int = 1;
  var neighborViews: List[meta.runtime.Future[Int]] = null;
  private var  reflectionIR_64: Int = -1
  private var resetData_0: scala.Any = null;
  private val resetData_1 = scala.collection.mutable.ListBuffer.apply[scala.collection.immutable.List[scala.Tuple2[scala.Tuple2[scala.Int, scala.Int], scala.Int]]]();
  private var resetData_2: meta.runtime.ResponseMessage = null;
  private var bindingMut_3: scala.Any = null;
  private var listValMut_4: meta.runtime.RequestMessage = null;
  @transient private var iterMut_5: scala.collection.Iterator[meta.runtime.RequestMessage] = null;
  private var bindingMut_6: scala.Int = 0;
  private var bindingMut_7: scala.Boolean = false;
  private var bindingMut_8: scala.Int = 0;
  private var bindingMut_9: generated.ticktalk.example.segregation.WorldMap = null;
  private var bindingMut_10: scala.Boolean = false;
  private var bindingMut_11: scala.Double = 0.0;
  private var bindingMut_12: scala.Int = 0;
  private var bindingMut_13: scala.Double = 0.0;
  private var bindingMut_14: scala.Int = 0;
  private var bindingMut_15: scala.Double = 0.0;
  private var bindingMut_16: scala.Int = 0;
  private var bindingMut_17: scala.Double = 0.0;
  private var bindingMut_18: scala.Int = 0;
  private var bindingMut_19: scala.Boolean = false;
  private var bindingMut_20: scala.Int = 0;
  private var bindingMut_21: scala.Int = 0;
  private var bindingMut_22: scala.Int = 0;
  private var bindingMut_23: scala.Boolean = false;
  private var bindingMut_24: scala.Int = 0;
  private var listValMut_25: scala.Int = 0;
  @transient private var iterMut_26: scala.collection.Iterator[scala.Int] = null;
  private var bindingMut_27: scala.collection.immutable.List[scala.Int] = null;
  private var bindingMut_28: scala.collection.immutable.List[scala.Int] = null;
  private var bindingMut_29: scala.Int = 0;
  private var bindingMut_30: scala.Int = 0;
  private var bindingMut_31: scala.Option[scala.Int] = null;
  private var listValMut_32: meta.runtime.Future[scala.Int] = null;
  @transient private var iterMut_33: scala.collection.Iterator[meta.runtime.Future[scala.Int]] = null;
  private var bindingMut_34: scala.collection.immutable.List[scala.Int] = null;
  @transient private var bindingMut_35: scala.collection.generic.CanBuildFrom[scala.collection.immutable.List[_], scala.Int, scala.collection.immutable.List[scala.Int]] = null;
  private var bindingMut_36: scala.collection.immutable.List[meta.runtime.Future[scala.Int]] = null;
  private var bindingMut_37: scala.Double = 0.0;
  private var bindingMut_38: scala.collection.immutable.List[meta.runtime.Future[scala.Int]] = null;
  private var bindingMut_39: scala.collection.immutable.List[meta.runtime.Future[scala.Int]] = null;
  private var bindingMut_40: meta.runtime.Future[scala.Int] = null;
  private var bindingMut_41: scala.Boolean = false;
  private var listValMut_42: generated.ticktalk.example.segregation.Person = null;
  @transient private var iterMut_43: scala.collection.Iterator[generated.ticktalk.example.segregation.Person] = null;
  private var bindingMut_44: scala.collection.immutable.List[meta.runtime.Future[scala.Int]] = null;
  @transient private var bindingMut_45: scala.collection.generic.CanBuildFrom[scala.collection.immutable.List[_], meta.runtime.Future[scala.Int], scala.collection.immutable.List[meta.runtime.Future[scala.Int]]] = null;
  private var bindingMut_46: scala.collection.immutable.List[generated.ticktalk.example.segregation.Person] = null;
  private var bindingMut_47: scala.collection.immutable.List[generated.ticktalk.example.segregation.Person] = null;
  private var bindingMut_48: generated.ticktalk.example.segregation.Person = null;
  private var bindingMut_49: meta.runtime.Actor = null;
  private var bindingMut_50: scala.collection.immutable.Map[scala.Long, meta.runtime.Actor] = null;
  private var listValMut_51: scala.Long = 0L;
  @transient private var iterMut_52: scala.collection.Iterator[scala.Long] = null;
  private var bindingMut_53: scala.collection.immutable.List[generated.ticktalk.example.segregation.Person] = null;
  @transient private var bindingMut_54: scala.collection.generic.CanBuildFrom[scala.collection.immutable.List[_], generated.ticktalk.example.segregation.Person, scala.collection.immutable.List[generated.ticktalk.example.segregation.Person]] = null;
  private var bindingMut_55: scala.collection.immutable.List[scala.Long] = null;
  private var bindingMut_56: scala.Boolean = false;
  private var bindingMut_57: scala.Int = 0;
  private var bindingMut_58: generated.ticktalk.example.segregation.WorldMap = null;
  private var sameView_59: scala.Int = 0;
  private var unblockFlag_60: scala.Boolean = true;
  private var positionVar_61: scala.Int = 0;
  
  val commands_504 = (() => {
  val data_62 = new scala.Array[scala.Function0[scala.Unit]](67);
  data_62.update(0, (() => {
    val receiver_63 = this.world;
    val x_64 = ((this): meta.runtime.Actor).id;
    val x_65 = receiver_63.id;
    val x_66 = scala.`package`.Right.apply[scala.Nothing, scala.Int](3);
    val x$1_67 = this.location;
    val x$1_68 = this.id;
    val x_69 = scala.collection.immutable.Nil.::[scala.Any](x$1_68);
    val x_70 = x_69.::[scala.Any](x$1_67);
    val x_71 = scala.collection.immutable.Nil.::[scala.collection.immutable.List[scala.Any]](x_70);
    val x_72 = meta.runtime.RequestMessage.apply(x_64, x_65, false, x_66, x_71);
    val x_73 = x_72.sessionId;
    val x_74 = meta.runtime.Future.apply$default$2[scala.Unit];
    val x_75 = meta.runtime.Future.apply[scala.Unit](x_73, x_74);
    var v_76: meta.runtime.Future[scala.Unit] = x_75;
    ((this): meta.runtime.Actor).sendMessage(x_72);
    val x_77 = x_72.sessionId;
    ((this): meta.runtime.Actor).setMessageResponseHandler(x_77, ((response_78: meta.runtime.Message) => {
      val x_79 = v_76;
      val x_80 = response_78.asInstanceOf[meta.runtime.ResponseMessage];
      val x_81 = x_80.arg;
      x_81.asInstanceOf[scala.Unit];
      x_79.setValue(())
    }));
    val x_82 = v_76;
    resetData_0 = x_82;
    positionVar_61 = 1
  }));
  data_62.update(1, (() => positionVar_61 = 2));
  data_62.update(2, (() => {
    resetData_0 = 0;
    val x_83 = resetData_0;
    val x_84 = x_83.asInstanceOf[scala.Int];
    sameView_59 = x_84;
    val x_85 = this.world;
    resetData_0 = x_85;
    val x_86 = resetData_0;
    val x_87 = x_86.asInstanceOf[generated.ticktalk.example.segregation.WorldMap];
    bindingMut_58 = x_87;
    val x_88 = this.location;
    resetData_0 = x_88;
    val x_89 = resetData_0;
    val x_90 = x_89.asInstanceOf[scala.Int];
    bindingMut_57 = x_90;
    val x_91 = this._container;
    val x_92 = x_91.!=(null);
    val x_97 = if (x_92)
      {
        val x_93 = this._container;
        val x_94 = x_93.proxyIds;
        val x_95 = bindingMut_58;
        val x_96 = x_95.id;
        x_94.contains[scala.Long](x_96)
      }
    else
      false;
    resetData_0 = x_97;
    val x_98 = resetData_0;
    val x_99 = x_98.asInstanceOf[scala.Boolean];
    bindingMut_56 = x_99;
    positionVar_61 = 3
  }));
  data_62.update(3, (() => {
    val x_100 = bindingMut_56;
    val x_101 = x_100.`unary_!`;
    if (x_101)
      {
        val x_102 = ((this): meta.runtime.Actor).id;
        val x_103 = bindingMut_58;
        val x_104 = x_103.id;
        val x_105 = scala.`package`.Right.apply[scala.Nothing, scala.Int](4);
        val x_106 = bindingMut_57;
        val x_107 = scala.collection.immutable.Nil.::[scala.Any](x_106);
        val x_108 = scala.collection.immutable.Nil.::[scala.collection.immutable.List[scala.Any]](x_107);
        val x_109 = meta.runtime.RequestMessage.apply(x_102, x_104, true, x_105, x_108);
        ((this): meta.runtime.Actor).sendMessage(x_109);
        val x_110 = x_109.sessionId;
        ((this): meta.runtime.Actor).setMessageResponseHandler(x_110, ((response_111: meta.runtime.Message) => {
          val x_112 = response_111.asInstanceOf[meta.runtime.ResponseMessage];
          resetData_2 = x_112
        }));
        resetData_0 = null;
        positionVar_61 = 4
      }
    else
      positionVar_61 = 65
  }));
  data_62.update(4, (() => {
    positionVar_61 = 5;
    unblockFlag_60 = false
  }));
  data_62.update(5, (() => {
    val x_113 = resetData_2;
    val x_114 = x_113.==(null);
    if (x_114)
      positionVar_61 = 4
    else
      positionVar_61 = 6
  }));
  data_62.update(6, (() => {
    val x_115 = resetData_2;
    val x_116 = x_115.!=(null);
    if (x_116)
      {
        val x_117 = resetData_2;
        val x_118 = x_117.arg;
        resetData_0 = x_118;
        resetData_2 = null;
        positionVar_61 = 7
      }
    else
      ()
  }));
  data_62.update(7, (() => {
    val x_119 = resetData_0;
    val x_120 = x_119.asInstanceOf[scala.collection.immutable.List[scala.Long]];
    bindingMut_55 = x_120;
    val x_121 = scala.collection.immutable.List.canBuildFrom[generated.ticktalk.example.segregation.Person];
    resetData_0 = x_121;
    val x_122 = resetData_0;
    val x_123 = x_122.asInstanceOf[scala.collection.generic.CanBuildFrom[scala.collection.immutable.List[_], generated.ticktalk.example.segregation.Person, scala.collection.immutable.List[generated.ticktalk.example.segregation.Person]]];
    bindingMut_54 = x_123;
    resetData_0 = scala.collection.immutable.Nil;
    val x_124 = resetData_0;
    val x_125 = x_124.asInstanceOf[scala.collection.immutable.List[generated.ticktalk.example.segregation.Person]];
    bindingMut_53 = x_125;
    val x_126 = bindingMut_55;
    val x_127 = x_126.iterator;
    iterMut_52 = x_127;
    positionVar_61 = 8
  }));
  data_62.update(8, (() => {
    val x_128 = iterMut_52;
    val x_129 = x_128.hasNext;
    if (x_129)
      {
        val x_130 = iterMut_52;
        val x_131 = x_130.next();
        listValMut_51 = x_131;
        val x_132 = this.connectedAgents;
        resetData_0 = x_132;
        val x_133 = resetData_0;
        val x_134 = x_133.asInstanceOf[scala.collection.immutable.Map[scala.Long, meta.runtime.Actor]];
        bindingMut_50 = x_134;
        val x_135 = bindingMut_50;
        val x_136 = listValMut_51;
        val x_137 = x_135.apply(x_136);
        resetData_0 = x_137;
        val x_138 = resetData_0;
        val x_139 = x_138.asInstanceOf[meta.runtime.Actor];
        bindingMut_49 = x_139;
        val x_140 = bindingMut_49;
        val x_141 = x_140.asInstanceOf[generated.ticktalk.example.segregation.Person];
        resetData_0 = x_141;
        val x_142 = resetData_0;
        val x_143 = x_142.asInstanceOf[generated.ticktalk.example.segregation.Person];
        bindingMut_48 = x_143;
        val x_144 = bindingMut_48;
        val x_145 = scala.collection.immutable.List.apply[generated.ticktalk.example.segregation.Person](x_144);
        resetData_0 = x_145;
        val x_146 = resetData_0;
        val x_147 = x_146.asInstanceOf[scala.collection.immutable.List[generated.ticktalk.example.segregation.Person]];
        bindingMut_47 = x_147;
        val x_148 = bindingMut_47;
        val x_149 = bindingMut_53;
        val x_150 = x_148.:::[generated.ticktalk.example.segregation.Person](x_149);
        resetData_0 = x_150;
        val x_151 = resetData_0;
        val x_152 = x_151.asInstanceOf[scala.collection.immutable.List[generated.ticktalk.example.segregation.Person]];
        bindingMut_53 = x_152;
        positionVar_61 = 8
      }
    else
      positionVar_61 = 9
  }));
  data_62.update(9, (() => {
    val x_153 = iterMut_52;
    val x_154 = x_153.hasNext;
    val x_155 = x_154.`unary_!`;
    if (x_155)
      {
        val x_156 = resetData_0;
        val x_157 = x_156.asInstanceOf[scala.collection.immutable.List[generated.ticktalk.example.segregation.Person]];
        bindingMut_46 = x_157;
        val x_158 = scala.collection.immutable.List.canBuildFrom[meta.runtime.Future[scala.Int]];
        resetData_0 = x_158;
        val x_159 = resetData_0;
        val x_160 = x_159.asInstanceOf[scala.collection.generic.CanBuildFrom[scala.collection.immutable.List[_], meta.runtime.Future[scala.Int], scala.collection.immutable.List[meta.runtime.Future[scala.Int]]]];
        bindingMut_45 = x_160;
        resetData_0 = scala.collection.immutable.Nil;
        val x_161 = resetData_0;
        val x_162 = x_161.asInstanceOf[scala.collection.immutable.List[meta.runtime.Future[scala.Int]]];
        bindingMut_44 = x_162;
        val x_163 = bindingMut_46;
        val x_164 = x_163.iterator;
        iterMut_43 = x_164;
        positionVar_61 = 10
      }
    else
      ()
  }));
  data_62.update(10, (() => {
    val x_165 = iterMut_43;
    val x_166 = x_165.hasNext;
    if (x_166)
      {
        val x_167 = iterMut_43;
        val x_168 = x_167.next();
        listValMut_42 = x_168;
        val x_169 = this._container;
        val x_170 = x_169.!=(null);
        val x_175 = if (x_170)
          {
            val x_171 = this._container;
            val x_172 = x_171.proxyIds;
            val x_173 = listValMut_42;
            val x_174 = x_173.id;
            x_172.contains[scala.Long](x_174)
          }
        else
          false;
        resetData_0 = x_175;
        val x_176 = resetData_0;
        val x_177 = x_176.asInstanceOf[scala.Boolean];
        bindingMut_41 = x_177;
        positionVar_61 = 11
      }
    else
      positionVar_61 = 14
  }));
  data_62.update(11, (() => {
    val x_178 = bindingMut_41;
    val x_179 = x_178.`unary_!`;
    if (x_179)
      {
        val x_180 = ((this): meta.runtime.Actor).id;
        val x_181 = listValMut_42;
        val x_182 = x_181.id;
        val x_183 = scala.`package`.Right.apply[scala.Nothing, scala.Int](0);
        val x_184 = scala.collection.immutable.Nil.::[scala.collection.immutable.List[scala.Any]](((scala.collection.immutable.Nil): scala.collection.immutable.List[scala.Any]));
        val x_185 = meta.runtime.RequestMessage.apply(x_180, x_182, false, x_183, x_184);
        val x_186 = x_185.sessionId;
        val x_187 = meta.runtime.Future.apply$default$2[scala.Int];
        val x_188 = meta.runtime.Future.apply[scala.Int](x_186, x_187);
        var v_189: meta.runtime.Future[scala.Int] = x_188;
        ((this): meta.runtime.Actor).sendMessage(x_185);
        val x_190 = x_185.sessionId;
        ((this): meta.runtime.Actor).setMessageResponseHandler(x_190, ((response_191: meta.runtime.Message) => {
          val x_192 = v_189;
          val x_193 = response_191.asInstanceOf[meta.runtime.ResponseMessage];
          val x_194 = x_193.arg;
          val x_195 = x_194.asInstanceOf[scala.Int];
          x_192.setValue(x_195)
        }));
        val x_196 = v_189;
        resetData_0 = x_196;
        positionVar_61 = 12
      }
    else
      positionVar_61 = 13
  }));
  data_62.update(12, (() => {
    val x_197 = resetData_0;
    val x_198 = x_197.asInstanceOf[meta.runtime.Future[scala.Int]];
    bindingMut_40 = x_198;
    val x_199 = bindingMut_40;
    val x_200 = scala.collection.immutable.List.apply[meta.runtime.Future[scala.Int]](x_199);
    resetData_0 = x_200;
    val x_201 = resetData_0;
    val x_202 = x_201.asInstanceOf[scala.collection.immutable.List[meta.runtime.Future[scala.Int]]];
    bindingMut_39 = x_202;
    val x_203 = bindingMut_39;
    val x_204 = bindingMut_44;
    val x_205 = x_203.:::[meta.runtime.Future[scala.Int]](x_204);
    resetData_0 = x_205;
    val x_206 = resetData_0;
    val x_207 = x_206.asInstanceOf[scala.collection.immutable.List[meta.runtime.Future[scala.Int]]];
    bindingMut_44 = x_207;
    positionVar_61 = 10
  }));
  data_62.update(13, (() => {
    val x_208 = bindingMut_41;
    squid.lib.`package`.IfThenElse[scala.Unit](x_208, {
      val x_209 = listValMut_42;
      val x_210 = x_209.getView();
      val x_211 = scala.Some.apply[scala.Int](x_210);
      val x$8_212 = meta.runtime.Future.apply$default$1[scala.Int];
      val x_213 = meta.runtime.Future.apply[scala.Int](x$8_212, x_211);
      resetData_0 = x_213;
      positionVar_61 = 12
    }, ())
  }));
  data_62.update(14, (() => {
    val x_214 = iterMut_43;
    val x_215 = x_214.hasNext;
    val x_216 = x_215.`unary_!`;
    if (x_216)
      {
        val x_217 = resetData_0;
        val x_218 = x_217.asInstanceOf[scala.collection.immutable.List[meta.runtime.Future[scala.Int]]];
        bindingMut_38 = x_218;
        val x_219 = bindingMut_38;
        this.`neighborViews_=`(x_219);
        resetData_0 = ();
        positionVar_61 = 15
      }
    else
      ()
  }));
  data_62.update(15, (() => {
    val x_220 = this.neighborViews;
    val x_222 = x_220.forall(((x$1_221: meta.runtime.Future[scala.Int]) => x$1_221.isCompleted));
    val x_223 = x_222.`unary_!`;
    if (x_223)
      positionVar_61 = 16
    else
      positionVar_61 = 64
  }));
  data_62.update(16, (() => {
    resetData_0 = 0.0;
    val x_224 = resetData_0;
    val x_225 = x_224.asInstanceOf[scala.Double];
    bindingMut_37 = x_225;
    positionVar_61 = 17
  }));
  data_62.update(17, (() => {
    val x_226 = bindingMut_37;
    val x_227 = x_226.+(1);
    resetData_0 = x_227;
    val x_228 = resetData_0;
    val x_229 = x_228.asInstanceOf[scala.Double];
    bindingMut_37 = x_229;
    positionVar_61 = 18;
    unblockFlag_60 = false
  }));
  data_62.update(18, (() => {
    positionVar_61 = 19;
    val x_230 = scala.Tuple2.apply[scala.Int, scala.Int](-1, -1);
    val x_231 = scala.Tuple2.apply[scala.Tuple2[scala.Int, scala.Int], scala.Int](x_230, 39);
    val x_232 = scala.collection.immutable.Nil.::[scala.Tuple2[scala.Tuple2[scala.Int, scala.Int], scala.Int]](x_231);
    resetData_1.prepend(x_232)
  }));
  data_62.update(19, (() => {
    val x_233 = this.popRequestMessages;
    val x_234 = x_233.iterator;
    iterMut_5 = x_234;
    positionVar_61 = 20
  }));
  data_62.update(20, (() => {
    val x_235 = iterMut_5;
    val x_236 = x_235.hasNext;
    if (x_236)
      {
        val x_237 = iterMut_5;
        val x_238 = x_237.next();
        listValMut_4 = x_238;
        positionVar_61 = 21
      }
    else
      positionVar_61 = 29
  }));
  data_62.update(21, (() => {
    val x_239 = listValMut_4;
    val x_240 = x_239.methodInfo;
    val x_241 = scala.`package`.Right.apply[scala.Nothing, scala.Int](0);
    val x_242 = x_240.==(x_241);
    if (x_242)
      positionVar_61 = 22
    else
      positionVar_61 = 28
  }));
  data_62.update(22, (() => {
    val x_243 = listValMut_4;
    this.handleNonblockingMessage(x_243);
    resetData_0 = ();
    positionVar_61 = 23
  }));
  data_62.update(23, (() => positionVar_61 = 24));
  data_62.update(24, (() => positionVar_61 = 20));
  data_62.update(25, (() => positionVar_61 = 26));
  data_62.update(26, (() => {
    val x_244 = this.view;
    resetData_0 = x_244;
    positionVar_61 = 27
  }));
  data_62.update(27, (() => {
    val x_245 = resetData_0;
    val x_246 = x_245.asInstanceOf[scala.Any];
    bindingMut_3 = x_246;
    val x_247 = bindingMut_3;
    val x_248 = listValMut_4;
    x_248.reply(this, x_247);
    resetData_0 = ();
    positionVar_61 = 23
  }));
  data_62.update(28, (() => {
    val x_249 = listValMut_4;
    val x_250 = x_249.methodInfo;
    val x_251 = scala.`package`.Right.apply[scala.Nothing, scala.Int](0);
    val x_252 = x_250.==(x_251);
    val x_253 = x_252.`unary_!`;
    if (x_253)
      {
        val x_254 = listValMut_4;
        val x_255 = scala.collection.immutable.List.apply[meta.runtime.RequestMessage](x_254);
        val x_256 = this.addReceiveMessages(x_255);
        resetData_0 = x_256;
        positionVar_61 = 24
      }
    else
      ()
  }));
  data_62.update(29, (() => {
    val x_257 = iterMut_5;
    val x_258 = x_257.hasNext;
    val x_259 = x_258.`unary_!`;
    if (x_259)
      {
        val x_260 = resetData_1.remove(0);
        val x_264 = x_260.find(((x_261: scala.Tuple2[scala.Tuple2[scala.Int, scala.Int], scala.Int]) => {
          val x_262 = x_261._1;
          val x_263 = scala.Tuple2.apply[scala.Int, scala.Int](-1, -1);
          x_262.==(x_263)
        }));
        val x_265 = x_264.get;
        val x_266 = x_265._2;
        positionVar_61 = x_266
      }
    else
      ()
  }));
  data_62.update(30, (() => positionVar_61 = 31));
  data_62.update(31, (() => {
    val x_267 = bindingMut_37;
    val x_268 = x_267.<(1.0);
    if (x_268)
      positionVar_61 = 32
    else
      positionVar_61 = 34
  }));
  data_62.update(32, (() => {
    val x_269 = bindingMut_37;
    val x_270 = x_269.+(1);
    resetData_0 = x_270;
    val x_271 = resetData_0;
    val x_272 = x_271.asInstanceOf[scala.Double];
    bindingMut_37 = x_272;
    positionVar_61 = 33;
    unblockFlag_60 = false
  }));
  data_62.update(33, (() => {
    positionVar_61 = 19;
    val x_273 = scala.Tuple2.apply[scala.Int, scala.Int](-1, -1);
    val x_274 = scala.Tuple2.apply[scala.Tuple2[scala.Int, scala.Int], scala.Int](x_273, 30);
    val x_275 = scala.collection.immutable.Nil.::[scala.Tuple2[scala.Tuple2[scala.Int, scala.Int], scala.Int]](x_274);
    resetData_1.prepend(x_275)
  }));
  data_62.update(34, (() => {
    val x_276 = bindingMut_37;
    val x_277 = x_276.<(1.0);
    val x_278 = x_277.`unary_!`;
    if (x_278)
      positionVar_61 = 35
    else
      ()
  }));
  data_62.update(35, (() => positionVar_61 = 2));
  data_62.update(36, (() => positionVar_61 = 37));
  data_62.update(37, (() => {
    positionVar_61 = 38;
    unblockFlag_60 = false
  }));
  data_62.update(38, (() => positionVar_61 = 37));
  data_62.update(39, (() => positionVar_61 = 40));
  data_62.update(40, (() => {
    val x_279 = bindingMut_37;
    val x_280 = x_279.<(1.0);
    if (x_280)
      positionVar_61 = 17
    else
      positionVar_61 = 41
  }));
  data_62.update(41, (() => {
    val x_281 = bindingMut_37;
    val x_282 = x_281.<(1.0);
    val x_283 = x_282.`unary_!`;
    if (x_283)
      positionVar_61 = 42
    else
      ()
  }));
  data_62.update(42, (() => {
    val x_284 = this.neighborViews;
    val x_286 = x_284.forall(((x$1_285: meta.runtime.Future[scala.Int]) => x$1_285.isCompleted));
    val x_287 = x_286.`unary_!`;
    if (x_287)
      positionVar_61 = 16
    else
      positionVar_61 = 43
  }));
  data_62.update(43, (() => {
    val x_288 = this.neighborViews;
    val x_290 = x_288.forall(((x$1_289: meta.runtime.Future[scala.Int]) => x$1_289.isCompleted));
    val x_291 = x_290.`unary_!`;
    val x_292 = x_291.`unary_!`;
    if (x_292)
      positionVar_61 = 44
    else
      ()
  }));
  data_62.update(44, (() => {
    val x_293 = this.neighborViews;
    resetData_0 = x_293;
    val x_294 = resetData_0;
    val x_295 = x_294.asInstanceOf[scala.collection.immutable.List[meta.runtime.Future[scala.Int]]];
    bindingMut_36 = x_295;
    val x_296 = scala.collection.immutable.List.canBuildFrom[scala.Int];
    resetData_0 = x_296;
    val x_297 = resetData_0;
    val x_298 = x_297.asInstanceOf[scala.collection.generic.CanBuildFrom[scala.collection.immutable.List[_], scala.Int, scala.collection.immutable.List[scala.Int]]];
    bindingMut_35 = x_298;
    resetData_0 = scala.collection.immutable.Nil;
    val x_299 = resetData_0;
    val x_300 = x_299.asInstanceOf[scala.collection.immutable.List[scala.Int]];
    bindingMut_34 = x_300;
    val x_301 = bindingMut_36;
    val x_302 = x_301.iterator;
    iterMut_33 = x_302;
    positionVar_61 = 45
  }));
  data_62.update(45, (() => {
    val x_303 = iterMut_33;
    val x_304 = x_303.hasNext;
    if (x_304)
      {
        val x_305 = iterMut_33;
        val x_306 = x_305.next();
        listValMut_32 = x_306;
        val x_307 = listValMut_32;
        val x_308 = x_307.popValue;
        resetData_0 = x_308;
        val x_309 = resetData_0;
        val x_310 = x_309.asInstanceOf[scala.Option[scala.Int]];
        bindingMut_31 = x_310;
        val x_311 = bindingMut_31;
        val x_312 = x_311.get;
        resetData_0 = x_312;
        val x_313 = resetData_0;
        val x_314 = x_313.asInstanceOf[scala.Int];
        bindingMut_30 = x_314;
        val x_315 = bindingMut_30;
        val x_316 = x_315.asInstanceOf[scala.Int];
        resetData_0 = x_316;
        val x_317 = resetData_0;
        val x_318 = x_317.asInstanceOf[scala.Int];
        bindingMut_29 = x_318;
        val x_319 = bindingMut_29;
        val x_320 = scala.collection.immutable.List.apply[scala.Int](x_319);
        resetData_0 = x_320;
        val x_321 = resetData_0;
        val x_322 = x_321.asInstanceOf[scala.collection.immutable.List[scala.Int]];
        bindingMut_28 = x_322;
        val x_323 = bindingMut_28;
        val x_324 = bindingMut_34;
        val x_325 = x_323.:::[scala.Int](x_324);
        resetData_0 = x_325;
        val x_326 = resetData_0;
        val x_327 = x_326.asInstanceOf[scala.collection.immutable.List[scala.Int]];
        bindingMut_34 = x_327;
        positionVar_61 = 45
      }
    else
      positionVar_61 = 46
  }));
  data_62.update(46, (() => {
    val x_328 = iterMut_33;
    val x_329 = x_328.hasNext;
    val x_330 = x_329.`unary_!`;
    if (x_330)
      {
        val x_331 = resetData_0;
        val x_332 = x_331.asInstanceOf[scala.collection.immutable.List[scala.Int]];
        bindingMut_27 = x_332;
        val x_333 = bindingMut_27;
        val x_334 = x_333.iterator;
        iterMut_26 = x_334;
        positionVar_61 = 47
      }
    else
      ()
  }));
  data_62.update(47, (() => {
    val x_335 = iterMut_26;
    val x_336 = x_335.hasNext;
    if (x_336)
      {
        val x_337 = iterMut_26;
        val x_338 = x_337.next();
        listValMut_25 = x_338;
        val x_339 = this.view;
        resetData_0 = x_339;
        val x_340 = resetData_0;
        val x_341 = x_340.asInstanceOf[scala.Int];
        bindingMut_24 = x_341;
        val x_342 = bindingMut_24;
        val x_343 = listValMut_25;
        val x_344 = x_343.==(x_342);
        resetData_0 = x_344;
        val x_345 = resetData_0;
        val x_346 = x_345.asInstanceOf[scala.Boolean];
        bindingMut_23 = x_346;
        positionVar_61 = 48
      }
    else
      positionVar_61 = 51
  }));
  data_62.update(48, (() => {
    val x_347 = bindingMut_23;
    val x_348 = x_347.`unary_!`;
    if (x_348)
      positionVar_61 = 49
    else
      positionVar_61 = 50
  }));
  data_62.update(49, (() => positionVar_61 = 47));
  data_62.update(50, (() => {
    val x_349 = bindingMut_23;
    squid.lib.`package`.IfThenElse[scala.Unit](x_349, {
      val x_350 = sameView_59;
      resetData_0 = x_350;
      val x_351 = resetData_0;
      val x_352 = x_351.asInstanceOf[scala.Int];
      bindingMut_22 = x_352;
      val x_353 = bindingMut_22;
      val x_354 = x_353.+(1);
      resetData_0 = x_354;
      val x_355 = resetData_0;
      val x_356 = x_355.asInstanceOf[scala.Int];
      bindingMut_21 = x_356;
      val x_357 = bindingMut_21;
      squid.lib.MutVarProxy[scala.Int](sameView_59, ((a) => sameView_59 = a)).:=(x_357);
      resetData_0 = ();
      positionVar_61 = 49
    }, ())
  }));
  data_62.update(51, (() => {
    val x_358 = iterMut_26;
    val x_359 = x_358.hasNext;
    val x_360 = x_359.`unary_!`;
    if (x_360)
      {
        val x_361 = bindingMut_46;
        val x_362 = x_361.length;
        resetData_0 = x_362;
        val x_363 = resetData_0;
        val x_364 = x_363.asInstanceOf[scala.Int];
        bindingMut_20 = x_364;
        val x_365 = bindingMut_20;
        val x_366 = x_365.==(0);
        resetData_0 = x_366;
        val x_367 = resetData_0;
        val x_368 = x_367.asInstanceOf[scala.Boolean];
        bindingMut_19 = x_368;
        positionVar_61 = 52
      }
    else
      ()
  }));
  data_62.update(52, (() => {
    val x_369 = bindingMut_19;
    squid.lib.`package`.IfThenElse[scala.Unit](x_369, {
      this.`similarity_=`(1.0);
      resetData_0 = ();
      val receiver_370 = this.world;
      val x_371 = ((this): meta.runtime.Actor).id;
      val x_372 = receiver_370.id;
      val x_373 = scala.`package`.Right.apply[scala.Nothing, scala.Int](6);
      val x$1_374 = this.location;
      val x$1_375 = this.similarity;
      val x_376 = scala.collection.immutable.Nil.::[scala.Any](x$1_375);
      val x_377 = x_376.::[scala.Any](x$1_374);
      val x_378 = scala.collection.immutable.Nil.::[scala.collection.immutable.List[scala.Any]](x_377);
      val x_379 = meta.runtime.RequestMessage.apply(x_371, x_372, false, x_373, x_378);
      val x_380 = x_379.sessionId;
      val x_381 = meta.runtime.Future.apply$default$2[scala.Unit];
      val x_382 = meta.runtime.Future.apply[scala.Unit](x_380, x_381);
      var v_383: meta.runtime.Future[scala.Unit] = x_382;
      ((this): meta.runtime.Actor).sendMessage(x_379);
      val x_384 = x_379.sessionId;
      ((this): meta.runtime.Actor).setMessageResponseHandler(x_384, ((response_385: meta.runtime.Message) => {
        val x_386 = v_383;
        val x_387 = response_385.asInstanceOf[meta.runtime.ResponseMessage];
        val x_388 = x_387.arg;
        x_388.asInstanceOf[scala.Unit];
        x_386.setValue(())
      }));
      val x_389 = v_383;
      resetData_0 = x_389;
      resetData_0 = false;
      positionVar_61 = 53
    }, positionVar_61 = 63)
  }));
  data_62.update(53, (() => {
    val x_390 = resetData_0;
    val x_391 = x_390.asInstanceOf[scala.Boolean];
    bindingMut_10 = x_391;
    positionVar_61 = 54
  }));
  data_62.update(54, (() => {
    val x_392 = bindingMut_10;
    val x_393 = x_392.`unary_!`;
    if (x_393)
      positionVar_61 = 55
    else
      positionVar_61 = 56
  }));
  data_62.update(55, (() => {
    resetData_0 = 0.0;
    val x_394 = resetData_0;
    val x_395 = x_394.asInstanceOf[scala.Double];
    bindingMut_37 = x_395;
    positionVar_61 = 32
  }));
  data_62.update(56, (() => {
    val x_396 = bindingMut_10;
    squid.lib.`package`.IfThenElse[scala.Unit](x_396, {
      val x_397 = this.world;
      resetData_0 = x_397;
      val x_398 = resetData_0;
      val x_399 = x_398.asInstanceOf[generated.ticktalk.example.segregation.WorldMap];
      bindingMut_9 = x_399;
      val x_400 = this.location;
      resetData_0 = x_400;
      val x_401 = resetData_0;
      val x_402 = x_401.asInstanceOf[scala.Int];
      bindingMut_8 = x_402;
      val x_403 = this._container;
      val x_404 = x_403.!=(null);
      val x_409 = if (x_404)
        {
          val x_405 = this._container;
          val x_406 = x_405.proxyIds;
          val x_407 = bindingMut_9;
          val x_408 = x_407.id;
          x_406.contains[scala.Long](x_408)
        }
      else
        false;
      resetData_0 = x_409;
      val x_410 = resetData_0;
      val x_411 = x_410.asInstanceOf[scala.Boolean];
      bindingMut_7 = x_411;
      positionVar_61 = 57
    }, ())
  }));
  data_62.update(57, (() => {
    val x_412 = bindingMut_7;
    val x_413 = x_412.`unary_!`;
    if (x_413)
      {
        val x_414 = ((this): meta.runtime.Actor).id;
        val x_415 = bindingMut_9;
        val x_416 = x_415.id;
        val x_417 = scala.`package`.Right.apply[scala.Nothing, scala.Int](5);
        val x_418 = bindingMut_8;
        val x_419 = scala.collection.immutable.Nil.::[scala.Any](x_418);
        val x_420 = scala.collection.immutable.Nil.::[scala.collection.immutable.List[scala.Any]](x_419);
        val x_421 = meta.runtime.RequestMessage.apply(x_414, x_416, true, x_417, x_420);
        ((this): meta.runtime.Actor).sendMessage(x_421);
        val x_422 = x_421.sessionId;
        ((this): meta.runtime.Actor).setMessageResponseHandler(x_422, ((response_423: meta.runtime.Message) => {
          val x_424 = response_423.asInstanceOf[meta.runtime.ResponseMessage];
          resetData_2 = x_424
        }));
        resetData_0 = null;
        positionVar_61 = 58
      }
    else
      positionVar_61 = 62
  }));
  data_62.update(58, (() => {
    positionVar_61 = 59;
    unblockFlag_60 = false
  }));
  data_62.update(59, (() => {
    val x_425 = resetData_2;
    val x_426 = x_425.==(null);
    if (x_426)
      positionVar_61 = 58
    else
      positionVar_61 = 60
  }));
  data_62.update(60, (() => {
    val x_427 = resetData_2;
    val x_428 = x_427.!=(null);
    if (x_428)
      {
        val x_429 = resetData_2;
        val x_430 = x_429.arg;
        resetData_0 = x_430;
        resetData_2 = null;
        positionVar_61 = 61
      }
    else
      ()
  }));
  data_62.update(61, (() => {
    val x_431 = resetData_0;
    val x_432 = x_431.asInstanceOf[scala.Int];
    bindingMut_6 = x_432;
    val x_433 = bindingMut_6;
    this.`location_=`(x_433);
    resetData_0 = ();
    positionVar_61 = 55
  }));
  data_62.update(62, (() => {
    val x_434 = bindingMut_7;
    squid.lib.`package`.IfThenElse[scala.Unit](x_434, {
      val x_435 = bindingMut_8;
      val x_436 = bindingMut_9;
      val x_437 = x_436.move(x_435);
      resetData_0 = x_437;
      positionVar_61 = 61
    }, ())
  }));
  data_62.update(63, (() => {
    val x_438 = bindingMut_19;
    val x_439 = x_438.`unary_!`;
    if (x_439)
      {
        val x_440 = sameView_59;
        resetData_0 = x_440;
        val x_441 = resetData_0;
        val x_442 = x_441.asInstanceOf[scala.Int];
        bindingMut_18 = x_442;
        val x_443 = bindingMut_18;
        val x_444 = x_443.toDouble;
        resetData_0 = x_444;
        val x_445 = resetData_0;
        val x_446 = x_445.asInstanceOf[scala.Double];
        bindingMut_17 = x_446;
        val x_447 = bindingMut_46;
        val x_448 = x_447.length;
        resetData_0 = x_448;
        val x_449 = resetData_0;
        val x_450 = x_449.asInstanceOf[scala.Int];
        bindingMut_16 = x_450;
        val x_451 = bindingMut_16;
        val x_452 = bindingMut_17;
        val x_453 = x_452./(x_451);
        resetData_0 = x_453;
        val x_454 = resetData_0;
        val x_455 = x_454.asInstanceOf[scala.Double];
        bindingMut_15 = x_455;
        val x_456 = bindingMut_15;
        this.`similarity_=`(x_456);
        resetData_0 = ();
        val receiver_457 = this.world;
        val x_458 = ((this): meta.runtime.Actor).id;
        val x_459 = receiver_457.id;
        val x_460 = scala.`package`.Right.apply[scala.Nothing, scala.Int](6);
        val x$1_461 = this.location;
        val x$1_462 = this.similarity;
        val x_463 = scala.collection.immutable.Nil.::[scala.Any](x$1_462);
        val x_464 = x_463.::[scala.Any](x$1_461);
        val x_465 = scala.collection.immutable.Nil.::[scala.collection.immutable.List[scala.Any]](x_464);
        val x_466 = meta.runtime.RequestMessage.apply(x_458, x_459, false, x_460, x_465);
        val x_467 = x_466.sessionId;
        val x_468 = meta.runtime.Future.apply$default$2[scala.Unit];
        val x_469 = meta.runtime.Future.apply[scala.Unit](x_467, x_468);
        var v_470: meta.runtime.Future[scala.Unit] = x_469;
        ((this): meta.runtime.Actor).sendMessage(x_466);
        val x_471 = x_466.sessionId;
        ((this): meta.runtime.Actor).setMessageResponseHandler(x_471, ((response_472: meta.runtime.Message) => {
          val x_473 = v_470;
          val x_474 = response_472.asInstanceOf[meta.runtime.ResponseMessage];
          val x_475 = x_474.arg;
          x_475.asInstanceOf[scala.Unit];
          x_473.setValue(())
        }));
        val x_476 = v_470;
        resetData_0 = x_476;
        val x_477 = sameView_59;
        resetData_0 = x_477;
        val x_478 = resetData_0;
        val x_479 = x_478.asInstanceOf[scala.Int];
        bindingMut_14 = x_479;
        val x_480 = this.toleranceThreshold;
        resetData_0 = x_480;
        val x_481 = resetData_0;
        val x_482 = x_481.asInstanceOf[scala.Double];
        bindingMut_13 = x_482;
        val x_483 = bindingMut_46;
        val x_484 = x_483.length;
        resetData_0 = x_484;
        val x_485 = resetData_0;
        val x_486 = x_485.asInstanceOf[scala.Int];
        bindingMut_12 = x_486;
        val x_487 = bindingMut_12;
        val x_488 = bindingMut_13;
        val x_489 = x_488.*(x_487);
        resetData_0 = x_489;
        val x_490 = resetData_0;
        val x_491 = x_490.asInstanceOf[scala.Double];
        bindingMut_11 = x_491;
        val x_492 = bindingMut_11;
        val x_493 = bindingMut_14;
        val x_494 = x_493.<(x_492);
        resetData_0 = x_494;
        positionVar_61 = 53
      }
    else
      ()
  }));
  data_62.update(64, (() => {
    val x_495 = this.neighborViews;
    val x_497 = x_495.forall(((x$1_496: meta.runtime.Future[scala.Int]) => x$1_496.isCompleted));
    val x_498 = x_497.`unary_!`;
    val x_499 = x_498.`unary_!`;
    if (x_499)
      positionVar_61 = 44
    else
      ()
  }));
  data_62.update(65, (() => {
    val x_500 = bindingMut_56;
    squid.lib.`package`.IfThenElse[scala.Unit](x_500, {
      val x_501 = bindingMut_57;
      val x_502 = bindingMut_58;
      val x_503 = x_502.getNeighbors(x_501);
      resetData_0 = x_503;
      positionVar_61 = 7
    }, ())
  }));
  data_62.update(66, (() => positionVar_61 = 37));
  data_62
}).apply();
  

  def getView(): Int = 
      this.view
  
  def wrapper_getView(args: List[Any]): Int = {
    
          
          getView()
          
  }
  
  override def deepClone(): meta.runtime.Actor = {
    val cloner = new Person(world, view, toleranceThreshold)
    cloner.connectedAgents = connectedAgents
    cloner
  }
  
  override def run(msgs: List[meta.runtime.Message]): List[meta.runtime.Message] = {
    addReceiveMessages(msgs)
    sendMessages.clear()
    unblockFlag_60 = true
    while (unblockFlag_60 && (positionVar_61 < 67)) {
      commands_504(positionVar_61)()
    }
    sendMessages.toList
  }
  
  override def getInstructionPointer: Int = {
    positionVar_61
  }
  
  override def setInstructionPointer(new_ir: Int) = {
    if (new_ir >= 67 || new_ir <0) {
      throw new Exception("Invalid address pointer " + new_ir + " for agent " + id)
    }
    val prev_ir: Int = positionVar_61
    positionVar_61 = new_ir
    this
  }
  
  override def handleNonblockingMessage(m: meta.runtime.RequestMessage): Unit = {
    val args = m.argss.flatten
    val response = m.methodInfo match {
      case Right(x) => {
        x match {
          case 0 => wrapper_getView(args)
        }
      }
      case Left(x) => println("For staged implementation only")
    }
    m.reply(this, response)
  }
  
    override def gotoHandleMessages(new_ir: Int = 18): meta.runtime.Actor = {
      // first entry, save the current IR to reflectionIR
      unblockFlag_60 = true

      if (reflectionIR_64 == -1){
        reflectionIR_64 = positionVar_61
        positionVar_61 = new_ir
      }

      while (positionVar_61 <= 28 && unblockFlag_60) {
        commands_504(positionVar_61)()
      }

      // reset instruction register when finishes processing
      if (positionVar_61 > 28) {
        positionVar_61 = reflectionIR_64
        reflectionIR_64 = -1
      }
      this
    }
    
}
