package com.example.hamrogroupproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.nio.file.WatchEvent

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold { innerPadding ->
                LoginBody(innerPadding)
            }
        }
    }
}
@Composable
    fun LoginBody(innerPadding : PaddingValues){
        Column(
            modifier =
                Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
                    .background(color=Color.White)
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp, vertical = 20.dp)


            ){
                Icon(imageVector= Icons.Default.KeyboardArrowLeft,
                    contentDescription = null,
                modifier= Modifier.height(30.dp).width(30.dp)
                )

                Text(text = "Niraj Bam", style = TextStyle(
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic,
                    textDecoration = TextDecoration.Underline,
                    textAlign = TextAlign.Center
                ))
                Icon(
                    painterResource(R.drawable.baseline_more_horiz_24), contentDescription = null,
                    modifier = Modifier.height(30.dp).width(30.dp)
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            )
            {
                
                Image(
                    painter = painterResource(R.drawable.niraj),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.
                    height(120.dp).width(120.dp).clip(shape = RoundedCornerShape(100.dp))
                )
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text("174")
                    Text("Posts")
                }
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text("174k")
                    Text("Followers")
                }
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text("715")
                    Text("Following")
                }

            }

            Column(
                modifier = Modifier.padding(
                    horizontal = 15.dp,
                    vertical = 15.dp
                )
            ){
                Text("Niraj Bam",style= TextStyle(
                    fontWeight =  FontWeight.Bold, color= Color.Red))
                Text("Student", modifier= Modifier.alpha(alpha=0.5f))
                Text("I'm Sugar Daddy")
                Text("NirajBam1@gmail.com")
                Text("Followed by Ragubansi, Yadav Brand and Humaji")

            }
            Row (
                modifier = Modifier
                    .padding(horizontal = 15.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Button(
                    onClick = {
                        //todo when button clicked
                    },
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Blue,
                        contentColor = Color.White
                    )
                ) {
                    Text(text = "Follow")
                }


                OutlinedButton(
                    onClick = {
                        //todo when button clicked
                    },
                    shape = RoundedCornerShape(8.dp),
                    border = BorderStroke(1.dp, Color.LightGray),
                    colors = ButtonDefaults.outlinedButtonColors(
                        contentColor = Color.Black
                    )
                ) {
                    Text(text = "Message")
                }

                OutlinedButton(
                    onClick = {
                        //todo when button clicked
                    },
                    shape = RoundedCornerShape(8.dp),
                    border = BorderStroke(1.dp, Color.LightGray),
                    colors = ButtonDefaults.outlinedButtonColors(

                        contentColor = Color.Black
                    )
                ) {
                    Text(text = "Email")
                }
                OutlinedButton (onClick = {

                }, shape = RoundedCornerShape(10.dp),
                    border = BorderStroke(1.dp,Color.Gray),
                    colors = ButtonDefaults.outlinedButtonColors(
                        contentColor = Color.Black
                    )
                ){
                    Icon(Icons.Default.KeyboardArrowDown,contentDescription = null)
                }

            }

    }
}


@Preview(showBackground = true)
@Composable
fun PreviewLogin(){
    LoginBody(innerPadding = PaddingValues(0.dp))
}

