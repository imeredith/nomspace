package blog

import views.html.posts._
import play.api.templates.Html
case class Post(date: java.util.Date, title: String, author: String,template: () => Html) {
	def dateString = Blog.format.format(date)
}

object Blog {
	val format = new java.text.SimpleDateFormat("yyyy-MM-dd")
	implicit def string2Date(s: String): java.util.Date = format.parse(s)
	val posts = List(
		Post("2012-04-12", "Nomspace", "Ivan Meredith", nomspace.apply)
	)


	def latest = posts.first
}

