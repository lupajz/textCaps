package com.example.somebug

import android.annotation.TargetApi
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var platformSet = false
    private var compatSet = false

    @TargetApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        platform.setOnClickListener {
            val newStyle = if (platformSet) R.style.PlatformFalse else R.style.PlatformTrue
            platformSet = platformSet.not()

            Log.d("platform - newStyle", "$newStyle")

            platformText.setTextAppearance(newStyle)
        }

        compat.setOnClickListener {
            val newStyle = if (compatSet) R.style.CompatFalse else R.style.CompatTrue
            compatSet = compatSet.not()

            Log.d("compat - newStyle", "$newStyle")

            compatText.setTextAppearance(newStyle)
        }
    }

}
