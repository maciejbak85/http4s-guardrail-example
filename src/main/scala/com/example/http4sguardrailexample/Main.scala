package com.example.http4sguardrailexample

import cats.effect.{ExitCode, IO, IOApp}
import cats.implicits._

object Main extends IOApp {
  def run(args: List[String]) =
    Http4sguardrailexampleServer.stream[IO].compile.drain.as(ExitCode.Success)
}