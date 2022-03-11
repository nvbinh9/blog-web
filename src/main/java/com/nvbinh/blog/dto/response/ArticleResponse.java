package com.nvbinh.blog.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ArticleResponse {

    private List<Content> content;

    private String size;

    @JsonProperty("number_of_elements")
    private String numberOfElements;
}
