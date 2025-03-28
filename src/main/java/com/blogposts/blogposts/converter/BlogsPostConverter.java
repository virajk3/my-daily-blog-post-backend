package com.blogposts.blogposts.converter;

import com.blogposts.blogposts.entity.BlogPosts;
import com.blogposts.blogposts.model.BlogPostsDTO;
import org.springframework.stereotype.Component;

@Component
public class BlogsPostConverter {

    public BlogPostsDTO convert(BlogPosts blogPosts ){
        return new BlogPostsDTO(blogPosts.getId(), blogPosts.getBody(), blogPosts.getTitle(), blogPosts.getUserId());
    }

}
