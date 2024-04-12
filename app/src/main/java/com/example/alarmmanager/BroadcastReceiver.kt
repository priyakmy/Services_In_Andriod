package com.example.alarmmanager

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
import android.app.AlarmManager
import android.app.PendingIntent

class AlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent)
    {

        //  called when the BroadcastReceiver is receiving an Intent broadcast.
        Toast.makeText(context , "Alarm Triggered!" , Toast.LENGTH_SHORT).show()


    }
}
