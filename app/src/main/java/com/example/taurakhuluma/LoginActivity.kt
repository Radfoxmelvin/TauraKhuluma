package com.example.taurakhuluma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun loginLoginBtnClicked(view: View){
        //val loginLogIntent = Intent(this,)
    }
    fun loginCreateUserBtnClicked(view:View){

        val loginCreateUserBtnIntent = Intent(this,CreateUserActivity::class.java)

        startActivity(loginCreateUserBtnIntent)

    }
}