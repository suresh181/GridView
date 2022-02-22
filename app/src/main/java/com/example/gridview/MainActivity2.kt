package com.example.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gridview.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val msg = intent.getStringExtra("name")

        binding.tvText.text = msg
    }
}