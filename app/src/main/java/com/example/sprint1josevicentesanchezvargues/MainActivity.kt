package com.example.sprint1josevicentesanchezvargues

import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
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
    }
}
