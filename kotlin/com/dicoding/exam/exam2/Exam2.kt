package com.dicoding.exam.exam2

// TODO 1
fun calculate(valueA: Int, valueB: Int, valueC: Int?): Int {
    /*
        dengan terlebih dahulu mengecek nilai valueC apakah null dengan ?:
        jika iya maka akan diubah menjadi 50
        jika tidak null maka nilai inputan akan dipertahankan
    */
    return valueA + (valueB - (valueC ?: 50))
}

// TODO 2
fun result(result: Int): String {
    //melakukan pengembalian nilai string dengan inputan result
    return "Result is $result"
}