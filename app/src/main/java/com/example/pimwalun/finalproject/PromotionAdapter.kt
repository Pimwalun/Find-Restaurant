package com.example.pimwalun.finalproject

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.promotion_list.view.*

/**
 * Created by pimwalun on 24/5/2018 AD.
 */
class PromotionAdapter : RecyclerView.Adapter<CustomViewHolder2>() {
    val resTitles = listOf<String>("Hotto Bun", "Jae Auan Chicken Rice", "Gorilia Grill", "Max Beef", "Yujin Shabu Buffet", "Sam Steak And More"
            , "R.E.A.D Cafe", "Shabu Indy Home Village", "Shinkanzen Sushi")

    val promotions = listOf<String>("50% discount coupon", "40% discount coupon", "Come 2 Pay 1", "10% discount coupon", "Come 3 Get 1 Coke Free"
            , "10% discount coupon", "5% discount coupon", "Come 4 Pay 3", "5% discount coupon")

    val expirations = listOf<String>("30/05/2018", "30/05/2018", "30/05/2018", "30/05/2018", "30/05/2018", "30/05/2018", "30/05/2018"
            , "30/05/2018", "30/05/2018")

    val images = intArrayOf(R.drawable.hotto_bunlogo,R.drawable.chicken_ricelogo,R.drawable.gorilialogo,R.drawable.maxbeeflogo
            ,R.drawable.yujinlogo,R.drawable.sam_steaklogo,R.drawable.readlogo,R.drawable.shabu_indylogo,R.drawable.shinkanzenlogo)

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CustomViewHolder2 {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val list = layoutInflater.inflate(R.layout.promotion_list,parent,false)
        return CustomViewHolder2(list)
    }

    override fun getItemCount(): Int {
        return resTitles.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder2?, position: Int) {
        val resTiltle = resTitles.get(position)
        holder?.view?.titleR2?.text = resTiltle
        val pro = promotions.get(position)
        holder?.view?.titlePro2?.text = pro
        val exp = expirations.get(position)
        holder?.view?.expiration?.text = exp
        val image = images.get(position)
        holder?.view?.image2?.setImageResource(image)
    }

}

class CustomViewHolder2(val view: View): RecyclerView.ViewHolder(view){
    init {
        view.setOnClickListener {
        }
    }
}


