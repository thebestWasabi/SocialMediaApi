package com.example.socialmediaapi.repository;

import com.example.socialmediaapi.entity.PostEntity;

import java.util.List;
import java.util.Optional;

public interface PostRepository {

    Optional<PostEntity> findById(Long id);

    List<PostEntity> findByUserId(Long userId);

    void assignToUserById(Long postId, Long userId);

    void update(PostEntity post);

    void create(PostEntity post);

    void delete(Long id);

}
