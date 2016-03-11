package moorhouse{
  package _o{package t{package t{package e{object r{val `)` = "( "}}}}}  
  sealed trait otterretto{
    def ***(c: Char, i:Int) = List.fill(i)(c).mkString
    def tter: String = this match{
      case `o`(o) => ' '.toString * o
      case `to`(o) => '\''.toString * o
      case `tto`(o) => '\"'.toString * o
      case `etto`(o) => '-'.toString * o
      case `retto`(o) => '('.toString * o
      case `oretto`(o) => ')'.toString * o
      case `toretto`(o) => '|'.toString * o
      case `ttoretto`(o) => '/'.toString * o
      case `ettoretto`(o) => '`'.toString * o
      case `rettoretto`(o) => '.'.toString * o
      case `orettoretto`(o) => ';'.toString * o
      case `torettoretto`(o) => 'o'.toString * o
      case `ttorettoretto`(o) => '0'.toString * o
      case `ettorettoretto`(o) => '\\'.toString * o
      case `rettorettoretto`(o) => '_'.toString * o
      case `orettorettoretto`(o) => ','.toString * o
      case `torettorettoretto`(o) => o./:("")((`o.t`,`t.e`) => `o.t`+`t.e`.tter)
    }
  }
  case class `torettorettoretto`(o:List[otterretto]) extends otterretto
  case object `torettorettoretto`{
    def apply(otter: otterretto*) = new `torettorettoretto`(otter.toList)
  }
  case class `orettorettoretto`(o: Int) extends otterretto
  case class `rettorettoretto`(o: Int) extends otterretto
  case class `ettorettoretto`(o: Int) extends otterretto
  case class `ttorettoretto`(t: Int) extends otterretto
  case class `torettoretto`(t: Int) extends otterretto
  case class `orettoretto`(e: Int) extends otterretto
  case class `rettoretto`(r: Int) extends otterretto
  case class `ettoretto`(o: Int) extends otterretto
  case class `ttoretto`(t: Int) extends otterretto
  case class `toretto`(t: Int) extends otterretto
  case class `oretto`(r: Int) extends otterretto
  case class `retto`(r: Int) extends otterretto
  case class `etto`(o: Int) extends otterretto
  case class `tto`(t: Int) extends otterretto
  case class `to`(t: Int) extends otterretto
  case class `o`(e: Int) extends otterretto 

  /*
  """
                  |  /
        .-"'"-.   | /
       /      o\  |/
      |    o   0).-.
      |       .-;(_/     .-.
       \     /  /)).---._|  `\   ,
        '.  '  /((       `'-./ _/|
          \  .'  )        .-.;`  /
           '.             |  `\-'
             '._        -'    /
                ``""--`------`
""" // 282 chars
  */
  object Otter
  {//jgs' otter, thanks
    val line1 = `torettorettoretto`(`o`(18), `toretto`(1), `o`(2), `ttoretto`(1))
    val line2 = `torettorettoretto`(`o`(8), `rettoretto`(1), `etto`(1), `tto`(1), `to`(1), `tto`(1), `etto`(1), `rettoretto`(1), `o`(3), `toretto`(1), `o`(1), `ttoretto`(1))
    val line3 = `torettorettoretto`(`o`(7), `ttoretto`(1), `o`(6), `torettoretto`(1), `ettorettoretto`(1), `o`(2), `ttoretto`(1))
    val line4 = `torettorettoretto`(`o`(6), `toretto`(1), `o`(4), `torettoretto`(1), `o`(3), `ttorettoretto`(1), `oretto`(1), `rettoretto`(1), `etto`(1), `rettoretto`(1))
    val line5 = `torettorettoretto`(`o`(6), `toretto`(1), `o`(7), `rettoretto`(1), `etto`(1), `orettoretto`(1), `retto`(1), `rettorettoretto`(1), `ttoretto`(1), `o`(5), `rettoretto`(1), `etto`(1), `rettoretto`(1))
    val line6 = `torettorettoretto`(`o`(7), `ettorettoretto`(1), `o`(5), `ttoretto`(1), `o`(2), `ttoretto`(1), `oretto`(2), `rettoretto`(1), `etto`(3), `rettoretto`(1), `rettorettoretto`(1), `toretto`(1), `o`(2),`ettoretto`(1), `ettorettoretto`(1),`o`(2), `orettorettoretto`(1))
    val line7 = `torettorettoretto`(`o`(8), `to`(1), `torettoretto`(1), `o`(2), `to`(1), `o`(2), `ttoretto`(1), `retto`(2), `o`(7), `ettoretto`(1), `to`(1), `etto`(1), `rettoretto`(1), `ttoretto`(1), `o`(1), `rettorettoretto`(1), `ttoretto`(1),`toretto`(1))
    val line8 = `torettorettoretto`(`o`(10), `toretto`(1), `o`(2), `torettoretto`(1), `to`(1), `o`(2), `oretto`(2), `o`(8), `rettoretto`(1), `etto`(1), `rettoretto`(1), `orettoretto`(1), `ettoretto`(1), `o`(2), `ttoretto`(1))
    val line9 = `torettorettoretto`(`o`(11), `to`(1), `torettoretto`(1), `o`(13), `toretto`(1), `o`(2), `ettoretto`(1),`toretto`(1), `etto`(1),`to`(1))
    val line10 = `torettorettoretto`(`o`(13), `to`(1), `torettoretto`(1), `rettorettoretto`(1), `o`(8),  `etto`(1),`to`(1), `o`(4), `ttoretto`(1))
    val line11 = `torettorettoretto`(`o`(16), `ettoretto`(2), `tto`(2), `etto`(2), `ettoretto`(1), `etto`(6),  `ettoretto`(1))
    
    println(line1.tter)
    println(line2.tter)
    println(line3.tter)
    println(line4.tter)
    println(line5.tter)
    println(line6.tter)
    println(line7.tter)
    println(line8.tter)
    println(line9.tter)
    println(line10.tter)
    println(line11.tter)
    //val line1 = `o`(`o`(`o`(`o`(`o`(`o`(`o`(`o`(`o`(`o`(`o`(`o`(`o`(`o`(`o`(`o`(`o`(`o`(`toretto`(`o`(`o`(`ttoretto`(`ettorettoretto`('o')))))))))))))))))))))))
    //val line2 = `o`(`o`(`o`(`o`(`o`(`o`(`o`(`o`(`rettoretto`(`etto`(`tto`(`to`(`tto`(`etto`(`rettoretto`(`o`(`o`(`o`(`toretto`(`o`(`ttoretto`(`ettorettoretto`('o'))))))))))))))))))))))
    //val line3 = `o`(`o`(`o`(`o`(`o`(`o`(`o`(`ttoretto`(`o`(`o`(`o`(`o`(`o`(`o`(`torettoretto`(`ttorettorettor`(`o`(`o`(`toretto`(`ttoretto`(`ettorettoretto`('o')))))))))))))))))))))
    //println(line3.tter)
    val (oo,t,e,r,toChar) = (32,18,2,65,10)
    val `t.t` = 50
    val `++` = " )"
    implicit class otterator(val `::`: String) {
      def otterate = {
        `::`./:(0)((`_`, _) => `_`.+(1)) match{
          case ott if (ott <= oo) => " " * (t - ott/e)  + _o.t.t.e.r.`)` + `::` + `++`
          case er if (er <= r) => _o.t.t.e.r.`)` + `::` + `++`
          case l =>{
            lazy val oterr : String => String = splitAt => splitAt.splitAt(`t.t`) match{
              case (l, ls) => _o.t.t.e.r.`)` + l + `++` + 
              (if(ls == "") "" else toChar.toChar +  oterr(ls))
            }
            oterr(`::`)
          }
        }
      } + """
                  |  /
        .-"'"-.   | /
       /      o\  |/
      |    o   0).-.
      |       .-;(_/     .-.
       \     /  /)).---._|  `\   ,
        '.  '  /((       `'-./ _/|
          \  .'  )        .-.;`  /
           '.             |  `\-'
             '._        -'    /
                ``""--`------`
""" // 282 chars
    }
    
  }
}