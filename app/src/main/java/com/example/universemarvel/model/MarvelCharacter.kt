package com.example.universemarvel.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MarvelCharacter (
    val characterName: String,
    val description: String,
    val longDescription: String
) : Parcelable


