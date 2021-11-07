package com.zinoview.downloadsourceandroid

import android.widget.EditText

interface Position {

    fun increment()

    fun decrement()

    //todo make interface for EditText
    fun focus(fields: List<EditText>)

    class Base : Position {

        private var currentPosition = 0

        override fun increment() {
            if (currentPosition == MAX_POSITION) {
                //disable next button
            } else {
                currentPosition++
            }
        }

        override fun decrement() {
            if (currentPosition == MIN_POSITION) {
                //disable back btn
            } else {
                currentPosition--
            }
        }

        override fun focus(fields: List<EditText>) {
            fields[currentPosition].requestFocus()
        }

        private companion object {
            private const val MAX_POSITION = 3
            private const val MIN_POSITION = 0
        }
    }
}