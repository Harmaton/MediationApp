package com.njagi.mediationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.njagi.mediationapp.ui.theme.MediationAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MediationAppTheme {
                Column(
                    modifier = Modifier.background(Color.Gray).
                            fillMaxSize()

                ){

                }
            }
        }
    }
    @Composable
    fun HeaderProfileComponent(){
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().padding()
        ){

        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MediationAppTheme {

    }
}