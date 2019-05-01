lazy val hepekGit = ProjectRef(uri("https://github.com/sake92/hepek.git"), "hepekProject")

lazy val sunblock = (project in file("sunblock")).settings(
  organization := "tf.bug",
  name := "sunblock",
  version := "0.1.0",
  scalaVersion := "2.12.8",
  libraryDependencies ++= Seq(
    "com.github.japgolly.scalacss" %% "core" % "0.5.5",
  ),
  (hepek in Compile) := {
    WebKeys.assets.value
    (hepek in Compile).value
  },
  WebKeys.webModulesLib := "site/lib",
  git.remoteRepo := "git@github.com:sorenbug/sunblock.git",
  siteSourceDirectory := target.value / "web" / "public" / "main" / "site",
).dependsOn(hepekGit).enablePlugins(SbtWeb, HepekPlugin, GhpagesPlugin)
