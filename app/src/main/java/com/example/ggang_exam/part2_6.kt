package com.example.ggang_exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.Toast

class part2_6 : AppCompatActivity(), View.OnClickListener,CompoundButton.OnCheckedChangeListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_part2_6)

    }
    fun showToast(message : String){
        val toast = Toast.makeText(this, message, Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun onClick(v: View?) {
        if(v==bellTextView){
            showToast("bell text Click event..")
        }
        else if(v==labelTextView){
            showToast("label text click event..")
        }
    }

    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        if(buttonView==repeatCheckView){
            showToast("repeat checkbox is $isChecked")
        }
        else if(buttonView==vibrateCheckView){
            showToast("vibrate checkbox is $isChecked")
        }
        else if(buttonView==switchView){
            showToast("switch is $isChecked")
        }
    }
}