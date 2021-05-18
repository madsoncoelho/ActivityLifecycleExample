package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("Lifecycle", "onCreate was called.")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Lifecycle", "onStart was called.")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Lifecycle", "onResume was called.")
    }

    override fun onPause() {
        Log.i("Lifecycle", "onPause was called.")
        super.onPause()
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Lifecycle", "onRestart was called.")
    }

    override fun onStop() {
        Log.i("Lifecycle", "onStop was called.")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i("Lifecycle", "onDestroy was called.")
        super.onDestroy()
    }
}