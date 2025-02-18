package com.example.broadcast_in_android

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Settings

class AirplaneModeReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == Intent.ACTION_AIRPLANE_MODE_CHANGED) {
            val isAirplaneModeOn = Settings.Global.getInt(
                    context?.contentResolver,
                    Settings.Global.AIRPLANE_MODE_ON, 0
            ) != 0
            if (isAirplaneModeOn) {
                println("Airplane mode turned on")
            } else {
                println("Airplane mode turned off")
            }
        }
    }
}

