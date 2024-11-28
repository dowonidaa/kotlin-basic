package hello.inheritance

import java.time.LocalDate

class MyCar(name: String, price: Double, brand: String, private val purchasedDate: LocalDate) :
  Car(name, price, brand) {

  override fun myPurchaseDate() {
    println("you made a purchase on $purchasedDate")
  }
}
