package com.example.c

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var a = 0 //check จำนวนการกดเครื่องหมาย โดยมีเลขแทนคือ 1 = กดแล้ว , 0 = ยังไม่กด ตย. กดเลขชุดแรกแล้วกดเครื่องหมาย + ตัวเลขชุดหลังจะต้องปรากฏขึ้น
    var op = "" //เก็บค่าเตัวแทนเครื่องหมายต่าง โดยเก็บค่าเป็นตัวอักษร
    var num = 0 //เก็ยค่าเลขชุดแรกที่กด
    var sum = 0 //เก็บผลรวม
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        one.setOnClickListener {
            if (show.text.toString() == "0" || a == 1) {
                show.setText("1")
                a = 0
            } else {
                var strOne = show.text.toString().plus(1)
                show.setText(strOne)
            }
        }

        two.setOnClickListener {
            if (show.text.toString() == "0" || a == 1) {
                show.setText("2")
                a = 0
            } else {
                var strTwo = show.text.toString().plus(2)
                show.setText(strTwo)
            }
        }

        three.setOnClickListener {
            if (show.text.toString() == "0" || a == 1) {
                show.setText("3")
                a = 0
            } else {
                var strThree = show.text.toString().plus(3)
                show.setText(strThree)
            }
        }

        four.setOnClickListener {
            if (show.text.toString() == "0" || a == 1) {
                show.setText("4")
                a = 0
            } else {
                var strFour = show.text.toString().plus(4)
                show.setText(strFour)
            }
        }

        five.setOnClickListener {
            if (show.text.toString() == "0" || a == 1) {
                show.setText("5")
                a = 0
            } else {
                var strFive = show.text.toString().plus(5)
                show.setText(strFive)
            }
        }

        six.setOnClickListener {
            if (show.text.toString() == "0" || a == 1) {
                show.setText("6")
                a = 0
            } else {
                var strSix = show.text.toString().plus(6)
                show.setText(strSix)
            }
        }

        seven.setOnClickListener {
            if (show.text.toString() == "0" || a == 1) {
                show.setText("7")
                a = 0
            } else {
                var strSeven = show.text.toString().plus(7)
                show.setText(strSeven)
            }
        }

        eight.setOnClickListener {
            if (show.text.toString() == "0" || a == 1) {
                show.setText("8")
                a = 0
            } else {
                var strEight = show.text.toString().plus(8)
                show.setText(strEight)
            }
        }

        nine.setOnClickListener {
            if (show.text.toString() == "0" || a == 1) {
                show.setText("9")
                a = 0
            } else {
                var strNine = show.text.toString().plus(9)
                show.setText(strNine)
            }
        }

        zero.setOnClickListener {
            if (show.text.toString() == "0" || a == 1) {
                show.setText("0")
                a = 0
            } else {
                var strZero = show.text.toString().plus(0)
                show.setText(strZero)
            }
        }

        clear.setOnClickListener() {
            show.setText("0")
            sum = 0
        }

        del.setOnClickListener {
            if (show.text.toString().length <= 1) {
                show.setText("0")
            } else {
                show.text = show.text.dropLast(1)
            }
        }

        multiplied.setOnClickListener {  //คูณ *
            a = 1
            num = show.text.toString().toInt()
            op = "mul"
            if (a >= 1 ){
                sum = sum * show.text.toString().toInt()
                show.text = sum.toString()
            }
        }

        minus.setOnClickListener { // -
            a = 1
            num = show.text.toString().toInt()
            op = "min"
            if (a >= 1 ){
                sum = sum - show.text.toString().toInt()
                show.text = sum.toString()
            }
        }

        plus.setOnClickListener { // +
            a = 1
            num = show.text.toString().toInt()
            op = "plu"
            if (a >= 1 ){
                sum = sum + show.text.toString().toInt()
                show.text = sum.toString()
            }
        }

        divide.setOnClickListener {  // หาร /
            a = 1
            num = show.text.toString().toInt()
            op = "div"
            if (a >= 1 ){
                sum = sum / show.text.toString().toInt()
                show.text = sum.toString()
            }
        }

        modulo.setOnClickListener {
            a = 1
            num = show.text.toString().toInt()
            op = "mod"
            if (a >= 1 ){
                sum = sum % show.text.toString().toInt()
                show.text = sum.toString()
            }
        }

        equals.setOnClickListener {
            if (op == "mul") { // *
                sum = num * show.text.toString().toInt()
                show.text = sum.toString()
            } else if (op == "min") { // -
                sum = num - show.text.toString().toInt()
                show.text = sum.toString()
            } else if (op == "plu") { //+
                sum = num + show.text.toString().toInt()
                show.text = sum.toString()
            } else if (op == "div") { // หาร /
                sum = num / show.text.toString().toInt()
                show.text = sum.toString()
            } else if (op == "mod") {
                sum = num % show.text.toString().toInt()
                show.text = sum.toString()
            }
        }
    }
}