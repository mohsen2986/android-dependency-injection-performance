package com.mohsen.dependencyinjectionperformance.katana

import com.mohsen.dependencyinjectionperformance.FibonacciJava
import org.rewedigital.katana.bind
import org.rewedigital.katana.createModule
import org.rewedigital.katana.factory
import org.rewedigital.katana.get

val katanaJavaModule = createModule("katanaJavaModule") {
    bind<FibonacciJava.Fib1> { factory { FibonacciJava.Fib1() } }
    bind<FibonacciJava.Fib2> { factory { FibonacciJava.Fib2() } }
    bind<FibonacciJava.Fib3> { factory { FibonacciJava.Fib3(get(), get()) } }
    bind<FibonacciJava.Fib4> { factory { FibonacciJava.Fib4(get(), get()) } }
    bind<FibonacciJava.Fib5> { factory { FibonacciJava.Fib5(get(), get()) } }
    bind<FibonacciJava.Fib6> { factory { FibonacciJava.Fib6(get(), get()) } }
    bind<FibonacciJava.Fib7> { factory { FibonacciJava.Fib7(get(), get()) } }
    bind<FibonacciJava.Fib8> { factory { FibonacciJava.Fib8(get(), get()) } }
    bind<FibonacciJava.Fib9> { factory { FibonacciJava.Fib9(get(), get()) } }
    bind<FibonacciJava.Fib10> { factory { FibonacciJava.Fib10(get(), get()) } }
    bind<FibonacciJava.Fib11> { factory { FibonacciJava.Fib11(get(), get()) } }
    bind<FibonacciJava.Fib12> { factory { FibonacciJava.Fib12(get(), get()) } }
    bind<FibonacciJava.Fib13> { factory { FibonacciJava.Fib13(get(), get()) } }
    bind<FibonacciJava.Fib14> { factory { FibonacciJava.Fib14(get(), get()) } }
    bind<FibonacciJava.Fib15> { factory { FibonacciJava.Fib15(get(), get()) } }
    bind<FibonacciJava.Fib16> { factory { FibonacciJava.Fib16(get(), get()) } }
    bind<FibonacciJava.Fib17> { factory { FibonacciJava.Fib17(get(), get()) } }
    bind<FibonacciJava.Fib18> { factory { FibonacciJava.Fib18(get(), get()) } }
    bind<FibonacciJava.Fib19> { factory { FibonacciJava.Fib19(get(), get()) } }
    bind<FibonacciJava.Fib20> { factory { FibonacciJava.Fib20(get(), get()) } }
    bind<FibonacciJava.Fib21> { factory { FibonacciJava.Fib21(get(), get()) } }
    bind<FibonacciJava.Fib22> { factory { FibonacciJava.Fib22(get(), get()) } }
    bind<FibonacciJava.Fib23> { factory { FibonacciJava.Fib23(get(), get()) } }
    bind<FibonacciJava.Fib24> { factory { FibonacciJava.Fib24(get(), get()) } }
    bind<FibonacciJava.Fib25> { factory { FibonacciJava.Fib25(get(), get()) } }
    bind<FibonacciJava.Fib26> { factory { FibonacciJava.Fib26(get(), get()) } }
    bind<FibonacciJava.Fib27> { factory { FibonacciJava.Fib27(get(), get()) } }
    bind<FibonacciJava.Fib28> { factory { FibonacciJava.Fib28(get(), get()) } }
    bind<FibonacciJava.Fib29> { factory { FibonacciJava.Fib29(get(), get()) } }
    bind<FibonacciJava.Fib30> { factory { FibonacciJava.Fib30(get(), get()) } }
    bind<FibonacciJava.Fib31> { factory { FibonacciJava.Fib31(get(), get()) } }
    bind<FibonacciJava.Fib32> { factory { FibonacciJava.Fib32(get(), get()) } }
    bind<FibonacciJava.Fib33> { factory { FibonacciJava.Fib33(get(), get()) } }
    bind<FibonacciJava.Fib34> { factory { FibonacciJava.Fib34(get(), get()) } }
    bind<FibonacciJava.Fib35> { factory { FibonacciJava.Fib35(get(), get()) } }
    bind<FibonacciJava.Fib36> { factory { FibonacciJava.Fib36(get(), get()) } }
    bind<FibonacciJava.Fib37> { factory { FibonacciJava.Fib37(get(), get()) } }
    bind<FibonacciJava.Fib38> { factory { FibonacciJava.Fib38(get(), get()) } }
    bind<FibonacciJava.Fib39> { factory { FibonacciJava.Fib39(get(), get()) } }
    bind<FibonacciJava.Fib40> { factory { FibonacciJava.Fib40(get(), get()) } }
    bind<FibonacciJava.Fib41> { factory { FibonacciJava.Fib41(get(), get()) } }
    bind<FibonacciJava.Fib42> { factory { FibonacciJava.Fib42(get(), get()) } }
    bind<FibonacciJava.Fib43> { factory { FibonacciJava.Fib43(get(), get()) } }
    bind<FibonacciJava.Fib44> { factory { FibonacciJava.Fib44(get(), get()) } }
    bind<FibonacciJava.Fib45> { factory { FibonacciJava.Fib45(get(), get()) } }
    bind<FibonacciJava.Fib46> { factory { FibonacciJava.Fib46(get(), get()) } }
    bind<FibonacciJava.Fib47> { factory { FibonacciJava.Fib47(get(), get()) } }
    bind<FibonacciJava.Fib48> { factory { FibonacciJava.Fib48(get(), get()) } }
    bind<FibonacciJava.Fib49> { factory { FibonacciJava.Fib49(get(), get()) } }
    bind<FibonacciJava.Fib50> { factory { FibonacciJava.Fib50(get(), get()) } }
    bind<FibonacciJava.Fib51> { factory { FibonacciJava.Fib51(get(), get()) } }
    bind<FibonacciJava.Fib52> { factory { FibonacciJava.Fib52(get(), get()) } }
    bind<FibonacciJava.Fib53> { factory { FibonacciJava.Fib53(get(), get()) } }
    bind<FibonacciJava.Fib54> { factory { FibonacciJava.Fib54(get(), get()) } }
    bind<FibonacciJava.Fib55> { factory { FibonacciJava.Fib55(get(), get()) } }
    bind<FibonacciJava.Fib56> { factory { FibonacciJava.Fib56(get(), get()) } }
    bind<FibonacciJava.Fib57> { factory { FibonacciJava.Fib57(get(), get()) } }
    bind<FibonacciJava.Fib58> { factory { FibonacciJava.Fib58(get(), get()) } }
    bind<FibonacciJava.Fib59> { factory { FibonacciJava.Fib59(get(), get()) } }
    bind<FibonacciJava.Fib60> { factory { FibonacciJava.Fib60(get(), get()) } }
    bind<FibonacciJava.Fib61> { factory { FibonacciJava.Fib61(get(), get()) } }
    bind<FibonacciJava.Fib62> { factory { FibonacciJava.Fib62(get(), get()) } }
    bind<FibonacciJava.Fib63> { factory { FibonacciJava.Fib63(get(), get()) } }
    bind<FibonacciJava.Fib64> { factory { FibonacciJava.Fib64(get(), get()) } }
    bind<FibonacciJava.Fib65> { factory { FibonacciJava.Fib65(get(), get()) } }
    bind<FibonacciJava.Fib66> { factory { FibonacciJava.Fib66(get(), get()) } }
    bind<FibonacciJava.Fib67> { factory { FibonacciJava.Fib67(get(), get()) } }
    bind<FibonacciJava.Fib68> { factory { FibonacciJava.Fib68(get(), get()) } }
    bind<FibonacciJava.Fib69> { factory { FibonacciJava.Fib69(get(), get()) } }
    bind<FibonacciJava.Fib70> { factory { FibonacciJava.Fib70(get(), get()) } }
    bind<FibonacciJava.Fib71> { factory { FibonacciJava.Fib71(get(), get()) } }
    bind<FibonacciJava.Fib72> { factory { FibonacciJava.Fib72(get(), get()) } }
    bind<FibonacciJava.Fib73> { factory { FibonacciJava.Fib73(get(), get()) } }
    bind<FibonacciJava.Fib74> { factory { FibonacciJava.Fib74(get(), get()) } }
    bind<FibonacciJava.Fib75> { factory { FibonacciJava.Fib75(get(), get()) } }
    bind<FibonacciJava.Fib76> { factory { FibonacciJava.Fib76(get(), get()) } }
    bind<FibonacciJava.Fib77> { factory { FibonacciJava.Fib77(get(), get()) } }
    bind<FibonacciJava.Fib78> { factory { FibonacciJava.Fib78(get(), get()) } }
    bind<FibonacciJava.Fib79> { factory { FibonacciJava.Fib79(get(), get()) } }
    bind<FibonacciJava.Fib80> { factory { FibonacciJava.Fib80(get(), get()) } }
    bind<FibonacciJava.Fib81> { factory { FibonacciJava.Fib81(get(), get()) } }
    bind<FibonacciJava.Fib82> { factory { FibonacciJava.Fib82(get(), get()) } }
    bind<FibonacciJava.Fib83> { factory { FibonacciJava.Fib83(get(), get()) } }
    bind<FibonacciJava.Fib84> { factory { FibonacciJava.Fib84(get(), get()) } }
    bind<FibonacciJava.Fib85> { factory { FibonacciJava.Fib85(get(), get()) } }
    bind<FibonacciJava.Fib86> { factory { FibonacciJava.Fib86(get(), get()) } }
    bind<FibonacciJava.Fib87> { factory { FibonacciJava.Fib87(get(), get()) } }
    bind<FibonacciJava.Fib88> { factory { FibonacciJava.Fib88(get(), get()) } }
    bind<FibonacciJava.Fib89> { factory { FibonacciJava.Fib89(get(), get()) } }
    bind<FibonacciJava.Fib90> { factory { FibonacciJava.Fib90(get(), get()) } }
    bind<FibonacciJava.Fib91> { factory { FibonacciJava.Fib91(get(), get()) } }
    bind<FibonacciJava.Fib92> { factory { FibonacciJava.Fib92(get(), get()) } }
    bind<FibonacciJava.Fib93> { factory { FibonacciJava.Fib93(get(), get()) } }
    bind<FibonacciJava.Fib94> { factory { FibonacciJava.Fib94(get(), get()) } }
    bind<FibonacciJava.Fib95> { factory { FibonacciJava.Fib95(get(), get()) } }
    bind<FibonacciJava.Fib96> { factory { FibonacciJava.Fib96(get(), get()) } }
    bind<FibonacciJava.Fib97> { factory { FibonacciJava.Fib97(get(), get()) } }
    bind<FibonacciJava.Fib98> { factory { FibonacciJava.Fib98(get(), get()) } }
    bind<FibonacciJava.Fib99> { factory { FibonacciJava.Fib99(get(), get()) } }
    bind<FibonacciJava.Fib100> { factory { FibonacciJava.Fib100(get(), get()) } }
    bind<FibonacciJava.Fib101> { factory { FibonacciJava.Fib101(get(), get()) } }
    bind<FibonacciJava.Fib102> { factory { FibonacciJava.Fib102(get(), get()) } }
    bind<FibonacciJava.Fib103> { factory { FibonacciJava.Fib103(get(), get()) } }
    bind<FibonacciJava.Fib104> { factory { FibonacciJava.Fib104(get(), get()) } }
    bind<FibonacciJava.Fib105> { factory { FibonacciJava.Fib105(get(), get()) } }
    bind<FibonacciJava.Fib106> { factory { FibonacciJava.Fib106(get(), get()) } }
    bind<FibonacciJava.Fib107> { factory { FibonacciJava.Fib107(get(), get()) } }
    bind<FibonacciJava.Fib108> { factory { FibonacciJava.Fib108(get(), get()) } }
    bind<FibonacciJava.Fib109> { factory { FibonacciJava.Fib109(get(), get()) } }
    bind<FibonacciJava.Fib110> { factory { FibonacciJava.Fib110(get(), get()) } }
    bind<FibonacciJava.Fib111> { factory { FibonacciJava.Fib111(get(), get()) } }
    bind<FibonacciJava.Fib112> { factory { FibonacciJava.Fib112(get(), get()) } }
    bind<FibonacciJava.Fib113> { factory { FibonacciJava.Fib113(get(), get()) } }
    bind<FibonacciJava.Fib114> { factory { FibonacciJava.Fib114(get(), get()) } }
    bind<FibonacciJava.Fib115> { factory { FibonacciJava.Fib115(get(), get()) } }
    bind<FibonacciJava.Fib116> { factory { FibonacciJava.Fib116(get(), get()) } }
    bind<FibonacciJava.Fib117> { factory { FibonacciJava.Fib117(get(), get()) } }
    bind<FibonacciJava.Fib118> { factory { FibonacciJava.Fib118(get(), get()) } }
    bind<FibonacciJava.Fib119> { factory { FibonacciJava.Fib119(get(), get()) } }
    bind<FibonacciJava.Fib120> { factory { FibonacciJava.Fib120(get(), get()) } }
    bind<FibonacciJava.Fib121> { factory { FibonacciJava.Fib121(get(), get()) } }
    bind<FibonacciJava.Fib122> { factory { FibonacciJava.Fib122(get(), get()) } }
    bind<FibonacciJava.Fib123> { factory { FibonacciJava.Fib123(get(), get()) } }
    bind<FibonacciJava.Fib124> { factory { FibonacciJava.Fib124(get(), get()) } }
    bind<FibonacciJava.Fib125> { factory { FibonacciJava.Fib125(get(), get()) } }
    bind<FibonacciJava.Fib126> { factory { FibonacciJava.Fib126(get(), get()) } }
    bind<FibonacciJava.Fib127> { factory { FibonacciJava.Fib127(get(), get()) } }
    bind<FibonacciJava.Fib128> { factory { FibonacciJava.Fib128(get(), get()) } }
    bind<FibonacciJava.Fib129> { factory { FibonacciJava.Fib129(get(), get()) } }
    bind<FibonacciJava.Fib130> { factory { FibonacciJava.Fib130(get(), get()) } }
    bind<FibonacciJava.Fib131> { factory { FibonacciJava.Fib131(get(), get()) } }
    bind<FibonacciJava.Fib132> { factory { FibonacciJava.Fib132(get(), get()) } }
    bind<FibonacciJava.Fib133> { factory { FibonacciJava.Fib133(get(), get()) } }
    bind<FibonacciJava.Fib134> { factory { FibonacciJava.Fib134(get(), get()) } }
    bind<FibonacciJava.Fib135> { factory { FibonacciJava.Fib135(get(), get()) } }
    bind<FibonacciJava.Fib136> { factory { FibonacciJava.Fib136(get(), get()) } }
    bind<FibonacciJava.Fib137> { factory { FibonacciJava.Fib137(get(), get()) } }
    bind<FibonacciJava.Fib138> { factory { FibonacciJava.Fib138(get(), get()) } }
    bind<FibonacciJava.Fib139> { factory { FibonacciJava.Fib139(get(), get()) } }
    bind<FibonacciJava.Fib140> { factory { FibonacciJava.Fib140(get(), get()) } }
    bind<FibonacciJava.Fib141> { factory { FibonacciJava.Fib141(get(), get()) } }
    bind<FibonacciJava.Fib142> { factory { FibonacciJava.Fib142(get(), get()) } }
    bind<FibonacciJava.Fib143> { factory { FibonacciJava.Fib143(get(), get()) } }
    bind<FibonacciJava.Fib144> { factory { FibonacciJava.Fib144(get(), get()) } }
    bind<FibonacciJava.Fib145> { factory { FibonacciJava.Fib145(get(), get()) } }
    bind<FibonacciJava.Fib146> { factory { FibonacciJava.Fib146(get(), get()) } }
    bind<FibonacciJava.Fib147> { factory { FibonacciJava.Fib147(get(), get()) } }
    bind<FibonacciJava.Fib148> { factory { FibonacciJava.Fib148(get(), get()) } }
    bind<FibonacciJava.Fib149> { factory { FibonacciJava.Fib149(get(), get()) } }
    bind<FibonacciJava.Fib150> { factory { FibonacciJava.Fib150(get(), get()) } }
    bind<FibonacciJava.Fib151> { factory { FibonacciJava.Fib151(get(), get()) } }
    bind<FibonacciJava.Fib152> { factory { FibonacciJava.Fib152(get(), get()) } }
    bind<FibonacciJava.Fib153> { factory { FibonacciJava.Fib153(get(), get()) } }
    bind<FibonacciJava.Fib154> { factory { FibonacciJava.Fib154(get(), get()) } }
    bind<FibonacciJava.Fib155> { factory { FibonacciJava.Fib155(get(), get()) } }
    bind<FibonacciJava.Fib156> { factory { FibonacciJava.Fib156(get(), get()) } }
    bind<FibonacciJava.Fib157> { factory { FibonacciJava.Fib157(get(), get()) } }
    bind<FibonacciJava.Fib158> { factory { FibonacciJava.Fib158(get(), get()) } }
    bind<FibonacciJava.Fib159> { factory { FibonacciJava.Fib159(get(), get()) } }
    bind<FibonacciJava.Fib160> { factory { FibonacciJava.Fib160(get(), get()) } }
    bind<FibonacciJava.Fib161> { factory { FibonacciJava.Fib161(get(), get()) } }
    bind<FibonacciJava.Fib162> { factory { FibonacciJava.Fib162(get(), get()) } }
    bind<FibonacciJava.Fib163> { factory { FibonacciJava.Fib163(get(), get()) } }
    bind<FibonacciJava.Fib164> { factory { FibonacciJava.Fib164(get(), get()) } }
    bind<FibonacciJava.Fib165> { factory { FibonacciJava.Fib165(get(), get()) } }
    bind<FibonacciJava.Fib166> { factory { FibonacciJava.Fib166(get(), get()) } }
    bind<FibonacciJava.Fib167> { factory { FibonacciJava.Fib167(get(), get()) } }
    bind<FibonacciJava.Fib168> { factory { FibonacciJava.Fib168(get(), get()) } }
    bind<FibonacciJava.Fib169> { factory { FibonacciJava.Fib169(get(), get()) } }
    bind<FibonacciJava.Fib170> { factory { FibonacciJava.Fib170(get(), get()) } }
    bind<FibonacciJava.Fib171> { factory { FibonacciJava.Fib171(get(), get()) } }
    bind<FibonacciJava.Fib172> { factory { FibonacciJava.Fib172(get(), get()) } }
    bind<FibonacciJava.Fib173> { factory { FibonacciJava.Fib173(get(), get()) } }
    bind<FibonacciJava.Fib174> { factory { FibonacciJava.Fib174(get(), get()) } }
    bind<FibonacciJava.Fib175> { factory { FibonacciJava.Fib175(get(), get()) } }
    bind<FibonacciJava.Fib176> { factory { FibonacciJava.Fib176(get(), get()) } }
    bind<FibonacciJava.Fib177> { factory { FibonacciJava.Fib177(get(), get()) } }
    bind<FibonacciJava.Fib178> { factory { FibonacciJava.Fib178(get(), get()) } }
    bind<FibonacciJava.Fib179> { factory { FibonacciJava.Fib179(get(), get()) } }
    bind<FibonacciJava.Fib180> { factory { FibonacciJava.Fib180(get(), get()) } }
    bind<FibonacciJava.Fib181> { factory { FibonacciJava.Fib181(get(), get()) } }
    bind<FibonacciJava.Fib182> { factory { FibonacciJava.Fib182(get(), get()) } }
    bind<FibonacciJava.Fib183> { factory { FibonacciJava.Fib183(get(), get()) } }
    bind<FibonacciJava.Fib184> { factory { FibonacciJava.Fib184(get(), get()) } }
    bind<FibonacciJava.Fib185> { factory { FibonacciJava.Fib185(get(), get()) } }
    bind<FibonacciJava.Fib186> { factory { FibonacciJava.Fib186(get(), get()) } }
    bind<FibonacciJava.Fib187> { factory { FibonacciJava.Fib187(get(), get()) } }
    bind<FibonacciJava.Fib188> { factory { FibonacciJava.Fib188(get(), get()) } }
    bind<FibonacciJava.Fib189> { factory { FibonacciJava.Fib189(get(), get()) } }
    bind<FibonacciJava.Fib190> { factory { FibonacciJava.Fib190(get(), get()) } }
    bind<FibonacciJava.Fib191> { factory { FibonacciJava.Fib191(get(), get()) } }
    bind<FibonacciJava.Fib192> { factory { FibonacciJava.Fib192(get(), get()) } }
    bind<FibonacciJava.Fib193> { factory { FibonacciJava.Fib193(get(), get()) } }
    bind<FibonacciJava.Fib194> { factory { FibonacciJava.Fib194(get(), get()) } }
    bind<FibonacciJava.Fib195> { factory { FibonacciJava.Fib195(get(), get()) } }
    bind<FibonacciJava.Fib196> { factory { FibonacciJava.Fib196(get(), get()) } }
    bind<FibonacciJava.Fib197> { factory { FibonacciJava.Fib197(get(), get()) } }
    bind<FibonacciJava.Fib198> { factory { FibonacciJava.Fib198(get(), get()) } }
    bind<FibonacciJava.Fib199> { factory { FibonacciJava.Fib199(get(), get()) } }
    bind<FibonacciJava.Fib200> { factory { FibonacciJava.Fib200(get(), get()) } }
    bind<FibonacciJava.Fib201> { factory { FibonacciJava.Fib201(get(), get()) } }
    bind<FibonacciJava.Fib202> { factory { FibonacciJava.Fib202(get(), get()) } }
    bind<FibonacciJava.Fib203> { factory { FibonacciJava.Fib203(get(), get()) } }
    bind<FibonacciJava.Fib204> { factory { FibonacciJava.Fib204(get(), get()) } }
    bind<FibonacciJava.Fib205> { factory { FibonacciJava.Fib205(get(), get()) } }
    bind<FibonacciJava.Fib206> { factory { FibonacciJava.Fib206(get(), get()) } }
    bind<FibonacciJava.Fib207> { factory { FibonacciJava.Fib207(get(), get()) } }
    bind<FibonacciJava.Fib208> { factory { FibonacciJava.Fib208(get(), get()) } }
    bind<FibonacciJava.Fib209> { factory { FibonacciJava.Fib209(get(), get()) } }
    bind<FibonacciJava.Fib210> { factory { FibonacciJava.Fib210(get(), get()) } }
    bind<FibonacciJava.Fib211> { factory { FibonacciJava.Fib211(get(), get()) } }
    bind<FibonacciJava.Fib212> { factory { FibonacciJava.Fib212(get(), get()) } }
    bind<FibonacciJava.Fib213> { factory { FibonacciJava.Fib213(get(), get()) } }
    bind<FibonacciJava.Fib214> { factory { FibonacciJava.Fib214(get(), get()) } }
    bind<FibonacciJava.Fib215> { factory { FibonacciJava.Fib215(get(), get()) } }
    bind<FibonacciJava.Fib216> { factory { FibonacciJava.Fib216(get(), get()) } }
    bind<FibonacciJava.Fib217> { factory { FibonacciJava.Fib217(get(), get()) } }
    bind<FibonacciJava.Fib218> { factory { FibonacciJava.Fib218(get(), get()) } }
    bind<FibonacciJava.Fib219> { factory { FibonacciJava.Fib219(get(), get()) } }
    bind<FibonacciJava.Fib220> { factory { FibonacciJava.Fib220(get(), get()) } }
    bind<FibonacciJava.Fib221> { factory { FibonacciJava.Fib221(get(), get()) } }
    bind<FibonacciJava.Fib222> { factory { FibonacciJava.Fib222(get(), get()) } }
    bind<FibonacciJava.Fib223> { factory { FibonacciJava.Fib223(get(), get()) } }
    bind<FibonacciJava.Fib224> { factory { FibonacciJava.Fib224(get(), get()) } }
    bind<FibonacciJava.Fib225> { factory { FibonacciJava.Fib225(get(), get()) } }
    bind<FibonacciJava.Fib226> { factory { FibonacciJava.Fib226(get(), get()) } }
    bind<FibonacciJava.Fib227> { factory { FibonacciJava.Fib227(get(), get()) } }
    bind<FibonacciJava.Fib228> { factory { FibonacciJava.Fib228(get(), get()) } }
    bind<FibonacciJava.Fib229> { factory { FibonacciJava.Fib229(get(), get()) } }
    bind<FibonacciJava.Fib230> { factory { FibonacciJava.Fib230(get(), get()) } }
    bind<FibonacciJava.Fib231> { factory { FibonacciJava.Fib231(get(), get()) } }
    bind<FibonacciJava.Fib232> { factory { FibonacciJava.Fib232(get(), get()) } }
    bind<FibonacciJava.Fib233> { factory { FibonacciJava.Fib233(get(), get()) } }
    bind<FibonacciJava.Fib234> { factory { FibonacciJava.Fib234(get(), get()) } }
    bind<FibonacciJava.Fib235> { factory { FibonacciJava.Fib235(get(), get()) } }
    bind<FibonacciJava.Fib236> { factory { FibonacciJava.Fib236(get(), get()) } }
    bind<FibonacciJava.Fib237> { factory { FibonacciJava.Fib237(get(), get()) } }
    bind<FibonacciJava.Fib238> { factory { FibonacciJava.Fib238(get(), get()) } }
    bind<FibonacciJava.Fib239> { factory { FibonacciJava.Fib239(get(), get()) } }
    bind<FibonacciJava.Fib240> { factory { FibonacciJava.Fib240(get(), get()) } }
    bind<FibonacciJava.Fib241> { factory { FibonacciJava.Fib241(get(), get()) } }
    bind<FibonacciJava.Fib242> { factory { FibonacciJava.Fib242(get(), get()) } }
    bind<FibonacciJava.Fib243> { factory { FibonacciJava.Fib243(get(), get()) } }
    bind<FibonacciJava.Fib244> { factory { FibonacciJava.Fib244(get(), get()) } }
    bind<FibonacciJava.Fib245> { factory { FibonacciJava.Fib245(get(), get()) } }
    bind<FibonacciJava.Fib246> { factory { FibonacciJava.Fib246(get(), get()) } }
    bind<FibonacciJava.Fib247> { factory { FibonacciJava.Fib247(get(), get()) } }
    bind<FibonacciJava.Fib248> { factory { FibonacciJava.Fib248(get(), get()) } }
    bind<FibonacciJava.Fib249> { factory { FibonacciJava.Fib249(get(), get()) } }
    bind<FibonacciJava.Fib250> { factory { FibonacciJava.Fib250(get(), get()) } }
    bind<FibonacciJava.Fib251> { factory { FibonacciJava.Fib251(get(), get()) } }
    bind<FibonacciJava.Fib252> { factory { FibonacciJava.Fib252(get(), get()) } }
    bind<FibonacciJava.Fib253> { factory { FibonacciJava.Fib253(get(), get()) } }
    bind<FibonacciJava.Fib254> { factory { FibonacciJava.Fib254(get(), get()) } }
    bind<FibonacciJava.Fib255> { factory { FibonacciJava.Fib255(get(), get()) } }
    bind<FibonacciJava.Fib256> { factory { FibonacciJava.Fib256(get(), get()) } }
    bind<FibonacciJava.Fib257> { factory { FibonacciJava.Fib257(get(), get()) } }
    bind<FibonacciJava.Fib258> { factory { FibonacciJava.Fib258(get(), get()) } }
    bind<FibonacciJava.Fib259> { factory { FibonacciJava.Fib259(get(), get()) } }
    bind<FibonacciJava.Fib260> { factory { FibonacciJava.Fib260(get(), get()) } }
    bind<FibonacciJava.Fib261> { factory { FibonacciJava.Fib261(get(), get()) } }
    bind<FibonacciJava.Fib262> { factory { FibonacciJava.Fib262(get(), get()) } }
    bind<FibonacciJava.Fib263> { factory { FibonacciJava.Fib263(get(), get()) } }
    bind<FibonacciJava.Fib264> { factory { FibonacciJava.Fib264(get(), get()) } }
    bind<FibonacciJava.Fib265> { factory { FibonacciJava.Fib265(get(), get()) } }
    bind<FibonacciJava.Fib266> { factory { FibonacciJava.Fib266(get(), get()) } }
    bind<FibonacciJava.Fib267> { factory { FibonacciJava.Fib267(get(), get()) } }
    bind<FibonacciJava.Fib268> { factory { FibonacciJava.Fib268(get(), get()) } }
    bind<FibonacciJava.Fib269> { factory { FibonacciJava.Fib269(get(), get()) } }
    bind<FibonacciJava.Fib270> { factory { FibonacciJava.Fib270(get(), get()) } }
    bind<FibonacciJava.Fib271> { factory { FibonacciJava.Fib271(get(), get()) } }
    bind<FibonacciJava.Fib272> { factory { FibonacciJava.Fib272(get(), get()) } }
    bind<FibonacciJava.Fib273> { factory { FibonacciJava.Fib273(get(), get()) } }
    bind<FibonacciJava.Fib274> { factory { FibonacciJava.Fib274(get(), get()) } }
    bind<FibonacciJava.Fib275> { factory { FibonacciJava.Fib275(get(), get()) } }
    bind<FibonacciJava.Fib276> { factory { FibonacciJava.Fib276(get(), get()) } }
    bind<FibonacciJava.Fib277> { factory { FibonacciJava.Fib277(get(), get()) } }
    bind<FibonacciJava.Fib278> { factory { FibonacciJava.Fib278(get(), get()) } }
    bind<FibonacciJava.Fib279> { factory { FibonacciJava.Fib279(get(), get()) } }
    bind<FibonacciJava.Fib280> { factory { FibonacciJava.Fib280(get(), get()) } }
    bind<FibonacciJava.Fib281> { factory { FibonacciJava.Fib281(get(), get()) } }
    bind<FibonacciJava.Fib282> { factory { FibonacciJava.Fib282(get(), get()) } }
    bind<FibonacciJava.Fib283> { factory { FibonacciJava.Fib283(get(), get()) } }
    bind<FibonacciJava.Fib284> { factory { FibonacciJava.Fib284(get(), get()) } }
    bind<FibonacciJava.Fib285> { factory { FibonacciJava.Fib285(get(), get()) } }
    bind<FibonacciJava.Fib286> { factory { FibonacciJava.Fib286(get(), get()) } }
    bind<FibonacciJava.Fib287> { factory { FibonacciJava.Fib287(get(), get()) } }
    bind<FibonacciJava.Fib288> { factory { FibonacciJava.Fib288(get(), get()) } }
    bind<FibonacciJava.Fib289> { factory { FibonacciJava.Fib289(get(), get()) } }
    bind<FibonacciJava.Fib290> { factory { FibonacciJava.Fib290(get(), get()) } }
    bind<FibonacciJava.Fib291> { factory { FibonacciJava.Fib291(get(), get()) } }
    bind<FibonacciJava.Fib292> { factory { FibonacciJava.Fib292(get(), get()) } }
    bind<FibonacciJava.Fib293> { factory { FibonacciJava.Fib293(get(), get()) } }
    bind<FibonacciJava.Fib294> { factory { FibonacciJava.Fib294(get(), get()) } }
    bind<FibonacciJava.Fib295> { factory { FibonacciJava.Fib295(get(), get()) } }
    bind<FibonacciJava.Fib296> { factory { FibonacciJava.Fib296(get(), get()) } }
    bind<FibonacciJava.Fib297> { factory { FibonacciJava.Fib297(get(), get()) } }
    bind<FibonacciJava.Fib298> { factory { FibonacciJava.Fib298(get(), get()) } }
    bind<FibonacciJava.Fib299> { factory { FibonacciJava.Fib299(get(), get()) } }
    bind<FibonacciJava.Fib300> { factory { FibonacciJava.Fib300(get(), get()) } }
    bind<FibonacciJava.Fib301> { factory { FibonacciJava.Fib301(get(), get()) } }
    bind<FibonacciJava.Fib302> { factory { FibonacciJava.Fib302(get(), get()) } }
    bind<FibonacciJava.Fib303> { factory { FibonacciJava.Fib303(get(), get()) } }
    bind<FibonacciJava.Fib304> { factory { FibonacciJava.Fib304(get(), get()) } }
    bind<FibonacciJava.Fib305> { factory { FibonacciJava.Fib305(get(), get()) } }
    bind<FibonacciJava.Fib306> { factory { FibonacciJava.Fib306(get(), get()) } }
    bind<FibonacciJava.Fib307> { factory { FibonacciJava.Fib307(get(), get()) } }
    bind<FibonacciJava.Fib308> { factory { FibonacciJava.Fib308(get(), get()) } }
    bind<FibonacciJava.Fib309> { factory { FibonacciJava.Fib309(get(), get()) } }
    bind<FibonacciJava.Fib310> { factory { FibonacciJava.Fib310(get(), get()) } }
    bind<FibonacciJava.Fib311> { factory { FibonacciJava.Fib311(get(), get()) } }
    bind<FibonacciJava.Fib312> { factory { FibonacciJava.Fib312(get(), get()) } }
    bind<FibonacciJava.Fib313> { factory { FibonacciJava.Fib313(get(), get()) } }
    bind<FibonacciJava.Fib314> { factory { FibonacciJava.Fib314(get(), get()) } }
    bind<FibonacciJava.Fib315> { factory { FibonacciJava.Fib315(get(), get()) } }
    bind<FibonacciJava.Fib316> { factory { FibonacciJava.Fib316(get(), get()) } }
    bind<FibonacciJava.Fib317> { factory { FibonacciJava.Fib317(get(), get()) } }
    bind<FibonacciJava.Fib318> { factory { FibonacciJava.Fib318(get(), get()) } }
    bind<FibonacciJava.Fib319> { factory { FibonacciJava.Fib319(get(), get()) } }
    bind<FibonacciJava.Fib320> { factory { FibonacciJava.Fib320(get(), get()) } }
    bind<FibonacciJava.Fib321> { factory { FibonacciJava.Fib321(get(), get()) } }
    bind<FibonacciJava.Fib322> { factory { FibonacciJava.Fib322(get(), get()) } }
    bind<FibonacciJava.Fib323> { factory { FibonacciJava.Fib323(get(), get()) } }
    bind<FibonacciJava.Fib324> { factory { FibonacciJava.Fib324(get(), get()) } }
    bind<FibonacciJava.Fib325> { factory { FibonacciJava.Fib325(get(), get()) } }
    bind<FibonacciJava.Fib326> { factory { FibonacciJava.Fib326(get(), get()) } }
    bind<FibonacciJava.Fib327> { factory { FibonacciJava.Fib327(get(), get()) } }
    bind<FibonacciJava.Fib328> { factory { FibonacciJava.Fib328(get(), get()) } }
    bind<FibonacciJava.Fib329> { factory { FibonacciJava.Fib329(get(), get()) } }
    bind<FibonacciJava.Fib330> { factory { FibonacciJava.Fib330(get(), get()) } }
    bind<FibonacciJava.Fib331> { factory { FibonacciJava.Fib331(get(), get()) } }
    bind<FibonacciJava.Fib332> { factory { FibonacciJava.Fib332(get(), get()) } }
    bind<FibonacciJava.Fib333> { factory { FibonacciJava.Fib333(get(), get()) } }
    bind<FibonacciJava.Fib334> { factory { FibonacciJava.Fib334(get(), get()) } }
    bind<FibonacciJava.Fib335> { factory { FibonacciJava.Fib335(get(), get()) } }
    bind<FibonacciJava.Fib336> { factory { FibonacciJava.Fib336(get(), get()) } }
    bind<FibonacciJava.Fib337> { factory { FibonacciJava.Fib337(get(), get()) } }
    bind<FibonacciJava.Fib338> { factory { FibonacciJava.Fib338(get(), get()) } }
    bind<FibonacciJava.Fib339> { factory { FibonacciJava.Fib339(get(), get()) } }
    bind<FibonacciJava.Fib340> { factory { FibonacciJava.Fib340(get(), get()) } }
    bind<FibonacciJava.Fib341> { factory { FibonacciJava.Fib341(get(), get()) } }
    bind<FibonacciJava.Fib342> { factory { FibonacciJava.Fib342(get(), get()) } }
    bind<FibonacciJava.Fib343> { factory { FibonacciJava.Fib343(get(), get()) } }
    bind<FibonacciJava.Fib344> { factory { FibonacciJava.Fib344(get(), get()) } }
    bind<FibonacciJava.Fib345> { factory { FibonacciJava.Fib345(get(), get()) } }
    bind<FibonacciJava.Fib346> { factory { FibonacciJava.Fib346(get(), get()) } }
    bind<FibonacciJava.Fib347> { factory { FibonacciJava.Fib347(get(), get()) } }
    bind<FibonacciJava.Fib348> { factory { FibonacciJava.Fib348(get(), get()) } }
    bind<FibonacciJava.Fib349> { factory { FibonacciJava.Fib349(get(), get()) } }
    bind<FibonacciJava.Fib350> { factory { FibonacciJava.Fib350(get(), get()) } }
    bind<FibonacciJava.Fib351> { factory { FibonacciJava.Fib351(get(), get()) } }
    bind<FibonacciJava.Fib352> { factory { FibonacciJava.Fib352(get(), get()) } }
    bind<FibonacciJava.Fib353> { factory { FibonacciJava.Fib353(get(), get()) } }
    bind<FibonacciJava.Fib354> { factory { FibonacciJava.Fib354(get(), get()) } }
    bind<FibonacciJava.Fib355> { factory { FibonacciJava.Fib355(get(), get()) } }
    bind<FibonacciJava.Fib356> { factory { FibonacciJava.Fib356(get(), get()) } }
    bind<FibonacciJava.Fib357> { factory { FibonacciJava.Fib357(get(), get()) } }
    bind<FibonacciJava.Fib358> { factory { FibonacciJava.Fib358(get(), get()) } }
    bind<FibonacciJava.Fib359> { factory { FibonacciJava.Fib359(get(), get()) } }
    bind<FibonacciJava.Fib360> { factory { FibonacciJava.Fib360(get(), get()) } }
    bind<FibonacciJava.Fib361> { factory { FibonacciJava.Fib361(get(), get()) } }
    bind<FibonacciJava.Fib362> { factory { FibonacciJava.Fib362(get(), get()) } }
    bind<FibonacciJava.Fib363> { factory { FibonacciJava.Fib363(get(), get()) } }
    bind<FibonacciJava.Fib364> { factory { FibonacciJava.Fib364(get(), get()) } }
    bind<FibonacciJava.Fib365> { factory { FibonacciJava.Fib365(get(), get()) } }
    bind<FibonacciJava.Fib366> { factory { FibonacciJava.Fib366(get(), get()) } }
    bind<FibonacciJava.Fib367> { factory { FibonacciJava.Fib367(get(), get()) } }
    bind<FibonacciJava.Fib368> { factory { FibonacciJava.Fib368(get(), get()) } }
    bind<FibonacciJava.Fib369> { factory { FibonacciJava.Fib369(get(), get()) } }
    bind<FibonacciJava.Fib370> { factory { FibonacciJava.Fib370(get(), get()) } }
    bind<FibonacciJava.Fib371> { factory { FibonacciJava.Fib371(get(), get()) } }
    bind<FibonacciJava.Fib372> { factory { FibonacciJava.Fib372(get(), get()) } }
    bind<FibonacciJava.Fib373> { factory { FibonacciJava.Fib373(get(), get()) } }
    bind<FibonacciJava.Fib374> { factory { FibonacciJava.Fib374(get(), get()) } }
    bind<FibonacciJava.Fib375> { factory { FibonacciJava.Fib375(get(), get()) } }
    bind<FibonacciJava.Fib376> { factory { FibonacciJava.Fib376(get(), get()) } }
    bind<FibonacciJava.Fib377> { factory { FibonacciJava.Fib377(get(), get()) } }
    bind<FibonacciJava.Fib378> { factory { FibonacciJava.Fib378(get(), get()) } }
    bind<FibonacciJava.Fib379> { factory { FibonacciJava.Fib379(get(), get()) } }
    bind<FibonacciJava.Fib380> { factory { FibonacciJava.Fib380(get(), get()) } }
    bind<FibonacciJava.Fib381> { factory { FibonacciJava.Fib381(get(), get()) } }
    bind<FibonacciJava.Fib382> { factory { FibonacciJava.Fib382(get(), get()) } }
    bind<FibonacciJava.Fib383> { factory { FibonacciJava.Fib383(get(), get()) } }
    bind<FibonacciJava.Fib384> { factory { FibonacciJava.Fib384(get(), get()) } }
    bind<FibonacciJava.Fib385> { factory { FibonacciJava.Fib385(get(), get()) } }
    bind<FibonacciJava.Fib386> { factory { FibonacciJava.Fib386(get(), get()) } }
    bind<FibonacciJava.Fib387> { factory { FibonacciJava.Fib387(get(), get()) } }
    bind<FibonacciJava.Fib388> { factory { FibonacciJava.Fib388(get(), get()) } }
    bind<FibonacciJava.Fib389> { factory { FibonacciJava.Fib389(get(), get()) } }
    bind<FibonacciJava.Fib390> { factory { FibonacciJava.Fib390(get(), get()) } }
    bind<FibonacciJava.Fib391> { factory { FibonacciJava.Fib391(get(), get()) } }
    bind<FibonacciJava.Fib392> { factory { FibonacciJava.Fib392(get(), get()) } }
    bind<FibonacciJava.Fib393> { factory { FibonacciJava.Fib393(get(), get()) } }
    bind<FibonacciJava.Fib394> { factory { FibonacciJava.Fib394(get(), get()) } }
    bind<FibonacciJava.Fib395> { factory { FibonacciJava.Fib395(get(), get()) } }
    bind<FibonacciJava.Fib396> { factory { FibonacciJava.Fib396(get(), get()) } }
    bind<FibonacciJava.Fib397> { factory { FibonacciJava.Fib397(get(), get()) } }
    bind<FibonacciJava.Fib398> { factory { FibonacciJava.Fib398(get(), get()) } }
    bind<FibonacciJava.Fib399> { factory { FibonacciJava.Fib399(get(), get()) } }
    bind<FibonacciJava.Fib400> { factory { FibonacciJava.Fib400(get(), get()) } }
    bind<FibonacciJava.Fib401> { factory { FibonacciJava.Fib401(get(), get()) } }
    bind<FibonacciJava.Fib402> { factory { FibonacciJava.Fib402(get(), get()) } }
    bind<FibonacciJava.Fib403> { factory { FibonacciJava.Fib403(get(), get()) } }
    bind<FibonacciJava.Fib404> { factory { FibonacciJava.Fib404(get(), get()) } }
    bind<FibonacciJava.Fib405> { factory { FibonacciJava.Fib405(get(), get()) } }
    bind<FibonacciJava.Fib406> { factory { FibonacciJava.Fib406(get(), get()) } }
    bind<FibonacciJava.Fib407> { factory { FibonacciJava.Fib407(get(), get()) } }
    bind<FibonacciJava.Fib408> { factory { FibonacciJava.Fib408(get(), get()) } }
    bind<FibonacciJava.Fib409> { factory { FibonacciJava.Fib409(get(), get()) } }
    bind<FibonacciJava.Fib410> { factory { FibonacciJava.Fib410(get(), get()) } }
    bind<FibonacciJava.Fib411> { factory { FibonacciJava.Fib411(get(), get()) } }
    bind<FibonacciJava.Fib412> { factory { FibonacciJava.Fib412(get(), get()) } }
    bind<FibonacciJava.Fib413> { factory { FibonacciJava.Fib413(get(), get()) } }
    bind<FibonacciJava.Fib414> { factory { FibonacciJava.Fib414(get(), get()) } }
    bind<FibonacciJava.Fib415> { factory { FibonacciJava.Fib415(get(), get()) } }
    bind<FibonacciJava.Fib416> { factory { FibonacciJava.Fib416(get(), get()) } }
    bind<FibonacciJava.Fib417> { factory { FibonacciJava.Fib417(get(), get()) } }
    bind<FibonacciJava.Fib418> { factory { FibonacciJava.Fib418(get(), get()) } }
    bind<FibonacciJava.Fib419> { factory { FibonacciJava.Fib419(get(), get()) } }
    bind<FibonacciJava.Fib420> { factory { FibonacciJava.Fib420(get(), get()) } }
    bind<FibonacciJava.Fib421> { factory { FibonacciJava.Fib421(get(), get()) } }
    bind<FibonacciJava.Fib422> { factory { FibonacciJava.Fib422(get(), get()) } }
    bind<FibonacciJava.Fib423> { factory { FibonacciJava.Fib423(get(), get()) } }
    bind<FibonacciJava.Fib424> { factory { FibonacciJava.Fib424(get(), get()) } }
    bind<FibonacciJava.Fib425> { factory { FibonacciJava.Fib425(get(), get()) } }
    bind<FibonacciJava.Fib426> { factory { FibonacciJava.Fib426(get(), get()) } }
    bind<FibonacciJava.Fib427> { factory { FibonacciJava.Fib427(get(), get()) } }
    bind<FibonacciJava.Fib428> { factory { FibonacciJava.Fib428(get(), get()) } }
    bind<FibonacciJava.Fib429> { factory { FibonacciJava.Fib429(get(), get()) } }
    bind<FibonacciJava.Fib430> { factory { FibonacciJava.Fib430(get(), get()) } }
    bind<FibonacciJava.Fib431> { factory { FibonacciJava.Fib431(get(), get()) } }
    bind<FibonacciJava.Fib432> { factory { FibonacciJava.Fib432(get(), get()) } }
    bind<FibonacciJava.Fib433> { factory { FibonacciJava.Fib433(get(), get()) } }
    bind<FibonacciJava.Fib434> { factory { FibonacciJava.Fib434(get(), get()) } }
    bind<FibonacciJava.Fib435> { factory { FibonacciJava.Fib435(get(), get()) } }
    bind<FibonacciJava.Fib436> { factory { FibonacciJava.Fib436(get(), get()) } }
    bind<FibonacciJava.Fib437> { factory { FibonacciJava.Fib437(get(), get()) } }
    bind<FibonacciJava.Fib438> { factory { FibonacciJava.Fib438(get(), get()) } }
    bind<FibonacciJava.Fib439> { factory { FibonacciJava.Fib439(get(), get()) } }
    bind<FibonacciJava.Fib440> { factory { FibonacciJava.Fib440(get(), get()) } }
    bind<FibonacciJava.Fib441> { factory { FibonacciJava.Fib441(get(), get()) } }
    bind<FibonacciJava.Fib442> { factory { FibonacciJava.Fib442(get(), get()) } }
    bind<FibonacciJava.Fib443> { factory { FibonacciJava.Fib443(get(), get()) } }
    bind<FibonacciJava.Fib444> { factory { FibonacciJava.Fib444(get(), get()) } }
    bind<FibonacciJava.Fib445> { factory { FibonacciJava.Fib445(get(), get()) } }
    bind<FibonacciJava.Fib446> { factory { FibonacciJava.Fib446(get(), get()) } }
    bind<FibonacciJava.Fib447> { factory { FibonacciJava.Fib447(get(), get()) } }
    bind<FibonacciJava.Fib448> { factory { FibonacciJava.Fib448(get(), get()) } }
    bind<FibonacciJava.Fib449> { factory { FibonacciJava.Fib449(get(), get()) } }
    bind<FibonacciJava.Fib450> { factory { FibonacciJava.Fib450(get(), get()) } }
}