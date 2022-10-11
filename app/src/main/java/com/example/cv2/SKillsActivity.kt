package com.example.cv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import com.google.android.material.slider.Slider

class SKillsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)

        val sub : Button = findViewById(R.id.BTNSKILL)
        sub.setOnClickListener {
            Submit()
        }
    }

    fun Submit () : Boolean
    {
        var valueAndroid = null
        var valueIos = null
        var valueFlutter = null
        var language =""
        var hobb = ""

        val Android : Slider = findViewById<Slider>(R.id.seekandroid)
        val ios : Slider = findViewById<Slider>(R.id.seekios)
        val flutter : Slider = findViewById<Slider>(R.id.seekflutter)


        val arabic : CheckBox = findViewById(R.id.checkboxarabic)
        val french : CheckBox = findViewById(R.id.checkboxfrench)
        val english : CheckBox = findViewById(R.id.checkboxenglish)


        val music : CheckBox = findViewById(R.id.checkboxmusic)
        val sport : CheckBox = findViewById(R.id.checkboxsport)
        val games : CheckBox = findViewById(R.id.checkboxgames)





        if(arabic.isChecked)
        {
            language += " Arabic"
        }
        if(french.isChecked)
        {
            language += " French"
        }
        if(english.isChecked)
        {
            language += " English"
        }
        if(!arabic.isChecked && !french.isChecked && !english.isChecked)
            return  false



        if(music.isChecked)
        {
            hobb += " Music"
        }
        if(sport.isChecked)
        {
            hobb += " Sport"
        }
        if(games.isChecked)
        {
            hobb += " Games"
        }
        if(!music.isChecked && !sport.isChecked && !games.isChecked)
            return  false



        var bundle :Bundle ?=intent.extras

        var fullname = bundle!!.getString("fullname")
        var email = bundle!!.getString("email")
        var age = bundle!!.getString("age")
        var gender = bundle!!.getString("gender")



        val intent = Intent(this,CVActivity::class.java).apply {
            putExtra("fullname", fullname)
            putExtra("email", email)
            putExtra("age", age)
            putExtra("gender",gender)
            putExtra("Android",valueAndroid.toString())
            putExtra("Ios",valueIos.toString())
            putExtra("Flutter",valueFlutter.toString())
            putExtra("Language",language)
            putExtra("hobbies",hobb)
        }
        startActivity(intent)
        return true
    }
}