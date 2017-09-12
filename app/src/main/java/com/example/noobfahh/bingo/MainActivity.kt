package com.example.noobfahh.bingo

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity(), View.OnClickListener {
    var myArrList = ArrayList<String>()
    var myArrListAdd = ArrayList<String>()
    val KeyAdd = "add"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState != null){
            myArrList = savedInstanceState.get(KeyAdd) as ArrayList<String>

        }
        AddMyArrList()
        AllSetTVText()
        tv1.setOnClickListener(this)
        tv2.setOnClickListener(this)
        tv3.setOnClickListener(this)
        tv4.setOnClickListener(this)
        tv5.setOnClickListener(this)
        tv6.setOnClickListener(this)
        tv7.setOnClickListener(this)
        tv8.setOnClickListener(this)
        tv9.setOnClickListener(this)
        btnRandom.setOnClickListener(this)
        EtRandom.setOnClickListener(this)

    }

    private fun AddMyArrList() {
        for (i in 0..100) {
            myArrList.add(i.toString())
            // EtRandom.setInputExtras(index)
            // tv1.setBackgroundResource(R.drawable.ic_finish)
        }
    }

    private fun AllSetTVText() {
        var i = randomNumber();
        tv1.text = i
        myArrList.remove(i)
        i = randomNumber();
        tv2.text = i
        myArrList.remove(i)
        i = randomNumber();
        tv3.text = i
        myArrList.remove(i)
        i = randomNumber();
        tv4.text = i
        myArrList.remove(i)
        i = randomNumber();
        tv5.text = i
        myArrList.remove(i)
        i = randomNumber();
        tv6.text = i
        myArrList.remove(i)
        i = randomNumber();
        tv7.text = i
        myArrList.remove(i)
        i = randomNumber ();
        tv8.text = i
        myArrList.remove(i)
        i = randomNumber ();
        tv9.text = i
        myArrList.remove(i)


    }

    @SuppressLint("ResourceAsColor")
    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.btnRandom -> {
                    println("kuy" + myArrListAdd[0])

                    for (i in 0 until myArrListAdd.size) {

                        println(myArrListAdd[i] + "test")
                    }
                    if (myArrListAdd.contains(EtRandom.text.toString())) {

                        confirm_mission(tv1)

                        println("fahtest")
                    }
                    // randomNumber(EtRandom)
                    //randomNumber()
                }
                R.id.tv1 -> {
//                    tv1.text = "กดไลค์ 5 ครั้ง"
//                    tv1.setBackgroundResource(R.drawable.ci_bg)
//                    tv1.setTextColor(R.color.colorPrimaryDark)
                    confirm_mission(tv1)
                }
                R.id.tv2 -> {
//                    tv2.text = "ดูวิดิโอ 2 ครั้ง"
//                    tv2.setBackgroundResource(R.drawable.ci_bg)
//                    tv2.setTextColor(R.color.colorPrimaryDark)
                    confirm_mission2(tv2)

                }
                R.id.tv3 -> {
//                    tv3.text = "กดแชร์วิดิโอ 1 ครั้ง"
//                    tv3.setBackgroundResource(R.drawable.ci_bg)
//                    tv3.setTextColor(R.color.colorPrimaryDark)
                    confirm_mission3(tv3)

                }
                R.id.tv4 -> {
//                    tv4.text = "กดแชร์วิดิโอ 1 ครั้ง"
//                    tv4.setBackgroundResource(R.drawable.ci_bg)
//                    tv4.setTextColor(R.color.colorPrimaryDark)
                    confirm_mission3(tv4)

                }
                R.id.tv5 -> {
//                    tv5.text = "ดูวิดิโอ 2 ครั้ง"
//                    tv5.setBackgroundResource(R.drawable.ci_bg)
//                    tv5.setTextColor(R.color.colorPrimaryDark)
                    confirm_mission(tv5)

                }
                R.id.tv6 -> {
//                    tv6.text = "ดูวิดิโอ 2 ครั้ง"
//                    tv6.setBackgroundResource(R.drawable.ci_bg)
//                    tv6.setTextColor(R.color.colorPrimaryDark)
                    confirm_mission(tv6)

                }
                R.id.tv7 -> {
//                    tv7.text = "กดไลค์ 5 ครั้ง"
//                    tv7.setBackgroundResource(R.drawable.ci_bg)
//                    tv7.setTextColor(R.color.colorPrimaryDark)
                    confirm_mission2(tv7)

                }
                R.id.tv8 -> {
//                    tv8.text = "กดแชร์วิดิโอ 1 ครั้ง"
//                    tv8.setBackgroundResource(R.drawable.ci_bg)
//                    tv8.setTextColor(R.color.colorPrimaryDark)
                    confirm_mission3(tv8)

                }
                R.id.tv9 -> {
//                    tv9.text = "กดไลค์ 5 ครั้ง"
//                    tv9.setBackgroundResource(R.drawable.ci_bg)
//                    tv9.setTextColor(R.color.colorPrimaryDark)
                    confirm_mission2(tv9)

                }
            }
        }
    }

    @SuppressLint("WrongConstant", "ResourceType")
    private fun confirm_mission(v: View?) {
        val builder = AlertDialog.Builder(this)
        builder.setMessage(R.string.dialog_mission)
//        builder.setMessage("fffff")
        builder.setPositiveButton(R.string.dialog_confirm, DialogInterface.OnClickListener { dialog, id ->
            val intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
            if (v != null) {
                v.setBackgroundResource(R.drawable.ic_finish)
                v.isEnabled = false
            }
        })
        builder.setNegativeButton(R.string.dialog_cancel, DialogInterface.OnClickListener { dialog, which ->
            dialog.dismiss();
        })
        builder.show()
    }

    private fun confirm_mission2(v: View?) {
        val builder = AlertDialog.Builder(this)
        builder.setMessage(R.string.dialog_mission2)
//        builder.setMessage("fffff")
        builder.setPositiveButton(R.string.dialog_confirm, DialogInterface.OnClickListener { dialog, id ->
            //            val i = Intent(application, MainActivity::class.java)
//            startActivity(i)
            if (v != null) {
                v.setBackgroundResource(R.drawable.ic_finish)
                v.isEnabled = false
            }
//            tv1.isClickable.equals(false)
            //sharedPrefUtil.clearSharedPref()
//            finish()
        })
        builder.setNegativeButton(R.string.dialog_cancel, DialogInterface.OnClickListener { dialog, which ->
            dialog.dismiss();
        })
        builder.show()
    }

    @SuppressLint("ResourceAsColor")
    private fun confirm_mission3(v: View?) {
        val builder = AlertDialog.Builder(this)
        builder.setMessage(R.string.dialog_mission3)
//        builder.setMessage("fffff")
        builder.setPositiveButton(R.string.dialog_confirm, DialogInterface.OnClickListener { dialog, id ->
            //            val i = Intent(application, MainActivity::class.java)
//            startActivity(i)
            if (v != null) {
                v.setBackgroundResource(R.drawable.ic_finish)
                v.isEnabled = false
            }
//            tv1.isClickable.equals(false)
            //sharedPrefUtil.clearSharedPref()
//            finish()
        })
        builder.setNegativeButton(R.string.dialog_cancel, DialogInterface.OnClickListener { dialog, which ->
            dialog.dismiss();
        })
        builder.show()
    }

    private fun randomNumber(): String {
        val number = Random()
        var index = number.nextInt(myArrList.size)
        myArrListAdd.add(myArrList[index])

        return myArrList[index]
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putStringArrayList(KeyAdd,myArrList)
    }
}