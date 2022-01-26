package com.github.chanjungkim.verticalview

import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.github.chanjungkim.verticalseekbar.VerticalSeekBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val verticalView = findViewById<VerticalSeekBar>(R.id.vertical_seek_view)
        val textView = findViewById<TextView>(R.id.textview)

        verticalView.apply {
            setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
                override fun onProgressChanged(
                    seekBar: SeekBar?,
                    progress: Int,
                    fromUser: Boolean,
                ) {
                    textView.text = "$progress"
                }

                override fun onStartTrackingTouch(seekBar: SeekBar?) {
                    // nothing
                }

                override fun onStopTrackingTouch(seekBar: SeekBar?) {
                    // nothing
                }

            })
            setSlideButtonListener(object : VerticalSeekBar.SlideButtonListener {
                override fun handleSlide() {
                    Toast.makeText(this@MainActivity, "triggered!", Toast.LENGTH_SHORT).show()
                }
            })
        }
    }
}