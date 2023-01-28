package com.suuding.springboot.web.Dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

//post수정요청dto: 수정요청하는 데이터
@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {

    private String title;
    private String content;

    @Builder
    public PostsUpdateRequestDto(String title, String content) {
        this.title=title;
        this.content=content;
    }
}
