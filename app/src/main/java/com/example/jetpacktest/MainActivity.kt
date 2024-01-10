package com.example.jetpacktest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpacktest.ui.theme.JetpackTEstTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackTEstTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Jetpack Compose")
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = modifier
                .weight(1f)
        ){

            DemoCards(
                modifier =modifier
                    .weight(1f),
                bgColor = Color(0xFFEADDFF),
                heading = stringResource(id = R.string.card1_header),
                bodyText = stringResource(id = R.string.card1_des))

            DemoCards(
                modifier =modifier
                    .weight(1f),
                bgColor = Color(0xFFD0BCFF),
                heading = stringResource(id = R.string.card1_header),
                bodyText = stringResource(id = R.string.card1_des))
        }

        Row(
            modifier = modifier
                .weight(1f)
        ){

            DemoCards(
                modifier =modifier
                    .weight(1f),
                bgColor = Color(0xFFB69DF8),
                heading = stringResource(id = R.string.card1_header),
                bodyText = stringResource(id = R.string.card1_des))

            DemoCards(
                modifier =modifier
                    .weight(1f),
                bgColor = Color(0xFFF6EDFF),
                heading = stringResource(id = R.string.card1_header),
                bodyText = stringResource(id = R.string.card1_des))
        }
    }
}

@Composable
fun DemoCards(bgColor: Color, heading : String, bodyText: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(bgColor)
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = heading,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier

        )

        Spacer(modifier = modifier.size(5.dp))

        Text(
            text = bodyText,
            fontSize = 10.sp,
            textAlign = TextAlign.Justify,
        )

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackTEstTheme {
        Greeting("Jetpack Compose")
    }
}