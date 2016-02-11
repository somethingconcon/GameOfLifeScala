package biz.GameOfLife

import org.scalatest.Matchers
import org.scalamock.scalatest.MockFactory
import org.scalatest.WordSpec



class GameOfLifeSpec extends WordSpec with MockFactory with Matchers {

  "GameOfLife" should {
    "do some shit" in {
      val shit = "shit"
      shit.length should be (4)
    }
  }
}