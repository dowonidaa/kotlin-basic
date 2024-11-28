package hello.task

class Calculator {


  fun sum(num1: Int, num2: Int){
    print(num1 + num2)

  }

  fun minus(num1: Int, num2: Int) {
    print( num1 - num2)
  }

  fun multiply(num1: Int, num2: Int){
    print(num1 + num2)
  }

  fun divide(num1: Int, num2: Int){
    if (num2 == 0) {
      println("계산할 수 없습니다.")
      return
    }
    print(num1 / num2)
  }

  private fun print(num: Int) {
    println("답은 $num 입니다.")
  }

}
