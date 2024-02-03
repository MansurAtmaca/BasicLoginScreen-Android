package com.example.basicloginscreen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation


@Composable
fun CustumTextfield(value: MutableState<String>, labelText: String,keyboardType:KeyboardType) {

    OutlinedTextField(

        value = value.value,
        onValueChange = { value.value = it },
        label = { Text(text = labelText) },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 8.dp),
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = keyboardType
        ),



        )
}