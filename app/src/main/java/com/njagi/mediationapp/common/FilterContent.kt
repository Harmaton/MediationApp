package com.njagi.mediationapp.common

import androidx.compose.ui.graphics.Color

data class FilterContent(
    val contentColor: Color,
    val backgroundColor:Color,
    val filterText: String
)

val FILTER_CONTENT_LIST = listOf<FilterContent>(
    FilterContent(Color.White, Color.Black , "Mood Swings" ),
     FilterContent(Color.Black, Color.DarkGray, "Stress" ),
    FilterContent(Color.Black, Color.DarkGray, "Depression" ),
    FilterContent(Color.Black, Color.DarkGray, "Anxiety" ),
    FilterContent(Color.Black, Color.DarkGray, "Anger" ),
    FilterContent(Color.Black, Color.DarkGray, "Desire" ),
    FilterContent(Color.Black, Color.DarkGray, "Fear" ),
    FilterContent(Color.Black, Color.DarkGray, "Joy" )
)