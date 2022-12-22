name := "data-engineering-example"

version := "0.1"

// scalaVersion := "3.2.0"

ThisBuild / scalaVersion := "2.13.6"
ThisBuild / organization := "com.example"

lazy val hello = (project in file("."))
  .settings(
    name := "Hello"
  )