package com.sevcan.yasam_d

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }

    private lateinit var lifecycleTextView: TextView
    private lateinit var scrollView: ScrollView
    private lateinit var offerButton: Button
    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("mytag", "MainActivity : onCreate")
        setContentView(R.layout.activity_main)

        lifecycleTextView = findViewById(R.id.lifecycle_text)
        scrollView = findViewById(R.id.scroll_view)
        offerButton = findViewById(R.id.offer_button)
        editText = findViewById(R.id.edit_text)

        offerButton.setOnClickListener {
            val enteredName = editText.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("USER", enteredName)
            startActivity(intent)
        }
    }
    override fun onStart() {
        super.onStart()
        Log.i("mytag", "MainActivity : onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("mytag", "MainActivity : onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("mytag", "MainActivity : onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("mytag", "MainActivity : onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("mytag", "MainActivity : onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("mytag", "MainActivity : onRestart")
    }
}
