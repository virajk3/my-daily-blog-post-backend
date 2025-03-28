package com.blogposts.blogposts.repository;

import com.blogposts.blogposts.entity.BlogPosts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPostsRepository extends JpaRepository<BlogPosts, Integer> {
}
