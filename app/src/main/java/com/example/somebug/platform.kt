package com.example.somebug

import android.annotation.TargetApi
import android.app.Activity
import android.os.Build
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*


class PlatformActivity : Activity() {

    private var platformSet = false

    @TargetApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        platform.setOnClickListener {
            val newStyle = if (platformSet) R.style.PlatformFalse else R.style.PlatformTrue
            platformSet = platformSet.not()

            Log.d("platform - newStyle", "$newStyle")

            platformText.setTextAppearance(this, newStyle)
        }

    }

}