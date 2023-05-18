package com.example.shiba.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shiba.R
import com.example.shiba.models.HomeVerModel

class HomeVerAdapter(var context: Context, list: List<HomeVerModel>) :
    RecyclerView.Adapter<HomeVerAdapter.ViewHolder>() {
    var list: List<HomeVerModel>

    init {
        this.context=context
        this.list = list
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.home_vertical_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(list[position].image)
        holder.name.text = list[position].name
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView
        var name: TextView
        var timing: TextView
        var rating: TextView
        var price: TextView

        init {
            imageView = itemView.findViewById<ImageView>(R.id.ver_img)
            name = itemView.findViewById<TextView>(R.id.name)
            timing = itemView.findViewById<TextView>(R.id.timing)
            rating = itemView.findViewById<TextView>(R.id.rating)
            price = itemView.findViewById<TextView>(R.id.price)
        }
    }
}
