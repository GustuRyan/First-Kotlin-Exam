package com.dicoding.exam.optionalexam4

// TODO
fun getMiddleCharacters(string: String): String {
    //mengelakukan pengecekan panjang string adalah genap dan panjangnya diantara 1 sampai 100
    return if (string.length % 2 == 0 && string.length in 1..100) {
        //menyimpan nilai tengah dari panjang string
        val middle = string.length / 2
        //mengembalikan nilai subtring dari nilai string yang berisi 2 nilai string tengah
        string.substring(middle - 1, middle + 1)
        //middle - 1 dan middle + 1 merujuk kepada 2 nilai tengah karna genap

        //jika string bernilai ganjil dan panjangnya diantara 1 sampai 100
    } else if (string.length in 1..100) {
        //menyimpan nilai tengah dari panjang string
        val middle = string.length / 2
        //mengembalikan nilai string dengan urutan index array sesuai dengan val middle
        string[middle].toString()
    } else {
        //ketika panjang string tidak berada diantara 1 sampai 100
        "false"
    }
}