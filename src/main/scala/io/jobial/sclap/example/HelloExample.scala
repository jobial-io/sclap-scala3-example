package io.jobial.sclap.example

import cats.effect.IO
import io.jobial.sclap.CommandLineApp

object HelloExample extends CommandLineApp :
  def run =
    for
      hello <- opt[String]("hello").default("world")
    yield
      IO(println(s"hello $hello"))
