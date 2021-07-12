package com.pertemuan6.intro_to_kotlin

import android.util.Log

class controlflow {
    var i: Int = 1
    var end: Int = 100
    if( i <= end)
    {
        if (i % 5 == 0 && i % 3 == 0) {
            Log.d("mainActivity", "FizzBuzz")
        } else if (i % 5 == 0) {
            Log.d("mainActivity", "Fizz")
        } else if (i % 3 == 0) {
            Log.d("mainActivity", "Buzz")
        } else {
            Log.d("mainActivity", i.toString())
        }
        i += 1
    }
}