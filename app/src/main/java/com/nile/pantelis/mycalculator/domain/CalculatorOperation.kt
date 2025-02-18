package com.nile.pantelis.mycalculator.domain

sealed class CalculatorOperation(val symbol: String) {
    object Add: CalculatorOperation("+")
    object Sub: CalculatorOperation("-")
    object Mul: CalculatorOperation("*")
    object Div: CalculatorOperation("/")

}