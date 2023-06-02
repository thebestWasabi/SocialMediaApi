package com.example.socialmediaapi.repository.impl;

import com.example.socialmediaapi.entity.UserEntity;
import com.example.socialmediaapi.repository.UserRepository;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public Optional<UserEntity> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<UserEntity> findByUserName(String username) {
        return Optional.empty();
    }

    @Override
    public void update(UserEntity user) {

    }

    @Override
    public void create(UserEntity user) {

    }

    @Override
    public void insertUser(Long userId) {

    }

    @Override
    public boolean isPostOwner(Long userId, Long postId) {
        return false;
    }

    @Override
    public void delete(Long id) {

    }

}
