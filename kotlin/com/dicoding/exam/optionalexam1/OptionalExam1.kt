package com.dicoding.exam.optionalexam1

// TODO
fun sumOfBigThree(vararg numbers: Int): Int {
    //mengurutkan dari kecil ke terbesar dan mengambil 3 nilai terakhirnya atau yg paling besar
    val bigThree = numbers.sorted().takeLast(3)
    //mengembalikan nilai penjumlahan semua angka dari variabel bigThree
    return bigThree.sum()
}
