package com.example.friendlist

import android.content.Context
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var frienddata = arrayOf<String>("Lincia","Loharano","Henintsoa","Karen","Kanto","Aina","Mia","Julia","Carine",
            "Iris","Chloé","Agathe","Léa","Léna","Charlie","Inès")
    val adapter = Friendlistadapter (frienddata)

    //val imageId = listOf<Int>(
        //R.drawable.a,
       // R.drawable.b,
    //R.drawable.c,
    //R.drawable.d,
    //R.drawable.e,
    //R.drawable.f,
    //R.drawable.g,
    // R.drawable.h,
    // R.drawable.i,
    //  R.drawable.j,
    //R.drawable.k,
    //R.drawable.l,
    //R.drawable.m,
    //R.drawable.n,
    //R.drawable.o,
    //R.drawable.p )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friendlist)
        val recyclerView = findViewById(R.id.recyclerview) as RecyclerView
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter = adapter

        //adding line decoration
    val decor = DividerItemDecoration(this, RecyclerView.VERTICAL)
    recyclerView.addItemDecoration(decor)
    }
}