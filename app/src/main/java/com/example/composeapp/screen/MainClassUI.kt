package com.example.composeapp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp.R
import com.example.composeapp.ui.theme.lightGray

@Composable
fun MainUi() {
    val scrollState = rememberScrollState()
    BoxWithConstraints(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(scrollState)) {
        Column(modifier = Modifier.fillMaxWidth()) {
            HorizontalCrousal()
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 200.dp)
                .background(Color.Black)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp, start = 15.dp, end = 15.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,

                ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.man_image),
                            contentDescription = "man image",
                            contentScale = ContentScale.Crop
                        )
                    }
                    Text(
                        text = "Biel Morrow",
                        color = Color.White,
                        modifier = Modifier.padding(start = 8.dp),
                        fontWeight = FontWeight.Bold
                    )
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(id = R.drawable.download),
                        contentDescription = "download icon",
                        tint = Color.White,
                        modifier = Modifier
                            .padding(end = 20.dp)
                            .size(34.dp)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.favorite),
                        contentDescription = "download icon",
                        tint = Color.White,
                        modifier = Modifier
                            .padding(end = 12.dp)
                            .size(34.dp)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.bookmark),
                        contentDescription = "download icon",
                        tint = Color.White,
                        modifier = Modifier
                            .padding(start = 15.dp)
                            .size(34.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(40.dp))
            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp), color = lightGray
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp, top = 20.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Camera",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 19.sp
                    )

                    Text(
                        text = "Aperture",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 19.sp
                    )
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "NIKON D3200",
                        color = Color.White,
                        fontSize = 15.sp,
                        textAlign = TextAlign.Start
                    )

                    Text(
                        text = "f/50",
                        color = Color.White,
                        fontSize = 15.sp,
                        textAlign = TextAlign.Start
                    )
                }

            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp, top = 20.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Focal length",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 19.sp
                    )

                    Text(
                        text = "Shutter Speed",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 19.sp
                    )
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "18.0 mm",
                        color = Color.White,
                        fontSize = 15.sp,
                        textAlign = TextAlign.Start
                    )

                    Text(
                        text = "1/125s",
                        color = Color.White,
                        fontSize = 15.sp,
                        textAlign = TextAlign.Start
                    )
                }

            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp, top = 20.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "ISO",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 19.sp
                    )

                    Text(
                        text = "Dimensions",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 19.sp
                    )
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "100",
                        color = Color.White,
                        fontSize = 15.sp,
                        textAlign = TextAlign.Start
                    )

                    Text(
                        text = "3906 x 4882",
                        color = Color.White,
                        fontSize = 15.sp,
                        textAlign = TextAlign.Start
                    )
                }

            }

            Spacer(modifier = Modifier.height(40.dp))
            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp), color = lightGray
            )

            Row(
                modifier = Modifier
                    .padding(top = 30.dp, start = 40.dp, end = 40.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Views",
                    color = Color.White,
                    fontSize = 19.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Downloads",
                    color = Color.White,
                    fontSize = 19.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Likes",
                    color = Color.White,
                    fontSize = 19.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Row(
                modifier = Modifier
                    .padding(start = 50.dp, end = 50.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "8.8M",
                    color = Color.White,
                    fontSize = 15.sp,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "99.1k",
                    color = Color.White,
                    fontSize = 15.sp,
                    textAlign = TextAlign.Center
                )

                Text(
                    text = "1.8k",
                    color = Color.White,
                    fontSize = 15.sp,
                    textAlign = TextAlign.Center
                )
            }

            Spacer(modifier = Modifier.height(30.dp))
            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp), color = lightGray
            )

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)) {
                Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                    containerColor = lightGray,
                    contentColor = Color.White,
                ),
                    modifier = Modifier.padding(end = 15.dp)
                    ) {
                    Text(text = "barcelona")
                }

                Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                    containerColor = lightGray,
                    contentColor = Color.White,
                ),
                    modifier = Modifier.padding(end = 15.dp)
                ) {
                    Text(text = "spain")
                }
            }


        }
    }
}

@Preview
@Composable
fun MainPreview() {
    MainUi()
}