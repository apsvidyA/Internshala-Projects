package com.vidya.foodrunner

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.view.*
import org.w3c.dom.Text

class LoginActivity : AppCompatActivity() {
    lateinit var etPhone : EditText
    lateinit var etPass : EditText
    lateinit var btnLogin : Button
    lateinit var txtForgotPass :TextView
    lateinit var txtRegister : TextView

    val validMobileNumber = "987654321"

    val validPassword = arrayOf("abcd","1234","qwer1234","normal")
    lateinit var username :String

    lateinit var sharedPreferences: SharedPreferences




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etPhone = findViewById(R.id.etPhone)
        etPass = findViewById(R.id.etPass)
        btnLogin = findViewById(R.id.btnLogin)
        txtForgotPass = findViewById(R.id.txtForgotPass)
        txtRegister = findViewById(R.id.txtRegister)

        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)





        btnLogin.setOnClickListener {
            var mobileNumber = etPhone.text.toString()
            var password = etPass.text.toString()

            var intent = Intent(this@LoginActivity, UserActivity::class.java)

            if (mobileNumber == validMobileNumber) {
                when (password) {
                    validPassword[0] -> {
                        username = "Steve Jobs"
                        savePreference(username, mobileNumber)
                        startActivity(intent)
                        finish()
                    }

                    validPassword[1] -> {
                        username = "Mark Zuckerberg"
                        savePreference(username, mobileNumber)
                        startActivity(intent)
                        finish()
                    }

                    validPassword[2] -> {
                        username = "Bill Gates"
                        savePreference(username, mobileNumber)
                        startActivity(intent)
                        finish()
                    }

                    validPassword[3] -> {
                        username = "Normal User"
                        savePreference(username, mobileNumber)
                        startActivity(intent)
                        finish()
                    }
                }
            }
            else{
                Toast.makeText(this@LoginActivity,"Invalid Credentials",Toast.LENGTH_SHORT).show()
            }
        }

        txtForgotPass.setOnClickListener {
            var intent = Intent( this@LoginActivity,ForgotPassword::class.java)
            startActivity(intent)

        }

        txtRegister.setOnClickListener {
            var intent = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(intent)

        }

    title = "Log In"

    }

    fun savePreference(username: String,mobile : String){
        sharedPreferences.edit().putString("UserName",username).apply()
        sharedPreferences.edit().putString("MobileNumber",mobile).apply()
    }
}
