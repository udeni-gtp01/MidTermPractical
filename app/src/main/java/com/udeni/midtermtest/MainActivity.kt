package com.udeni.midtermtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        //initialize country flag list
        val flagImages = listOf(
            R.drawable.argentina,
            R.drawable.australia,
            R.drawable.bangladesh,
            R.drawable.canada,
            R.drawable.china,
            R.drawable.finland,
            R.drawable.france,
            R.drawable.great_britain,
            R.drawable.india,
            R.drawable.japan,
            R.drawable.norway,
            R.drawable.srilanka,
            R.drawable.united_states
        )

        //initialize country name list
        val countryNames = listOf(
            "Argentina",
            "Australia",
            "Bangladesh",
            "Canada",
            "China",
            "Finland",
            "France",
            "Great Britain",
            "India",
            "Japan",
            "Norway",
            "Sri Lanka",
            "United States"
        )
        recyclerView.adapter = MyAdapter(flagImages, countryNames)
    }
}