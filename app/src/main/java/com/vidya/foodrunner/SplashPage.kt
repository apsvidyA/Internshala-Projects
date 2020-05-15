package com.vidya.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashPage : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Handler().postDelayed({
            var intent = Intent(this@SplashPage,LoginActivity::class.java)
            startActivity(intent)
            finish()
        },2000)


    }
}
