package com.example.aditya_practical2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    private fun showmessge(msg:String){
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        showmessge("On start is called")
    }

    override fun onResume() {
        super.onResume()
        showmessge("On resume is called")

    }

    override fun onPause() {
        super.onPause()
        showmessge("On pause is called")
    }

    override fun onStop() {
        super.onStop()
        showmessge("On stop is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        showmessge("On destroy is called")
    }
}