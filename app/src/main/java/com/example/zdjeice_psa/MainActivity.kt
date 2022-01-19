package com.example.zdjeice_psa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var licznik = 1;
        findViewById<Button>(R.id.lewy).setOnClickListener {
            if(licznik == 1)
            licznik = 4;
        else
            licznik -=1;
            if(licznik == 1)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.arka);
            else if(licznik == 2)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.pies);
            else if(licznik == 3)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.sloth);
            else if (licznik == 4)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.auto);

        }
        findViewById<Button>(R.id.prawa).setOnClickListener {
            if (licznik ==4)
                licznik = 1;
            else
                licznik += 1;
            if(licznik == 1)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.arka);
            if(licznik == 2)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.pies);
            if(licznik == 3)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.sloth);
            if(licznik == 4)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.auto);
        }
            findViewById<Button>(R.id.rotacja_p).setOnClickListener {
                var rotacja = findViewById<EditText>(R.id.rotacja).text
                findViewById<ImageView>(R.id.imageView).rotation = rotacja.toString().toFloat();

                findViewById<Button>(R.id.rotacja_l).setOnClickListener {
                    var rotacja = "-" + findViewById<EditText>(R.id.rotacja).text;
                    findViewById<ImageView>(R.id.imageView).rotation = rotacja.toString().toFloat();


                }
            }

    }
}