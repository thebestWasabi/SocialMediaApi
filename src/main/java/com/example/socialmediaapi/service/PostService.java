package com.example.socialmediaapi.service;

import com.example.socialmediaapi.entity.PostEntity;

import java.util.List;

public interface PostService {

    PostEntity getById(Long id);

    List<PostEntity> getAllByUserId(Long id);

    PostEntity update(PostEntity post);

    PostEntity create(PostEntity post);

    void delete(Long id);

}
