package com.example.servicesinandroidstudio

import android.app.Notification
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class NotificationDisplay : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification_display)

        Notification.createNotificationChannel(this)

        scheduleNotification.setOnClickListener( scheduleNotification()) {
            //scheduleNotification()
        }
    }

    private fun scheduleNotification() {
        // Set the time when the notification should appear
        val calendar = Calendar.getInstance()
        calendar.add(Calendar.SECOND, 10) // Notification will appear after 10 seconds

        // Title and message for the notification
        val title = "Notification Title"
        val message = "This is a scheduled notification"

        // Schedule the notification
        NotificationScheduler.scheduleNotification(
                this,
                calendar.timeInMillis,
                title,
                message
        )

        }
    }
