package biz.GameOfLife.clients

import com.redis._

object GameOfLifeRedis {
  def init = new GameOfLifeRedis("localhost", 6379)
}

class GameOfLifeRedis(host: String, port: Int) extends RedisClientPool(host, port) {

  def push = {}

}