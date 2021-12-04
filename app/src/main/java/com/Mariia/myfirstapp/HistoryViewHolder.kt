package com.Mariia.myfirstapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HistoryViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
    private val resultTextView: TextView = itemView.findViewById(R.id.result_of_calculating_view)
    fun bind(result: results) {

        resultTextView.text = "${result.result}"
    }
}