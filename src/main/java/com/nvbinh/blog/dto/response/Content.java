package com.nvbinh.blog.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Content {
    private Long id;
    private String title;
    private String description;
    private String thumbnail;
    private String slug;

    @JsonProperty("category")
    private Category category;

    @JsonProperty("create_by")
    private CreateBy createBy;

    @JsonProperty("update_by")
    private UpdateBy updateBy;

}
