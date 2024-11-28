package hello.variable

class VariableSample {

  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      val name: String = "이름"
      val org = "Around Hun Studio"
      var age = 12
      // org = "ThinkGround"
      age = 15

      println("my name is $name")
      println("my organization is $org")
      println("my age is $age")
    }
  }
}
