package com.learn.demoapplication

import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.TaskStackBuilder
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import android.widget.Button

class MainActivity6 : AppCompatActivity() {

    val CHANNEL_ID = "channelid"
    val CHANNEL_NAME = "channelname"
    val NOTIF_ID = 0

    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        createNotifChannel()

        val notif = NotificationCompat.Builder(this,CHANNEL_ID)
            .setContentTitle("Sample Title")
            .setContentText("This is sample body notif")
            .setSmallIcon(R.drawable.ic_baseline_info_24)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .build()

        val notifManger = NotificationManagerCompat.from(this)

        val btnShowNotif:Button = findViewById(R.id.btnShowNotif)

        btnShowNotif.setOnClickListener(){
            notifManger.notify(NOTIF_ID,notif)
        }
    }

    private fun createNotifChannel(){
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.O){
            val channel = NotificationChannel(CHANNEL_ID,CHANNEL_NAME,NotificationManager.IMPORTANCE_DEFAULT).apply {
                lightColor = Color.BLUE
                enableLights(true)
            }

            val manager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            manager.createNotificationChannel(channel)
        }
    }
}