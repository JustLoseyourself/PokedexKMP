package com.loseyourself.pokedex

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform