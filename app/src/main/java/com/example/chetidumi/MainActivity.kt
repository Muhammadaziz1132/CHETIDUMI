package com.example.chetidumi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chetidumi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.webView.loadUrl("https://www.google.com/search?q=chetidumi.uz&source=lmns&bih=902&biw=1920&hl=ru&sa=X&ved=2ahUKEwjZmaqY5aD7AhXIQt4KHda-CVIQ_AUoAHoECAEQAA")
    }
}
