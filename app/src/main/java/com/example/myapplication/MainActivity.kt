package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private val lazyTry: Int by lazy { gettInt() }
    var counter: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = findViewById<TextView>(R.id.text)
        val patient1 = Person("Вася")
        val patient2 = Person("Петя", 15)
        val patient3 = Person(age = 26, name = "Джон Доу")
        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            patient1.alive = false
            text.text = "${patient1.name} закончился"
        }
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener { text.text = "$lazyTry" }
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener { text.text = "${counter++}" }
        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "${patient1.name} и  ${patient1.age}",
                Toast.LENGTH_LONG
            )
                .show()
            val patient4 = patient1.copy(name = "Вася II", age = 3)


            text.text = "${patient4.name} и лет ему  ${patient4.age}"


        }


        TestObject.somethingNoStep(patient3.age)

    }

    private fun gettInt(): Int {
        return 5
    }
}



