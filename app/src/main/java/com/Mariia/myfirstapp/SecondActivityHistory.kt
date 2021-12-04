package com.Mariia.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivityHistory : AppCompatActivity() {

    private lateinit var ResultsRecyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_history)
        val resultsList:List<results> = listOf(
            results("534567.0"),
            results("53565635.3536"),
            results("67658778.98789"),
            results("232121.0"),
            results("625543748564661435589594634.0")
        )
        ResultsRecyclerView=findViewById(R.id.history_calculatings_recyclerview)
        ResultsRecyclerView.layoutManager=LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        ResultsRecyclerView.adapter = ResultsAdapter(resultsList)
    }
}