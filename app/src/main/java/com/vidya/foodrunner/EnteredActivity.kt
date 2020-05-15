package com.vidya.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class EnteredActivity : AppCompatActivity() {

    lateinit var displayMobile :TextView
    lateinit var displayEmail: TextView

      var mobile : String = "No number entered"
      var email :String = "no Email Entered"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entered)



        if(intent != null){
            mobile = intent.getStringExtra("MobileNumber")
            email = intent.getStringExtra("EmailAddress")
        }

        displayMobile = findViewById(R.id.txtDisplayMobile)
        displayEmail = findViewById(R.id.txtDisplayEmail)

        displayMobile.text = "Entered Mobile Number is $mobile"
        displayEmail.text = "Entered Email Address is $email"


    }
}
