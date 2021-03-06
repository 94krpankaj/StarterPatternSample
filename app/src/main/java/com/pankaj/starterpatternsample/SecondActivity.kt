package com.pankaj.starterpatternsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        button.setOnClickListener {
            if(editText.text.isNotEmpty()){
                DetailsActivity.getDetailsActivityIntent(this,editText.text.toString())
            }
        }
    }
}
