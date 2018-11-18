package com.daftmobile.a4bhomework2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener { buttonOnClickListener(it as Button) }
        button2.setOnClickListener { buttonOnClickListener(it as Button) }
        button3.setOnClickListener { buttonOnClickListener(it as Button) }
    }

    private

    fun buttonOnClickListener( button: Button ) {
        textView.text = button.text
    }
}

