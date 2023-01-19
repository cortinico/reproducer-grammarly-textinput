package com.ncorti.kotlin.template.app

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.ncorti.kotlin.template.app.databinding.ActivityMainBinding
import com.ncorti.kotlin.template.library.FactorialCalculator
import com.ncorti.kotlin.template.library.android.NotificationUtil
import java.lang.IllegalStateException
import java.lang.Integer.min

class MainActivity : AppCompatActivity() {

    private val notificationUtil: NotificationUtil by lazy { NotificationUtil(this) }
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.editTextFactorial.addTextChangedListener({ text: CharSequence?, start: Int, count: Int, after: Int ->
            Log.wtf("TEXT-BEFORE", "${text?.length} - start: $start - count: $count - after: $after - text ${text?.substring(0, min(50, text.length))}")
        }, { text: CharSequence?, start: Int, before: Int, count: Int ->
            Log.wtf("TEXT-ON", "${text?.length} - start: $start - before: $before - count: $count - text ${text?.substring(0, min(50, text.length))}")
        }, { text ->
            Log.wtf("TEXT-AFTER", "[after]: ${text?.length} - text ${text?.substring(0, min(50, text.length))}")
        })
    }
}
