package com.pinta.pintalkapi.controller;

import com.pinta.pintalkapi.dto.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200")
@RestController("/api/messages")
public class ChatController {

    @PostMapping("/echo")
    public Message echo(@RequestBody Message message) {
        return repeat(message);
    }

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public Message send(Message message) {
        return repeat(message);
    }

    private Message repeat(Message message) {
        return new Message(message.getSender(), message.getContent(), message.getDate());
    }
}
