package com.example.first_project.dto;


import com.example.first_project.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

// 리팩토링
@AllArgsConstructor
@ToString
public class ArticleForm {

    private String title;
    private String content;

    public Article toEntity() {
        return new Article(null, title, content);
    }
}
