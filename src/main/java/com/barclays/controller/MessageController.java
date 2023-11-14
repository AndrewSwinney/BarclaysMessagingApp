package com.barclays.controller;

import com.barclays.model.Message;
import com.barclays.service.MessageService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService){
        this.messageService = messageService;
    }

    @GetMapping("/messages")
    public List<Message> getAllMessages() {
        return messageService.findAll();
    }

    @GetMapping("/messages/{id}")
    public Message getMessage(@PathVariable int id) {
        return messageService.findById(id);
    }
}
