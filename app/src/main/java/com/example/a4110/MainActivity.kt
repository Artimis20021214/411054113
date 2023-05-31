package com.example.a4110

import android.content.pm.ActivityInfo
import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a4110.ui.theme.張予綸4110Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContent {
            張予綸4110Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {

    Column( modifier = Modifier.fillMaxSize(),verticalArrangement = Arrangement.Center,horizontalAlignment = Alignment.CenterHorizontally ) {
        Text(text = "資管2B 張予綸 ")
        Image(

            painter = painterResource(id = R.drawable.map),
            contentDescription = "地圖",


        )
    }
    Box(

        modifier = Modifier.fillMaxSize()

    ){

        Canvas(modifier = Modifier){
            drawRect(color = androidx.compose.ui.graphics.Color.Blue, Offset(780f,200f),Size(40f,40f)
            )

        }
        Canvas(modifier = Modifier){
            drawRect(color = androidx.compose.ui.graphics.Color.Blue, Offset(1600f,920f),Size(40f,40f)
            )

        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    張予綸4110Theme {
        Greeting("Android")
    }
}