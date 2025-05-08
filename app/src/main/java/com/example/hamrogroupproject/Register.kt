package com.example.hamrogroupproject


import android.app.DatePickerDialog
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.platform.LocalContext
import java.util.*

class Register : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RegisterBody()
        }
    }

    @Composable
    fun RegisterBody() {
        val context = LocalContext.current

        var firstName by remember { mutableStateOf("") }
        var lastName by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var country by remember { mutableStateOf("") }
        var dob by remember { mutableStateOf("") }
        var gender by remember { mutableStateOf("") }
        var termsAccepted by remember { mutableStateOf(false) }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Register", modifier = Modifier.padding(bottom = 16.dp))

            OutlinedTextField(
                value = firstName,
                onValueChange = { firstName = it },
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text(text = "First Name") }
            )

            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                value = lastName,
                onValueChange = { lastName = it },
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text(text = "Last Name") }
            )

            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text(text = "Email") },
                keyboardOptions = KeyboardOptions.Default
            )

            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                value = country,
                onValueChange = { country = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable(onClick = {
                        // Open a dropdown menu for country selection
                    }),
                placeholder = { Text(text = "Select Country") },
                readOnly = true
            )

            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                value = dob,
                onValueChange = { dob = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable(onClick = {
                        val calendar = Calendar.getInstance()
                        val datePickerDialog = DatePickerDialog(
                            context,
                            { _, year, month, dayOfMonth ->
                                dob = "$dayOfMonth/${month + 1}/$year"
                            },
                            calendar.get(Calendar.YEAR),
                            calendar.get(Calendar.MONTH),
                            calendar.get(Calendar.DAY_OF_MONTH)
                        )
                        datePickerDialog.show()
                    }),
                placeholder = { Text(text = "Date of Birth") },
                readOnly = true
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(text = "Gender")
            Row {
                RadioButton(selected = gender == "Male", onClick = { gender = "Male" })
                Text(text = "Male")
                RadioButton(selected = gender == "Female", onClick = { gender = "Female" })
                Text(text = "Female")
                RadioButton(selected = gender == "Others", onClick = { gender = "Others" })
                Text(text = "Others")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = termsAccepted,
                    onCheckedChange = { termsAccepted = it }
                )
                Text(text = "I accept terms and conditions")
            }

            Button(
                onClick = {
                    // Handle registration logic here
                },
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Text(text = "Register")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(text = "Already have an account? Sign in.")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRegister() {
    Register().RegisterBody()
}