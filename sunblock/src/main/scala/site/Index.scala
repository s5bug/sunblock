package site

import ba.sake.hepek.html.structure.PageSettings
import scalatags.{Text, text}
import scalatags.Text.implicits._
import templates.SunblockPage

object Index extends SunblockPage {

  override def pageSettings: PageSettings = super.pageSettings.withTitle("sunblock games")

  override def subName: String = "it's pizza time!"

  override def gameContent: text.Frag = "Choose one of the games in the sidebar to play"

}
