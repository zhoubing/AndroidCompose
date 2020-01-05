package com.example.androidcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Clip
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Image
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting("zhoubing")
        }
    }
}

@Composable
fun Greeting(name: String) {
    val image = +imageResource(R.drawable.girl)
    MaterialTheme {
        Column(modifier = Spacing(16.dp)) {
            Container(modifier = Height(180.dp) wraps Expanded) {
                Clip(shape = RoundedCornerShape(8.dp)) {
                    DrawImage(image)
                }
            }
            HeightSpacer(height = 16.dp)
            Text(text = "Hello $name!")
            Text(text = "Hello $name!")
            Text(text = "Hello $name!")
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    Greeting("zhoubing")
}
