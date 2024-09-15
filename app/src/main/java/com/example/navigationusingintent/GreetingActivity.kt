package com.example.navigationusingintent

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.navigationusingintent.utils.Constants

class GreetingActivity : AppCompatActivity() {
    lateinit var nametv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)
        nametv=findViewById(R.id.greeting_text)
        val name=intent.getStringExtra(Constants.NAME_TAG)
        nametv.setText(name)
    }
}