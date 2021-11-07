package com.zinoview.downloadsourceandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import java.util.*

class MainActivity : AppCompatActivity() {

    private val position = Position.Base()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fieldFirst = findViewById<EditText>(R.id.field_first)
        val fieldSecond = findViewById<EditText>(R.id.field_second)
        val fieldThird = findViewById<EditText>(R.id.field_third)

        val fields = ArrayList<EditText>()
        fields.add(fieldFirst)
        fields.add(fieldSecond)
        fields.add(fieldThird)

        val chainField = ChainField.Base(
            fields
        )

        chainField.focus(position)

        val nextBtn = findViewById<Button>(R.id.next_btn)
        val backBtn = findViewById<Button>(R.id.back_btn)

        nextBtn.setOnClickListener {
            position.increment()
            chainField.focus(position)
        }

        backBtn.setOnClickListener {
            position.increment()
            chainField.focus(position)
        }


    }

}