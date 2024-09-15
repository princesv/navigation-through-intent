package com.example.navigationusingintent

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.navigationusingintent.ui.theme.NavigationUsingIntentTheme
import com.example.navigationusingintent.utils.Constants

class MainActivity : ComponentActivity() {
    lateinit var buttonNextActivity: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonNextActivity=findViewById(R.id.go_to_greeting)
        buttonNextActivity.setOnClickListener(View.OnClickListener {
            startNewActivity()
        })
    }
    fun startNewActivity(){
        startActivity(Intent(this,GreetingActivity::class.java).apply{
            putExtra(Constants.NAME_TAG,"Prince")
        })
    }
}
