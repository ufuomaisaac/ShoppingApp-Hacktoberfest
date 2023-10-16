package com.example.shoppingapp_hacktoberfest.ui.theme.UI.SignUp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shoppingapp_hacktoberfest.Greeting
import com.example.shoppingapp_hacktoberfest.R
import com.example.shoppingapp_hacktoberfest.ui.theme.ShoppingApphacktoberfestTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen() {

    var email by remember {
        mutableStateOf("")
    }
    var password by remember { mutableStateOf(TextFieldValue()) }
    var passwordVisibility by remember { mutableStateOf(false) }
    var cpassword by remember { mutableStateOf("") }
    var cPasswordVisibility by remember { mutableStateOf(false) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(start = 10.dp, end = 10.dp, bottom = 30.dp, top = 20.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.backimage),
            modifier = Modifier.size(230.dp),
            contentDescription = "Sign Up Image"
        )
        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            text = "Let's Get Started",
            style = TextStyle(fontWeight = FontWeight.Bold),
            fontSize = 25.sp, color = Color.Black.copy(0.6f)
        )
        Text(
            text = "Create an account",
            style = TextStyle(fontWeight = FontWeight.Normal),
            fontSize = 15.sp, color = Color(0xFFA9A9A9)
        )
        Spacer(modifier = Modifier.padding(10.dp))
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            OutlinedTextField(
                value = email,
                onValueChange = {
                    email = it
                },
                singleLine = true,
                label = {
                    Text(text = "email")
                },
                placeholder = { Text(text = "username@gmail.com") },
                modifier = Modifier.fillMaxWidth(0.8f),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color(0xFF281B48)
                )
            )
            OutlinedTextField(
                value = password,
                onValueChange = {
                    password = it
                },
                singleLine = true,
                label = {
                    Text(
                        text = "password"
                    )
                },
                placeholder = { Text(text = "********") },
                trailingIcon = {
                    IconButton(
                        onClick = { passwordVisibility = !passwordVisibility }
                    ) {
                        Icon(
                            painter = painterResource(id = if (passwordVisibility) R.drawable.view else R.drawable.hidden),
                            contentDescription =""
                        )
                    }
                },
                visualTransformation = if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                modifier = Modifier.fillMaxWidth(0.8f),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color(0xFF281B48)
                )
            )
            OutlinedTextField(
                value = cpassword,
                onValueChange = {
                    cpassword = it
                },
                singleLine = true,
                label = {
                    Text(
                        text = "Re-enter password"
                    )
                },
                placeholder = { Text(text = "********") },
                trailingIcon = {
                    IconButton(
                        onClick = { cPasswordVisibility = !cPasswordVisibility }
                    ) {
                        Icon(
                            painter = painterResource(id = if (cPasswordVisibility) R.drawable.view else R.drawable.hidden),
                            contentDescription =""
                        )
                    }
                },
                visualTransformation = if (cPasswordVisibility) VisualTransformation.None else PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                modifier = Modifier.fillMaxWidth(0.8f),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color(0xFF281B48)
                )
            )
            Spacer(modifier = Modifier.padding(20.dp))
            Button(
                onClick = {

                },
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF281B48))
            ) {
                Text(
                    text = "SIGN UP",
                    fontSize = 18.sp,
                    letterSpacing = 0.sp,
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.padding(12.dp))
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                Text(
                    text = "Already have an account ?",
                    style = TextStyle(fontWeight = FontWeight.Normal),
                    fontSize = 16.sp, color = Color.Black.copy(0.6f)
                )
                Spacer(modifier = Modifier.padding(2.dp))
                Text(
                    text = "Sign In",
                    style = TextStyle(fontWeight = FontWeight.SemiBold),
                    fontSize = 16.sp, color =  Color(0xFF281B48)
                )
            }
        }

    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ShoppingApphacktoberfestTheme {
        SignUpScreen()
    }
}