package br.senai.sp.jandira.lionschools.screens

import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschools.R

@Composable
fun InicialScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    contentDescription = stringResource(R.string.image_description),
                    painter = painterResource(id = R.drawable.lionschools),
                    modifier = Modifier
                        .width(170.dp)
                        .height(170.dp)
                )
                Column() {
                    Text(
                        modifier = Modifier,
                        text = stringResource(R.string.lion_name),
                        fontSize = 45.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF3347B0)
                    )
                    Text(
                        modifier = Modifier
                            .padding(bottom = 20.dp),
                        text = stringResource(R.string.school_name),
                        fontSize = 45.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF3347B0)
                    )
                }
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(R.string.subtitle_inicial_screen),
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF3347B0),
                    modifier = Modifier
                        .padding(bottom = 10.dp)
                )
                HorizontalDivider(
                    modifier = Modifier
                        .width(50.dp)
                        .clip(RoundedCornerShape(50)),
                    thickness = 5.dp,
                    color = Color(0xFFFFC23D)
                )
                Text(
                    text = stringResource(R.string.description),
                    modifier = Modifier
                        .padding(top = 35.dp)
                        .padding(horizontal = 45.dp),
                    color = Color(0xFF9E9FA4),
                    textAlign = TextAlign.Center,
                    fontSize = 16.sp
                )
            }
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth(0.7f)
                    .height(45.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFFC23D)
                ),
                border = BorderStroke(1.5.dp, Color(0xFF3347B0))
            ) {
                Text(
                    text = stringResource(R.string.get_started_button),
                    color = Color(0xFF3347B0),
                    fontSize = 15.sp
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(0.5f),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    contentDescription = stringResource(R.string.youtube),
                    painter = painterResource(R.drawable.youtube),
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp)
                )
                Image(
                    contentDescription = stringResource(R.string.twitter),
                    painter = painterResource(R.drawable.twitter),
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp)
                )
                Image(
                    contentDescription = stringResource(R.string.instagram),
                    painter = painterResource(R.drawable.instagram),
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp)
                )
                Image(
                    contentDescription = stringResource(R.string.facebook),
                    painter = painterResource(R.drawable.facebook),
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp)
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun InicialScreenPreview() {
    InicialScreen()
}

