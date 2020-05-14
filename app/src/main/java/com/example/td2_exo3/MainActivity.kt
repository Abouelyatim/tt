package com.example.td2_exo3

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.td2_exo3.MyService.Companion.mediaPlayer
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        stop_azan.setOnClickListener {
            mediaPlayer.stop()
        }

    }

    fun startService(v: View?) {

        val serviceIntent = Intent(this, MyService::class.java)
        ContextCompat.startForegroundService(this, serviceIntent)
    }

    fun stopService(v: View?) {



        val serviceIntent = Intent(this, MyService::class.java)
        stopService(serviceIntent)
    }
}
