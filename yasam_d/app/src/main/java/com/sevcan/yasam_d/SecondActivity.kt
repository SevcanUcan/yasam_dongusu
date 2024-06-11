package com.sevcan.yasam_d

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("mytag", "SecondActivity : onCreate")
        setContentView(R.layout.activity_second)

        val userName = intent.getStringExtra("USER")
        val textView = findViewById<TextView>(R.id.tvOffer)
        val message = if (userName != null) {
            "$userName, you will get free access to all the content for one month"
        } else {
            "User name is missing"
        }
        textView.text = message
    }

    override fun onStart() {
        super.onStart()
        Log.i("mytag", "SecondActivity : onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("mytag", "SecondActivity : onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("mytag", "SecondActivity : onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("mytag", "SecondActivity : onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("mytag", "SecondActivity : onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("mytag", "SecondActivity : onRestart")
    }
}
