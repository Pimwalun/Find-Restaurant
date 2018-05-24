package com.example.pimwalun.finalproject

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.content.Intent
import kotlinx.android.synthetic.main.restaurant_list.view.*

/**
 * Created by pimwalun on 24/5/2018 AD.
 */
class MainAdapter : RecyclerView.Adapter<CustomViewHolder>() {

    val resTitles = listOf<String>("Hotto Bun","Jae Auan Chicken Rice","Gorilia Grill","Max Beef","Yujin Shabu Buffet","Sam Steak And More"
    ,"R.E.A.D Cafe", "Shabu Indy Home Village", "Shinkanzen Sushi")

    val reviews = listOf<String>("4.2/5","3.9/5","3.5/5","3.9/5","3.9/5","3.9/5","4.0/5","3.9/5","4.1/5")

    val distances = listOf<String>("1.7 km","2.3 km","1.7 km","450 m","2.2 km","1.8 km","2.0 km","2.2 km","2.2 km")

    val images = intArrayOf(R.drawable.hotto_bunlogo,R.drawable.chicken_ricelogo,R.drawable.gorilialogo,R.drawable.maxbeeflogo
    ,R.drawable.yujinlogo,R.drawable.sam_steaklogo,R.drawable.readlogo,R.drawable.shabu_indylogo,R.drawable.shinkanzenlogo)

    override fun getItemCount() :Int{
        return resTitles.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val list = layoutInflater.inflate(R.layout.restaurant_list,parent,false)
        return CustomViewHolder(list)
    }

    override fun onBindViewHolder(holder: CustomViewHolder?, position: Int) {
        val resTitle = resTitles.get(position)
        holder?.view?.titleR?.text = resTitle
        val review = reviews.get(position)
        holder?.view?.titleReview?.text = review
        val distance = distances.get(position)
        holder?.view?.distance?.text = distance
        val image = images.get(position)
        holder?.view?.image?.setImageResource(image)
    }


}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view){
    val resTitles = listOf<String>("Hotto Bun","Jae Auan Chicken Rice","Gorilia Grill","Max Beef","Yujin Shabu Buffet","Sam Steak And More"
            ,"R.E.A.D Cafe", "Shabu Indy Home Village", "Shinkanzen Sushi")

    val images = intArrayOf(R.drawable.hotto_bun,R.drawable.chicken_rice,R.drawable.gorilia,R.drawable.maxbeef
            ,R.drawable.yujin,R.drawable.sam_steak,R.drawable.read,R.drawable.shabu_indy,R.drawable.shinkanzen)

    init {
        view.setOnClickListener {
            val intent = Intent(view.context, MenuActivity::class.java)
            intent.putExtra("Name",resTitles[position])
            intent.putExtra("Image",images[position])
            intent.putExtra("Index",position)
            view.context.startActivity(intent)
        }
    }
}