package com.javiersc.cleanArchAndroid.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ContextAmbient
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.style.TextAlign
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Content()
        }
    }
}

@Preview
@Composable
fun Content() {
    Scaffold(
        topBar = { TopBar() },
        bodyContent = { BodyContent() }
    )
}

@Composable
fun TopBar() {
    TopAppBar(
        title = { Text(ContextAmbient.current.getString(R.string.app_name)) },
        backgroundColor = Color.White,
    )
}

@Composable
fun BodyContent() {
    Column(
        modifier = Modifier.fillMaxHeight().fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalGravity = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Hello!",
            style = MaterialTheme.typography.h6,
            textAlign = TextAlign.Center,
        )
    }
}
