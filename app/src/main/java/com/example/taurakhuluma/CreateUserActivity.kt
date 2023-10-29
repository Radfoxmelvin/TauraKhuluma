package com.example.taurakhuluma

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.taurakhuluma.databinding.ActivityCreateUserBinding
import com.example.taurakhuluma.databinding.ActivityMainBinding
import java.util.Random

class CreateUserActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCreateUserBinding
    var userAvater = "ProfileDefault"
    var avaterColor = "[0.5,0.5,05,1]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateUserBinding.inflate(layoutInflater)
        val hona = binding.root
        setContentView(hona)
        //setContentView(R.layout.activity_create_user)
    }
    fun generateUserAvater(view:View){

        val random = Random()
        val color = random.nextInt(8)
        val avatar = random.nextInt(5)

        if(color==0){

              userAvater = "reddess02"
        }
        if(color==1){

            userAvater = "reddress01"
        }
        if(color==2){

            userAvater = "reddess03"
        }
        if(color==3){

            userAvater = "hatcol02"
        }else{

            userAvater = "hatpng"
        }
          val resouceId = resources.getIdentifier(userAvater,"drawable",packageName)
          binding.createAvaterImageView.setImageResource(resouceId)

    }
    fun generateBackgroundColorClicked(view: View){

        val random = Random()
        val r = random.nextInt(255)
        val g = random.nextInt(255)
        val b = random.nextInt(255)

        binding.createAvaterImageView.setBackgroundColor(Color.rgb(r,g,b))
        val savedR = r.toDouble()/255
        val savedG = g.toDouble()/255
        val savedB = b.toDouble()/255

        avaterColor ="[$savedR,$savedG,$savedB,1]"
        println(avaterColor)

    }
    fun createUserBtnClicked(view: View){

    }
}