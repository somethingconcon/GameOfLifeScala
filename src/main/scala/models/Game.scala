package biz.GameOfLife.Models

import biz.GameOfLife.UI.GameInterface
import biz.GameOfLife.clients.GameOfLifeRedis

object Game {

  val state = 0

  def start = {
    initClients
    run
  }

  private def initClients = {
    val redis = GameOfLifeRedis.init
  }

  private def run = {
    GameInterface.run
  }
}