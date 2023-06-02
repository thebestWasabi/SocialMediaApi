package com.example.socialmediaapi.service.impl;

import com.example.socialmediaapi.entity.PostEntity;
import com.example.socialmediaapi.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Override
    public PostEntity getById(Long id) {
        return null;
    }

    @Override
    public List<PostEntity> getAllByUserId(Long id) {
        return null;
    }

    @Override
    public PostEntity update(PostEntity post) {
        return null;
    }

    @Override
    public PostEntity create(PostEntity post) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

}
