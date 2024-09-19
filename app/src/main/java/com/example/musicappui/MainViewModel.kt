package com.example.musicappui

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
    private val _currScreen:MutableState<Screen> = mutableStateOf(Screen.DrawerScreen.AddAccount)
    val currScreen:MutableState<Screen>
        get()=_currScreen
    fun setCurrScreen(screen: Screen){
        _currScreen.value=screen
    }
}