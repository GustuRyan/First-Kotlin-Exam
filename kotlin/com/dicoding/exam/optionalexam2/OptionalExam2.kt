package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    //menyimpan hasil pemetaan nilai int ke dalam array bertipe integer
    val arrayNumber = number.toString().map { it.toString().toInt() }.toIntArray()
    //proses pengecekan apakah panjang array diantara 2 sampai 9
    if (arrayNumber.size in 2..9) {
        //mengambil nilai minimum jika tidak ada maka akan diganti 0
        val minNumber = arrayNumber.minOrNull() ?: 0
        //mengambil nilai maksimum jika tidak ada maka akan diganti 0
        val maxNumber = arrayNumber.maxOrNull() ?: 0
        //mengembalikan hasil penjumlahan minimum dan maksimum
        return minNumber + maxNumber
    }
    return 0
}
