package com.example.socialmediaapi.entity;

import lombok.Data;

import java.util.List;

@Data
public class UserEntity {

    private Long id;
    private String name;
    private String username;
    private String password;
    private String passwordConfirmation;

    private List<PostEntity> posts;
    private List<MessageEntity> sentMessages;
    private List<MessageEntity> receivedMessages;
}
