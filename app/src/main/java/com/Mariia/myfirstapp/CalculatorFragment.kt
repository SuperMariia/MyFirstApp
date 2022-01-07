package com.Mariia.myfirstapp

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.room.Room
import com.Mariia.myfirstapp.MainActivity.Companion.instance
import kotlin.collections.ArrayList
const val KEY = "input text"

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
    var secondNumber: Double = 0.0
    var operation: String? = null
    var result: String = ""
    var pressedOperation: Boolean = false
    var hadResult: Boolean = false



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
        inputWindow.text = ""


if(savedInstanceState!=null) inputWindow.text = savedInstanceState.getString(KEY)

            oneButton.setOnClickListener {
            if (hadResult==false)
            inputWindow.text = inputWindow.text.toString() + "1"
            else {hadResult=false
                inputWindow.text=""
            inputWindow.text = inputWindow.text.toString() + "1"}
        }
        twoButton.setOnClickListener {
            if (hadResult==false)
            inputWindow.text = inputWindow.text.toString() + "2"
            else {hadResult=false
                inputWindow.text = ""
            inputWindow.text = inputWindow.text.toString() + "2"}
        }
        threeButton.setOnClickListener {
            if (hadResult==false)
            inputWindow.text = inputWindow.text.toString() + "3"
            else {hadResult=false
                inputWindow.text = ""
            inputWindow.text = inputWindow.text.toString() + "3"}
        }
        fourButton.setOnClickListener {
            if (hadResult==false)
            inputWindow.text = inputWindow.text.toString() + "4"
            else {hadResult=false
                inputWindow.text = ""
            inputWindow.text = inputWindow.text.toString() + "4"}
        }
        fiveButton.setOnClickListener {
            if (hadResult==false)
            inputWindow.text = inputWindow.text.toString() + "5"
            else {hadResult=false
                inputWindow.text = ""
            inputWindow.text = inputWindow.text.toString() + "5"}
        }
        sixButton.setOnClickListener {
            if (hadResult==false)
            inputWindow.text = inputWindow.text.toString() + "6"
            else {hadResult=false
                inputWindow.text = ""
            inputWindow.text = inputWindow.text.toString() + "6"}
        }
        sevenButton.setOnClickListener {
            if (hadResult==false)
            inputWindow.text = inputWindow.text.toString() + "7"
            else {hadResult=false
                inputWindow.text = ""
            inputWindow.text = inputWindow.text.toString() + "7"}
        }
        eightButton.setOnClickListener {
            if (hadResult==false)
            inputWindow.text = inputWindow.text.toString() + "8"
            else {hadResult=false
                inputWindow.text = ""
            inputWindow.text = inputWindow.text.toString() + "8"}
        }
        nineButton.setOnClickListener {
            if (hadResult==false)
            inputWindow.text = inputWindow.text.toString() + "9"
            else {hadResult=false
                inputWindow.text = ""
            inputWindow.text = inputWindow.text.toString() + "9"}
        }
        zeroButton.setOnClickListener {
            if (hadResult==false)
            inputWindow.text = inputWindow.text.toString() + "0"
            else {hadResult=false
                inputWindow.text = ""
            inputWindow.text = inputWindow.text.toString() + "0"}
        }


        plusMinusButton.setOnClickListener {
            if (!inputWindow.text.contains("-"))
                inputWindow.text = "-" + inputWindow.text.toString()
        }

        dotButton.setOnClickListener {
            if (!inputWindow.text.contains("."))
                inputWindow.text = inputWindow.text.toString() + "."

        }

        plusButton.setOnClickListener {
            if (pressedOperation == false) {
                firstNumber = inputWindow.text.toString().toDouble()
                operation = "+"
                inputWindow.text = ""
                pressedOperation = true
            }

        }
        minusButton.setOnClickListener {
            if (pressedOperation == false) {
                firstNumber = inputWindow.text.toString().toDouble()
                operation = "-"
                inputWindow.text = ""
                pressedOperation = true
            }
        }
        multiplicateButton.setOnClickListener {
            if (pressedOperation == false) {
                firstNumber = inputWindow.text.toString().toDouble()
                operation = "*"
                inputWindow.text = ""
                pressedOperation = true
            }
        }
        divideButton.setOnClickListener {
            if (pressedOperation == false) {
                firstNumber = inputWindow.text.toString().toDouble()
                operation = "/"
                inputWindow.text = ""
                pressedOperation = true
            }

        }
        clearButton.setOnClickListener {
            inputWindow.text = ""
            pressedOperation = false
            hadResult=false

        }
        backspaceButton.setOnClickListener {

            inputWindow.text = inputWindow.text.subSequence(0, inputWindow.length() - 1)

        }

        equalButton.setOnClickListener {

            secondNumber = inputWindow.text.toString().toDouble()
            result = when (operation) {
                "+" -> (firstNumber + secondNumber).toString()
                "-" -> (firstNumber - secondNumber).toString()
                "*" -> (firstNumber * secondNumber).toString()
                "/" -> (if (secondNumber != 0.0) {
                    (firstNumber / secondNumber).toString()
                } else ("Error"))


                else -> ("Error")
            }
            inputWindow.text = result
            pressedOperation = false
            hadResult=true
            // MainActivity.resultsList.add(result) нужно заменить на базу данных


            val db = instance?.database
            val calculatingDao = db?.calculatingDao()


            val calculating = Calculating(
            id = 0,
            num = "$firstNumber $operation $secondNumber",
            res = result)

            calculatingDao?.insert(calculating)


        }
        return view

    }


    // private fun ApplicationContext(): Context { // added

    // }


    override fun onSaveInstanceState(outState: Bundle)  {
        super.onSaveInstanceState(outState)
        outState.putString(KEY,inputWindow.text.toString())
    }
}





