package com.example.filleword

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setTheme(R.style.myStyle)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun gameButton(view: View) {
        val intent:Intent = Intent(this@MainActivity, GameActivity::class.java)
        startActivity(intent)
    }
}