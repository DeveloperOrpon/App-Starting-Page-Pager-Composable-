package com.example.pagercomposable.Data

import androidx.annotation.DrawableRes
import com.example.pagercomposable.R

data class Pager(
    @DrawableRes val image : Int,
    val desctription:String
)
val datalist= listOf(
    Pager(R.drawable.image,"Page One"),
    Pager(R.drawable.image,"Page Two"),
    Pager(R.drawable.image,"Page Three")
)