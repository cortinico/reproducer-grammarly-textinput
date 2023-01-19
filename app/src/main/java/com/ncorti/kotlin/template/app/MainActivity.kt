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

class MainActivity : AppCompatActivity() {

    private val notificationUtil: NotificationUtil by lazy { NotificationUtil(this) }
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.editTextFactorial.addTextChangedListener({ text: CharSequence?, start: Int, count: Int, after: Int ->
//            Log.wtf("NCOR", "[before]: $text - start: $start - count: $count - after: $after")
        }, { text: CharSequence?, start: Int, before: Int, count: Int ->
            Log.wtf("NCOR", "[on]: ${text?.length} - start: $start - before: $before - count: $count")
//            Log.wtf("NCOR", "[content]: $text")
        }, { text ->
//            Log.wtf("NCOR", "[after]: $text")
        })

        binding.buttonCompute.setOnClickListener {
//            if (binding.editTextFactorial.text.isNotEmpty()) {
//                val input = binding.editTextFactorial.text.toString().toLong()
//                val result = try {
//                    FactorialCalculator.computeFactorial(input).toString()
//                } catch (ex: IllegalStateException) {
//                    "Error: ${ex.message}"
//                }
//
//                binding.textResult.text = result
//                binding.textResult.visibility = View.VISIBLE
//                notificationUtil.showNotification(
//                    context = this,
//                    title = getString(R.string.notification_title),
//                    message = result
//                )
//            } else {
//                Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show()
//            }
        }

        binding.buttonAppcompose.setOnClickListener {
//            val intent = Intent(it.context, ComposeActivity::class.java)
//            startActivity(intent)
        }
    }
}
