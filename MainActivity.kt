package com.example.multiscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    /* making key to use anywhere in the code, so static declare krdo but static nhi hota to use
       companion object
     */

    //creating key, generally key remains constant
    companion object{
        const val KEY = "com.example.multiscreenapp.MainActivity.KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickBtn = findViewById<Button>(R.id.btnOrder)
        val c1 = findViewById<TextView>(R.id.et1)
        val c2 = findViewById<TextView>(R.id.et2)
        val c3 = findViewById<TextView>(R.id.et3)
        val c4 = findViewById<TextView>(R.id.et4)

        clickBtn.setOnClickListener {

            //saving user's order in message
          val ordersPlaced = c1.text.toString() + " " + c2.text.toString() + " " +
                        c3.text.toString() + " " + c4.text.toString()

              //making explicit intent
            intent = Intent(this,showOrder::class.java)

            //give key value pair in this method
            intent.putExtra(KEY,ordersPlaced)

            startActivity(intent)

        }

    }
}