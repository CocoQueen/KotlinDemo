package com.example.wissdom.kotlindemo

import java.lang.Math.pow
import java.util.*
import kotlin.collections.ArrayList
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
    println(str1.equals(str2, true))

    println(heat("水"))
    println(heat(null))

    gradeStudent(1)
    //..包含100
    var nums = 1..100
    var result = 0
    //in 从数组中取值
    for (num in nums) {
        print("${num},")
        result = result + num
    }
    println()
    println(result)

    //until 不包含100
    var nums2 = 1 until 100
    //step 跨两个数取值
    for (num in nums2 step 2) {
        print("${num},")
    }
    println()
    //reversed反转
    for (i in nums2.reversed()) {
        print("${i},")
    }

    println()

    var lists = listOf("1", "2", "3", "4", "5")

    //withIndex 带下标用法
    for ((i, e) in lists.withIndex()) {
        println("$i  $e")
    }

    var map = TreeMap<String, String>()
    map["好"] = "good"
    map["学习"] = "study"
    map["天"] = "day"

    println(map["好"])
    var arr = arrayListOf(1, 10, 5, 8)
    bubbleSort()
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

//接收一个参数，多数是非空的string类型,加问号表示可以为空
fun heat(str: String?): String {
    return "热" + str
}

//10分为满分  9分为不错，8分还可以，7分还需努力，6分及以下还需要加油啦
fun gradeStudent(score: Int) {
    when (score) {
        10 -> println("棒棒哒~")
        9 -> println("不错哟~")
        8 -> println("还可以")
        7 -> println("还需努力")
        else -> println("需要加油哦~")

    }
}

/**
 * 冒泡排序
 */
fun bubbleSort() {
    val arr = intArrayOf(2, 1, 3, 4, 6, 5, 7, 8, 9, 0, 10)
    //N是数组的元素个数，这样无论多少个数，直接修改arr中的元素就行了，
    //不需要调整循环次数
    val N = arr.size
    var temp = 0
    //冒泡排序：每次把最大的放到最后，N-i是因为第i次排序之后，
    //数组arr的最后i个数已经是按照大小顺序的了，所以不需要再排序了
    //比如第一次排序之后，最后一个数肯定是最大的，下一次只需要排前9个就行了。
    for (i in 1 until N) {
        for (j in 0 until N - i) {
            //如果前面的数比后面的大，则不是按照顺序的，因此要交换
            if (arr[j] > arr[j + 1]) {
                temp = arr[j]           //交换2个数
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }

    for (i in 0 until N)
    //输出排序后的结果
    {
        print(arr[i].toString() + "  ")
    }

}