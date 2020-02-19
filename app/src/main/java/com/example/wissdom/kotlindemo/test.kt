package com.example.wissdom.kotlindemo

import java.lang.Math.pow
import kotlin.math.sqrt

/**
 *
 * @author：Coco
 * date：2020/2/18
 * version：1.0
 * description:test
 */
fun main(args: Array<String>) {
    val aByte = Long.MAX_VALUE
    val bByte = Long.MIN_VALUE
    println("最大值：==" + aByte + "==最小值：==" + bByte)

    //根号5和根号4
    var num = sqrt(5.0)
    var num2 = sqrt(4.0)

    //2的100次方
    var num3 = pow(2.0, 100.0)

    println("===" + num2 + "===" + num)
    println(sayHello("张三"))

    println(checkAge(20))
    saveLog(20)

    println(temple("中山公园"))
    checkFace(60)

    println(returnBig(10, 30))

    //字符串比较 = 赋值  == 比较 相当于 java.equal()方法
    var str1 = "andy"
    var str2 = "Andy"

    println(str1 == str2)
    //equals的第二个参数为true时表示忽略字母的大小写
    println(str1.equals(str2,true))

}

//方法使用
fun sayHello(name: String): String {
    return name
}

fun checkAge(age: Int): Boolean {
    if (age > 18) return true else return false
}

fun saveLog(logLevel: Int) {
    println(logLevel)
}

//${}动态替换内容
fun temple(place: String): String {
    var temp = """今天天气晴朗，万里无云，我们去${place}游玩，首先映入眼帘的是，${place}${place.length}个鎏金大字"""
    return temp
}

//颜值判断器  颜值>80  帅哥  反之  衰哥
fun checkFace(score: Int) {
    if (score > 80) {
        println("这是一个帅哥")
    } else {
        println("这是一个衰哥")
    }
}

//返回两个数中比较大的那个数
fun returnBig(a: Int, b: Int): Int {
    if (a > b) return a else return b
}
