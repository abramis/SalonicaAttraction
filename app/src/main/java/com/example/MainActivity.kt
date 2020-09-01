package com.example

import android.app.PendingIntent.getActivity
import android.content.Intent
import android.os.Bundle
import android.util.Log.d
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.my_toolbar))
        Toast.makeText(this, "Welcome to my app!", Toast.LENGTH_LONG).show()
        switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                button.visibility = View.VISIBLE
            }else {
                button.visibility = View.GONE
            }
        }
        button.setOnClickListener {
          d("daniel", "button was pressed!")
            startActivity(Intent(this, AboutMe::class.java))
        }
    }
}
