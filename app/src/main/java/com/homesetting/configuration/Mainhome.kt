package com.homesetting.configuration

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import com.google.firebase.database.FirebaseDatabase
import com.homesetting.configuration.databinding.ActivityMainBinding
import com.homesetting.configuration.databinding.ActivityMainhomeBinding

class Mainhome : AppCompatActivity() {
    private lateinit var binding:ActivityMainhomeBinding
    private lateinit var player: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainhomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.settingButton.setOnClickListener { onsettingButtonTapped(it) }
        binding.motionButton.setOnClickListener { onmotionButtonTapped(it) }
        binding.kcalButton.setOnClickListener { onkcalButtonTapped(it) }
        player = MediaPlayer.create(this,R.raw.getdown)
        player.isLooping = true
        val database = FirebaseDatabase.getInstance()
        val ref = database.getReference("hogehoge")
        val buttonWrite = findViewById<ImageButton>(R.id.motionButton)

        buttonWrite.setOnClickListener {
            ref.setValue("fugafuga")
        }
    }
    override fun onResume() {
        super.onResume()
        player.start()
    }

    override fun onPause() {
        super.onPause()
        player.pause()
    }
    fun onsettingButtonTapped(view: View?){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    fun onmotionButtonTapped(view: View?) {
        val intent = Intent(this, MotionActivity::class.java)
        startActivity(intent)
    }
    fun onkcalButtonTapped(view: View?) {
        val intent = Intent(this, MaintestActivity::class.java)
        startActivity(intent)
    }
}