package com.in8.conversordemoedas.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.in8.conversordemoedas.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar!!.hide()
    }
}
