package com.pinta.pintalk.controller

import com.pinta.pintalk.dto.Message
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.web.bind.annotation.RestController


@RestController("/api/messages")
class ChatController{

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    @Throws(Exception::class)
    fun send(message: Message): Message? {
        return Message(message.from, message.time, message.content)
    }

}
