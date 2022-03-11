package com.nvbinh.blog.dto.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class CategoryReq {

    @NotEmpty(message = "id can not be null")
    private Long id;
}
