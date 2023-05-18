package com.example.shiba.adapters

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.shiba.R
import com.example.shiba.models.HomeHorModel
import com.example.shiba.models.HomeVerModel


class HomeHorAdapter(var context: Context, var list: List<HomeHorModel>, var activity: Activity) :
    RecyclerView.Adapter<HomeHorAdapter.ViewHolder>() {
    var homeVerModelList: List<HomeVerModel>? = null
    var homeVerAdapter: HomeVerAdapter? = null
    var homeHorAdapter: HomeHorAdapter? = null

    fun homeHorAdapter(
        activity: Activity?,
        list: java.util.ArrayList<HomeHorAdapter?>
    ) {


    }

    init {
        this.context=context
        this.activity = activity
        this.list = list
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView
        var cardView: CardView
        var name:TextView

        init {
            imageView = itemView.findViewById(R.id.ver_img)
            name = itemView.findViewById(R.id.name)
            cardView = itemView.findViewById(R.id.card_view)
        }
        

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.home_horizontal_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(list[position].image)
        holder.name.text = list[position].name
    }

    override fun getItemCount(): Int {
        return list.size
    }

}
