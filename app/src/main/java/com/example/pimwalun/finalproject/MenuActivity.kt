package com.example.pimwalun.finalproject

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by pimwalun on 24/5/2018 AD.
 */
class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_detail)

        val nameRes:TextView? = findViewById(R.id.textView3)
        val imageFood:ImageView? = findViewById(R.id.food)
        val detailRes:TextView? = findViewById(R.id.detail)

        val strName = intent.getStringExtra("Name")
        nameRes?.text = strName

        val imagesFood = intent.getIntExtra("Image",R.drawable.hotto_bun)
        imageFood?.setImageResource(imagesFood)

        val intIndex = intent.getIntExtra("Index", 0)

        val detailStrings = resources.getStringArray(R.array.menu_long)
        detailRes?.text = detailStrings[intIndex]

    }

    fun promotionClicked(view:View){
        val intent = Intent(this, PromotionActivity::class.java)
        startActivity(intent)
    }

}