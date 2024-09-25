package com.dicoding.exam.exam5

//mengimpor library untuk menambahkan fitur suspend delay fungsi dalam beberapa detik
import kotlinx.coroutines.delay

// TODO 1
suspend fun sum(valueA: Int, valueB: Int): Int {
    //melakukan delay dalam mengembalikan nilai dari hasil penjumlahan
    val delayTime = 3000L
    delay(delayTime)
    return valueA + valueB
}

// TODO 2
suspend fun multiple(valueA: Int, valueB: Int): Int {
    //melakukan delay dalam mengembalikan nilai dari hasil perkalian
    val delayTime = 2000L
    delay(delayTime)
    return valueA * valueB
}
