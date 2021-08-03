package com.example.userintraction2

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text1: TextView = findViewById(R.id.Area1)
        val text2: TextView = findViewById(R.id.Area2)
        val text3: TextView = findViewById(R.id.Area3)
        val text4: TextView = findViewById(R.id.Area4)
        val text5: TextView = findViewById(R.id.Area5)
        val text6: TextView = findViewById(R.id.Area6)
        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)
        val btn3: Button = findViewById(R.id.Pink)
        val btn4: Button = findViewById(R.id.Yellow)
        val btn5: Button = findViewById(R.id.White)
        val btn6: Button = findViewById(R.id.Purple)
        btn1.setOnClickListener {
            btn1.setBackgroundColor(Color.RED)
            text1.setBackgroundColor(Color.RED)
            text2.setBackgroundColor(Color.RED)
            text3.setBackgroundColor(Color.RED)
            text4.setBackgroundColor(Color.RED)
            text5.setBackgroundColor(Color.RED)
            text6.setBackgroundColor(Color.RED)
            }
        btn2.setOnClickListener {
            btn2.setBackgroundColor(Color.GREEN)
            text1.setBackgroundColor(Color.GREEN)
            text2.setBackgroundColor(Color.GREEN)
            text3.setBackgroundColor(Color.GREEN)
            text4.setBackgroundColor(Color.GREEN)
            text5.setBackgroundColor(Color.GREEN)
            text6.setBackgroundColor(Color.GREEN)
        }
        btn3.setOnClickListener {
            btn3.setBackgroundColor(Color.GRAY)
            text1.setBackgroundColor(Color.GRAY)
            text2.setBackgroundColor(Color.GRAY)
            text3.setBackgroundColor(Color.GRAY)
            text4.setBackgroundColor(Color.GRAY)
            text5.setBackgroundColor(Color.GRAY)
            text6.setBackgroundColor(Color.GRAY)
        }
        btn4.setOnClickListener {
            btn4.setBackgroundColor(Color.YELLOW)
            text1.setBackgroundColor(Color.YELLOW)
            text2.setBackgroundColor(Color.YELLOW)
            text3.setBackgroundColor(Color.YELLOW)
            text4.setBackgroundColor(Color.YELLOW)
            text5.setBackgroundColor(Color.YELLOW)
            text6.setBackgroundColor(Color.YELLOW)
        }
        btn5.setOnClickListener {
            btn5.setBackgroundColor(Color.WHITE)
            text1.setBackgroundColor(Color.WHITE)
            text2.setBackgroundColor(Color.WHITE)
            text3.setBackgroundColor(Color.WHITE)
            text4.setBackgroundColor(Color.WHITE)
            text5.setBackgroundColor(Color.WHITE)
            text6.setBackgroundColor(Color.WHITE)
        }
        btn6.setOnClickListener {
            btn6.setBackgroundColor(Color.MAGENTA)
            text1.setBackgroundColor(Color.MAGENTA)
            text2.setBackgroundColor(Color.MAGENTA)
            text3.setBackgroundColor(Color.MAGENTA)
            text4.setBackgroundColor(Color.MAGENTA)
            text5.setBackgroundColor(Color.MAGENTA)
            text6.setBackgroundColor(Color.MAGENTA)
        }




    }
}
