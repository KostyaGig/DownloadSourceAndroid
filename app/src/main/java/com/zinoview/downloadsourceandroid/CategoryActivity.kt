package com.zinoview.downloadsourceandroid

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageView

class CategoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.category_layout)

        val readingCategoryContainer = findViewById<FrameLayout>(R.id.reading_category_container)
        val readingCategoryImageView = findViewById<ImageView>(R.id.reading_category_image)

        readingCategoryContainer.setOnClickListener {
            readingCategoryContainer.setBackgroundColor(Color.parseColor("#5DCAC2"))
            readingCategoryImageView.setColorFilter(Color.parseColor("#5DCAC2"))
        }
    }
}