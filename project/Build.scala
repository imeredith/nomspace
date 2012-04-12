import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "ivan-blog"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "com.github.play2war" %% "play2-war-core" % "0.2-SNAPSHOT"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      resolvers += "Play2war plugins snapshot" at "http://repository-play-war.forge.cloudbees.com/snapshot/"    
    )

}
