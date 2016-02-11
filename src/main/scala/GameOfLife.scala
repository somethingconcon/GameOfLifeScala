package biz.GameOfLife

//scala
import scala.util.Properties

import biz.GameOfLife.Models.Game

object GameOfLife extends App {

  override def main(args: Array[String]) = {

    println(scala.util.Properties.envOrElse("COLUMNS", "/myhome"))

    Game.start
  }
}