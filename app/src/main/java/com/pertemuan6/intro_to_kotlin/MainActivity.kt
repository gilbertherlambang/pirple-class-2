package com.pertemuan6.intro_to_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var t_shirt: Clothing = Clothing("t-shirt", 6)
        var isClean = t_shirt.isClean
        t_shirt.washClothing()

        var sneakers: ShoesWithLaces = ShoesWithLaces("sneakers", 11)
        sneakers.laceShoes("checked Laces")
        sneakers.washClothing()
        }
    }
