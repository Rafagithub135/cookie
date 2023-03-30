package com.example.cookie.repositories;

import com.example.cookie.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
Post findPostById(long id);
}
