package com.example.simplebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button =findViewById<Button>(R.id.button);
        val textView=findViewById<TextView>(R.id.textView);
        val upgradeBtn=findViewById<Button>(R.id.upgradeBtn);
        var counter=0;
        button.setOnClickListener{
            counter++
            textView.text=counter.toString();
            if (counter>=100){
                upgradeBtn.visibility=View.VISIBLE;
                button.text="Add 2"

                button.setOnClickListener{
                    counter+=2;
                    textView.text=counter.toString();
                }
                upgradeBtn.visibility=View.INVISIBLE
            }
        }
    }
}