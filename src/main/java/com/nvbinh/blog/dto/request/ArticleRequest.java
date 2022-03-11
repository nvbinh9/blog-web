package com.nvbinh.blog.dto.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class ArticleRequest {

    @NotEmpty(message = "page can not be empty ")
    private String page;

    @NotEmpty(message = "size can not be empty ")
    private String size;

    @NotEmpty(message = "sort can not be empty ")
    private String sort;
}
