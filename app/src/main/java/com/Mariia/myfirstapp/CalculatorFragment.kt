package com.Mariia.myfirstapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

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
    private lateinit var error: Exception

    lateinit var inputWindow: TextView

    var firstNumber: Double = 0.0
    var secondNumber: Double = 0.0
    var operation = ""
    var result = ""


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
            inputWindow.text = inputWindow.text.toString() + "1"

        }
        twoButton.setOnClickListener {
            inputWindow.text = inputWindow.text.toString() + "2"
        }
        threeButton.setOnClickListener {
            inputWindow.text = inputWindow.text.toString() + "3"
        }
        fourButton.setOnClickListener {
            inputWindow.text = inputWindow.text.toString() + "4"
        }
        fiveButton.setOnClickListener {
            inputWindow.text = inputWindow.text.toString() + "5"
        }
        sixButton.setOnClickListener {
            inputWindow.text = inputWindow.text.toString() + "6"
        }
        sevenButton.setOnClickListener {
            inputWindow.text = inputWindow.text.toString() + "7"
        }
        eightButton.setOnClickListener {
            inputWindow.text = inputWindow.text.toString() + "8"
        }
        nineButton.setOnClickListener {
            inputWindow.text = inputWindow.text.toString() + "9"
        }
        zeroButton.setOnClickListener {
            inputWindow.text = inputWindow.text.toString() + "0"
        }

        dotButton.setOnClickListener {
            inputWindow.text = inputWindow.text.toString() + "."
        }


        plusButton.setOnClickListener {
            firstNumber = inputWindow.text.toString().toDouble()
            operation = "+"
            inputWindow.text = ""

        }
        minusButton.setOnClickListener {
            firstNumber = inputWindow.text.toString().toDouble()
            operation = "-"
            inputWindow.text = ""
        }
        multiplicateButton.setOnClickListener {
            firstNumber = inputWindow.text.toString().toDouble()
            operation = "*"
            inputWindow.text = ""
        }
        divideButton.setOnClickListener {
            firstNumber = inputWindow.text.toString().toDouble()
            operation = "/"
            inputWindow.text = ""

        }
        clearButton.setOnClickListener {
            inputWindow.text = ""

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
                "/" -> (((if (secondNumber !== 0.0) {result=
                    (firstNumber / secondNumber).toString()
                } else ("Error")) as String))


                else -> ("Error")
            }
            inputWindow.text = result
        }
        return view
    }
}





