package com.ncorti.kotlin.template.app

import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.AbsoluteSizeSpan
import androidx.appcompat.app.AppCompatActivity
import com.ncorti.kotlin.template.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // This is a sample on how to recreate an ANR outside of React Native using Samsung Keyboard with Grammarly.
        val spannableString = SpannableString("Hello World!")
        spannableString.setSpan(AbsoluteSizeSpan(55), 0, spannableString.length, Spanned.SPAN_INCLUSIVE_INCLUSIVE)
        binding.editText.setText(spannableString)
    }
}
