package com.nile.pantelis.mycalculator.domain

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalculatorViewModel: ViewModel() {
    var state by mutableStateOf(CalculatorState())

    fun onAction(action: CalculatorAction) {

    }

    private fun enterOperation(operation: CalculatorOperation) {

    }

    private fun calculate() {

    }

    private fun delete() {

    }

    private fun enterDecimal() {

    }

    private fun  enterNumber(number: Int) {

    }

    companion object {
        private const val MAX_NUM_LENGTH = 8
    }

}