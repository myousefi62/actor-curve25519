package im.actor.crypto.blocks.impl.curve25519;

public class ge_precomp_base_24_31 {
  /* base[i][j] = (j+1)*256^i*B */
  static ge_precomp base[][];

  static {
//CONVERT #include "base.h"
    base = new ge_precomp[32][8];

    base[24][0] = new ge_precomp(
        new int[]  { 793299,-9230478,8836302,-6235707,-27360908,-2369593,33152843,-4885251,-9906200,-621852 },
        new int[]  { 5666233,525582,20782575,-8038419,-24538499,14657740,16099374,1468826,-6171428,-15186581 },
        new int[]  { -4859255,-3779343,-2917758,-6748019,7778750,11688288,-30404353,-9871238,-1558923,-9863646 }
    );
    base[24][1] = new ge_precomp(
        new int[]  { 10896332,-7719704,824275,472601,-19460308,3009587,25248958,14783338,-30581476,-15757844 },
        new int[]  { 10566929,12612572,-31944212,11118703,-12633376,12362879,21752402,8822496,24003793,14264025 },
        new int[]  { 27713862,-7355973,-11008240,9227530,27050101,2504721,23886875,-13117525,13958495,-5732453 }
    );
    base[24][2] = new ge_precomp(
        new int[]  { -23481610,4867226,-27247128,3900521,29838369,-8212291,-31889399,-10041781,7340521,-15410068 },
        new int[]  { 4646514,-8011124,-22766023,-11532654,23184553,8566613,31366726,-1381061,-15066784,-10375192 },
        new int[]  { -17270517,12723032,-16993061,14878794,21619651,-6197576,27584817,3093888,-8843694,3849921 }
    );
    base[24][3] = new ge_precomp(
        new int[]  { -9064912,2103172,25561640,-15125738,-5239824,9582958,32477045,-9017955,5002294,-15550259 },
        new int[]  { -12057553,-11177906,21115585,-13365155,8808712,-12030708,16489530,13378448,-25845716,12741426 },
        new int[]  { -5946367,10645103,-30911586,15390284,-3286982,-7118677,24306472,15852464,28834118,-7646072 }
    );
    base[24][4] = new ge_precomp(
        new int[]  { -17335748,-9107057,-24531279,9434953,-8472084,-583362,-13090771,455841,20461858,5491305 },
        new int[]  { 13669248,-16095482,-12481974,-10203039,-14569770,-11893198,-24995986,11293807,-28588204,-9421832 },
        new int[]  { 28497928,6272777,-33022994,14470570,8906179,-1225630,18504674,-14165166,29867745,-8795943 }
    );
    base[24][5] = new ge_precomp(
        new int[]  { -16207023,13517196,-27799630,-13697798,24009064,-6373891,-6367600,-13175392,22853429,-4012011 },
        new int[]  { 24191378,16712145,-13931797,15217831,14542237,1646131,18603514,-11037887,12876623,-2112447 },
        new int[]  { 17902668,4518229,-411702,-2829247,26878217,5258055,-12860753,608397,16031844,3723494 }
    );
    base[24][6] = new ge_precomp(
        new int[]  { -28632773,12763728,-20446446,7577504,33001348,-13017745,17558842,-7872890,23896954,-4314245 },
        new int[]  { -20005381,-12011952,31520464,605201,2543521,5991821,-2945064,7229064,-9919646,-8826859 },
        new int[]  { 28816045,298879,-28165016,-15920938,19000928,-1665890,-12680833,-2949325,-18051778,-2082915 }
    );
    base[24][7] = new ge_precomp(
        new int[]  { 16000882,-344896,3493092,-11447198,-29504595,-13159789,12577740,16041268,-19715240,7847707 },
        new int[]  { 10151868,10572098,27312476,7922682,14825339,4723128,-32855931,-6519018,-10020567,3852848 },
        new int[]  { -11430470,15697596,-21121557,-4420647,5386314,15063598,16514493,-15932110,29330899,-15076224 }
    );
    base[25][0] = new ge_precomp(
        new int[]  { -25499735,-4378794,-15222908,-6901211,16615731,2051784,3303702,15490,-27548796,12314391 },
        new int[]  { 15683520,-6003043,18109120,-9980648,15337968,-5997823,-16717435,15921866,16103996,-3731215 },
        new int[]  { -23169824,-10781249,13588192,-1628807,-3798557,-1074929,-19273607,5402699,-29815713,-9841101 }
    );
    base[25][1] = new ge_precomp(
        new int[]  { 23190676,2384583,-32714340,3462154,-29903655,-1529132,-11266856,8911517,-25205859,2739713 },
        new int[]  { 21374101,-3554250,-33524649,9874411,15377179,11831242,-33529904,6134907,4931255,11987849 },
        new int[]  { -7732,-2978858,-16223486,7277597,105524,-322051,-31480539,13861388,-30076310,10117930 }
    );
    base[25][2] = new ge_precomp(
        new int[]  { -29501170,-10744872,-26163768,13051539,-25625564,5089643,-6325503,6704079,12890019,15728940 },
        new int[]  { -21972360,-11771379,-951059,-4418840,14704840,2695116,903376,-10428139,12885167,8311031 },
        new int[]  { -17516482,5352194,10384213,-13811658,7506451,13453191,26423267,4384730,1888765,-5435404 }
    );
    base[25][3] = new ge_precomp(
        new int[]  { -25817338,-3107312,-13494599,-3182506,30896459,-13921729,-32251644,-12707869,-19464434,-3340243 },
        new int[]  { -23607977,-2665774,-526091,4651136,5765089,4618330,6092245,14845197,17151279,-9854116 },
        new int[]  { -24830458,-12733720,-15165978,10367250,-29530908,-265356,22825805,-7087279,-16866484,16176525 }
    );
    base[25][4] = new ge_precomp(
        new int[]  { -23583256,6564961,20063689,3798228,-4740178,7359225,2006182,-10363426,-28746253,-10197509 },
        new int[]  { -10626600,-4486402,-13320562,-5125317,3432136,-6393229,23632037,-1940610,32808310,1099883 },
        new int[]  { 15030977,5768825,-27451236,-2887299,-6427378,-15361371,-15277896,-6809350,2051441,-15225865 }
    );
    base[25][5] = new ge_precomp(
        new int[]  { -3362323,-7239372,7517890,9824992,23555850,295369,5148398,-14154188,-22686354,16633660 },
        new int[]  { 4577086,-16752288,13249841,-15304328,19958763,-14537274,18559670,-10759549,8402478,-9864273 },
        new int[]  { -28406330,-1051581,-26790155,-907698,-17212414,-11030789,9453451,-14980072,17983010,9967138 }
    );
    base[25][6] = new ge_precomp(
        new int[]  { -25762494,6524722,26585488,9969270,24709298,1220360,-1677990,7806337,17507396,3651560 },
        new int[]  { -10420457,-4118111,14584639,15971087,-15768321,8861010,26556809,-5574557,-18553322,-11357135 },
        new int[]  { 2839101,14284142,4029895,3472686,14402957,12689363,-26642121,8459447,-5605463,-7621941 }
    );
    base[25][7] = new ge_precomp(
        new int[]  { -4839289,-3535444,9744961,2871048,25113978,3187018,-25110813,-849066,17258084,-7977739 },
        new int[]  { 18164541,-10595176,-17154882,-1542417,19237078,-9745295,23357533,-15217008,26908270,12150756 },
        new int[]  { -30264870,-7647865,5112249,-7036672,-1499807,-6974257,43168,-5537701,-32302074,16215819 }
    );
    base[26][0] = new ge_precomp(
        new int[]  { -6898905,9824394,-12304779,-4401089,-31397141,-6276835,32574489,12532905,-7503072,-8675347 },
        new int[]  { -27343522,-16515468,-27151524,-10722951,946346,16291093,254968,7168080,21676107,-1943028 },
        new int[]  { 21260961,-8424752,-16831886,-11920822,-23677961,3968121,-3651949,-6215466,-3556191,-7913075 }
    );
    base[26][1] = new ge_precomp(
        new int[]  { 16544754,13250366,-16804428,15546242,-4583003,12757258,-2462308,-8680336,-18907032,-9662799 },
        new int[]  { -2415239,-15577728,18312303,4964443,-15272530,-12653564,26820651,16690659,25459437,-4564609 },
        new int[]  { -25144690,11425020,28423002,-11020557,-6144921,-15826224,9142795,-2391602,-6432418,-1644817 }
    );
    base[26][2] = new ge_precomp(
        new int[]  { -23104652,6253476,16964147,-3768872,-25113972,-12296437,-27457225,-16344658,6335692,7249989 },
        new int[]  { -30333227,13979675,7503222,-12368314,-11956721,-4621693,-30272269,2682242,25993170,-12478523 },
        new int[]  { 4364628,5930691,32304656,-10044554,-8054781,15091131,22857016,-10598955,31820368,15075278 }
    );
    base[26][3] = new ge_precomp(
        new int[]  { 31879134,-8918693,17258761,90626,-8041836,-4917709,24162788,-9650886,-17970238,12833045 },
        new int[]  { 19073683,14851414,-24403169,-11860168,7625278,11091125,-19619190,2074449,-9413939,14905377 },
        new int[]  { 24483667,-11935567,-2518866,-11547418,-1553130,15355506,-25282080,9253129,27628530,-7555480 }
    );
    base[26][4] = new ge_precomp(
        new int[]  { 17597607,8340603,19355617,552187,26198470,-3176583,4593324,-9157582,-14110875,15297016 },
        new int[]  { 510886,14337390,-31785257,16638632,6328095,2713355,-20217417,-11864220,8683221,2921426 },
        new int[]  { 18606791,11874196,27155355,-5281482,-24031742,6265446,-25178240,-1278924,4674690,13890525 }
    );
    base[26][5] = new ge_precomp(
        new int[]  { 13609624,13069022,-27372361,-13055908,24360586,9592974,14977157,9835105,4389687,288396 },
        new int[]  { 9922506,-519394,13613107,5883594,-18758345,-434263,-12304062,8317628,23388070,16052080 },
        new int[]  { 12720016,11937594,-31970060,-5028689,26900120,8561328,-20155687,-11632979,-14754271,-10812892 }
    );
    base[26][6] = new ge_precomp(
        new int[]  { 15961858,14150409,26716931,-665832,-22794328,13603569,11829573,7467844,-28822128,929275 },
        new int[]  { 11038231,-11582396,-27310482,-7316562,-10498527,-16307831,-23479533,-9371869,-21393143,2465074 },
        new int[]  { 20017163,-4323226,27915242,1529148,12396362,15675764,13817261,-9658066,2463391,-4622140 }
    );
    base[26][7] = new ge_precomp(
        new int[]  { -16358878,-12663911,-12065183,4996454,-1256422,1073572,9583558,12851107,4003896,12673717 },
        new int[]  { -1731589,-15155870,-3262930,16143082,19294135,13385325,14741514,-9103726,7903886,2348101 },
        new int[]  { 24536016,-16515207,12715592,-3862155,1511293,10047386,-3842346,-7129159,-28377538,10048127 }
    );
    base[27][0] = new ge_precomp(
        new int[]  { -12622226,-6204820,30718825,2591312,-10617028,12192840,18873298,-7297090,-32297756,15221632 },
        new int[]  { -26478122,-11103864,11546244,-1852483,9180880,7656409,-21343950,2095755,29769758,6593415 },
        new int[]  { -31994208,-2907461,4176912,3264766,12538965,-868111,26312345,-6118678,30958054,8292160 }
    );
    base[27][1] = new ge_precomp(
        new int[]  { 31429822,-13959116,29173532,15632448,12174511,-2760094,32808831,3977186,26143136,-3148876 },
        new int[]  { 22648901,1402143,-22799984,13746059,7936347,365344,-8668633,-1674433,-3758243,-2304625 },
        new int[]  { -15491917,8012313,-2514730,-12702462,-23965846,-10254029,-1612713,-1535569,-16664475,8194478 }
    );
    base[27][2] = new ge_precomp(
        new int[]  { 27338066,-7507420,-7414224,10140405,-19026427,-6589889,27277191,8855376,28572286,3005164 },
        new int[]  { 26287124,4821776,25476601,-4145903,-3764513,-15788984,-18008582,1182479,-26094821,-13079595 },
        new int[]  { -7171154,3178080,23970071,6201893,-17195577,-4489192,-21876275,-13982627,32208683,-1198248 }
    );
    base[27][3] = new ge_precomp(
        new int[]  { -16657702,2817643,-10286362,14811298,6024667,13349505,-27315504,-10497842,-27672585,-11539858 },
        new int[]  { 15941029,-9405932,-21367050,8062055,31876073,-238629,-15278393,-1444429,15397331,-4130193 },
        new int[]  { 8934485,-13485467,-23286397,-13423241,-32446090,14047986,31170398,-1441021,-27505566,15087184 }
    );
    base[27][4] = new ge_precomp(
        new int[]  { -18357243,-2156491,24524913,-16677868,15520427,-6360776,-15502406,11461896,16788528,-5868942 },
        new int[]  { -1947386,16013773,21750665,3714552,-17401782,-16055433,-3770287,-10323320,31322514,-11615635 },
        new int[]  { 21426655,-5650218,-13648287,-5347537,-28812189,-4920970,-18275391,-14621414,13040862,-12112948 }
    );
    base[27][5] = new ge_precomp(
        new int[]  { 11293895,12478086,-27136401,15083750,-29307421,14748872,14555558,-13417103,1613711,4896935 },
        new int[]  { -25894883,15323294,-8489791,-8057900,25967126,-13425460,2825960,-4897045,-23971776,-11267415 },
        new int[]  { -15924766,-5229880,-17443532,6410664,3622847,10243618,20615400,12405433,-23753030,-8436416 }
    );
    base[27][6] = new ge_precomp(
        new int[]  { -7091295,12556208,-20191352,9025187,-17072479,4333801,4378436,2432030,23097949,-566018 },
        new int[]  { 4565804,-16025654,20084412,-7842817,1724999,189254,24767264,10103221,-18512313,2424778 },
        new int[]  { 366633,-11976806,8173090,-6890119,30788634,5745705,-7168678,1344109,-3642553,12412659 }
    );
    base[27][7] = new ge_precomp(
        new int[]  { -24001791,7690286,14929416,-168257,-32210835,-13412986,24162697,-15326504,-3141501,11179385 },
        new int[]  { 18289522,-14724954,8056945,16430056,-21729724,7842514,-6001441,-1486897,-18684645,-11443503 },
        new int[]  { 476239,6601091,-6152790,-9723375,17503545,-4863900,27672959,13403813,11052904,5219329 }
    );
    base[28][0] = new ge_precomp(
        new int[]  { 20678546,-8375738,-32671898,8849123,-5009758,14574752,31186971,-3973730,9014762,-8579056 },
        new int[]  { -13644050,-10350239,-15962508,5075808,-1514661,-11534600,-33102500,9160280,8473550,-3256838 },
        new int[]  { 24900749,14435722,17209120,-15292541,-22592275,9878983,-7689309,-16335821,-24568481,11788948 }
    );
    base[28][1] = new ge_precomp(
        new int[]  { -3118155,-11395194,-13802089,14797441,9652448,-6845904,-20037437,10410733,-24568470,-1458691 },
        new int[]  { -15659161,16736706,-22467150,10215878,-9097177,7563911,11871841,-12505194,-18513325,8464118 },
        new int[]  { -23400612,8348507,-14585951,-861714,-3950205,-6373419,14325289,8628612,33313881,-8370517 }
    );
    base[28][2] = new ge_precomp(
        new int[]  { -20186973,-4967935,22367356,5271547,-1097117,-4788838,-24805667,-10236854,-8940735,-5818269 },
        new int[]  { -6948785,-1795212,-32625683,-16021179,32635414,-7374245,15989197,-12838188,28358192,-4253904 },
        new int[]  { -23561781,-2799059,-32351682,-1661963,-9147719,10429267,-16637684,4072016,-5351664,5596589 }
    );
    base[28][3] = new ge_precomp(
        new int[]  { -28236598,-3390048,12312896,6213178,3117142,16078565,29266239,2557221,1768301,15373193 },
        new int[]  { -7243358,-3246960,-4593467,-7553353,-127927,-912245,-1090902,-4504991,-24660491,3442910 },
        new int[]  { -30210571,5124043,14181784,8197961,18964734,-11939093,22597931,7176455,-18585478,13365930 }
    );
    base[28][4] = new ge_precomp(
        new int[]  { -7877390,-1499958,8324673,4690079,6261860,890446,24538107,-8570186,-9689599,-3031667 },
        new int[]  { 25008904,-10771599,-4305031,-9638010,16265036,15721635,683793,-11823784,15723479,-15163481 },
        new int[]  { -9660625,12374379,-27006999,-7026148,-7724114,-12314514,11879682,5400171,519526,-1235876 }
    );
    base[28][5] = new ge_precomp(
        new int[]  { 22258397,-16332233,-7869817,14613016,-22520255,-2950923,-20353881,7315967,16648397,7605640 },
        new int[]  { -8081308,-8464597,-8223311,9719710,19259459,-15348212,23994942,-5281555,-9468848,4763278 },
        new int[]  { -21699244,9220969,-15730624,1084137,-25476107,-2852390,31088447,-7764523,-11356529,728112 }
    );
    base[28][6] = new ge_precomp(
        new int[]  { 26047220,-11751471,-6900323,-16521798,24092068,9158119,-4273545,-12555558,-29365436,-5498272 },
        new int[]  { 17510331,-322857,5854289,8403524,17133918,-3112612,-28111007,12327945,10750447,10014012 },
        new int[]  { -10312768,3936952,9156313,-8897683,16498692,-994647,-27481051,-666732,3424691,7540221 }
    );
    base[28][7] = new ge_precomp(
        new int[]  { 30322361,-6964110,11361005,-4143317,7433304,4989748,-7071422,-16317219,-9244265,15258046 },
        new int[]  { 13054562,-2779497,19155474,469045,-12482797,4566042,5631406,2711395,1062915,-5136345 },
        new int[]  { -19240248,-11254599,-29509029,-7499965,-5835763,13005411,-6066489,12194497,32960380,1459310 }
    );
    base[29][0] = new ge_precomp(
        new int[]  { 19852034,7027924,23669353,10020366,8586503,-6657907,394197,-6101885,18638003,-11174937 },
        new int[]  { 31395534,15098109,26581030,8030562,-16527914,-5007134,9012486,-7584354,-6643087,-5442636 },
        new int[]  { -9192165,-2347377,-1997099,4529534,25766844,607986,-13222,9677543,-32294889,-6456008 }
    );
    base[29][1] = new ge_precomp(
        new int[]  { -2444496,-149937,29348902,8186665,1873760,12489863,-30934579,-7839692,-7852844,-8138429 },
        new int[]  { -15236356,-15433509,7766470,746860,26346930,-10221762,-27333451,10754588,-9431476,5203576 },
        new int[]  { 31834314,14135496,-770007,5159118,20917671,-16768096,-7467973,-7337524,31809243,7347066 }
    );
    base[29][2] = new ge_precomp(
        new int[]  { -9606723,-11874240,20414459,13033986,13716524,-11691881,19797970,-12211255,15192876,-2087490 },
        new int[]  { -12663563,-2181719,1168162,-3804809,26747877,-14138091,10609330,12694420,33473243,-13382104 },
        new int[]  { 33184999,11180355,15832085,-11385430,-1633671,225884,15089336,-11023903,-6135662,14480053 }
    );
    base[29][3] = new ge_precomp(
        new int[]  { 31308717,-5619998,31030840,-1897099,15674547,-6582883,5496208,13685227,27595050,8737275 },
        new int[]  { -20318852,-15150239,10933843,-16178022,8335352,-7546022,-31008351,-12610604,26498114,66511 },
        new int[]  { 22644454,-8761729,-16671776,4884562,-3105614,-13559366,30540766,-4286747,-13327787,-7515095 }
    );
    base[29][4] = new ge_precomp(
        new int[]  { -28017847,9834845,18617207,-2681312,-3401956,-13307506,8205540,13585437,-17127465,15115439 },
        new int[]  { 23711543,-672915,31206561,-8362711,6164647,-9709987,-33535882,-1426096,8236921,16492939 },
        new int[]  { -23910559,-13515526,-26299483,-4503841,25005590,-7687270,19574902,10071562,6708380,-6222424 }
    );
    base[29][5] = new ge_precomp(
        new int[]  { 2101391,-4930054,19702731,2367575,-15427167,1047675,5301017,9328700,29955601,-11678310 },
        new int[]  { 3096359,9271816,-21620864,-15521844,-14847996,-7592937,-25892142,-12635595,-9917575,6216608 },
        new int[]  { -32615849,338663,-25195611,2510422,-29213566,-13820213,24822830,-6146567,-26767480,7525079 }
    );
    base[29][6] = new ge_precomp(
        new int[]  { -23066649,-13985623,16133487,-7896178,-3389565,778788,-910336,-2782495,-19386633,11994101 },
        new int[]  { 21691500,-13624626,-641331,-14367021,3285881,-3483596,-25064666,9718258,-7477437,13381418 },
        new int[]  { 18445390,-4202236,14979846,11622458,-1727110,-3582980,23111648,-6375247,28535282,15779576 }
    );
    base[29][7] = new ge_precomp(
        new int[]  { 30098053,3089662,-9234387,16662135,-21306940,11308411,-14068454,12021730,9955285,-16303356 },
        new int[]  { 9734894,-14576830,-7473633,-9138735,2060392,11313496,-18426029,9924399,20194861,13380996 },
        new int[]  { -26378102,-7965207,-22167821,15789297,-18055342,-6168792,-1984914,15707771,26342023,10146099 }
    );
    base[30][0] = new ge_precomp(
        new int[]  { -26016874,-219943,21339191,-41388,19745256,-2878700,-29637280,2227040,21612326,-545728 },
        new int[]  { -13077387,1184228,23562814,-5970442,-20351244,-6348714,25764461,12243797,-20856566,11649658 },
        new int[]  { -10031494,11262626,27384172,2271902,26947504,-15997771,39944,6114064,33514190,2333242 }
    );
    base[30][1] = new ge_precomp(
        new int[]  { -21433588,-12421821,8119782,7219913,-21830522,-9016134,-6679750,-12670638,24350578,-13450001 },
        new int[]  { -4116307,-11271533,-23886186,4843615,-30088339,690623,-31536088,-10406836,8317860,12352766 },
        new int[]  { 18200138,-14475911,-33087759,-2696619,-23702521,-9102511,-23552096,-2287550,20712163,6719373 }
    );
    base[30][2] = new ge_precomp(
        new int[]  { 26656208,6075253,-7858556,1886072,-28344043,4262326,11117530,-3763210,26224235,-3297458 },
        new int[]  { -17168938,-14854097,-3395676,-16369877,-19954045,14050420,21728352,9493610,18620611,-16428628 },
        new int[]  { -13323321,13325349,11432106,5964811,18609221,6062965,-5269471,-9725556,-30701573,-16479657 }
    );
    base[30][3] = new ge_precomp(
        new int[]  { -23860538,-11233159,26961357,1640861,-32413112,-16737940,12248509,-5240639,13735342,1934062 },
        new int[]  { 25089769,6742589,17081145,-13406266,21909293,-16067981,-15136294,-3765346,-21277997,5473616 },
        new int[]  { 31883677,-7961101,1083432,-11572403,22828471,13290673,-7125085,12469656,29111212,-5451014 }
    );
    base[30][4] = new ge_precomp(
        new int[]  { 24244947,-15050407,-26262976,2791540,-14997599,16666678,24367466,6388839,-10295587,452383 },
        new int[]  { -25640782,-3417841,5217916,16224624,19987036,-4082269,-24236251,-5915248,15766062,8407814 },
        new int[]  { -20406999,13990231,15495425,16395525,5377168,15166495,-8917023,-4388953,-8067909,2276718 }
    );
    base[30][5] = new ge_precomp(
        new int[]  { 30157918,12924066,-17712050,9245753,19895028,3368142,-23827587,5096219,22740376,-7303417 },
        new int[]  { 2041139,-14256350,7783687,13876377,-25946985,-13352459,24051124,13742383,-15637599,13295222 },
        new int[]  { 33338237,-8505733,12532113,7977527,9106186,-1715251,-17720195,-4612972,-4451357,-14669444 }
    );
    base[30][6] = new ge_precomp(
        new int[]  { -20045281,5454097,-14346548,6447146,28862071,1883651,-2469266,-4141880,7770569,9620597 },
        new int[]  { 23208068,7979712,33071466,8149229,1758231,-10834995,30945528,-1694323,-33502340,-14767970 },
        new int[]  { 1439958,-16270480,-1079989,-793782,4625402,10647766,-5043801,1220118,30494170,-11440799 }
    );
    base[30][7] = new ge_precomp(
        new int[]  { -5037580,-13028295,-2970559,-3061767,15640974,-6701666,-26739026,926050,-1684339,-13333647 },
        new int[]  { 13908495,-3549272,30919928,-6273825,-21521863,7989039,9021034,9078865,3353509,4033511 },
        new int[]  { -29663431,-15113610,32259991,-344482,24295849,-12912123,23161163,8839127,27485041,7356032 }
    );
    base[31][0] = new ge_precomp(
        new int[]  { 9661027,705443,11980065,-5370154,-1628543,14661173,-6346142,2625015,28431036,-16771834 },
        new int[]  { -23839233,-8311415,-25945511,7480958,-17681669,-8354183,-22545972,14150565,15970762,4099461 },
        new int[]  { 29262576,16756590,26350592,-8793563,8529671,-11208050,13617293,-9937143,11465739,8317062 }
    );
    base[31][1] = new ge_precomp(
        new int[]  { -25493081,-6962928,32500200,-9419051,-23038724,-2302222,14898637,3848455,20969334,-5157516 },
        new int[]  { -20384450,-14347713,-18336405,13884722,-33039454,2842114,-21610826,-3649888,11177095,14989547 },
        new int[]  { -24496721,-11716016,16959896,2278463,12066309,10137771,13515641,2581286,-28487508,9930240 }
    );
    base[31][2] = new ge_precomp(
        new int[]  { -17751622,-2097826,16544300,-13009300,-15914807,-14949081,18345767,-13403753,16291481,-5314038 },
        new int[]  { -33229194,2553288,32678213,9875984,8534129,6889387,-9676774,6957617,4368891,9788741 },
        new int[]  { 16660756,7281060,-10830758,12911820,20108584,-8101676,-21722536,-8613148,16250552,-11111103 }
    );
    base[31][3] = new ge_precomp(
        new int[]  { -19765507,2390526,-16551031,14161980,1905286,6414907,4689584,10604807,-30190403,4782747 },
        new int[]  { -1354539,14736941,-7367442,-13292886,7710542,-14155590,-9981571,4383045,22546403,437323 },
        new int[]  { 31665577,-12180464,-16186830,1491339,-18368625,3294682,27343084,2786261,-30633590,-14097016 }
    );
    base[31][4] = new ge_precomp(
        new int[]  { -14467279,-683715,-33374107,7448552,19294360,14334329,-19690631,2355319,-19284671,-6114373 },
        new int[]  { 15121312,-15796162,6377020,-6031361,-10798111,-12957845,18952177,15496498,-29380133,11754228 },
        new int[]  { -2637277,-13483075,8488727,-14303896,12728761,-1622493,7141596,11724556,22761615,-10134141 }
    );
    base[31][5] = new ge_precomp(
        new int[]  { 16918416,11729663,-18083579,3022987,-31015732,-13339659,-28741185,-12227393,32851222,11717399 },
        new int[]  { 11166634,7338049,-6722523,4531520,-29468672,-7302055,31474879,3483633,-1193175,-4030831 },
        new int[]  { -185635,9921305,31456609,-13536438,-12013818,13348923,33142652,6546660,-19985279,-3948376 }
    );
    base[31][6] = new ge_precomp(
        new int[]  { -32460596,11266712,-11197107,-7899103,31703694,3855903,-8537131,-12833048,-30772034,-15486313 },
        new int[]  { -18006477,12709068,3991746,-6479188,-21491523,-10550425,-31135347,-16049879,10928917,3011958 },
        new int[]  { -6957757,-15594337,31696059,334240,29576716,14796075,-30831056,-12805180,18008031,10258577 }
    );
    base[31][7] = new ge_precomp(
        new int[]  { -22448644,15655569,7018479,-4410003,-30314266,-1201591,-1853465,1367120,25127874,6671743 },
        new int[]  { 29701166,-14373934,-10878120,9279288,-17568,13127210,21382910,11042292,25838796,4642684 },
        new int[]  { -20430234,14955537,-24126347,8124619,-5369288,-5990470,30468147,-13900640,18423289,4177476 }
    );
  }
}
