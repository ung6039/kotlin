package com.sist.kotlinfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn:Button = findViewById(R.id.button2)
        val text:TextView = findViewById(R.id.textView)
        val edit:EditText = findViewById(R.id.nameTest)

        btn.setOnClickListener({
            var name=edit.text
            text.setText(name)
        })
    }
}