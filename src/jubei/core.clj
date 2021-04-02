(ns jubei.core
  (:gen-class))

(def ascii "xxxxkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkOOOOO0000000000000000KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK0000000000000000O
xxxxkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkOOOO0000000000000KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK00000000000000000
xxxkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkOOOOO000000000000KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK0K00000000000000
xxxkkkkkkkkkkkkkkkkkkkkkkkkkkOOOOOkOOOkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkOOOOO00000000KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK000000000000000OO
xkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkOkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkOOOOO0000000000KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK000000000000000OOOOOOOOO
kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkxOkkkkkkkkkkkkkkkkkOOOOO0000000000000KKKKKKKKK0000000000KKKKKKK00000000000000000000OOOOOOOOOOkkkk
kkkkkkkkkkkkkkkkkkOOkkkkkkkkkkkkkkkkkkkkkkkkk;dkkkkkkkkkkkkkkkkOOOOO000OkkkkOK000000000000000000000000000000KK000000000OOOOOOOOOOOOOOOOOOOkkkk
kkkkkkkkkkkkkkkkkOOOOOOOkkkkkkkkkkkkkkkkkkkOOlckkkkkkoodxxkkkkOOOO0Okkxdxxxxdlok000000000000000000000000OOO:.':kOOOOOOOOOOOOOOOOOOOOOkkkkkkOkk
kkkkkkkkkkkkOOOOOOOOOOOOOOkkkkkOOOOOOOOOOkOOOOxOOOOkOOxxdoxOOOOOkxxdxxxxxxxxxxd::ldk00000000000000OOOoocllc....okkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
kkkkkkkkkOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOklkOOOOOOOOOOOOOOkxxdxkxxxxkxkkkkxxkxdc:;cldO00OOOOOOOOOOkcdkkkl,'..:kxxxxxxkkkkxkkkkkkkkxxxxkkkkkk
kkkkOOOOOOOOO0000000000OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOxxxdxxxkkkkkkkkkkkkkkkxxkoc::::coxOOOOOOoxOkkkkkk:,'..:coxxxxxxxxxxxxxxxxxxxxxxxxxxdd
kkOOOOOO0000000000000000OOOOOOOOOOOOO00000000000OOO0Oxxddxxxkkkkkkkkkkkkkkkkkxxkdlxxl:::::;:ldkOOOOOOOOOkk;,'..d:;dxxxxxxxxxxxxxxxdddddddddddd
kOOOOO000000000000000000000000000000000000000000Oxxddxxxkxkkkkkkkkkxxxxkxxxxxxxkkdcoxxl:::::::;coxOOOOOOOd,,..,kocxxxxdcoxxxxxxxddddo:xddddddd
kkOOO000000000000000000000000000000000000000Okxxdxxkkkkkkkkkxdxkxxxddxkxxxkkkkkkkkdccoxdc;;;:::::;:ldxkkkc,'..lkkxxkkkkkkkkkkxxxxxxd:odddddddd
kOOOOO000000K00KK000000000KK000000000000kkxdxxxkxxdxkkkkkkxdxxxxxxxddkxxxxxdxxxxxxxxl;cdxdc;;;;::::::::lo;,,..okkkkkkkkkkkkkkkkkkxxkddxxxxxddd
OOOO0000000000000000000KKKKKKKKKKKKKOkxddkxxkkkxddxkxxxkxxdodxxxdooxkxxxxxxodxxxxxxkko;:oxxdl:;;;:::::::::;;..xkkkkkkkkkkkkkkkkkkkkkxdkxxxxxxx
O000000000000000000000000000KKKKKKkodkxkkkkxxddxkkkkkkkkoodokxxddxoxxxxxxkxdodxxxxoxxxdc;:dxxxc,;;;::::::::::;clodkkkkkkkkkkkkkkkkkkkkkkkkkkkk
0000000000000000000000000000000000xdoxxxxxxdodxkkkkkkddooldxxxxdoodkxxxkkkxdooxxxxxoxxxxl;;ldxxd:,;:;;::::::::lc;cxkkkkkkkkkkkkkkkkkkkkkkkkkkk
0000000000KKKKKKKKK00000000000000000kxdlclodddxkkkkxoloodxxxxxddodxxxxxxkkxxdodxxxxxldxxxl;,;lxxxdc;,;;;clc:,looxkxxxkkkkkkkkkkkkkkkkkkkkkkkxk
000dk0000000KKKKK00000000OOOOOOOOO0OOK00KOxxdocccooololoxxxxxdoodxkxxxxkxxxxoodkxxxxlcxxxx:::;;ldooo:clo:,'..oxxxxxxxxkkkkkkkkkkkkkkkkkkkkkkxx
00kxckkookO00000000000OOOOOO00koc:;,',;..;oOOO0Oxddololllloodoodxdddxdxxddxdl::codddlccllc::::c:oolodxkx:,'..xxxxxxxxxxxxxxxkkkkkkkkkkkkkkkkkk
OO000OO0OOOOO000000OOOOOOo:cko'            .:dOOkd:..,odo:;. ..:l'.',,;;;;;;;;;;;;;;c;.loodkkkkkkkkkkkkd',..:kxxxxxxxxxxxxxxxkkkkkkkkkkkkkkkkk
kOOOOOOOOOOOOOOOOOOOOOO0l'. .'''.             .'.      ..      .lc.       ....     ,;  :xkkkkkkkkkkkkkko .. :kxxkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
kOOkOOOOOOOOOOOOOOOOOOdldOOOOxx00Ox.                            .x:'',',,,l'.::.  .'   'kkkkkkkkkkkkkkOl   .dkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
kkkkkOOOOOOOOOOOOOOOOOOkOOOOOOkxkko,.                            .oclcll:cc, ,,'. ...;okkkkOOOkkkkkc,''.....codkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
kOOOOOOOOOOOOOOOOOOOOOOkkkkkkOkxc,,.     .';,,;::;'               .cllcc:lccc:cl',;cokOOkkOOkkkkkkd. ...'......lkxxkkkkkkkkkkkkkkkkkkkkkkkkkkk
OOOOOOOOOOOOOOOOOkkkkkkkkkkkkkkkOkxlccloxk;.   ....         .....':;dOxl;c;;:clc:;,..,,...,:lodxkkkl,..;,''.. 'xxxxkkkkkkkkkkkkkkkkkkkkkkkkkkk
OOOOOOOOOOOOkkkkkkkkkkkkkkkkkkkkkOOOkdxxo,;ol:.    .   .......;ccc;,lcoOxdlodl..l,:c..............,;:c,...,oldxxxxxkkkkkkkkkkkkkkkkkkkkkkkkkkk
kOOOOOOOOOOOOOkkkkkkkkkkkkkkkOdlc::;;,;;;:;'.''',,,''.........c,...,l::ldkklc. 'l; ........................,;cldxxxxxxxkkkkkkkkkkkkkkkkkkkkkkk
OOOOOOOOOOOOOOOOOkkkkkkkkkxoc,,,,'''',,,,,,,,,,,,,'................ccc;:c.'....:c:...........................,,,;cxxxxxxxkkxkkkkkkkkkkkkkkkkkk
OOOOOOOOOOOOOOOOOOkkkOkoc;',,,'.'',,,,,,,,,,,,,,,..''.'''.''....'coxdkxlool;cc:ccc................xd;od;...',,,,,,,dkxkkkkkkkkkkkkkkkkkkkkkkkk
kkkkkkkkOOOOkkkkkOkdl:',,,,'..',,,,,,,,,,,,,,,,,..,,.','..;,,'lkxxk0XWWWWWWWxOoldccl,...........':xodxxx,..',,,,,,,,lkkkkkkkkkkkkkkkkkkkkkkkkk
dddddddddoooolll::,',,,,,'..,,,,,,,,,,,,,,,,,,,'.,,.',,'.,,,,'oOxd0WWWWWWWWKxocldkdo,,..........c;doxdxkc...,',,,,,,'ckkkkkkkkkkkkkkkkkkkkkkkk
,,,,,,,,,,,,'','',,,,,,'.',,,,,,,,,,,,,,,,,,,,,,,,..,,,',,,,,,dko0oKNWWWWWXkdclOlOkOc''........:o:xllkxko...:',,,,,,,':kxxxxxxxkkkkkkkkkkkkkkk
,,,,,,,,,''',,,',,,,,'..,,,,,''',,,,,,,,,,,,,,,,,'.,,,'',,,,,;kxdxckXNWNXOkkl:cl,kkOc'''.......xooocdcodo...o.''',,,,'';xxxxxxxxxxkkkkkkkkkkkk
',,,,,,'..,,,,',,,,,..,,,,,,''..,,,,,,,,,,,,,,,,,.,,,,.,,,,,'lOxokodKKKOdxOdcccl,xd:'..',.,,'..okkd:c:xoo..'x'.''',,,,..;xxxxxxxxxxkkkkkkkkkkx
,,'''...',,,,,.,,'..',,,,,,,''..,,,,,,,,,,,,,,,,.',,,'.;,,,,,kOOoOOxodocoOkk:dcc:c'..,,,,.''..'dklccccd:,..;;..''''''''..cxxxxxxxxkkkkkkkkkkkk
......',,,,,,,,'...,,,,,,,,'''..,,,,,,,,,,,,,,,'',,,,.',,,,,;OkOokOOkkxxdxxcco:::d::',''''..','kxcccldOxl:cc...''''',,''.;kxxxxxxxkkkkkkkkkkkk
.....',,,,,,,,,...',,,,,,,,,....,,,,,,,,',,,,,,,,,,,..,,,,,'c0kkdkooolccclccc:;coOOx','''..,,''coccokxdlccc,...''''''','..dxxxxxkkkkkkkkkkkkkk
...',,,,,,,,,,'.,,'',,,,,,,,'...,,,',,,.',,,,,,,,,,...,,,,,'dOkkkdoccccccccc::dkkkk;'''...''','...,oko:ccc;.....''''''''..lkxkkkkkkkkkkkkkkkkk
.',,,,,,,,,,,,,,,,,,.',,,,,,,...,,,.,,..,,'',,,,,,'..',,,,,'lxkOOdcccccccccclOkkkOl'''..'..''',,'.'',,''.  .........''''..'xkkkkkkkkOOOOkkkkkk
',,,,,,,,,,,,,,,'........',,,''.,,'.,..',..,,,,,,,...,,,,,,'ccllldkoccccccc;odxkxl','...,..',,,,'.'.'.      ..........'''..:OkkkkkOOOOOOOOOOOO
,,,,,,,,,''................,,,'.',,....,'.',,,,,,....,,,,,,'lccc:Odllcccc::cccccc',,''.''.'.''',...'''..     ..........',..oOkkkOOOOOOOOOOOOOO
''..........................',,..,,...,'.',,,,,,.....,,,,,,'lccckOoccccclocccccc,,,,,,,,'',..'''.''.'''.      .........','.kkkkOOOOOOOOOOOOOOO
'.............................,'.,,..',..,,,,,'......,,,,,,':;okkkoccccdOOdcc::'',,,,,,,.,'..''..,.,.,''.      ........',''OkkOOOOOOOOOOOOOOOO
'','.............................,,..,..,,,,,........,,,,,,'oxOOkdccccOOkkkkOk,',,,'',,''''..''.''...''''      .........'''lOkkOOOOOOOOOOOOOOO
''',,,'..........................,'.,..',,,'.........',,,,,,kkkxocl:lOkokkkkk;',,''','..,.''.''''.....'''     'c''........''lOkkOOOOOOOOOOOOOO
'''',,,,,,'......................,'.'..,,,'......'',..,'',,'cxdccc:okdo::dkx,''''''''..''.'''''''...'..;..   'ccc'.,'........;dkkkOOOOOOOOOOOO
......'''',,,,,'''................''..','',,,,,,,,,,..'''''',lccc;co::cc::c,'''''''....''..,''''..''...dxoc,:cccc,..''''.....''dOkkOOOOOOOOOOO
.............'',,,,,,''...............,,'.,,,,,,,,,,'..'''''.',,,:cccldxdc'''''''......''...'''..'.....'kkkoccccc......''''..''oOkkkkkOOOOOOOO
...................''',,,,'''''.......,,..''',,,,,,,,.....'',. .ccclxkkOo'''''.........''...............lkxxcccc,...........''.oOkkkkOOOOOOOOO
.....................................','...''''',,,,,..........cccccoxx;'''............'''...............odxo:c'..........'..'';okkkkkkkOOOOkO
.....................................,''....'''''''','..........:c:::o,.''..............''...'............::::.............'...''dkkkkkkkkkkkk")

(def quote "-- No. As a matter of fact, I've been thinking about... your body. It seems to me that... your body can't be as hard as rock all over, now, can it?")

(defn print-file
  "Prints strings"
  [xs]
  (mapv println xs))


(defn -main []
  (print-file [quote ascii]))