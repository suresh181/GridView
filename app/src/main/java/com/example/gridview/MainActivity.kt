package com.example.gridview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.gridview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    val title = arrayOf(
        "MS Dhoni",
        "Suresh Raina",
        "Moeen Ali",
        "Ravindra Jadeja",
        "Dwayne Bravo",
        "C Hari Nishaanth",
        "Sam Curran",
        "Robin Uthappa",
        "Ruturaj Gaikwad",
        "Ambati Rayudu",
        "Narayan Jagadeesan"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,title)
        binding.gridView.adapter = arrayAdapter

        binding.gridView.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("name",title[position])
            startActivity(intent)

        }
    }
}