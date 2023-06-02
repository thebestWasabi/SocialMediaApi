package com.example.socialmediaapi.service;

import com.example.socialmediaapi.entity.UserEntity;

public interface UserService {

    UserEntity getById(Long id);

    UserEntity getByUserName(String username);

    UserEntity update(UserEntity user);

    UserEntity create(UserEntity user);

    boolean isPostOwner(Long userId, Long postId);

    void delete(Long id);

}
