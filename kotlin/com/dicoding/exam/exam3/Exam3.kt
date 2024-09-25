package com.dicoding.exam.exam3

// TODO
fun <T> checkType(args: T): String {
    //menyimpan nama tipe data dari args dan menganggap tidak ada nilai null pada args pada variabel dataType
    val dataType = args!!::class.simpleName
    //mengembalikan nilai String dengan pengkondisian when pada variabel dataType seperti di bawah
    return when(args) {
        is Int -> "Yes! it's Integer"
        is List<*> -> "Yes! it's List"
        is Map<*, *> -> "Yes! it's Map"
        else -> "Yes! it's $dataType"
    }
}