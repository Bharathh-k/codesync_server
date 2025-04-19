package com.example.colabed.api.controller;

import com.example.colabed.api.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class SocketController {

    @MessageMapping("/sendMessage") // Frontend sends to /app/sendMessage
    @SendTo("/topic/messages") // Everyone subscribed to /topic/messages gets it
    public Message sendMessage(Message message) {
        System.out.println("Received message: " + message.getContent());
        return message;
    }
}
