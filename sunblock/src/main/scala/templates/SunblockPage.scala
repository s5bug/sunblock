package templates

import ba.sake.hepek.bulma.statik.BulmaStaticPage
import ba.sake.hepek.html.structure.{PageSettings, SiteSettings}
import scalatags.Text
import scalatags.Text.all
import scalatags.Text.all.{cls, div}
import scalatags.text.Frag
import scalatags.Text.implicits._
import site.Index
import site.games.{ChatChat, FiveXMan}

trait SunblockPage extends BulmaStaticPage {

  import ba.sake.hepek.bulma._
  import component._, element._, grid._
  import BulmaTitleElements._
  import BulmaGridComponents._

  override def siteSettings: SiteSettings = super.siteSettings.withName("sunblock games").withIndexPage(Index)

  override def pageSettings: PageSettings = super.pageSettings.withTitle(subName)

  def subName: String

  def gameContent: Frag

  override def pageContent: Text.TypedTag[String] = section(
    container(
      all.a(all.href := "/")(title("sunblock games")),
      subtitle(subName),
      row(
        div(cls := "column is-one-quarter ")(SunblockPage.navBar(this)),
        div(cls := "column is-three-quarters ")(gameContent)
      )
    )
  )

}

object SunblockPage {

  val games: List[SunblockPage] =
    ChatChat ::
    FiveXMan ::
      Nil

  import ba.sake.hepek.bulma.component.ListComponents._

  def navBar(o: SunblockPage): Frag =
    list(
      games.sortBy(_.subName).map { p =>
        item(p.subName, Some(p.relPath().toString.drop(5)), p.subName == o.subName)
      }: _*
    )

}
