package com.book.springboot.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {
    private String titie;
    private String content;

    @Builder
    public PostsUpdateRequestDto(String titie,String content){
        this.titie=titie;
        this.content=content;
    }
}
