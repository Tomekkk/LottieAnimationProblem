package com.tomekkk.lottie.pulsing

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start_button.setOnClickListener {
            Intent(this, AnimationFrozeActivity::class.java).run {
                val options =
                    ActivityOptionsCompat.makeSceneTransitionAnimation(this@MainActivity, app_bar, "app_bar_transition")
                startActivity(this, options.toBundle())
            }
        }
    }
}
