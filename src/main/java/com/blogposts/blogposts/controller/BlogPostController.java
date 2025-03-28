package com.blogposts.blogposts.controller;

import com.blogposts.blogposts.model.BlogPostsDTO;
import com.blogposts.blogposts.service.BlogPostsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/blog-posts")
@CrossOrigin("*")
public class BlogPostController {

    private final BlogPostsService blogPostsService;

    public BlogPostController(BlogPostsService blogPostsService){
        this.blogPostsService = blogPostsService;
    }


    @GetMapping
    public ResponseEntity<List<BlogPostsDTO>> getBlogPosts(){
        return ResponseEntity.of(Optional.ofNullable(blogPostsService.getAllBlogPosts()));
    }
}
