package com.example.pagercomposable.Data

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnBoardingScreen(){
    val pageState= rememberPagerState()
    Column {
        HorizontalPager(
            count = datalist.size,
            state = pageState,
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) { page ->  
            PageUi(pager = datalist[page])
        }
        HorizontalPagerIndicator(
            pagerState = pageState,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(20.dp),
            activeColor = Color.Magenta
        )
        AnimatedVisibility(visible = pageState.currentPage==2) {
            Button(onClick = { /*TODO*/ }, modifier = Modifier
                .fillMaxWidth()) {
                Text(text = "Getting Start")
            }
        }
    }
}
@Composable
fun PageUi(pager: Pager){
    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(id = pager.image),
            contentDescription = "image",
            modifier = Modifier.size(200.dp)
            )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = pager.desctription)
        
    }
}