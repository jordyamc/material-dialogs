package com.afollestad.materialdialogs.utils

internal fun IntArray.appendAll(values: Collection<Int>): IntArray {
  val mutable = this.toMutableList()
  mutable.addAll(values)
  return mutable.toIntArray()
}

internal fun IntArray.removeAll(values: Collection<Int>): IntArray {
  val mutable = this.toMutableList()
  mutable.removeAll { values.contains(it) }
  return mutable.toIntArray()
}