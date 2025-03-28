package com.blogposts.blogposts.service;

import com.blogposts.blogposts.converter.BlogsPostConverter;
import com.blogposts.blogposts.entity.BlogPosts;
import com.blogposts.blogposts.model.BlogPostsDTO;
import com.blogposts.blogposts.repository.BlogPostsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogPostsService {

    private BlogPostsRepository blogPostsRepository;

    private BlogsPostConverter blogsPostConverter;

    public BlogPostsService(BlogPostsRepository blogPostsRepository,
                            BlogsPostConverter blogsPostConverter){
        this.blogPostsRepository = blogPostsRepository;
        this.blogsPostConverter = blogsPostConverter;
    }

    public List<BlogPostsDTO> getAllBlogPosts(){
        List<BlogPosts> all = blogPostsRepository.findAll();
       return all.stream().map(blogPosts -> blogsPostConverter.convert(blogPosts)).toList();
    }

}
