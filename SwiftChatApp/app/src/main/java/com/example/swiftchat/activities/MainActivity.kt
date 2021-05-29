package com.example.swiftchat.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swiftchat.R
import com.example.swiftchat.viewmodel.UserViewModel
import com.example.swiftchat.viewmodelfactory.UserViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var userViewModel: UserViewModel? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userViewModel = UserViewModelFactory(this).create(UserViewModel::class.java)
        fetchDataBase()
    }

    private fun fetchDataBase() {
        val userName = intent.getStringExtra("userName")
        tvUserName.text = userName
    }
}