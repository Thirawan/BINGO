package com.example.noobfahh.bingo

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
    var count: Int? = 0
    var countshare:Int?=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        like.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                count = count!! + 1
                if (count == 1) {
                    toast(" First Like")
                } else {
                    Toast("" + count)
                }
            }
        })
        share.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                countshare = countshare!! + 1
                if (countshare==1){
                    toastShare("First Share")
                } else if(countshare!=1){
                    ToastShare(""+countshare)
                    if (countshare == 2) {
                        val builder = AlertDialog.Builder(this@Main2Activity)
                        builder.setMessage("ยินดีด้วยคุณทำ Mission สำเร็จแล้ว")
                        builder.setPositiveButton("ตกลง") { dialog, id ->
                            val intent = Intent(this@Main2Activity,MainActivity::class.java)
                            startActivity(intent)
                        }
                        builder.setNegativeButton("ยกเลิก") { dialog, which ->
                            //dialog.dismiss();
                        }
                        builder.show()
                    }

                }
            }
        })

    }
    private fun confirm_mission(v: View?) {
        val builder = AlertDialog.Builder(this)
        builder.setMessage(R.string.dialog_mission)
//        builder.setMessage("fffff")
        builder.setPositiveButton(R.string.dialog_confirm, DialogInterface.OnClickListener { dialog, id ->
            val intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
//            if (v != null) {
//                v.setBackgroundResource(R.drawable.ic_finish)
//                v.isEnabled = false
//            }
        })
        builder.setNegativeButton(R.string.dialog_cancel, DialogInterface.OnClickListener { dialog, which ->
            dialog.dismiss();
        })
        builder.show()
    }

    fun toastShare(message: String) = android.widget.Toast.makeText(this,message, android.widget.Toast.LENGTH_SHORT).show()
    fun ToastShare(message: String) = android.widget.Toast.makeText(this,message, android.widget.Toast.LENGTH_SHORT).show()

    //
    fun toast(message: String) = android.widget.Toast.makeText(this, message, android.widget.Toast.LENGTH_SHORT).show()

    fun Toast(message: String) = android.widget.Toast.makeText(this, message, android.widget.Toast.LENGTH_SHORT).show()


}
