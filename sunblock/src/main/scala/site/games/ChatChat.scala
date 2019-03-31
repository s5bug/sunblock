package site.games

import scalatags.Text.all._
import scalatags.text.Frag
import templates.SunblockPage

object ChatChat extends SunblockPage {

  override def subName: String = "ChatChat"

  override def gameContent: Frag = embed(
    src := "/games/chatchat/chatchat.swf",
    widthA := "640",
    heightA := "600",
    height := "600px",
  )

}
