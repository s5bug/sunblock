package templates.bulma

import ba.sake.hepek.html.structure.StaticPage
import scalatags.Text

trait BulmaPage extends StaticPage {

  override def styleURLs: List[String] = BulmaDeps.cssUrl :: super.styleURLs

  def content: Text.TypedTag[String]

  override def bodyContent: List[Text.all.Frag] = content :: Nil

}
