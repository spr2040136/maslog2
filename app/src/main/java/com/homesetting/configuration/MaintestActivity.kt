package com.homesetting.configuration


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.homesetting.configuration.databinding.ActivityMaintestBinding

class MaintestActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMaintestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMaintestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton2.setOnClickListener { onbackButton2Tapped(it) }
    }
    fun onbackButton2Tapped(view: View?) {
        val intent = Intent(this, Mainhome::class.java)
        startActivity(intent)
    }
}