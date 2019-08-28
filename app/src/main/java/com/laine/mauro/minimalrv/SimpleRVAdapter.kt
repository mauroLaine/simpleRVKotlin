package com.laine.mauro.minimalrv

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class SimpleRVAdapter : RecyclerView.Adapter<SimpleRVAdapter.SimpleViewHolder>() {

    val names = listOf<String>(
        "Raiders", "Cardinals", "Falcons", "Ravens",
        "Bills", "Panthers", "Bears", "Bengals",
        "Browns", "Cowboys", "Broncos", "Lions",
        "Packers", "Texans", "Colts", "Jaguars",
        "Chiefs", "Chargers", "Rams", "Dolphins",
        "Vikings", "Patriots", "Saints", "Giants",
        "Jets", "Eagles", "Steelers", "49ers",
        "Seahawks", "Buccaneers", "Titans", "Redskins"
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.view_recyclerview_row, parent, false)
        return SimpleViewHolder(view)
    }

    override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
        holder.bindData(names.get(position))
    }

    override fun getItemCount(): Int {
        return names.size
    }

    inner class SimpleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val nameTextView: TextView

        init {
            nameTextView = itemView.findViewById(R.id.name_tv)
        }

        fun bindData(name: String) {
            nameTextView.text = name
        }
    }
}


