package com.Mariia.myfirstapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ResultsAdapter(private val resultsList: List<Calculating>) : // List<results>
    RecyclerView.Adapter<HistoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.history_list_item, parent, false)
        return HistoryViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        val result = resultsList.get(position)
        holder.bind(result)
    }

override fun getItemCount(): Int {
    return resultsList.size
}
}
