package com.udeni.midtermtest

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class MyAdapter(val flagNames: List<Int>, val countryNames: List<String>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    // Holds the views for adding it to image and text
    class MyViewHolder(val row: View) : RecyclerView.ViewHolder(row) {
        val imageView: ImageView = row.findViewById(R.id.img_country)
        val textView: TextView = row.findViewById(R.id.txt_country)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return MyViewHolder(layout)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = countryNames[position]

        // sets the image to the imageview
        holder.imageView.setImageResource(flagNames[position])

        // sets the text to the textview
        holder.textView.text = countryNames[position]
    }

    override fun getItemCount(): Int {
        return countryNames.size
    }
}