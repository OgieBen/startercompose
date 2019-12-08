package com.ogieben.startercompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.*
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.material.MaterialTypography
import androidx.ui.material.surface.Surface
import androidx.ui.material.withOpacity
import androidx.ui.res.imageResource
import androidx.ui.text.style.TextOverflow
import androidx.ui.tooling.preview.Preview
import com.ogieben.startercompose.ui.components.App

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App {
                NewStory()
            }
        }
    }
}

@Composable
fun NewStory() {
    val _image = +imageResource(R.drawable.ic_header_compose_ui)
    MaterialTheme {
        val typography = MaterialTypography()
        Column(modifier = Spacing(16.dp)) {
            Container(padding = EdgeInsets(12.dp), height = 180.dp, expanded = true) {
                Clip(shape = RoundedCornerShape(12.dp)) {
                    DrawImage(image = _image)
                }
            }

            HeightSpacer(height = 16.dp)
            Text(
                "A simple Header",
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                style = typography.h3.withOpacity(0.56f)
            )
            Text(
                "Hey Check this article",
                style = typography.body1.withOpacity(0.78f)
            )
            Surface(color = Color.Gray) {
                Text(
                    "Note the difference?",
                    modifier = Spacing(24.dp),
                    style = typography.body2.withOpacity(1.0f)
                )
            }
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
  App {
        NewStory()
    }
}
