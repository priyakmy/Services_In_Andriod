package com.example.alarmmanager

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            // Call setAlarm() when the button is clicked
            AlarmScheduler.setAlarm(this, 10000) // Trigger after 10 seconds (adjust time as needed)
        }

    }
}
