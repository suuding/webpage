package com.suuding.springboot.web.Dto;

import com.suuding.springboot.domain.posts.Posts;
import lombok.Getter;

//post응답dto
@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id=entity.getId();
        this.title=entity.getTitle();
        this.content=entity.getContent();
        this.author=entity.getAuthor();
    }
}
