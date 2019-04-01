package site.games

import scalatags.Text.all._
import scalatags.text.Frag
import templates.SunblockPage

object FiveXMan extends SunblockPage {

  override def subName: String = "5xMan"

  override def gameContent: Frag = embed(
    src := "/games/5xman/5xman.swf",
    widthA := "640",
    heightA := "480",
    height := "480px",
  )

}
