package com.example.sprint1josevicentesanchezvargues

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(
            findViewById(R.id.main)
        ) { v, insets ->
            val systemBars = insets.getInsets(
                WindowInsetsCompat.Type.systemBars()
            )
            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )
            insets
        }

        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        val seekBarProgress =
            findViewById<TextView>(R.id.seekBarProgress)

        seekBar.setOnSeekBarChangeListener(
            object : SeekBar.OnSeekBarChangeListener {

                override fun onProgressChanged(
                    seekBar: SeekBar?,
                    progress: Int,
                    fromUser: Boolean
                ) {
                    seekBarProgress.text = "Nivel seleccionado: $progress"
                }

                override fun onStartTrackingTouch(
                    seekBar: SeekBar?
                ) {

                }

                override fun onStopTrackingTouch(
                    seekBar: SeekBar?
                ) {

                }
            }
        )

        val saveButton = findViewById<Button>(R.id.saveButton)

        saveButton.setOnClickListener {
            Toast.makeText(
                this,
                "Información guardada.",
                Toast.LENGTH_SHORT
            ).show()
        }

        val celebratingText = findViewById<TextView>(R.id.celebratingText)

        celebratingText.setOnClickListener {
            val texto = "Celebrating 5 Years of Jetpack Compose!"
            val spannable = SpannableString(texto)

            val inicio = texto.indexOf("5")

            if (inicio != -1) {
                spannable.setSpan(
                    ForegroundColorSpan(Color.RED),
                    inicio,
                    inicio + 1,
                    Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
                )
            }

            celebratingText.text = spannable
        }
    }
}
