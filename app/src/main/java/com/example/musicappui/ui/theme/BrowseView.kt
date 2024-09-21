package com.example.musicappui.ui.theme

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import com.example.musicappui.R

@Composable
fun BrowseScreen(){
    val browseItems= listOf("music","dance","NTR","Prabhakar","mad2","SURYA")
    LazyVerticalGrid(columns = GridCells.Fixed(2)){
        items(browseItems){
            brow->
           BrowserItem(cat = brow, drawable = R.drawable.ic_subscribe)
        }
    }
}




