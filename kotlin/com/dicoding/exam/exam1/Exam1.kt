package com.dicoding.exam.exam1

// TODO 1
fun isEvenNumber(number: Int): Boolean {
    //mengembalikan nilai langsung setelah proses pengecekan ganjil genap dengan modulus 2
    val even = number % 2 == 0
    return even
}

// TODO 2
fun moreThanFive(number: Int): Boolean {
    //mengembalikan nilai langsung setelah proses pengecekan apakah number lebih dari 5
    return number >= 6
}

// TODO 3
fun result(number: Int): Int {
    //mengembalikan nilai langsung setelah operasi dengan rumus di bawah
    return number * (number + 10)
}