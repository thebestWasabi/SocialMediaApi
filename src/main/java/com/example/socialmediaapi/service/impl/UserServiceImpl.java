package com.example.socialmediaapi.service.impl;

import com.example.socialmediaapi.entity.UserEntity;
import com.example.socialmediaapi.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserEntity getById(Long id) {
        return null;
    }

    @Override
    public UserEntity getByUserName(String username) {
        return null;
    }

    @Override
    public UserEntity update(UserEntity user) {
        return null;
    }

    @Override
    public UserEntity create(UserEntity user) {
        return null;
    }

    @Override
    public boolean isPostOwner(Long userId, Long postId) {
        return false;
    }

    @Override
    public void delete(Long id) {

    }

}
