package com.vidya.foodrunner

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class UserActivity : AppCompatActivity() {

    lateinit var txtUserName :TextView
    lateinit var txtUserMobile: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        var sharedPreferences:SharedPreferences = getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)

        var username = sharedPreferences.getString("UserName","User")
        var number = sharedPreferences.getString("MobileNumber","0000000")

        txtUserName = findViewById(R.id.txtUserName)
        txtUserMobile = findViewById(R.id.txtUserMobile)

        txtUserName.text = "Hello $username"
        txtUserMobile.text = "Your entered number is $number"

        title = username
    }
}
