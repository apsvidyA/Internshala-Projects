package com.vidya.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ForgotPassword : AppCompatActivity() {
    lateinit var etForgotMobile : EditText
    lateinit var etForgotEmail : EditText
    lateinit var btnNext : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)



        etForgotMobile = findViewById(R.id.etForgotMobile)
        etForgotEmail = findViewById(R.id.etForgotEmail)
        btnNext = findViewById(R.id.btnNext)


        btnNext.setOnClickListener {
            var phone = etForgotMobile.text.toString()
            var email = etForgotEmail.text.toString()

            var intent = Intent(this@ForgotPassword,EnteredActivity::class.java)

            intent.putExtra("MobileNumber",phone)
            intent.putExtra("EmailAddress",email)

            startActivity(intent)
            finish()

        }

    }
}
