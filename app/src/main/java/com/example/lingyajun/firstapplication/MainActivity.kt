package com.example.lingyajun.firstapplication

import android.content.Intent
import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var datas = emptyArray<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        id_tv.text = "凌亚军"
        val intent = Intent()
        packageManager.queryIntentActivities(intent,PackageManager.MATCH_DEFAULT_ONLY)
    }
}
