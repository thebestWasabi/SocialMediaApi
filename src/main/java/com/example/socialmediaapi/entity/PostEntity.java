package com.example.socialmediaapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PostEntity {

    private Long id;
    private String title;
    private String text;

    @Lob
    @Column(name = "image", length = 1000)
    private byte[] imageData;

    private LocalDateTime createdAt;
    private UserEntity user;

    public PostEntity() {
        this.createdAt = LocalDateTime.now();
    }

    public PostEntity(String title, String text, byte[] imageData, UserEntity user) {
        this.title = title;
        this.text = text;
        this.user = user;
        this.imageData = imageData;
        this.createdAt = LocalDateTime.now();
    }

}
