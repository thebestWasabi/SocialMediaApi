package com.example.socialmediaapi.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PostEntity {

    private Long id;
    private String text;
    private LocalDateTime createdAt;
    private UserEntity user;

    public PostEntity() {
        this.createdAt = LocalDateTime.now();
    }

    public PostEntity(String text, UserEntity user) {
        this.text = text;
        this.user = user;
        this.createdAt = LocalDateTime.now();
    }
}
