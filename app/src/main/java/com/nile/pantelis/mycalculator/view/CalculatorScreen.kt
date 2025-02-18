package com.nile.pantelis.mycalculator.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nile.pantelis.mycalculator.ui.theme.ClearButtons
import com.nile.pantelis.mycalculator.ui.theme.MyCalculatorTheme

import com.nile.pantelis.mycalculator.ui.theme.MyGreen
import com.nile.pantelis.mycalculator.ui.theme.OperationButtons

@Composable
fun CalculatorScreen(
    modifier: Modifier = Modifier
){
    val spacer = 8.dp
   Box(
       modifier = Modifier
           .fillMaxSize()
           .background(Color.Black)
           .padding(16.dp)
   ) {
       Column(
           modifier = Modifier
               .fillMaxWidth()
               .align(Alignment.BottomCenter),
           verticalArrangement = Arrangement.spacedBy(spacer)
       ) {
           Row (
               modifier = Modifier
                   .fillMaxWidth(),
               horizontalArrangement = Arrangement.spacedBy(spacer)

           ) {
               CalculatorButton(
                   text = "AC",
                   modifier = Modifier
                       .aspectRatio(2f)
                       .weight(2f),
                   color = ClearButtons,
                   onClick = {print("Hello")}

               )
               CalculatorButton(
                   text = "del",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onClick = {print("Hello")}
               )
               CalculatorButton(
                   text = "/",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   color = OperationButtons,
                   onClick = {print("Hello")}
               )
           }

//           ===================================== 7 8 9 =====================================
//           ===================================== 7 8 9 =====================================
//           ===================================== 7 8 9 =====================================
           Row (
               modifier = Modifier
                   .fillMaxWidth(),
               horizontalArrangement = Arrangement.spacedBy(spacer)

           ) {
               CalculatorButton(
                   text = "7",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onClick = {print("Hello")}

               )
               CalculatorButton(
                   text = "8",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onClick = {print("Hello")}
               )
               CalculatorButton(
                   text = "9",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onClick = {print("Hello")}
               )
               CalculatorButton(
                   text = "*",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   color = OperationButtons,
                   onClick = {print("Hello")}
               )
           }

//           ===================================== 4 5 6 =====================================
//           ===================================== 4 5 6 =====================================
//           ===================================== 4 5 6 =====================================
           Row (
               modifier = Modifier
                   .fillMaxWidth(),
               horizontalArrangement = Arrangement.spacedBy(spacer)

           ) {
               CalculatorButton(
                   text = "4",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onClick = {print("Hello")}

               )
               CalculatorButton(
                   text = "5",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onClick = {print("Hello")}
               )
               CalculatorButton(
                   text = "6",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onClick = {print("Hello")}
               )
               CalculatorButton(
                   text = "-",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   color = OperationButtons,
                   onClick = {print("Hello")}
               )
           }

//           ===================================== 1 2 3 =====================================
//           ===================================== 1 2 3 =====================================
//           ===================================== 1 2 3 =====================================
           Row (
               modifier = Modifier
                   .fillMaxWidth(),
               horizontalArrangement = Arrangement.spacedBy(spacer)

           ) {
               CalculatorButton(
                   text = "1",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onClick = {print("Hello")}

               )
               CalculatorButton(
                   text = "2",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onClick = {print("Hello")}
               )
               CalculatorButton(
                   text = "3",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onClick = {print("Hello")}
               )
               CalculatorButton(
                   text = "+",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   color = OperationButtons,
                   onClick = {print("Hello")}
               )
           }

//           =====================================   0   =====================================
//           =====================================   0   =====================================
//           =====================================   0   =====================================
           Row (
               modifier = Modifier
                   .fillMaxWidth(),
               horizontalArrangement = Arrangement.spacedBy(spacer)

           ) {
               CalculatorButton(
                   text = "0",
                   modifier = Modifier
                       .aspectRatio(2f)
                       .weight(2f),
                   onClick = {print("Hello")}

               )
               CalculatorButton(
                   text = ",",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onClick = {print("Hello")}
               )
               CalculatorButton(
                   text = "=",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   color = MyGreen,
                   onClick = {print("Hello")}
               )
           }
       }
   }

}

@Preview(showBackground = true)
@Composable
fun CalculatorScreenPreview() {
    MyCalculatorTheme {
        CalculatorScreen(
        )
    }
}