package com.example.ggang_exam

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class Dialog : AppCompatActivity(), View.OnClickListener{


    var customDialog : AlertDialog
    var listDialog
    var alertDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)
        val alertBtn : Button =findViewById(R.id.btn_alert)
        val listBtn : Button =findViewById(R.id.btn_list)
        val dateBtn : Button =findViewById(R.id.btn_date)
        val timeBtn : Button =findViewById(R.id.btn_time)
        val customDialogBtn : Button =findViewById(R.id.btn_custom)

        alertBtn.setOnClickListener(this)
        listBtn.setOnClickListener(this)
        dateBtn.setOnClickListener(this)
        timeBtn.setOnClickListener(this)
        customDialogBtn.setOnClickListener(this)
    }

    fun showToast(message : String){
        var toast = Toast.makeText(this,message,Toast.LENGTH_SHORT)
        toast.show()
    }


    override fun onClick(v: View?) {

    }
}