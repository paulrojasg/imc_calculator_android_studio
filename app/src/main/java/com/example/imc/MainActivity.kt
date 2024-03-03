package com.example.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.imc.databinding.ActivityMainBinding
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalculate.setOnClickListener {
            val weight = binding.etWeightInput.text.toString().toFloat()
            val height = binding.etHeightInput.text.toString().toFloat()

            binding.tvResult.text = calculateIMC(weight, height).toString()
        }
    }

    val calculateIMC:(Float, Float) -> Float  =  { weight, height -> weight / height.pow(2)}

}