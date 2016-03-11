package moorhouse{
  package _o{package t{package t{package e{object r{val `)` = "( "}}}}}  
  sealed trait otterretto{
    def tter: String = this match{
      case `o`(o) => ' ' + o.tter
      case `to`(o) => '\'' + o.tter
      case `tto`(o) => '\"' + o.tter
      case `etto`(o) => '-' + o.tter
      case `retto`(o) => '(' + o.tter
      case `oretto`(o) => ')' + o.tter
      case `toretto`(o) => '|' + o.tter
      case `ttoretto`(o) => '/' + o.tter
      case `ettoretto`(o) => '`' + o.tter
      case `rettoretto`(o) => '.' + o.tter
      case `orettoretto`(o) => ';' + o.tter
      case `torettoretto`(o) => 'o' + o.tter
      case `ttorettoretto`(o) => '0' + o.tter
      case `ttorettorettor`(o) => '\\' + o.tter
      case `ettorettorettor`(o) => "\n"
    }
  }
  case class `o`(o:otterretto) extends otterretto
  case class `ttorettoretto`(o:otterretto) extends otterretto
  case class `to`(o:otterretto) extends otterretto
  case class `torettoretto`(o:otterretto) extends otterretto
  case class `tto`(o:otterretto) extends otterretto
  case class `orettoretto`(o:otterretto) extends otterretto
  case class `etto`(o:otterretto) extends otterretto
  case class `rettoretto`(o:otterretto) extends otterretto
  case class `retto`(o:otterretto) extends otterretto
  case class `ettoretto`(o:otterretto) extends otterretto
  case class `oretto`(o:otterretto) extends otterretto
  case class `ttoretto`(o:otterretto) extends otterretto
  case class `toretto`(o:otterretto) extends otterretto
  case class `ettorettoretto`(o:otterretto) extends otterretto
  case class `ttorettorettor`(o:Char) extends otterretto
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
    val line1 = `o`(`o`(`o`(`o`(`o`(`o`(`o`(`o`(`o`(`o`(`o`(`o`(`o`(`o`(`o`(`o`(`o`(`o`(`toretto`(`o`(`o`(`ttoretto`(`ettorettoretto`('o')))))))))))))))))))))))
    val line2 = `o`(`o`(`o`(`o`(`o`(`o`(`o`(`o`(`rettoretto`(`etto`(`tto`(`to`(`tto`(`etto`(`rettoretto`(`o`(`o`(`o`(`toretto`(`o`(`ttoretto`(`ettorettoretto`('o'))))))))))))))))))))))
    val line3 = `o`(`o`(`o`(`o`(`o`(`o`(`o`(`ttoretto`(`o`(`o`(`o`(`o`(`o`(`o`(`torettoretto`(`ttorettorettor`(`o`(`o`(`toretto`(`ttoretto`(`ettorettoretto`('o')))))))))))))))))))))
        
    println(line2.tter)
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