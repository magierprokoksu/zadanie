package com.example.aplikacja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var x=1
        findViewById<Button>(R.id.next).setOnClickListener {
            if(x==1) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.t2)
                x=2
            }else if (x==0){
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.multipla)
                x=1
            }else if (x==2){
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.maluch)
                x=0
            }
        }
        findViewById<Button>(R.id.prev).setOnClickListener {
            if(x==1){
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.maluch)
                x=0
            }else if (x==2){
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.multipla)
                x=1
            }else if (x==0){
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.t2)
                x=2
            }
        }


        val silniar = findViewById<Button>(R.id.rsilnia)
        val silniai = findViewById<EditText>(R.id.silnia)

        silniar.setOnClickListener {
            val inputInt = silniai.text.toString().toInt()
            var liczbasilni=1
            if(inputInt==0 || inputInt==1){
                liczbasilni=1
            }
            else{
                for(i in 2 .. inputInt)
                    liczbasilni *= i
            }
            val text = liczbasilni.toString()
            findViewById<TextView>(R.id.wynik1).text=(text)
        }
    }
}