package com.example.test_app3.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.test_app3.BaseActivity
import com.example.test_app3.R
import com.example.test_app3.loginFlow.login.LoginActivity
import kotlinx.android.synthetic.main.activity_splash.*


class SplashActivity : BaseActivity() {
    private val mHideHandler = Handler()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        SwitchToNextPage()
    }

    fun SwitchToNextPage() {
        mHideHandler.postDelayed(Runnable {
            OpenNextPage()
        },5000)

    }

    fun OpenNextPage(){
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}
