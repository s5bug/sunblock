resolvers += Resolver.typesafeRepo("releases")
resolvers += Resolver.sonatypeRepo("public")

addSbtPlugin("com.typesafe.sbt" % "sbt-web" % "1.4.4")
addSbtPlugin("ba.sake" % "sbt-hepek" % "0.1.2")

addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.6.3")
