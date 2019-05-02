package site.games

import scalatags.Text.all._
import scalatags.text.Frag
import templates.SunblockPage

object DuckLifeFour extends SunblockPage {
  override def subName: String = "Duck Life 4"

  override def gameContent: Frag = embed(
    src := "/games/ducklife/ducklife4.swf",
    widthA := "640",
    heightA := "480",
    height := "480px",
  )
}
