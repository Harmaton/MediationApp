package com.njagi.mediationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.njagi.mediationapp.ui.theme.MediationAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MediationAppTheme {
                Column(
                    modifier = Modifier
                        .background(Color.Gray)
                        .fillMaxSize()

                ) {
                    HeaderProfileComponent()
                }
            }
        }
    }


}
@Composable
fun HeaderProfileComponent() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Gray)
            .padding(start = 15.dp, end = 15.dp, top = 15.dp)
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically
        )
        {

            Image(painter = painterResource(id = R.drawable.ic_baseline_self_improvement_24),
                contentDescription ="profile picture"  ,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
            )

            Column(
                modifier = Modifier.padding(start = 10.dp)
            ) {
                Text(text = "Welcome Back,",
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Light,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Start
                )
                Text(text = "Njagi SirSusten",
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Medium,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Start
                )
            }

        }

        BadgedBox(badge = { Badge(backgroundColor = Color.Red)}) {
            Icon(imageVector = Icons.Default.Notifications,
                contentDescription ="Notifications badge" )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun HeaderPreview(){
    MediationAppTheme {
        HeaderProfileComponent()
    }
}