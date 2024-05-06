package com.example.myapplication

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Calendar

class DateTimeActivity : AppCompatActivity() {
    lateinit var button : Button
    lateinit var  textview : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_date_time)
        button = findViewById(R.id.loadcalendar)
        textview=findViewById(R.id.textView4)

        button.setOnClickListener {
            loadcalendar()
        }
        }
    private fun loadcalendar(){
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day=c.get(Calendar.DAY_OF_MONTH)

        val datepickerdialog =DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                textview.text="Selected Date :$dayOfMonth/$month+1/$year"
            },year,
            month,
            day
        )
        datepickerdialog.show()
    }
    }
