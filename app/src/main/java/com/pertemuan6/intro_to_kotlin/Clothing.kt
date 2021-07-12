package com.pertemuan6.intro_to_kotlin

open class Clothing(var name: String, var size: Int) {
    var isClean: Boolean = true

    constructor(name: String, size: Int, isClean: Boolean): this(name, size){
        this.isClean = isClean
    }

    open fun washClothing(){
        this.isClean = true
    }
}