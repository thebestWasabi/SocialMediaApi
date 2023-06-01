package com.example.socialmediaapi.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MessageEntity {

    private Long id;
    private String text;
    private LocalDateTime sentAt;
    private UserEntity sender;
    private UserEntity recipient;

    public MessageEntity() {
        this.sentAt = LocalDateTime.now();
    }

    public MessageEntity(String text, UserEntity sender, UserEntity recipient) {
        this.text = text;
        this.sender = sender;
        this.recipient = recipient;
        this.sentAt = LocalDateTime.now();
    }
}
