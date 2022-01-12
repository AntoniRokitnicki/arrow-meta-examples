package io.arrowkt.example

import arrow.refinement.Refined
import arrow.refinement.numbers.PositiveInt
import arrow.refinement.numbers.Even

data class PositiveIntEven private constructor(val value: Int) {
  companion object : Refined<Int, PositiveIntEven>(::PositiveIntEven, PositiveInt, Even)
}

val result = PositiveIntEven(-1).value

fun main() {
  println(result)
  //Exception in thread "main" java.lang.ExceptionInInitializerError
  //Caused by: java.lang.IllegalArgumentException: -1 should be > 0, -1 should be even
  //	at io.arrowkt.example.ContextKt.<clinit>(Context.kt:23)
}