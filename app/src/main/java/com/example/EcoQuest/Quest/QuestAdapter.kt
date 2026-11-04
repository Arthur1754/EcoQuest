package com.example.EcoQuest.Quest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.EcoQuest.R

class QuestAdapter(private val context: Context, private val questList: List<QuestModel>) : BaseAdapter() {

    override fun getCount(): Int = questList.size

    override fun getItem(position: Int): Any = questList[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_quest, parent, false)

        val quest = questList[position]

        val tvTitle = view.findViewById<TextView>(R.id.tvQuestTitle)
        val tvDesc = view.findViewById<TextView>(R.id.tvQuestDesc)
        val imgIcon = view.findViewById<ImageView>(R.id.imgQuestIcon)

        tvTitle.text = quest.title
        tvDesc.text = quest.description

        // Memuat gambar menggunakan Glide
        Glide.with(context)
            .load(quest.imageUrl)
            .into(imgIcon)

        return view
    }
}