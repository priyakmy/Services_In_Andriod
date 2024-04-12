package com.example.servicesinandroidstudio

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationCompat

class NotificationPublisher : BroadcastReceiver() {

    companion object {
        const val NOTIFICATION_TITLE = "title"
        const val NOTIFICATION_MESSAGE = "message"
    }

    override fun onReceive(context: Context, intent: Intent) {
        val title = intent.getStringExtra(NOTIFICATION_TITLE)
        val message = intent.getStringExtra(NOTIFICATION_MESSAGE)

        // Show notification
        NotificationUtils.showNotification(context, title!!, message!!)
    }
}
