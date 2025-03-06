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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nile.pantelis.mycalculator.domain.CalculatorAction
import com.nile.pantelis.mycalculator.domain.CalculatorOperation
import com.nile.pantelis.mycalculator.domain.CalculatorViewModel
import com.nile.pantelis.mycalculator.ui.theme.ClearButtons
import com.nile.pantelis.mycalculator.ui.theme.MyCalculatorTheme
import com.nile.pantelis.mycalculator.ui.theme.MyGreen
import com.nile.pantelis.mycalculator.ui.theme.OperationButtons

@Composable
fun CalculatorScreen(
    viewModel: CalculatorViewModel,
    modifier: Modifier = Modifier
){
    val spacer = 8.dp
    val state = viewModel.state
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
           Text(
               text = state.num1 + (state.operation?.symbol ?: "") + state.num2,
               textAlign = TextAlign.End,
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(horizontal = 8.dp, vertical = 16.dp),
               fontWeight = FontWeight.Light,
               fontSize = 80.sp,
               color = Color.White,
               maxLines = 2,
               lineHeight = 80.sp

           )
           Row (
               modifier = Modifier
                   .fillMaxWidth(),
               horizontalArrangement = Arrangement.spacedBy(spacer)

           ) {
               CalculatorButton(
                   text = "AC",
                   modifier = Modifier
                       .padding(horizontal = 2.dp)
                       .aspectRatio(2f)
                       .weight(2f),
                   color = ClearButtons,
                   onClick = {
                       viewModel.onAction(CalculatorAction.Clear)
                   }

               )
               CalculatorButton(
                   text = "del",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onClick = {
                       viewModel.onAction(CalculatorAction.Delete)
                   }
               )
               CalculatorButton(
                   text = "/",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   color = OperationButtons,
                   onClick = {
                       viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Div))
                   }
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
                   onClick = {
                       viewModel.onAction(CalculatorAction.Number(7))
                   }

               )
               CalculatorButton(
                   text = "8",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onClick = {
                       viewModel.onAction(CalculatorAction.Number(8))
                   }
               )
               CalculatorButton(
                   text = "9",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onClick = {
                       viewModel.onAction(CalculatorAction.Number(9))
                   }
               )
               CalculatorButton(
                   text = "*",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   color = OperationButtons,
                   onClick = {
                       viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Mul))
                   }
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
                   onClick = {
                       viewModel.onAction(CalculatorAction.Number(4))
                   }

               )
               CalculatorButton(
                   text = "5",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onClick = {
                       viewModel.onAction(CalculatorAction.Number(5))
                   }
               )
               CalculatorButton(
                   text = "6",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onClick = {
                       viewModel.onAction(CalculatorAction.Number(6))
                   }
               )
               CalculatorButton(
                   text = "-",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   color = OperationButtons,
                   onClick = {
                       viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Sub))
                   }
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
                   onClick = {
                       viewModel.onAction(CalculatorAction.Number(1))
                   }

               )
               CalculatorButton(
                   text = "2",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onClick = {
                       viewModel.onAction(CalculatorAction.Number(2))
                   }
               )
               CalculatorButton(
                   text = "3",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onClick = {
                       viewModel.onAction(CalculatorAction.Number(3))
                   }
               )
               CalculatorButton(
                   text = "+",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   color = OperationButtons,
                   onClick = {
                       viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Add))
                   }
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
                   onClick = {
                       viewModel.onAction(CalculatorAction.Number(0))
                   }

               )
               CalculatorButton(
                   text = ".",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onClick = {
                       viewModel.onAction(CalculatorAction.Decimal)
                   }
               )
               CalculatorButton(
                   text = "=",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   color = MyGreen,
                   onClick = {
                       viewModel.onAction(CalculatorAction.Calculate)
                   }
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
            viewModel = CalculatorViewModel()
        )
    }
}