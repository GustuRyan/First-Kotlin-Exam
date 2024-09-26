package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    //menyimpan hasil pencarian nilai yang bertipe integer
    val result = "\\d+".toRegex().find(str)
    //perkondisian untuk mengetahui apakah di string terdapat number atau tidak
    return if (result != null) {
        //mengubah nilai hasil menjadi integer dan menyimpannya di dalam val number
        val number = result.value.toInt()
        //mengalikan hasil number dari string dan int input
        val timesResult = number * int
        //mengganti nilai yang sama dengan result pada str menjadi timesResult
        str.replace(result.value, timesResult.toString())
    }
    //jika tidak ada int pada string maka akan langsung menggabungkan str dengan int
    else {
        str + int
    }
}
