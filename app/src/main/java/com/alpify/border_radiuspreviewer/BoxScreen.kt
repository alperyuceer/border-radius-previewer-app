package com.alpify.border_radiuspreviewer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BoxScreen(modifier: Modifier = Modifier) {
    var topStartRadius by remember { mutableIntStateOf(0) }
    var topEndRadius by remember { mutableIntStateOf(0) }
    var bottomEndRadius by remember { mutableIntStateOf(0) }
    var bottomStartRadius by remember { mutableIntStateOf(0) }



    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(top = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .clip(
                    shape = RoundedCornerShape(
                        topStartRadius.dp,
                        topEndRadius.dp,
                        bottomEndRadius.dp,
                        bottomStartRadius.dp
                    )
                )
                .background(Color.Blue)


        ) { }
        Column(
            modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 20.dp),
        ) {
            var sliderPosition1 by remember { mutableFloatStateOf(0f) }
            var sliderPosition2 by remember { mutableFloatStateOf(0f) }
            var sliderPosition3 by remember { mutableFloatStateOf(0f) }
            var sliderPosition4 by remember { mutableFloatStateOf(0f) }

            Slider(
                value = sliderPosition1,
                onValueChange = {
                    sliderPosition1 = it
                    topStartRadius = (sliderPosition1 * 100).toInt()
                }
            )
            Text(text = (sliderPosition1 * 100).toInt().toString())

            Slider(
                value = sliderPosition2,
                onValueChange = {
                    sliderPosition2 = it
                    topEndRadius = (sliderPosition2 * 100).toInt()
                }
            )
            Text(text = (sliderPosition2 * 100).toInt().toString())

            Slider(
                value = sliderPosition3,
                onValueChange = {
                    sliderPosition3 = it
                    bottomEndRadius = (sliderPosition3 * 100).toInt()
                }
            )
            Text(text = (sliderPosition3 * 100).toInt().toString())

            Slider(
                value = sliderPosition4,
                onValueChange = {
                    sliderPosition4 = it
                    bottomStartRadius = (sliderPosition4 * 100).toInt()
                }
            )
            Text(text = (sliderPosition4 * 100).toInt().toString())


        }
    }


}

@Preview
@Composable
fun PreviewBoxScreen(modifier: Modifier = Modifier) {
    BoxScreen()

}