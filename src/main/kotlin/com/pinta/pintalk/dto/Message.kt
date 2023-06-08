package com.pinta.pintalk.dto

import java.time.LocalDateTime

data class Message(
    val from: String,
    val time: LocalDateTime = LocalDateTime.now(),
    val content: String,
)
