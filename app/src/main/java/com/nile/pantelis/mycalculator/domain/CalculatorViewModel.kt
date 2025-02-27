package com.nile.pantelis.mycalculator.domain

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {
    var state by mutableStateOf(CalculatorState())

    fun onAction(action: CalculatorAction) {
        when (action) {
            is CalculatorAction.Calculate -> calculate()
            is CalculatorAction.Clear -> state = CalculatorState()
            is CalculatorAction.Decimal -> enterDecimal()
            is CalculatorAction.Delete -> delete()
            is CalculatorAction.Number -> enterNumber(action.number)
            is CalculatorAction.Operation -> enterOperation(action.operation)
        }
    }


    private fun enterOperation(operation: CalculatorOperation) {
        if (state.num1.isNotBlank()) {
            state = state.copy(operation = operation)
        }
    }

    private fun calculate() {
        val number1 = state.num1.toDoubleOrNull()
        val number2 = state.num2.toDoubleOrNull()
        if (number1 != null && number2 != null) {
            val result = when (state.operation) {
                CalculatorOperation.Add -> number1 + number2
                CalculatorOperation.Div -> number1 / number2
                CalculatorOperation.Mul -> number1 * number2
                CalculatorOperation.Sub -> number1 - number2
                null -> return
            }

            state = state.copy(
                num1 = result.toString().take(7),
                num2 = "",
                operation = null
            )
        }
    }

    private fun delete() {
        when {
            state.num2.isNotBlank() -> state = state.copy(
                num2 = state.num2.dropLast(1)
            )

            state.operation != null -> state = state.copy(
                operation = null
            )

            state.num1.isNotBlank() -> state = state.copy(
                num1 = state.num1.dropLast(1)
            )
        }
    }

    private fun enterDecimal() {
        if (state.operation == null && !state.num1.contains(".") && state.num1.isNotBlank()) {
            state = state.copy(
                num1 = state.num1 + "."
            )
            return
        } else if (state.operation == null && !state.num2.contains(".") && state.num2.isNotBlank()) {
            state = state.copy(
                num2 = state.num2 + "."
            )
        }
    }

    private fun enterNumber(number: Int) {
        if (state.operation == null) {
            if (state.num1.length >= MAX_NUM_LENGTH) {
                return
            }
            state = state.copy(
                num1 = state.num1 + number
            )
            return
        }
        if (state.num1.length >= MAX_NUM_LENGTH) {
            return
        }
        state = state.copy(
            num2 = state.num2 + number
        )
    }

    companion object {
        private const val MAX_NUM_LENGTH = 8
    }

}