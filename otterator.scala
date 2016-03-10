package moorhouse{
  object Otter 
  {//jgs' otter, thanks
    val (o,t,e,r,oter) = (32,18,2,65,10)
    val `t.t` = 50
    val `)` = "( "
    val `++` = " )"
    implicit class otterator(val `::`: String) {
      def otterate = {
        `::`.foldLeft(0)((`_`, _) => `_`.+(1)) match{
          case l if (l <= o) => " " * (t - l/e)  + `)` + `::` + `++`
          case l if (l <= r) => `)` + `::` + `++`
          case l =>{
            lazy val oterr : String => String = (s: String) => s.splitAt(`t.t`) match{
              case (l, ls) => `)` + l + `++` + oter.toChar + (if(ls == "") oterr(ls) else "")
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