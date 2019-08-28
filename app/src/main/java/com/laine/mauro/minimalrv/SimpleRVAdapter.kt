package com.laine.mauro.minimalrv

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

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

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): SimpleViewHolder {
        return SimpleViewHolder(parent)
    }

    override fun onBindViewHolder(p0: SimpleViewHolder, p1: Int) {
    }

    override fun getItemCount(): Int {
        return names.size
    }

    inner class SimpleViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}


