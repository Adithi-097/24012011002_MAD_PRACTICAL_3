package com.example.a24012011002_mad_practical_3

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        implicitintent()
        explicitintent()
    }

    fun implicitintent() {

        findViewById<Button>(R.id.btnBrowse).setOnClickListener {
            Intent(Intent.ACTION_VIEW, Uri.parse(findViewById<EditText>(R.id.etWeb).text.toString())).also {
                startActivity(it)
            }
        }

        findViewById<Button>(R.id.btnCallLog).setOnClickListener {
            Intent(Intent.ACTION_VIEW, Uri.parse("content://call_log/calls")).also {
                startActivity(it)
            }
        }

        findViewById<Button>(R.id.btnGallery).setOnClickListener {
            Intent(Intent.ACTION_VIEW).setType("image/*").also {
                startActivity(it)
            }
        }

        findViewById<Button>(R.id.btnCamera).setOnClickListener {
            Intent(MediaStore.ACTION_IMAGE_CAPTURE).also {
                startActivity(it)
            }
        }

        findViewById<Button>(R.id.btnAlarm).setOnClickListener {
            Intent(AlarmClock.ACTION_SET_ALARM).also {
                startActivity(it)
            }
        }

        findViewById<Button>(R.id.btnCall).setOnClickListener {
            Intent(Intent.ACTION_DIAL,
                Uri.parse("tel:${findViewById<EditText>(R.id.etPhone).text.toString()}")).also {
                startActivity(it)
            }
        }
    }


    fun explicitintent() {

        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            Intent(this, LoginActivity::class.java).also {
                startActivity(it)
            }
        }
    }

}