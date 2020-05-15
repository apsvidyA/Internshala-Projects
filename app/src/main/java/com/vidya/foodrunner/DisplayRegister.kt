package com.vidya.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayRegister : AppCompatActivity() {

    lateinit var txtDetails : TextView
    lateinit var name : String
    lateinit var mobile : String
    lateinit var email : String
    lateinit var Address: String

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_register)

        txtDetails = findViewById(R.id.txtDetails)

        if(intent != null){
            name = intent.getStringExtra("Name")
            mobile = intent.getStringExtra("MobileNumber")
            email = intent.getStringExtra("EmailAddress")
            Address = intent.getStringExtra("Address")
        }

        txtDetails.text = "Name : $name \nMobileNumber: $mobile\nEmail Address : $email\nDelivery Address : $Address\n"


    }
}
