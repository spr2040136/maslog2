package com.homesetting.configuration

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.homesetting.configuration.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.informationchangeButton.setOnClickListener { oninformationchangeButtonTapped(it) }
        binding.mailchangeButton.setOnClickListener { onmailchangeButtonTapped(it) }
        binding.passwordchangeButton.setOnClickListener { onpasswordchangeButtonTapped(it) }
        binding.homeButton.setOnClickListener { onhomeButtonTapped(it) }

    }







    fun oninformationchangeButtonTapped(view: View?) {
        val intent = Intent(this, IndividualActivity::class.java)
        startActivity(intent)
    }

    fun onmailchangeButtonTapped(view: View?) {
        val intent = Intent(this, MailActivity::class.java)
        startActivity(intent)
    }
    fun onpasswordchangeButtonTapped(view: View?) {
        val intent = Intent(this, PasswordActivity::class.java)
        startActivity(intent)
    }
    fun onhomeButtonTapped(view: View?) {
        val intent = Intent(this, Mainhome::class.java)
        startActivity(intent)
    }



}