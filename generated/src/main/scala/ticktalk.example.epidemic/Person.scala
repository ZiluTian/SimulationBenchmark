package generated.ticktalk.example.epidemic

class Person (val dailyContact: Int, val age: Int) extends meta.runtime.Actor {

  val symptomatic: Boolean = scala.util.Random.nextBoolean();
  var connection: List[generated.ticktalk.example.epidemic.Person] = null;
  var health: ticktalk.example.epidemic.HealthStatus = ticktalk.example.epidemic.Susceptible;
  var totalConnections: Int = 0;
  var f: Option[meta.runtime.Future[Boolean]] = scala.None;
  var daysInfected: Int = 0;
  val dailyTimeSlices: Int = 24;
  var usedTimeSlices: Int = 0;
  var cnt: Int = 0;
  private var  reflectionIR_13: Int = -1
  private var resetData_0: scala.Any = null;
  private val resetData_1 = scala.collection.mutable.ListBuffer.apply[scala.collection.immutable.List[scala.Tuple2[scala.Tuple2[scala.Int, scala.Int], scala.Int]]]();
  private var resetData_2: meta.runtime.ResponseMessage = null;
  private val x_3 = scala.collection.mutable.ListBuffer.apply[scala.Any]();
  private var methodArgsMut_4: scala.Double = 0.0;
  private var bindingMut_5: scala.Any = null;
  private var listValMut_6: meta.runtime.RequestMessage = null;
  @transient private var iterMut_7: scala.collection.Iterator[meta.runtime.RequestMessage] = null;
  private var bindingMut_8: scala.Double = 0.0;
  private var bindingMut_9: scala.Double = 0.0;
  private var bindingMut_10: scala.Int = 0;
  private var bindingMut_11: scala.Int = 0;
  private var bindingMut_12: scala.Int = 0;
  private var bindingMut_13: scala.Int = 0;
  private var bindingMut_14: scala.Int = 0;
  private var bindingMut_15: ticktalk.example.epidemic.HealthStatus = null;
  private var bindingMut_16: ticktalk.example.epidemic.HealthStatus = null;
  private var bindingMut_17: scala.Boolean = false;
  private var bindingMut_18: scala.Int = 0;
  private var bindingMut_19: scala.Boolean = false;
  private var bindingMut_20: ticktalk.example.epidemic.HealthStatus = null;
  private var bindingMut_21: scala.Int = 0;
  private var bindingMut_22: scala.Int = 0;
  private var bindingMut_23: ticktalk.example.epidemic.HealthStatus = null;
  private var bindingMut_24: ticktalk.example.epidemic.HealthStatus = null;
  private var bindingMut_25: scala.Boolean = false;
  private var bindingMut_26: ticktalk.example.epidemic.HealthStatus = null;
  private var bindingMut_27: scala.Boolean = false;
  private var bindingMut_28: scala.Option[scala.Boolean] = null;
  private var bindingMut_29: meta.runtime.Future[scala.Boolean] = null;
  private var bindingMut_30: scala.Option[meta.runtime.Future[scala.Boolean]] = null;
  private var bindingMut_31: scala.Int = 0;
  private var bindingMut_32: scala.Int = 0;
  private var bindingMut_33: scala.Double = 0.0;
  private var bindingMut_34: scala.Some[meta.runtime.Future[scala.Boolean]] = null;
  private var bindingMut_35: meta.runtime.Future[scala.Boolean] = null;
  private var bindingMut_36: scala.Boolean = false;
  private var bindingMut_37: scala.Double = 0.0;
  private var bindingMut_38: generated.ticktalk.example.epidemic.Person = null;
  private var bindingMut_39: scala.Int = 0;
  private var bindingMut_40: scala.Int = 0;
  private var bindingMut_41: scala.collection.immutable.List[generated.ticktalk.example.epidemic.Person] = null;
  private var bindingMut_42: scala.Int = 0;
  private var bindingMut_43: scala.collection.immutable.List[generated.ticktalk.example.epidemic.Person] = null;
  private var unblockFlag_44: scala.Boolean = true;
  private var positionVar_45: scala.Int = 0;
  
  val commands_387 = (() => {
  val data_46 = new scala.Array[scala.Function0[scala.Unit]](70);
  data_46.update(0, (() => {
    val x_47 = this.connection;
    resetData_0 = x_47;
    val x_48 = resetData_0;
    val x_49 = x_48.asInstanceOf[scala.collection.immutable.List[generated.ticktalk.example.epidemic.Person]];
    bindingMut_43 = x_49;
    val x_50 = bindingMut_43;
    val x_51 = x_50.size;
    resetData_0 = x_51;
    val x_52 = resetData_0;
    val x_53 = x_52.asInstanceOf[scala.Int];
    bindingMut_42 = x_53;
    val x_54 = bindingMut_42;
    this.`totalConnections_=`(x_54);
    resetData_0 = ();
    positionVar_45 = 1
  }));
  data_46.update(1, (() => positionVar_45 = 2));
  data_46.update(2, (() => {
    this.`cnt_=`(0);
    resetData_0 = ();
    this.`usedTimeSlices_=`(0);
    resetData_0 = ();
    positionVar_45 = 3
  }));
  data_46.update(3, (() => {
    val x_55 = this.cnt;
    val x_56 = this.dailyContact;
    val x_57 = x_55.<(x_56);
    val x_60 = x_57.&&({
      val x_58 = this.usedTimeSlices;
      val x_59 = this.dailyTimeSlices;
      x_58.<(x_59)
    });
    if (x_60)
      positionVar_45 = 4
    else
      positionVar_45 = 68
  }));
  data_46.update(4, (() => {
    val x_61 = this.connection;
    resetData_0 = x_61;
    val x_62 = resetData_0;
    val x_63 = x_62.asInstanceOf[scala.collection.immutable.List[generated.ticktalk.example.epidemic.Person]];
    bindingMut_41 = x_63;
    val x_64 = this.totalConnections;
    resetData_0 = x_64;
    val x_65 = resetData_0;
    val x_66 = x_65.asInstanceOf[scala.Int];
    bindingMut_40 = x_66;
    val x_67 = bindingMut_40;
    val x_68 = scala.util.Random.nextInt(x_67);
    resetData_0 = x_68;
    val x_69 = resetData_0;
    val x_70 = x_69.asInstanceOf[scala.Int];
    bindingMut_39 = x_70;
    val x_71 = bindingMut_39;
    val x_72 = bindingMut_41;
    val x_73 = x_72.apply(x_71);
    resetData_0 = x_73;
    val x_74 = resetData_0;
    val x_75 = x_74.asInstanceOf[generated.ticktalk.example.epidemic.Person];
    bindingMut_38 = x_75;
    val x_76 = this.infectiousness();
    resetData_0 = x_76;
    val x_77 = resetData_0;
    val x_78 = x_77.asInstanceOf[scala.Double];
    bindingMut_37 = x_78;
    val x_79 = this._container;
    val x_80 = x_79.!=(null);
    val x_85 = if (x_80)
      {
        val x_81 = this._container;
        val x_82 = x_81.proxyIds;
        val x_83 = bindingMut_38;
        val x_84 = x_83.id;
        x_82.contains[scala.Long](x_84)
      }
    else
      false;
    resetData_0 = x_85;
    val x_86 = resetData_0;
    val x_87 = x_86.asInstanceOf[scala.Boolean];
    bindingMut_36 = x_87;
    positionVar_45 = 5
  }));
  data_46.update(5, (() => {
    val x_88 = bindingMut_36;
    val x_89 = x_88.`unary_!`;
    if (x_89)
      {
        val x_90 = ((this): meta.runtime.Actor).id;
        val x_91 = bindingMut_38;
        val x_92 = x_91.id;
        val x_93 = scala.`package`.Right.apply[scala.Nothing, scala.Int](2);
        val x_94 = bindingMut_37;
        val x_95 = scala.collection.immutable.Nil.::[scala.Any](x_94);
        val x_96 = scala.collection.immutable.Nil.::[scala.collection.immutable.List[scala.Any]](x_95);
        val x_97 = meta.runtime.RequestMessage.apply(x_90, x_92, false, x_93, x_96);
        val x_98 = x_97.sessionId;
        val x_99 = meta.runtime.Future.apply$default$2[scala.Boolean];
        val x_100 = meta.runtime.Future.apply[scala.Boolean](x_98, x_99);
        var v_101: meta.runtime.Future[scala.Boolean] = x_100;
        ((this): meta.runtime.Actor).sendMessage(x_97);
        val x_102 = x_97.sessionId;
        ((this): meta.runtime.Actor).setMessageResponseHandler(x_102, ((response_103: meta.runtime.Message) => {
          val x_104 = v_101;
          val x_105 = response_103.asInstanceOf[meta.runtime.ResponseMessage];
          val x_106 = x_105.arg;
          val x_107 = x_106.asInstanceOf[scala.Boolean];
          x_104.setValue(x_107)
        }));
        val x_108 = v_101;
        resetData_0 = x_108;
        positionVar_45 = 6
      }
    else
      positionVar_45 = 67
  }));
  data_46.update(6, (() => {
    val x_109 = resetData_0;
    val x_110 = x_109.asInstanceOf[meta.runtime.Future[scala.Boolean]];
    bindingMut_35 = x_110;
    val x_111 = bindingMut_35;
    val x_112 = scala.Some.apply[meta.runtime.Future[scala.Boolean]](x_111);
    resetData_0 = x_112;
    val x_113 = resetData_0;
    val x_114 = x_113.asInstanceOf[scala.Some[meta.runtime.Future[scala.Boolean]]];
    bindingMut_34 = x_114;
    val x_115 = bindingMut_34;
    this.`f_=`(x_115);
    resetData_0 = ();
    positionVar_45 = 7
  }));
  data_46.update(7, (() => {
    val x_116 = this.f;
    val x_117 = x_116.get;
    val x_118 = x_117.isCompleted;
    val x_119 = x_118.`unary_!`;
    if (x_119)
      positionVar_45 = 8
    else
      positionVar_45 = 66
  }));
  data_46.update(8, (() => {
    resetData_0 = 0.0;
    val x_120 = resetData_0;
    val x_121 = x_120.asInstanceOf[scala.Double];
    bindingMut_33 = x_121;
    positionVar_45 = 9
  }));
  data_46.update(9, (() => {
    val x_122 = bindingMut_33;
    val x_123 = x_122.+(1);
    resetData_0 = x_123;
    val x_124 = resetData_0;
    val x_125 = x_124.asInstanceOf[scala.Double];
    bindingMut_33 = x_125;
    positionVar_45 = 10;
    unblockFlag_44 = false
  }));
  data_46.update(10, (() => {
    positionVar_45 = 11;
    val x_126 = scala.Tuple2.apply[scala.Int, scala.Int](-1, -1);
    val x_127 = scala.Tuple2.apply[scala.Tuple2[scala.Int, scala.Int], scala.Int](x_126, 45);
    val x_128 = scala.collection.immutable.Nil.::[scala.Tuple2[scala.Tuple2[scala.Int, scala.Int], scala.Int]](x_127);
    resetData_1.prepend(x_128)
  }));
  data_46.update(11, (() => {
    val x_129 = this.popRequestMessages;
    val x_130 = x_129.iterator;
    iterMut_7 = x_130;
    positionVar_45 = 12
  }));
  data_46.update(12, (() => {
    val x_131 = iterMut_7;
    val x_132 = x_131.hasNext;
    if (x_132)
      {
        val x_133 = iterMut_7;
        val x_134 = x_133.next();
        listValMut_6 = x_134;
        positionVar_45 = 13
      }
    else
      positionVar_45 = 35
  }));
  data_46.update(13, (() => {
    val x_135 = listValMut_6;
    val x_136 = x_135.methodInfo;
    val x_137 = scala.`package`.Right.apply[scala.Nothing, scala.Int](2);
    val x_138 = x_136.==(x_137);
    if (x_138)
      positionVar_45 = 14
    else
      positionVar_45 = 20
  }));
  data_46.update(14, (() => {
    val x_139 = listValMut_6;
    this.handleNonblockingMessage(x_139);
    resetData_0 = ();
    positionVar_45 = 15
  }));
  data_46.update(15, (() => positionVar_45 = 16));
  data_46.update(16, (() => positionVar_45 = 12));
  data_46.update(17, (() => positionVar_45 = 18));
  data_46.update(18, (() => {
    val x_140 = this.health;
    val x_141 = x_140.==(ticktalk.example.epidemic.Infectious);
    val x_155 = if (x_141)
      {
        val x_142 = this.infectiousness();
        x_142.>(1)
      }
    else
      {
        val x_143 = this.health;
        val x_144 = x_143.==(ticktalk.example.epidemic.Susceptible);
        if (x_144)
          {
            val x_145 = methodArgsMut_4;
            val x_146 = squid.lib.MutVar.apply[scala.Double](x_145);
            val x_147 = this.age;
            val x_148 = x_147.>(ticktalk.example.epidemic.DiseaseParameter.ageThreshold);
            if (x_148)
              {
                val x_149 = x_146.!;
                val x_150 = x_149.*(ticktalk.example.epidemic.DiseaseParameter.ageSkew);
                x_146.:=(x_150)
              }
            else
              ();
            val x_151 = x_146.!;
            val x_152 = x_151.>(1);
            if (x_152)
              {
                val x_153 = this.health;
                val x_154 = x_153.change();
                this.`health_=`(x_154)
              }
            else
              ()
          }
        else
          ();
        false
      };
    resetData_0 = x_155;
    positionVar_45 = 19
  }));
  data_46.update(19, (() => {
    x_3.remove(0);
    val x_156 = x_3.isEmpty;
    val x_157 = x_156.`unary_!`;
    if (x_157)
      {
        val x_158 = x_3(0);
        val x_159 = x_158.asInstanceOf[scala.Double];
        methodArgsMut_4 = x_159
      }
    else
      ();
    val x_160 = resetData_0;
    val x_161 = x_160.asInstanceOf[scala.Any];
    bindingMut_5 = x_161;
    val x_162 = bindingMut_5;
    val x_163 = listValMut_6;
    x_163.reply(this, x_162);
    resetData_0 = ();
    positionVar_45 = 15
  }));
  data_46.update(20, (() => {
    val x_164 = listValMut_6;
    val x_165 = x_164.methodInfo;
    val x_166 = scala.`package`.Right.apply[scala.Nothing, scala.Int](2);
    val x_167 = x_165.==(x_166);
    val x_168 = x_167.`unary_!`;
    if (x_168)
      positionVar_45 = 21
    else
      ()
  }));
  data_46.update(21, (() => {
    val x_169 = listValMut_6;
    val x_170 = x_169.methodInfo;
    val x_171 = scala.`package`.Right.apply[scala.Nothing, scala.Int](1);
    val x_172 = x_170.==(x_171);
    if (x_172)
      positionVar_45 = 22
    else
      positionVar_45 = 27
  }));
  data_46.update(22, (() => {
    val x_173 = listValMut_6;
    this.handleNonblockingMessage(x_173);
    resetData_0 = ();
    positionVar_45 = 23
  }));
  data_46.update(23, (() => positionVar_45 = 16));
  data_46.update(24, (() => positionVar_45 = 25));
  data_46.update(25, (() => {
    val x_174 = this.health;
    val x_175 = x_174.==(ticktalk.example.epidemic.Infectious);
    val x_184 = if (x_175)
      {
        val x$5_176 = ticktalk.example.epidemic.DiseaseParameter.infectiousBeta.toDouble;
        val x$6_177 = breeze.stats.distributions.Gamma.apply$default$3(ticktalk.example.epidemic.DiseaseParameter.infectiousAlpha, x$5_176);
        val x_178 = breeze.stats.distributions.Gamma.apply(ticktalk.example.epidemic.DiseaseParameter.infectiousAlpha, x$5_176)(x$6_177);
        val x_179 = x_178.draw();
        var v_180: scala.Double = x_179;
        val x_181 = this.symptomatic;
        if (x_181)
          {
            val x_182 = v_180;
            val x_183 = x_182.*(ticktalk.example.epidemic.DiseaseParameter.sympotamaticSkew);
            v_180 = x_183
          }
        else
          ();
        v_180
      }
    else
      0.0;
    resetData_0 = x_184;
    positionVar_45 = 26
  }));
  data_46.update(26, (() => {
    val x_185 = resetData_0;
    val x_186 = x_185.asInstanceOf[scala.Any];
    bindingMut_5 = x_186;
    val x_187 = bindingMut_5;
    val x_188 = listValMut_6;
    x_188.reply(this, x_187);
    resetData_0 = ();
    positionVar_45 = 23
  }));
  data_46.update(27, (() => {
    val x_189 = listValMut_6;
    val x_190 = x_189.methodInfo;
    val x_191 = scala.`package`.Right.apply[scala.Nothing, scala.Int](1);
    val x_192 = x_190.==(x_191);
    val x_193 = x_192.`unary_!`;
    if (x_193)
      positionVar_45 = 28
    else
      ()
  }));
  data_46.update(28, (() => {
    val x_194 = listValMut_6;
    val x_195 = x_194.methodInfo;
    val x_196 = scala.`package`.Right.apply[scala.Nothing, scala.Int](0);
    val x_197 = x_195.==(x_196);
    if (x_197)
      positionVar_45 = 29
    else
      positionVar_45 = 34
  }));
  data_46.update(29, (() => {
    val x_198 = listValMut_6;
    this.handleNonblockingMessage(x_198);
    resetData_0 = ();
    positionVar_45 = 30
  }));
  data_46.update(30, (() => positionVar_45 = 16));
  data_46.update(31, (() => positionVar_45 = 32));
  data_46.update(32, (() => {
    val x_199 = this.health;
    resetData_0 = x_199;
    positionVar_45 = 33
  }));
  data_46.update(33, (() => {
    val x_200 = resetData_0;
    val x_201 = x_200.asInstanceOf[scala.Any];
    bindingMut_5 = x_201;
    val x_202 = bindingMut_5;
    val x_203 = listValMut_6;
    x_203.reply(this, x_202);
    resetData_0 = ();
    positionVar_45 = 30
  }));
  data_46.update(34, (() => {
    val x_204 = listValMut_6;
    val x_205 = x_204.methodInfo;
    val x_206 = scala.`package`.Right.apply[scala.Nothing, scala.Int](0);
    val x_207 = x_205.==(x_206);
    val x_208 = x_207.`unary_!`;
    if (x_208)
      {
        val x_209 = listValMut_6;
        val x_210 = scala.collection.immutable.List.apply[meta.runtime.RequestMessage](x_209);
        val x_211 = this.addReceiveMessages(x_210);
        resetData_0 = x_211;
        positionVar_45 = 16
      }
    else
      ()
  }));
  data_46.update(35, (() => {
    val x_212 = iterMut_7;
    val x_213 = x_212.hasNext;
    val x_214 = x_213.`unary_!`;
    if (x_214)
      {
        val x_215 = resetData_1.remove(0);
        val x_219 = x_215.find(((x_216: scala.Tuple2[scala.Tuple2[scala.Int, scala.Int], scala.Int]) => {
          val x_217 = x_216._1;
          val x_218 = scala.Tuple2.apply[scala.Int, scala.Int](-1, -1);
          x_217.==(x_218)
        }));
        val x_220 = x_219.get;
        val x_221 = x_220._2;
        positionVar_45 = x_221
      }
    else
      ()
  }));
  data_46.update(36, (() => positionVar_45 = 37));
  data_46.update(37, (() => {
    val x_222 = bindingMut_8;
    val x_223 = bindingMut_9;
    val x_224 = x_222.<(x_223);
    if (x_224)
      positionVar_45 = 38
    else
      positionVar_45 = 40
  }));
  data_46.update(38, (() => {
    val x_225 = bindingMut_8;
    val x_226 = x_225.+(1);
    resetData_0 = x_226;
    val x_227 = resetData_0;
    val x_228 = x_227.asInstanceOf[scala.Double];
    bindingMut_8 = x_228;
    positionVar_45 = 39;
    unblockFlag_44 = false
  }));
  data_46.update(39, (() => {
    positionVar_45 = 11;
    val x_229 = scala.Tuple2.apply[scala.Int, scala.Int](-1, -1);
    val x_230 = scala.Tuple2.apply[scala.Tuple2[scala.Int, scala.Int], scala.Int](x_229, 36);
    val x_231 = scala.collection.immutable.Nil.::[scala.Tuple2[scala.Tuple2[scala.Int, scala.Int], scala.Int]](x_230);
    resetData_1.prepend(x_231)
  }));
  data_46.update(40, (() => {
    val x_232 = bindingMut_8;
    val x_233 = bindingMut_9;
    val x_234 = x_232.<(x_233);
    val x_235 = x_234.`unary_!`;
    if (x_235)
      positionVar_45 = 41
    else
      ()
  }));
  data_46.update(41, (() => positionVar_45 = 2));
  data_46.update(42, (() => positionVar_45 = 43));
  data_46.update(43, (() => {
    positionVar_45 = 44;
    unblockFlag_44 = false
  }));
  data_46.update(44, (() => positionVar_45 = 43));
  data_46.update(45, (() => positionVar_45 = 46));
  data_46.update(46, (() => {
    val x_236 = bindingMut_33;
    val x_237 = x_236.<(1.0);
    if (x_237)
      positionVar_45 = 9
    else
      positionVar_45 = 47
  }));
  data_46.update(47, (() => {
    val x_238 = bindingMut_33;
    val x_239 = x_238.<(1.0);
    val x_240 = x_239.`unary_!`;
    if (x_240)
      {
        val x_241 = this.usedTimeSlices;
        resetData_0 = x_241;
        val x_242 = resetData_0;
        val x_243 = x_242.asInstanceOf[scala.Int];
        bindingMut_32 = x_243;
        val x_244 = bindingMut_32;
        val x_245 = x_244.+(1);
        resetData_0 = x_245;
        val x_246 = resetData_0;
        val x_247 = x_246.asInstanceOf[scala.Int];
        bindingMut_31 = x_247;
        val x_248 = bindingMut_31;
        this.`usedTimeSlices_=`(x_248);
        resetData_0 = ();
        positionVar_45 = 48
      }
    else
      ()
  }));
  data_46.update(48, (() => {
    val x_249 = this.f;
    val x_250 = x_249.get;
    val x_251 = x_250.isCompleted;
    val x_252 = x_251.`unary_!`;
    if (x_252)
      positionVar_45 = 8
    else
      positionVar_45 = 49
  }));
  data_46.update(49, (() => {
    val x_253 = this.f;
    val x_254 = x_253.get;
    val x_255 = x_254.isCompleted;
    val x_256 = x_255.`unary_!`;
    val x_257 = x_256.`unary_!`;
    if (x_257)
      positionVar_45 = 50
    else
      ()
  }));
  data_46.update(50, (() => {
    val x_258 = this.f;
    resetData_0 = x_258;
    val x_259 = resetData_0;
    val x_260 = x_259.asInstanceOf[scala.Option[meta.runtime.Future[scala.Boolean]]];
    bindingMut_30 = x_260;
    val x_261 = bindingMut_30;
    val x_262 = x_261.get;
    resetData_0 = x_262;
    val x_263 = resetData_0;
    val x_264 = x_263.asInstanceOf[meta.runtime.Future[scala.Boolean]];
    bindingMut_29 = x_264;
    val x_265 = bindingMut_29;
    val x_266 = x_265.value;
    resetData_0 = x_266;
    val x_267 = resetData_0;
    val x_268 = x_267.asInstanceOf[scala.Option[scala.Boolean]];
    bindingMut_28 = x_268;
    val x_269 = bindingMut_28;
    val x_270 = x_269.get;
    resetData_0 = x_270;
    val x_271 = resetData_0;
    val x_272 = x_271.asInstanceOf[scala.Boolean];
    bindingMut_27 = x_272;
    positionVar_45 = 51
  }));
  data_46.update(51, (() => {
    val x_273 = bindingMut_27;
    val x_274 = x_273.`unary_!`;
    if (x_274)
      {
        resetData_0 = false;
        positionVar_45 = 52
      }
    else
      positionVar_45 = 65
  }));
  data_46.update(52, (() => {
    val x_275 = resetData_0;
    val x_276 = x_275.asInstanceOf[scala.Boolean];
    bindingMut_25 = x_276;
    positionVar_45 = 53
  }));
  data_46.update(53, (() => {
    val x_277 = bindingMut_25;
    val x_278 = x_277.`unary_!`;
    if (x_278)
      positionVar_45 = 54
    else
      positionVar_45 = 64
  }));
  data_46.update(54, (() => {
    val x_279 = this.cnt;
    resetData_0 = x_279;
    val x_280 = resetData_0;
    val x_281 = x_280.asInstanceOf[scala.Int];
    bindingMut_22 = x_281;
    val x_282 = bindingMut_22;
    val x_283 = x_282.+(1);
    resetData_0 = x_283;
    val x_284 = resetData_0;
    val x_285 = x_284.asInstanceOf[scala.Int];
    bindingMut_21 = x_285;
    val x_286 = bindingMut_21;
    this.`cnt_=`(x_286);
    resetData_0 = ();
    positionVar_45 = 55
  }));
  data_46.update(55, (() => {
    val x_287 = this.cnt;
    val x_288 = this.dailyContact;
    val x_289 = x_287.<(x_288);
    val x_292 = x_289.&&({
      val x_290 = this.usedTimeSlices;
      val x_291 = this.dailyTimeSlices;
      x_290.<(x_291)
    });
    if (x_292)
      positionVar_45 = 4
    else
      positionVar_45 = 56
  }));
  data_46.update(56, (() => {
    val x_293 = this.cnt;
    val x_294 = this.dailyContact;
    val x_295 = x_293.<(x_294);
    val x_298 = x_295.&&({
      val x_296 = this.usedTimeSlices;
      val x_297 = this.dailyTimeSlices;
      x_296.<(x_297)
    });
    val x_299 = x_298.`unary_!`;
    if (x_299)
      positionVar_45 = 57
    else
      ()
  }));
  data_46.update(57, (() => {
    val x_300 = this.health;
    resetData_0 = x_300;
    val x_301 = resetData_0;
    val x_302 = x_301.asInstanceOf[ticktalk.example.epidemic.HealthStatus];
    bindingMut_20 = x_302;
    val x_303 = bindingMut_20;
    val x_304 = x_303.==(ticktalk.example.epidemic.Infectious);
    resetData_0 = x_304;
    val x_305 = resetData_0;
    val x_306 = x_305.asInstanceOf[scala.Boolean];
    bindingMut_19 = x_306;
    positionVar_45 = 58
  }));
  data_46.update(58, (() => {
    val x_307 = bindingMut_19;
    val x_308 = x_307.`unary_!`;
    if (x_308)
      positionVar_45 = 59
    else
      positionVar_45 = 60
  }));
  data_46.update(59, (() => {
    val x_309 = this.dailyTimeSlices;
    resetData_0 = x_309;
    val x_310 = resetData_0;
    val x_311 = x_310.asInstanceOf[scala.Int];
    bindingMut_12 = x_311;
    val x_312 = this.usedTimeSlices;
    resetData_0 = x_312;
    val x_313 = resetData_0;
    val x_314 = x_313.asInstanceOf[scala.Int];
    bindingMut_11 = x_314;
    val x_315 = bindingMut_11;
    val x_316 = bindingMut_12;
    val x_317 = x_316.-(x_315);
    resetData_0 = x_317;
    val x_318 = resetData_0;
    val x_319 = x_318.asInstanceOf[scala.Int];
    bindingMut_10 = x_319;
    val x_320 = bindingMut_10;
    val x_321 = x_320.toDouble;
    resetData_0 = x_321;
    val x_322 = resetData_0;
    val x_323 = x_322.asInstanceOf[scala.Double];
    bindingMut_9 = x_323;
    resetData_0 = 0.0;
    val x_324 = resetData_0;
    val x_325 = x_324.asInstanceOf[scala.Double];
    bindingMut_8 = x_325;
    positionVar_45 = 38
  }));
  data_46.update(60, (() => {
    val x_326 = bindingMut_19;
    squid.lib.`package`.IfThenElse[scala.Unit](x_326, {
      val x_327 = this.daysInfected;
      resetData_0 = x_327;
      val x_328 = resetData_0;
      val x_329 = x_328.asInstanceOf[scala.Int];
      bindingMut_18 = x_329;
      val x_330 = bindingMut_18;
      val x_331 = x_330.==(ticktalk.example.epidemic.DiseaseParameter.mildRecover);
      resetData_0 = x_331;
      val x_332 = resetData_0;
      val x_333 = x_332.asInstanceOf[scala.Boolean];
      bindingMut_17 = x_333;
      positionVar_45 = 61
    }, ())
  }));
  data_46.update(61, (() => {
    val x_334 = bindingMut_17;
    squid.lib.`package`.IfThenElse[scala.Unit](x_334, {
      val x_335 = this.health;
      resetData_0 = x_335;
      val x_336 = resetData_0;
      val x_337 = x_336.asInstanceOf[ticktalk.example.epidemic.HealthStatus];
      bindingMut_16 = x_337;
      val x_338 = bindingMut_16;
      val x_339 = x_338.change();
      resetData_0 = x_339;
      val x_340 = resetData_0;
      val x_341 = x_340.asInstanceOf[ticktalk.example.epidemic.HealthStatus];
      bindingMut_15 = x_341;
      val x_342 = bindingMut_15;
      this.`health_=`(x_342);
      resetData_0 = ();
      this.`daysInfected_=`(0);
      resetData_0 = ();
      positionVar_45 = 62
    }, positionVar_45 = 63)
  }));
  data_46.update(62, (() => positionVar_45 = 59));
  data_46.update(63, (() => {
    val x_343 = bindingMut_17;
    val x_344 = x_343.`unary_!`;
    if (x_344)
      {
        val x_345 = this.daysInfected;
        resetData_0 = x_345;
        val x_346 = resetData_0;
        val x_347 = x_346.asInstanceOf[scala.Int];
        bindingMut_14 = x_347;
        val x_348 = bindingMut_14;
        val x_349 = x_348.+(1);
        resetData_0 = x_349;
        val x_350 = resetData_0;
        val x_351 = x_350.asInstanceOf[scala.Int];
        bindingMut_13 = x_351;
        val x_352 = bindingMut_13;
        this.`daysInfected_=`(x_352);
        resetData_0 = ();
        positionVar_45 = 62
      }
    else
      ()
  }));
  data_46.update(64, (() => {
    val x_353 = bindingMut_25;
    squid.lib.`package`.IfThenElse[scala.Unit](x_353, {
      val x_354 = this.health;
      resetData_0 = x_354;
      val x_355 = resetData_0;
      val x_356 = x_355.asInstanceOf[ticktalk.example.epidemic.HealthStatus];
      bindingMut_24 = x_356;
      val x_357 = bindingMut_24;
      val x_358 = x_357.change();
      resetData_0 = x_358;
      val x_359 = resetData_0;
      val x_360 = x_359.asInstanceOf[ticktalk.example.epidemic.HealthStatus];
      bindingMut_23 = x_360;
      val x_361 = bindingMut_23;
      this.`health_=`(x_361);
      resetData_0 = ();
      positionVar_45 = 54
    }, ())
  }));
  data_46.update(65, (() => {
    val x_362 = bindingMut_27;
    squid.lib.`package`.IfThenElse[scala.Unit](x_362, {
      val x_363 = this.health;
      resetData_0 = x_363;
      val x_364 = resetData_0;
      val x_365 = x_364.asInstanceOf[ticktalk.example.epidemic.HealthStatus];
      bindingMut_26 = x_365;
      val x_366 = bindingMut_26;
      val x_367 = x_366.==(ticktalk.example.epidemic.Susceptible);
      resetData_0 = x_367;
      positionVar_45 = 52
    }, ())
  }));
  data_46.update(66, (() => {
    val x_368 = this.f;
    val x_369 = x_368.get;
    val x_370 = x_369.isCompleted;
    val x_371 = x_370.`unary_!`;
    val x_372 = x_371.`unary_!`;
    if (x_372)
      positionVar_45 = 50
    else
      ()
  }));
  data_46.update(67, (() => {
    val x_373 = bindingMut_36;
    squid.lib.`package`.IfThenElse[scala.Unit](x_373, {
      val x_374 = bindingMut_37;
      val x_375 = bindingMut_38;
      val x_376 = x_375.makeContact(x_374);
      val x_377 = scala.Some.apply[scala.Boolean](x_376);
      val x$8_378 = meta.runtime.Future.apply$default$1[scala.Boolean];
      val x_379 = meta.runtime.Future.apply[scala.Boolean](x$8_378, x_377);
      resetData_0 = x_379;
      positionVar_45 = 6
    }, ())
  }));
  data_46.update(68, (() => {
    val x_380 = this.cnt;
    val x_381 = this.dailyContact;
    val x_382 = x_380.<(x_381);
    val x_385 = x_382.&&({
      val x_383 = this.usedTimeSlices;
      val x_384 = this.dailyTimeSlices;
      x_383.<(x_384)
    });
    val x_386 = x_385.`unary_!`;
    if (x_386)
      positionVar_45 = 57
    else
      ()
  }));
  data_46.update(69, (() => positionVar_45 = 43));
  data_46
}).apply();
  

  def getStatus(): ticktalk.example.epidemic.HealthStatus = 
      this.health
  
  def wrapper_getStatus(args: List[Any]): ticktalk.example.epidemic.HealthStatus = {
    
          
          getStatus()
          
  }
  
  def makeContact(risk: Double): Boolean = 
      {
  val x_0 = this.health;
  val x_1 = x_0.==(ticktalk.example.epidemic.Infectious);
  if (x_1)
    {
      val x_2 = this.infectiousness();
      x_2.>(1)
    }
  else
    {
      val x_3 = this.health;
      val x_4 = x_3.==(ticktalk.example.epidemic.Susceptible);
      if (x_4)
        {
          var personalRisk_5: scala.Double = risk;
          val x_6 = this.age;
          val x_7 = x_6.>(ticktalk.example.epidemic.DiseaseParameter.ageThreshold);
          if (x_7)
            {
              val x_8 = personalRisk_5;
              val x_9 = x_8.*(ticktalk.example.epidemic.DiseaseParameter.ageSkew);
              personalRisk_5 = x_9
            }
          else
            ();
          val x_10 = personalRisk_5;
          val x_11 = x_10.>(1);
          if (x_11)
            {
              val x_12 = this.health;
              val x_13 = x_12.change();
              this.`health_=`(x_13)
            }
          else
            ()
        }
      else
        ();
      false
    }
}
  
  def wrapper_makeContact(args: List[Any]): Boolean = {
    
          val risk: Double = args(0).asInstanceOf[Double]
          makeContact(risk)
          
  }
  
  def infectiousness(): Double = 
      {
  val x_0 = this.health;
  val x_1 = x_0.==(ticktalk.example.epidemic.Infectious);
  if (x_1)
    {
      val x$5_2 = ticktalk.example.epidemic.DiseaseParameter.infectiousBeta.toDouble;
      val x$6_3 = breeze.stats.distributions.Gamma.apply$default$3(ticktalk.example.epidemic.DiseaseParameter.infectiousAlpha, x$5_2);
      val x_4 = breeze.stats.distributions.Gamma.apply(ticktalk.example.epidemic.DiseaseParameter.infectiousAlpha, x$5_2)(x$6_3);
      val x_5 = x_4.draw();
      var v_6: scala.Double = x_5;
      val x_7 = this.symptomatic;
      if (x_7)
        {
          val x_8 = v_6;
          val x_9 = x_8.*(ticktalk.example.epidemic.DiseaseParameter.sympotamaticSkew);
          v_6 = x_9
        }
      else
        ();
      v_6
    }
  else
    0.0
}
  
  def wrapper_infectiousness(args: List[Any]): Double = {
    
          
          infectiousness()
          
  }
  
  override def deepClone(): meta.runtime.Actor = {
    val cloner = new Person(dailyContact, age)
    cloner.connectedAgents = connectedAgents
    cloner
  }
  
  override def run(msgs: List[meta.runtime.Message]): List[meta.runtime.Message] = {
    addReceiveMessages(msgs)
    sendMessages.clear()
    unblockFlag_44 = true
    while (unblockFlag_44 && (positionVar_45 < 70)) {
      commands_387(positionVar_45)()
    }
    sendMessages.toList
  }
  
  override def getInstructionPointer: Int = {
    positionVar_45
  }
  
  override def setInstructionPointer(new_ir: Int) = {
    if (new_ir >= 70 || new_ir <0) {
      throw new Exception("Invalid address pointer " + new_ir + " for agent " + id)
    }
    val prev_ir: Int = positionVar_45
    positionVar_45 = new_ir
    this
  }
  
  override def handleNonblockingMessage(m: meta.runtime.RequestMessage): Unit = {
    val args = m.argss.flatten
    val response = m.methodInfo match {
      case Right(x) => {
        x match {
          case 0 => wrapper_getStatus(args)
        case 2 => wrapper_makeContact(args)
        case 1 => wrapper_infectiousness(args)
        }
      }
      case Left(x) => println("For staged implementation only")
    }
    m.reply(this, response)
  }
  
    override def gotoHandleMessages(new_ir: Int = 10): meta.runtime.Actor = {
      // first entry, save the current IR to reflectionIR
      unblockFlag_44 = true

      if (reflectionIR_13 == -1){
        reflectionIR_13 = positionVar_45
        positionVar_45 = new_ir
      }

      while (positionVar_45 <= 34 && unblockFlag_44) {
        commands_387(positionVar_45)()
      }

      // reset instruction register when finishes processing
      if (positionVar_45 > 34) {
        positionVar_45 = reflectionIR_13
        reflectionIR_13 = -1
      }
      this
    }
    
}
