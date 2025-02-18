package com.nile.pantelis.mycalculator.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nile.pantelis.mycalculator.ui.theme.MyCalculatorTheme
import com.nile.pantelis.mycalculator.ui.theme.NumberButtons

@Composable
fun CalculatorButton(
    text: String,
    modifier: Modifier = Modifier,
    fontStyle: TextStyle = TextStyle(),
    fontColor: Color = Color.White,
    color: Color = NumberButtons,
    onClick: () -> Unit
){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .background(color = color)
            .clip(RoundedCornerShape(100.dp))
            .clickable {
                 onClick()
            }
            .then(modifier)
        ,

    ) {
        Text(
            text = text,
            style = fontStyle,
            fontSize = 36.sp,
            color = fontColor
        )
    }
}


@Preview(showBackground = true)
@Composable
fun CalculatorButtonPreview() {
    MyCalculatorTheme {
        CalculatorButton(
            text = "9",
            color = Color.Gray,
            onClick = {print("Hello")}
        )
    }
}
