package templates

import ba.sake.hepek.html.structure.{PageSettings, SiteSettings}
import scalatags.Text
import scalatags.Text.all
import scalatags.text.Frag
import scalatags.Text.implicits._
import site.Index
import site.games.{ChatChat, FiveXMan}
import templates.bulma.BulmaOps._
import templates.bulma.BulmaPage

trait SunblockPage extends BulmaPage {

  override def siteSettings: SiteSettings = super.siteSettings.withName("sunblock games").withIndexPage(Index)

  override def pageSettings: PageSettings = super.pageSettings.withTitle(subName)

  def subName: String

  def gameContent: Frag

  override def content: Text.TypedTag[String] = section(
    container(
      all.a(all.href := "/")(title("sunblock games")),
      subtitle(subName),
      columns(
        column(Text.all.cls := "is-one-quarter")(SunblockPage.navBar(this)),
        column(gameContent)
      )
    )
  )

}

object SunblockPage {

  val games: List[SunblockPage] =
    ChatChat ::
    FiveXMan ::
      Nil

  def navBar(o: SunblockPage): Frag =
    list(
      games.sortBy(_.subName).map { p =>
        itemize(all.a(all.href := p.relPath().toString.drop(5))(p.subName), p.subName == o.subName)
      }: _*
    )

}
