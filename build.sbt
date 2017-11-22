lazy val root = (project in file("."))
.settings(
  libraryDependencies ++= Dependencies.Test.all
)