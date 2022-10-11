package com.example.cv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)




        val btn : Button = findViewById(R.id.NEXT)
        btn.setOnClickListener {
            verification()

        }
    }
        fun verification() : Boolean
        {
            val FN : EditText = findViewById(R.id.fntxt)
            val email : EditText = findViewById(R.id.temail)
            val age : EditText = findViewById(R.id.tage)
            val homme : RadioButton = findViewById(R.id.radhomme)
            val femme : RadioButton = findViewById(R.id.radfemme)
            var sFullname = FN.getText().toString();
            var sage = age.getText().toString();
            var semail = email.getText().toString().trim();
            val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
            if(sFullname.isEmpty())
            {
                FN.error = getString(R.string.empty)
                return false
            }
            if (semail.matches(emailPattern.toRegex())) {
            } else {
                email.error = getString(R.string.email)
                return false
            }
            if(sage.isEmpty())
            {
                age.error = getString(R.string.empty)
                return false
            }
            var sendFullname=FN.getText().toString()
            var sendEmail =semail
            var sendAge =   sage
            var sendGender = ""
            if(homme.isChecked)
            {
                sendGender="homme"
            }
            else
            {
                sendGender="femme"
            }
            val intent = Intent(this,SKillsActivity::class.java).apply {
                putExtra("fullname", sendFullname)
                putExtra("email", sendEmail)
                putExtra("age", sendAge)
                putExtra("gender",sendGender)

            }
            startActivity(intent)
            return true
        }

}
