package com.example.hamrogroupproject

import android.os.Bundle
import android.provider.Settings
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



class Task: ComponentActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CardScreen()
        }
    }
}
@Composable
fun CardScreen(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF00C897))
            .padding(16.dp)
    ){
        TopBar()
        Spacer(modifier= Modifier.height(40.dp))
        CardGrid()
        Spacer(modifier = Modifier.height(16.dp))
        SettingsButton()
    }
}
@Composable
fun TopBar() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(
                text = "Card",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Text(
                text = "Simple and easy to use app",
                fontSize = 17.sp,
                color = Color.White
            )
        }
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Color.White, CircleShape)
                .clip(CircleShape)
        ) {
            Image(
                painter = painterResource(R.drawable.person),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Composable
fun CardGrid() {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            CardItem(title = "Text", itemCount = "7 items", imageRes = R.drawable.text_icon)
            CardItem(title = "Address", itemCount = "3 items", imageRes = R.drawable.address_icon)
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            CardItem(title = "Character", itemCount = "15 items", imageRes = R.drawable.character_icon)
            CardItem(title = "Bank card", itemCount = "5 items", imageRes = R.drawable.bankcard)
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            CardItem(title = "Password", itemCount = "9 items", imageRes = R.drawable.password_icon)
            CardItem(title = "Logistics", itemCount = "13 items", imageRes = R.drawable.logistics_icon)
        }
    }
}

@Composable
fun CardItem(title: String, itemCount: String, imageRes: Int) {
    Card(
        modifier = Modifier
            .size(width = 170.dp, height = 170.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = title,
                modifier = Modifier
                    .size(50.dp)
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = title,
                color = Color.Black,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(6.dp))

        }
    }
}

@Composable
fun SettingsButton() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(start = 16.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_settings),
                contentDescription = "Settings",
                tint = Color(0xFF00C897),
                modifier = Modifier.size(28.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = "Settings",
                color = Color.Black,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardScreenPreview() {
    CardScreen()
}