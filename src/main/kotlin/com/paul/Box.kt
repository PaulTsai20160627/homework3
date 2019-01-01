package com.koltin

import java.util.*

fun main(args: Array<String>) {
    var box : Box
    val scanner = Scanner(System.`in`)
    println("Please enter object's length:  ")
    val boxlength = scanner.nextFloat()
    println("Please enter object's width:  ")
    val boxwidth = scanner.nextFloat()
    println("Please enter object's height:  ")
    val boxheight = scanner.nextInt()
    box = Box3(boxlength,boxwidth,boxheight)
    if(!box.validate()) {
        box = Box5(boxlength,boxwidth,boxheight);
        if(box.validate()){
            System.out.println("Box5");
        }else
            System.out.println("Good is out of range of Box3 and Box5 !!");
    }else
        System.out.println("Box3");
}

open class Box(var length : Float, var width :Float, var height : Int){
    open fun validate() :Boolean = false
}
class Box3(length: Float, width: Float,height: Int) : Box(length,width,height){
    var sizeIsValid : Boolean = false
    companion object {
        var length =23.0f
        var width =14.0f
        var height = 13
    }
    var companion = Box3.Companion
    override fun validate(): Boolean {
        sizeIsValid = (length < companion.length) && (width < companion.width) && (height < companion.height)
        return sizeIsValid
    }
}

class Box5(length: Float,width: Float,height: Int) : Box(length,width,height){
    var sizeIsValid : Boolean = false
    companion object {
        var length = 39.5f
        var width = 27.5f
        var height = 23
    }
    var companion = Box5.Companion
    override fun validate(): Boolean {
        sizeIsValid = (length < companion.length) && (width < companion.width) && (height < companion.height)
        return sizeIsValid
    }
}