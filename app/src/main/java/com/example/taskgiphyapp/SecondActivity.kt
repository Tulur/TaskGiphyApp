package com.example.taskgiphyapp

//import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val imageView = findViewById<ImageView>(R.id.imageView)

        val url = intent.getStringArrayExtra("url")

        Glide.with(this).load(url).into(imageView)
    }
}