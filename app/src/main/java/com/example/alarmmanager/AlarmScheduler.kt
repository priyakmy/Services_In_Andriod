package com.example.alarmmanager

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent

object AlarmScheduler {
    fun setAlarm(context: Context, delayInMillis: Long) {
        val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
        val alarmIntent = Intent(context, AlarmReceiver::class.java)
        val pendingIntent = PendingIntent.getBroadcast(context, 0, alarmIntent, 0)

        // Set the alarm
        alarmManager.setExact(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + delayInMillis, pendingIntent)
    }
}
