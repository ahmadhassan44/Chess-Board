package com.example.chessboard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chessboard.ui.theme.ChessBoardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChessBoardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ChessBoard()
                }
            }
        }
    }
}

@Composable
fun ChessBoard( modifier: Modifier = Modifier) {

    Column(verticalArrangement = Arrangement.Center, modifier = Modifier.background(Color(0xFFA6A3A3))) {
        Spacer(modifier=Modifier.height(150.dp))
        Column {
            Row(modifier=Modifier.padding(start = 10.dp, end = 10.dp), horizontalArrangement =
            Arrangement.Center,) {
                Column(modifier=Modifier.padding(start = 17.dp, end = 18.dp, top = 10.dp, bottom
                = 10.dp)) {
                    Text(text = "A")
                }
                Column(modifier=Modifier.padding(start = 17.dp, end = 18.dp, top = 10.dp, bottom
                = 10.dp)) {
                    Text(text = "B")
                }
                Column(modifier=Modifier.padding(start = 17.dp, end = 18.dp, top = 10.dp, bottom
                = 10.dp)) {
                    Text(text = "C")
                }
                Column(modifier=Modifier.padding(start = 17.dp, end = 18.dp, top = 10.dp, bottom
                = 10.dp)) {
                    Text(text = "D")
                }
                Column(modifier=Modifier.padding(start = 17.dp, end = 18.dp, top = 10.dp, bottom
                = 10.dp)) {
                    Text(text = "E")
                }
                Column(modifier=Modifier.padding(start = 17.dp, end = 18.dp, top = 10.dp, bottom
                = 10.dp)) {
                    Text(text = "F")
                }
                Column(modifier=Modifier.padding(start = 17.dp, end = 18.dp, top = 10.dp, bottom
                = 10.dp)) {
                    Text(text = "G")
                }
                Column(modifier=Modifier.padding(start = 17.dp, end = 18.dp, top = 10.dp, bottom
                = 10.dp)) {
                    Text(text = "H")
                }

            }
            Row(modifier=Modifier.padding(start = 10.dp, end = 10.dp)) {
                Column(verticalArrangement = Arrangement.Top, modifier=Modifier.width(50.dp)
                    .height
                    (50.dp)
                    .weight(1F).background
                    (Color
                    (0xFF000000))) {
                    Text(text="1", color = Color.White, fontSize = 15.sp )
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
            }
            Row(modifier=Modifier.padding(start = 10.dp, end = 10.dp)) {
                Column(verticalArrangement = Arrangement.Top, modifier=Modifier.width(50.dp)
                    .height
                    (50.dp)
                    .weight(1F).background
                    (Color
                    (0xFFFFFFFF))) {
                    Text(text="2", color = Color.Black, fontSize = 15.sp )
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
            }
            Row(modifier=Modifier.padding(start = 10.dp, end = 10.dp)) {
                Column(verticalArrangement = Arrangement.Top, modifier=Modifier.width(50.dp)
                    .height
                    (50.dp)
                    .weight(1F).background
                    (Color
                    (0xFF000000))) {
                    Text(text="3", color = Color.White, fontSize = 15.sp  )
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
            }
            Row(modifier=Modifier.padding(start = 10.dp, end = 10.dp)) {
                Column(verticalArrangement = Arrangement.Top, modifier=Modifier.width(50.dp)
                    .height
                    (50.dp)
                    .weight(1F).background
                    (Color
                    (0xFFFFFFFF))) {
                    Text(text="4", color = Color.Black, fontSize = 15.sp )
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
            }
            Row(modifier=Modifier.padding(start = 10.dp, end = 10.dp)) {
                Column(verticalArrangement = Arrangement.Top, modifier=Modifier.width(50.dp)
                    .height
                    (50.dp)
                    .weight(1F).background
                    (Color
                    (0xFF000000))) {
                    Text(text="5", color = Color.White, fontSize = 15.sp )
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
            }
            Row(modifier=Modifier.padding(start = 10.dp, end = 10.dp)) {
                Column(verticalArrangement = Arrangement.Top, modifier=Modifier.width(50.dp)
                    .height
                    (50.dp)
                    .weight(1F).background
                    (Color
                    (0xFFFFFFFF))) {
                    Text(text="6", color = Color.Black, fontSize = 15.sp )
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
            }
            Row(modifier=Modifier.padding(start = 10.dp, end = 10.dp)) {
                Column(verticalArrangement = Arrangement.Top, modifier=Modifier.width(50.dp)
                    .height
                    (50.dp)
                    .weight(1F).background
                    (Color
                    (0xFF000000))) {
                    Text(text="7", color = Color.White, fontSize = 15.sp )
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
            }
            Row(modifier=Modifier.padding(start = 10.dp, end = 10.dp)) {
                Column(verticalArrangement = Arrangement.Top, modifier=Modifier.width(50.dp)
                    .height
                    (50.dp)
                    .weight(1F).background(Color
                    (0xFFFFFFFF))) {
                    Text(text="8", color = Color.Black, fontSize = 15.sp )
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFFFFFFFF))) {
                }
                Column(modifier=Modifier.width(50.dp).height(50.dp).weight(1F).background(Color
                    (0xFF000000))) {
                }
            }
        }
        Spacer(modifier=Modifier.height(150.dp))



    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ChessBoardTheme {
        ChessBoard()
    }
}