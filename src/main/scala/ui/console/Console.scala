object Console {

  def print(statements: Array[String]): Unit = {
    statements.foreach { statement =>
      print(statement)
    }
  }

  def print(statement: String): Unit = println(pad(statement))

  def pad(statement: String): String = statement

}