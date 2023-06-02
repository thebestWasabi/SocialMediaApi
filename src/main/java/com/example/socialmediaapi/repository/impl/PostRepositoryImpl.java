package com.example.socialmediaapi.repository.impl;

import com.example.socialmediaapi.entity.PostEntity;
import com.example.socialmediaapi.repository.PostRepository;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Repository
public class PostRepositoryImpl implements PostRepository, RowMapper<PostEntity> {

    @Override
    public Optional<PostEntity> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<PostEntity> findByUserId(Long userId) {
        return null;
    }

    @Override
    public void assignToUserById(Long postId, Long userId) {

    }

    @Override
    public void update(PostEntity post) {

    }

    @Override
    public void create(PostEntity post) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public PostEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        return null;
    }
}
