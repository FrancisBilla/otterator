package moorhouse{
  object Otter 
  {//jgs' otter, thanks
    val o,`t.t`,e,r = "otter"
    //val f = 'o' << otter.length
      //bubble pointer starts at char 18\
      //line wrap at 60?
      val otter = """
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
    implicit class otterator(val str: String) extends AnyVal {
      
      def otterate = tokenize(str) + otter
      def tokenize(s:String) = {
        val length = s.length
        length match{
          case l if (l <= 32) =>{
            val lpad = " " * (18 - l/2) 
            lpad + "( " + s + " )"
          }
          case l if (l <= 65) => {
            "( " + s + " )"
          }
          case l =>{
            val lines = l / 50
            def split (n: String): String = n.splitAt(50) match{
              case (l, "") => "( " + l + " )\n"
              case (l, ls) => "( " + l + " )\n" + split(ls)
            }
            split(s)
          }
        }
      }
    }
    
  }
}