package br.senai.sp.jandira.lionschools.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschools.R

@Composable
fun StudentsScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 30.dp, horizontal = 10.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    contentDescription = stringResource(R.string.image_description),
                    painter = painterResource(id = R.drawable.lionschools),
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp)
                )
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = stringResource(R.string.lion_name),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF3347B0)
                    )
                    Text(
                        modifier = Modifier
                            .padding(bottom = 5.dp),
                        text = stringResource(R.string.school_name),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF3347B0)
                    )
                }
                Card(
                    modifier = Modifier
                        .size(45.dp),
                    shape = RoundedCornerShape(50.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(color = Color(0xFFFFC23D)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "DS",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            color = Color(0xFF3347B0)
                        )
                    }
                }
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 25.dp),
                color = Color(0xFFFFC23D)
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(50.dp),
                label = {
                    Text(
                        text = stringResource(R.string.students),
                        fontSize = 14.sp
                    )
                },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = ""
                    )
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    capitalization = KeyboardCapitalization.Words
                )
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 25.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Card(
                    modifier = Modifier
                        .height(28.dp)
                        .weight(1f),
                    shape = RoundedCornerShape(50.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(color = Color(0xFF3347B0)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = stringResource(R.string.all_students),
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp,
                            color = Color.White
                        )
                    }
                }

                Card(
                    modifier = Modifier
                        .height(28.dp)
                        .weight(1f),
                    shape = RoundedCornerShape(50.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(color = Color(0xFFFFC23D)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = stringResource(R.string.students_studying),
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp,
                            color = Color(0xFF3347B0)
                        )
                    }
                }

                Card(
                    modifier = Modifier
                        .height(28.dp)
                        .weight(1f),
                    shape = RoundedCornerShape(50.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(color = Color(0xFFFFC23D)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = stringResource(R.string.finished_students),
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp,
                            color = Color(0xFF3347B0)
                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    contentDescription = "",
                    painter = painterResource(id = R.drawable.hood),
                    modifier = Modifier
                        .width(35.dp)
                        .height(35.dp)
                )
                Text(
                    modifier = Modifier.padding(start = 5.dp),
                    text = stringResource(R.string.students_list),
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    color = Color(0xFF3347B0)
                )
            }
            Column(
                modifier = Modifier
                    .weight(1f)
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .height(100.dp)
                        .padding(top = 5.dp, bottom = 5.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                brush = Brush.horizontalGradient(
                                    colors = listOf(
                                        Color(0xFFCFD4EA),
                                        Color(0xFFB4BDE3)
                                    )
                                )
                            )
                    ) {
                        Spacer(
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(15.dp)
                                .background(color = Color(0xFFFFC23D))
                        )

                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(start = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Card(
                                modifier = Modifier
                                    .size(50.dp),
                                shape = RoundedCornerShape(150.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .background(color = Color(0xFFFFC23D)),
                                    contentAlignment = Alignment.Center,
                                ) {
                                    Image(
                                        painter = painterResource(R.drawable.img),
                                        contentDescription = "",
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clip(CircleShape)
                                    )
                                }
                            }
                            Column(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .padding(start = 10.dp),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = "Luana Oliveira Dias",
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 17.sp
                                )
                                Row(
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Image(
                                        modifier = Modifier
                                            .width(15.dp)
                                            .height(15.dp),
                                        contentDescription = "",
                                        painter = painterResource(R.drawable.credencial)
                                    )

                                    Text(
                                        modifier = Modifier
                                            .padding(start = 3.dp),
                                        text = "28190087",
                                        color = Color.White,
                                        fontSize = 11.sp
                                    )
                                }
                            }
                            Row(
                                modifier = Modifier
                                    .padding(start = 100.dp, top = 60.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    modifier = Modifier
                                        .width(15.dp)
                                        .height(15.dp),
                                    contentDescription = "",
                                    painter = painterResource(R.drawable.calendar)
                                )
                                Text(
                                    modifier = Modifier
                                        .padding(start = 2.dp),
                                    text = "2023",
                                    color = Color(0xFFFFC23D),
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }

                Card(
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .height(100.dp)
                        .padding(top = 5.dp, bottom = 5.dp)
                ) {}

                Card(
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .height(100.dp)
                        .padding(top = 5.dp, bottom = 5.dp)
                ) {}

                Card(
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .height(100.dp)
                        .padding(top = 5.dp, bottom = 5.dp)
                ) {}

                Card(
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .height(100.dp)
                        .padding(top = 5.dp, bottom = 5.dp)
                ) {}

                Card(
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .height(100.dp)
                        .padding(top = 5.dp, bottom = 5.dp)
                ) {}
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun StudentsScreenPreview() {
    StudentsScreen()
}