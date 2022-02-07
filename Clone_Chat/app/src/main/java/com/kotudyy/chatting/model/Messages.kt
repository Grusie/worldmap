package com.kotudyy.chatting.model

data class Messages(
    var message: String = "",
    var timestamp: Long = 0,
    var sender: String = "",
    var read: Boolean = false
)
