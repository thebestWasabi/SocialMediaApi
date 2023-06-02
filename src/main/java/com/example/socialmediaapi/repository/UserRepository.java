package com.example.socialmediaapi.repository;

import com.example.socialmediaapi.entity.UserEntity;

import java.util.Optional;

public interface UserRepository {

    Optional<UserEntity> findById(Long id);

    Optional<UserEntity> findByUserName(String username);

    void update(UserEntity user);

    void create(UserEntity user);

    void insertUser(Long userId);

    boolean isPostOwner(Long userId, Long postId);

    void delete(Long id);
}
