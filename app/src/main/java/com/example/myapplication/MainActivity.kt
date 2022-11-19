package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    /**
     * On create
     *
     * @param savedInstanceState
     * @param val
     *
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_click_me = findViewById(R.id.button) as Button
        val btn_open_web = findViewById(R.id.button2) as Button


        btn_click_me.setOnClickListener{
            Toast.makeText(this@MainActivity, "You tapped me!", Toast.LENGTH_SHORT).show()
        }



        btn_open_web.setOnClickListener{
            val uri: Uri =
                Uri.parse("https://developer.android.com/kotlin?gclid=CjwKCAiAmuKbBhA2EiwAxQnt7276i4LWHLA5n28GuMkKmK6VzMTU6aVN3pZR_UC032pbnhtsjgUcOxoC5loQAvD_BwE&gclsrc=aw.ds") // missing 'http://' will cause crashed
                val intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
        }


    }
}
