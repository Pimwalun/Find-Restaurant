package com.example.pimwalun.finalproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.promotion_main.*

/**
 * Created by pimwalun on 24/5/2018 AD.
 */
class PromotionActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.promotion_main)

        recyclerView2_main.layoutManager = LinearLayoutManager(this)
        recyclerView2_main.adapter = PromotionAdapter()

        textView2.text = "Promotion"
    }
}