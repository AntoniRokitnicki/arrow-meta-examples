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
  //> Task :refined-types-compiler-plugin-demo:compileKotlin FAILED
  //e: -1 should be > 0, -1 should be even : io.arrowkt.example.PositiveIntEven.Companion.invoke
  //
  //-1 should be > 0, -1 should be even : io.arrowkt.example.PositiveIntEven.Companion.invoke
}