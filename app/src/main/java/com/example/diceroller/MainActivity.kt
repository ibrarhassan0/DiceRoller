package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.diceroller.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private val TAG="MainActivity"
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"onCreate: starts")
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
//            Toast.makeText(this,"Button clicked ", Toast.LENGTH_SHORT).show()
            diceroll()
        }

    }

    private fun diceroll() {
        Log.d(TAG,"diceRoll called")
     val random= java.util.Random().nextInt(6)+1
        val multiImg=when(random){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            6-> R.drawable.dice_6
            else-> R.drawable.empty_dice
        }
      binding.img.setImageResource(multiImg)


    }
}