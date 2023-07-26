package com.example.composeapp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.lerp
import coil.compose.rememberAsyncImagePainter
import com.example.composeapp.R
import com.example.composeapp.model.UnSplashPhotos
import com.example.composeapp.service.RetrofitService
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.math.absoluteValue

@OptIn(ExperimentalPagerApi::class)
@Composable
fun HorizontalCrousal() {
    val page = 1
    val perPage = 30
    var images by remember {
        mutableStateOf(emptyList<UnSplashPhotos>())
    }
    val coroutineScope = rememberCoroutineScope()
    val pagerState = rememberPagerState(initialPage = images.size)

    LaunchedEffect(Unit) {
        val photos: List<UnSplashPhotos> = withContext(Dispatchers.IO) {
            RetrofitService.unsplashApiService.getPhotos(page, perPage)
        }
        images = photos
    }
    if (images.isNotEmpty()) {
        LaunchedEffect(pagerState.currentPage) {
            while (true) {
                delay(4000) // Change image every 4 second
                coroutineScope.launch {
                    pagerState.animateScrollToPage((pagerState.currentPage + 1) % images.size)
                }
            }
        }
    }
    HorizontalPager(
        count = images.size,
        state = pagerState
    ) { pages ->
        val imageUrl = images.getOrNull(pages)?.urls?.regular
        if(imageUrl!!.isNotEmpty()) {
            Image(
                painter = rememberAsyncImagePainter(model = imageUrl),
                contentDescription = "header image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .carouselTransition(pages, pagerState)
            )
        } else {
            Image(
                painter = painterResource(id = R.drawable.header_image),
                contentDescription = "header image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Modifier.carouselTransition(page: Int, pagerState: PagerState) =
    graphicsLayer {
        val pageOffset =
            ((pagerState.currentPage - page) + pagerState.currentPageOffset).absoluteValue

        val transformation =
            lerp(
                start = 0.7.dp,
                stop = 1.dp,
                fraction = 1f - pageOffset.coerceIn(0f, 1f)
            )
        alpha = transformation.toPx()
        scaleY = transformation.toPx()
    }

