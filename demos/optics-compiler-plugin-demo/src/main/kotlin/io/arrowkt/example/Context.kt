package io.arrowkt.example

import arrow.Optics
import arrow.optics.*

//metadebug

@Optics
data class LensData(
  val field1: String
) {
  companion object
}

fun main() {
  val i: Lens<LensData, String> = LensData.field1
  val result = i != null
  println(i)
  println(result)

  // IDE shows warning:
  // IDE-compiler-error.png
  //arrow.optics.PLens$Companion$invoke$1@c4437c4
  //true

  //generate file Context.kt.meta during compilation
  /**
  package io.arrowkt.example

  import arrow.Optics
  import arrow.optics.*

  //meta: Wed Jan 12 17:49:27 CET 2022

  @Optics
  data class LensData(val field1: String) {
  companion object
  }

  fun main() {
  val i: Lens<LensData, String> = LensData.field1
  val result = i != null
  println(i)
  println(result)
  }
   */

}
