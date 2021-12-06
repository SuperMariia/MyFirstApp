package com.Mariia.myfirstapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class CalculatorFragment : Fragment() {

    lateinit var oneButton: Button
    lateinit var twoButton: Button
    lateinit var threeButton: Button
    lateinit var fourButton: Button
    lateinit var fiveButton: Button
    lateinit var sixButton: Button
    lateinit var sevenButton: Button
    lateinit var eightButton: Button
    lateinit var nineButton: Button
    lateinit var zeroButton: Button
    lateinit var dotButton: Button

    lateinit var plusButton: Button
    lateinit var minusButton: Button
    lateinit var multiplicateButton: Button
    lateinit var divideButton: Button
    lateinit var equalButton: Button
    lateinit var clearButton: Button
    lateinit var backspaceButton: Button
    lateinit var plusMinusButton: Button

    lateinit var inputWindow: TextView

    var firstNumber: Double = 0.0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_calculator, container, false)
        oneButton = view.findViewById(R.id.one_button)
        twoButton = view.findViewById(R.id.two_button)
        threeButton = view.findViewById(R.id.three_button)
        fourButton = view.findViewById(R.id.four_button)
        fiveButton = view.findViewById(R.id.five_button)
        sixButton = view.findViewById(R.id.six_button)
        sevenButton = view.findViewById(R.id.seven_button)
        eightButton = view.findViewById(R.id.eight_button)
        nineButton = view.findViewById(R.id.nine_button)
        zeroButton = view.findViewById(R.id.zero_button)
        dotButton = view.findViewById(R.id.dot_button)

        plusButton = view.findViewById(R.id.plus_button)
        minusButton = view.findViewById(R.id.minus_button)
        multiplicateButton = view.findViewById(R.id.multiplication_button)
        divideButton = view.findViewById(R.id.division_button)
        equalButton = view.findViewById(R.id.equals_button)
        clearButton = view.findViewById(R.id.clear_button)
        backspaceButton = view.findViewById(R.id.backspace_button)
        plusMinusButton = view.findViewById(R.id.plus_minus_button)

        inputWindow = view.findViewById(R.id.input_window)


        oneButton.setOnClickListener {
            Log.i("input", inputWindow.text.toString())
            inputWindow.text = inputWindow.text.toString() + "1"
            Log.i("input", inputWindow.text.toString())
        }

        return view
    }


}