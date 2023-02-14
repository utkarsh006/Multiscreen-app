package com.example.multiscreenapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class showOrder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_order)

        val ordersOfCustomer = intent.getStringExtra(MainActivity.KEY)

        val click = findViewById<TextView>(R.id.tvOrder)
        click.text = ordersOfCustomer.toString()
    }
}