package com.Mariia.myfirstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.room.Room
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.app.Application




private const val LAST_SELECTED_ITEM = "item"
private val CALCULATOR_FRAGMENT = CalculatorFragment().javaClass.name
private val HISTORY_FRAGMENT = HistoryFragment().javaClass.name

class MainActivity : AppCompatActivity() {
    var database: AppDatabase? = null
        private set

    lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        instance = this
        database = Room.databaseBuilder(this, AppDatabase::class.java, "database").allowMainThreadQueries().build()





        bottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnItemSelectedListener { item ->
            var fragment: Fragment? = null
            when (item.itemId) {
                R.id.calculator_menu -> {
                    fragment = if (savedInstanceState != null) supportFragmentManager.getFragment(savedInstanceState,CALCULATOR_FRAGMENT) else CalculatorFragment()

                }
                R.id.history_of_calculatings_menu -> {
                    fragment = if (savedInstanceState != null) supportFragmentManager.getFragment(savedInstanceState,HISTORY_FRAGMENT) else HistoryFragment()
                }
            }
            replaceFragment(fragment!!)
            true
        }
        bottomNavigationView.selectedItemId =
            savedInstanceState?.getInt(LAST_SELECTED_ITEM) ?: R.id.calculator_menu


    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(LAST_SELECTED_ITEM, bottomNavigationView.selectedItemId)

        val currentFragment = supportFragmentManager.fragments.last()
        supportFragmentManager.putFragment(
            outState,
            currentFragment.javaClass.name,
            currentFragment
        )
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

    companion object {
        var instance: MainActivity? = null
    }

}


