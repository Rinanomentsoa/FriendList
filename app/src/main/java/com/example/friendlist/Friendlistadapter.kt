package com.example.friendlist

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class Friendlistadapter (val friendname : Array <String>): RecyclerView.Adapter <Friendlistadapter.ViewHolder>() {
    //private val friendata = ListFriends()
    //private val listOfFriends = friendata.friendname

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val namefriend : TextView = itemView.findViewById<TextView>(R.id.friend)
        val friendimage : ShapeableImageView= itemView.findViewById<ShapeableImageView>(R.id.avatar)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val viewItem = inflater.inflate(R.layout.list_item,parent,false)
        return ViewHolder(viewItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentfriend = friendname[position]
        //val currentimage = friendata[position].imagesrc
        holder.namefriend.text = currentfriend
        holder.friendimage.setImageResource(R.drawable.a)
        //holder.friendimage.setImageResource(currentimage)
    }
    override fun getItemCount(): Int {
        return friendname.size
    }

}