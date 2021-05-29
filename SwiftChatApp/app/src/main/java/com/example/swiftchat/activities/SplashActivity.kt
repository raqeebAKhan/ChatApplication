package com.example.swiftchat.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import androidx.lifecycle.Observer
import com.example.swiftchat.R
import com.example.swiftchat.viewmodel.LoginViewModel
import com.practical.arbeenakhanum.viewmodelfactory.LoginViewModelFactory
import kotlinx.android.synthetic.main.activity_authentication.*
import kotlinx.android.synthetic.main.activity_login.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val runnable = Runnable {
            val splashIntent = Intent(this@SplashActivity, AuthenticationActivity::class.java)
            startActivity(splashIntent)
            finish()
        }
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed(runnable, 3400)

        animationOnSplash()
    }

    private fun animationOnSplash() {
        val splashAnimation = AnimationUtils.loadAnimation(
            this,
            R.anim.transitions_splash
        )

        val lTRTextAnimation = AnimationUtils.loadAnimation(
            this,
            R.anim.left_to_right
        )

        val lTRIconAnimation = AnimationUtils.loadAnimation(
            this,
            R.anim.left_to_right
        )

        ivLogo.animation = splashAnimation
        tvAppName.animation = lTRTextAnimation
        ivChatIcon.animation = lTRIconAnimation
    }
}