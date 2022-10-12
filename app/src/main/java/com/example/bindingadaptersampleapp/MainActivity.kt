package com.example.bindingadaptersampleapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bindingadaptersampleapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = DataModel(
            "Test Title",
            "Test description",
            "https://picsum.photos/id/237/400",
            12
        )

        binding.dataModel = data
    }
}
