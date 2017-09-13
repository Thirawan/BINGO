package com.example.noobfahh.bingo

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList
import android.view.inputmethod.InputMethodManager.HIDE_IMPLICIT_ONLY
import android.app.Activity
import android.content.Context
import android.view.MotionEvent
import android.view.inputmethod.InputMethodManager
import android.content.Context.INPUT_METHOD_SERVICE
import android.graphics.Rect
import android.widget.RelativeLayout




class MainActivity : AppCompatActivity(), View.OnClickListener {
    var myArrList = ArrayList<String>()
    var myArrListAdd = ArrayList<String>()
    val KeyAdd = "add"
    private val myMission = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initHideKeyboard(RL1)
        showMissionArrList()
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

    private fun showMissionArrList() {
       // println(R.string.dialog_mission.toString()+"hjk")
        myMission.add("ดู วิดิโอ 2 ครั้ง")
        myMission.add("กดไลค์ 5 ตรั้ง")
        myMission.add("แชร์วิดิโอ 1 ครั้ง")
        myMission.add("กดไลค์ 5 ตรั้ง")
        myMission.add("ดู วิดิโอ 2 ครั้ง")
        myMission.add("ดู วิดิโอ 2 ครั้ง")
        myMission.add("กดไลค์ 5 ตรั้ง")
        myMission.add("แชร์วิดิโอ 1 ครั้ง")
        myMission.add("แชร์วิดิโอ 1 ครั้ง")

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
                        for (i in 1..9) {
                            println(i.toString()+"saassssss")
                            val id = resources.getIdentifier("tv"+ i.toString(), "id", packageName)
                            val textView = this.findViewById<TextView>(id)
                            if (textView.text.toString() == EtRandom.text.toString()){
                                confirm_mission(textView,i-1)
                            }
                        }


//                        println("fahtest")
                    }
                    // randomNumber(EtRandom)
                    //randomNumber()
                }
                R.id.tv1 -> {
//                    tv1.text = "กดไลค์ 5 ครั้ง"
//                    tv1.setBackgroundResource(R.drawable.ci_bg)
//                    tv1.setTextColor(R.color.colorPrimaryDark)
                    confirm_mission(v,0)
                }
                R.id.tv2 -> {
//                    tv2.text = "ดูวิดิโอ 2 ครั้ง"
//                    tv2.setBackgroundResource(R.drawable.ci_bg)
//                    tv2.setTextColor(R.color.colorPrimaryDark)
                    confirm_mission(v,1)

                }
                R.id.tv3 -> {
//                    tv3.text = "กดแชร์วิดิโอ 1 ครั้ง"
//                    tv3.setBackgroundResource(R.drawable.ci_bg)
//                    tv3.setTextColor(R.color.colorPrimaryDark)
                    confirm_mission(v,2)

                }
                R.id.tv4 -> {
//                    tv4.text = "กดแชร์วิดิโอ 1 ครั้ง"
//                    tv4.setBackgroundResource(R.drawable.ci_bg)
//                    tv4.setTextColor(R.color.colorPrimaryDark)
                    confirm_mission(v,3)

                }
                R.id.tv5 -> {
//                    tv5.text = "ดูวิดิโอ 2 ครั้ง"
//                    tv5.setBackgroundResource(R.drawable.ci_bg)
//                    tv5.setTextColor(R.color.colorPrimaryDark)
                    confirm_mission(v,4)

                }
                R.id.tv6 -> {
//                    tv6.text = "ดูวิดิโอ 2 ครั้ง"
//                    tv6.setBackgroundResource(R.drawable.ci_bg)
//                    tv6.setTextColor(R.color.colorPrimaryDark)
                    confirm_mission(v,5)

                }
                R.id.tv7 -> {
//                    tv7.text = "กดไลค์ 5 ครั้ง"
//                    tv7.setBackgroundResource(R.drawable.ci_bg)
//                    tv7.setTextColor(R.color.colorPrimaryDark)
                    confirm_mission(v,6)

                }
                R.id.tv8 -> {
//                    tv8.text = "กดแชร์วิดิโอ 1 ครั้ง"
//                    tv8.setBackgroundResource(R.drawable.ci_bg)
//                    tv8.setTextColor(R.color.colorPrimaryDark)
                    confirm_mission(v,7)

                }
                R.id.tv9 -> {
//                    tv9.text = "กดไลค์ 5 ครั้ง"
//                    tv9.setBackgroundResource(R.drawable.ci_bg)
//                    tv9.setTextColor(R.color.colorPrimaryDark)
                    confirm_mission(v,8)

                }
            }
        }
    }

    @SuppressLint("WrongConstant", "ResourceType")
    private fun confirm_mission(v: View?, i: Int) {
        val builder = AlertDialog.Builder(this)
//        println(myMission[i])
        builder.setMessage(myMission[i])

//        builder.setMessage(R.string.dialog_mission)
        builder.setPositiveButton(R.string.dialog_confirm, DialogInterface.OnClickListener { dialog, id ->
//            val intent = Intent(this, Main2Activity::class.java)
//            startActivity(intent)
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

    private fun initHideKeyboard(touchInterceptor: RelativeLayout) {
        touchInterceptor.setOnTouchListener { v, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                setHideKeyboard(EtRandom, v, event)

            }
            false
        }
    }

    private fun setHideKeyboard(editText: EditText, v: View, event: MotionEvent) {
        if (editText.isFocused) {
            val outRect = Rect()
            editText.getGlobalVisibleRect(outRect)
            if (!outRect.contains(event.rawX.toInt(), event.rawY.toInt())) {
                editText.clearFocus()
                val imm = v.context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(v.windowToken, 0)
            }
        }
    }


}