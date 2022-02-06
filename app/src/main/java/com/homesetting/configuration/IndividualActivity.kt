package com.homesetting.configuration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.homesetting.configuration.databinding.ActivityIndividualBinding

class IndividualActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIndividualBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIndividualBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton2.setOnClickListener { finish() }
    }
}