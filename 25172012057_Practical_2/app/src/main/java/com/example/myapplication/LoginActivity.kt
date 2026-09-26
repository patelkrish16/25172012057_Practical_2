package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    private val TAG = "LoginActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        display("onCreate method is called")
    }

    override fun onStart() {
        super.onStart()
        display("onStart method is called")
    }

    override fun onResume() {
        super.onResume()
        display("onResume method is called")
    }

    override fun onPause() {
        display("onPause method is called")
        super.onPause()
    }

    override fun onStop() {
        display("onStop method is called")
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
        display("onRestart method is called")
    }

    override fun onDestroy() {
        display("onDestroy method is called")
        super.onDestroy()
    }

    private fun display(msg: String) {
        Log.i(TAG, msg)
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }
}
