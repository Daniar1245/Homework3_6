package com.geektech.homework3_6

import java.io.Serializable

data class Song(val name: String, val artist: String,
                val duration: String,
                val image: String
): Serializable
