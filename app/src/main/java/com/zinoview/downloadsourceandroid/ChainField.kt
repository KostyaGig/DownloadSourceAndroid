package com.zinoview.downloadsourceandroid

import android.widget.EditText
import java.util.*


interface ChainField {

    fun focus(position: Position)

    class Base(
        private val fields: List<EditText>
    ) : ChainField {

        override fun focus(position: Position) {
            position.focus(ArrayList(fields))
        }
    }
}