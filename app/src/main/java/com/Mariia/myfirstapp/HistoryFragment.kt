package com.Mariia.myfirstapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HistoryFragment : Fragment() {

    lateinit var historyRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_history, container, false)
        historyRecyclerView = view.findViewById(R.id.history_calculatings_recyclerview)
        val resultsList: List<results> = listOf(
            results("534567.0"),
            results("53565635.3536"),
            results("67658778.98789"),
            results("232121.0"),
            results("625543748564661435589594634.0")
        )
        historyRecyclerView.layoutManager=LinearLayoutManager(
            context,
            LinearLayoutManager.VERTICAL,
            false
        )
        historyRecyclerView.adapter = ResultsAdapter(resultsList)
        return view
    }


}