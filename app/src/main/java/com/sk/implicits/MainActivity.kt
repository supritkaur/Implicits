package com.sk.implicits

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnsms: Button
    lateinit var btndialer: Button
    lateinit var btnshare: Button
    lateinit var btnrating: Button
    lateinit var btnurl: Button
    lateinit var btnemail: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnrating = findViewById(R.id.btnrating)
        btnemail = findViewById(R.id.btnemail)
        btnshare = findViewById(R.id.btnshare)
        btnurl = findViewById(R.id.btnurl)
        btnsms = findViewById(R.id.btnsms)
        btndialer = findViewById(R.id.btndialer)

        btnurl.setOnClickListener {
            System.out.println(" Clicked")
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.google.com/")
            startActivity(intent)
        }
        btnrating.setOnClickListener {
            System.out.println(" Clicked")
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://play.google.com")
            startActivity(intent)
        }
        btndialer.setOnClickListener {
            System.out.println(" Clicked")
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("tel:" + "9999922222")
            startActivity(intent)
        }
        btnemail.setOnClickListener {
            System.out.println(" Clicked")
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("mailto:abc@gmail.com")
            startActivity(intent)
        }
        btnshare.setOnClickListener {
            System.out.println(" Clicked")
            val intent = Intent(Intent.ACTION_SEND)
            intent.setType("text/plain")
            intent.putExtra(Intent.EXTRA_TEXT,"hi");
            startActivity(intent)
        }
        btnsms.setOnClickListener {
            System.out.println(" Clicked")
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("sms:"+"9999922222")
            startActivity(intent)
        }
    }
}
