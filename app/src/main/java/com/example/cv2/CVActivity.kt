package com.example.cv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CVActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cvactivity)




        var bundle :Bundle ?=intent.extras
        var fullname = bundle!!.getString("fullname")
        var email = bundle!!.getString("email")
        var age = bundle!!.getString("age")
        var gender = bundle!!.getString("gender")
        var android = bundle!!.getString("android")
        var ios = bundle!!.getString("ios")
        var flutter = bundle!!.getString("flutter")
        var Language = bundle!!.getString("Language")
        var hobbies = bundle!!.getString("hobbies")



        val tname : TextView = findViewById(R.id.tXTname)
        tname.setText("FULLName : "+fullname)

        val temail : TextView = findViewById(R.id.txtemail)
        temail.setText("Email : "+email)
        val tfage : TextView = findViewById(R.id.textage)
        tfage.setText("Age : "+age)
        val tfgender : TextView = findViewById(R.id.txtgender)
        tfgender.setText("Gender : "+gender)
        val tfandroid : TextView = findViewById(R.id.textandroid)
        tfandroid.setText("Android : "+android)
        val tfios : TextView = findViewById(R.id.textios)
        tfios.setText("IOS : "+ios)
        val tflutter : TextView = findViewById(R.id.textflutter)
        tflutter.setText("FLUTTER : "+flutter)
        val tflan : TextView = findViewById(R.id.lang)
        tflan.setText("languages : "+Language)
        val tfhobbies : TextView = findViewById(R.id.hobb)
        tfhobbies.setText("hobbies : "+hobbies)
    }
}