package com.vidya.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {

    lateinit var etRegName : EditText
    lateinit var etRegEmail :EditText
    lateinit var etRegMobile : EditText
    lateinit var etRegAddress : EditText
    lateinit var etRegPassword: EditText
    lateinit var etRegConfirmPassword : EditText
    lateinit var btnRegister : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etRegName = findViewById(R.id.etRegName)
        etRegEmail =findViewById(R.id.etRegEmail)
        etRegMobile = findViewById(R.id.etRegMobile)
        etRegAddress = findViewById(R.id.etRegAddress)
        etRegPassword = findViewById(R.id.etRegPassword)
        etRegConfirmPassword = findViewById(R.id.etRegConfirmPassword)
        btnRegister = findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener {
            var name = etRegName.text.toString()
            var email = etRegEmail.text.toString()
            var mobile = etRegMobile.text.toString()
            var address = etRegAddress.text.toString()
            var password = etRegPassword.text.toString()
            var confirmPassword = etRegConfirmPassword.text.toString()

            if(password == confirmPassword){
                var intent = Intent(this@RegisterActivity,DisplayRegister::class.java)
                intent.putExtra("Name",name)
                intent.putExtra("MobileNumber",mobile)
                intent.putExtra("EmailAddress",email)
                intent.putExtra("Address",address)
                startActivity(intent)
                finish()
            }
            else{
                Toast.makeText(this@RegisterActivity,"Password does not match",Toast.LENGTH_SHORT).show()
            }
        }
        title ="Register Yourself"
    }
}
