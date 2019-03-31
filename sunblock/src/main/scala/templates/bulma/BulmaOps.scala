package templates.bulma

import scalatags.Text
import scalatags.Text.tags
import scalatags.Text.tags2
import scalatags.Text.all
import scalatags.Text.implicits._

object BulmaOps {

  val section: Text.TypedTag[String] = tags2.section(all.cls := "section ")
  val container: Text.TypedTag[String] = tags.div(all.cls := "container ")
  val title: Text.TypedTag[String] = tags.h1(all.cls := "title ")
  val subtitle: Text.TypedTag[String] = tags.p(all.cls := "subtitle ")

  val columns: Text.TypedTag[String] = tags.div(all.cls := "columns ")
  val column: Text.TypedTag[String] = tags.div(all.cls := "column ")

  val list: Text.TypedTag[String] = tags.div(all.cls := "list is-hoverable ")
  def itemize(t: Text.TypedTag[String], active: Boolean = false): Text.TypedTag[String] = t(all.cls := s"list-item ${if(active) "is-active" else ""}")

}
