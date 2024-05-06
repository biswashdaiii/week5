package com.example.a34a
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
//import com.example.a34a.databinding.ActivityMainBinding
//import com.example.a34a.databinding.ActivityMessageBinding
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityWeek5Binding

class MessageActivity : AppCompatActivity() {
    lateinit var messageBinding: ActivityWeek5Binding
    lateinit var sharedPreferences: SharedPreferences
    var counter = 0
    var username: String? = null
    var message: String? = null
    var rememberMe: Boolean? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        messageBinding = ActivityWeek5Binding.inflate(layoutInflater)
        var view = messageBinding.root
        setContentView(view)
        messageBinding.button7.setOnClickListener {
            counter++
            messageBinding.button7.text = counter.toString()
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onPause() {
        sharedPreferences = this.getSharedPreferences("userValue", MODE_PRIVATE)
        username = messageBinding.editTextText9.text.toString()
        message = messageBinding.editTextNumberPassword.text.toString()
        rememberMe = messageBinding.checkbox2.isChecked
        var editor = sharedPreferences.edit()
        editor.putString("username", username)
        editor.putString("message", message)
        editor.putInt("counter", counter)
        editor.putBoolean("remember", rememberMe!!)
        editor.apply()
        Toast.makeText(
            applicationContext, "Data saved",
            Toast.LENGTH_LONG
        ).show()
        super.onPause()
    }

    override fun onResume() {
        sharedPreferences = this.getSharedPreferences("userValue", MODE_PRIVATE)
        username = sharedPreferences.getString("username", "")
        message = sharedPreferences.getString("message", "")
        rememberMe = sharedPreferences.getBoolean("remember", false)
        counter = sharedPreferences.getInt("counter", 0)
        messageBinding.editTextText9.setText(username)
        messageBinding.editTextNumberPassword.setText(message)
        messageBinding.checkbox2.isChecked = rememberMe!!

        messageBinding.button7.text = counter.toString()
        super.onResume()
    }
}