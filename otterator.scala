package moorhouse{
  package _o{package t{package t{package e{object r{val `)` = "( "}}}}}  
  object Otter
  {//jgs' otter, thanks
    val (o,t,e,r,toChar) = (32,18,2,65,10)
    val `t.t` = 50
    val `++` = " )"
    implicit class otterator(val `::`: String) {
      def otterate = {
        `::`.foldLeft(0)((`_`, _) => `_`.+(1)) match{
          case ott if (ott <= o) => " " * (t - ott/e)  + _o.t.t.e.r.`)` + `::` + `++`
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