package com.namlx.jetpackcomposecodelab1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.namlx.jetpackcomposecodelab1.ui.theme.JetpackComposeCodeLab1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeCodeLab1Theme {
                // A surface container using the 'background' color from the theme
                MyApplication(modifier = Modifier.fillMaxSize())
            }
        }
    }
}

@Composable
private fun MyApplication(modifier: Modifier = Modifier, names: List<String> = listOf("World","Compose")){
    Surface(modifier = modifier, color = MaterialTheme.colorScheme.background) {
        Column(modifier) {
            names.forEach {
                Greeting(name = it)
            }
        }
    }
}

/**
 * Coding in here
 */
@Composable
fun Greeting(name: String) {
    Surface(color = MaterialTheme.colorScheme.primary, modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)) {
        Column(modifier = Modifier.padding(24.dp).fillMaxWidth()) {
            Text(text = "Hello,")
            Text(text = name)
        }
    }
}

@Preview(showBackground = true, )
@Composable
private fun DefaultPreview() {
    JetpackComposeCodeLab1Theme {
        MyApplication()
    }
}