import sbt._

object Dependencies {
  private lazy val scalaTestVersion      = "3.0.1"
  private lazy val ScalaTest             = "org.scalatest" %% "scalatest" % scalaTestVersion % "test"
  object Test {
    def all = Seq(ScalaTest)
  }
}
