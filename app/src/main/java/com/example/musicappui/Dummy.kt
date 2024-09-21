package com.example.musicappui

import androidx.annotation.DrawableRes

data class Lib(@DrawableRes val icon:Int,
    val name:String)

val libraries= listOf<Lib>(
    Lib(R.drawable.baseline_queue_music_24,name="Playlists"),
    Lib(R.drawable.baseline_mic_none_24,name="Artists"),
    Lib(R.drawable.baseline_album_24,name="Album"),
    Lib(R.drawable.baseline_music_note_24, name = "Songs"),
    Lib(R.drawable.baseline_repeat_24, name = "Genre")
)
