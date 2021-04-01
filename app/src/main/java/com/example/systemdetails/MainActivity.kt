package com.example.systemdetails

import android.annotation.SuppressLint
import android.os.Build
import android.os.Build.VERSION_CODES
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.webkit.WebViewCompat
import com.stericson.RootTools.RootTools
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.reflect.Field


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView1.text = Build.BOARD
        textView2.text = Build.BOOTLOADER
        textView3.text = Build.BRAND
        textView4.text = Build.DEVICE
        textView5.text = Build.DISPLAY
        textView6.text = Build.FINGERPRINT
        textView7.text = Build.HARDWARE
        textView8.text = Build.ID
        textView9.text = Build.MANUFACTURER
        textView10.text = Build.MODEL
        textView11.text = Build.PRODUCT
        textView12.text = Build.HOST
        textView13.text = Build.TYPE
        textView14.text = Build.VERSION.SDK_INT.toString()
        if (Build.VERSION.SDK_INT >= VERSION_CODES.M) {
            textView15.text = Build.VERSION.SECURITY_PATCH
        }
        textView16.text = VERSION_CODES::class.java.fields[Build.VERSION.SDK_INT].name
        textView17.text = "Root Enabled: " + RootTools.isRootAvailable().toString()
        textView18.text = WebViewCompat.getCurrentWebViewPackage(this)?.packageName
        textView19.text = WebViewCompat.getCurrentWebViewPackage(this)?.versionName

    }
}