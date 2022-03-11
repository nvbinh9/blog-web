package com.nvbinh.blog.controller;

import com.nvbinh.blog.dto.request.ArticleRequest;
import com.nvbinh.blog.dto.response.ArticleResponse;
import com.nvbinh.blog.service.ArticleService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/cms/article")
    public ArticleResponse getArticle(@RequestBody @Valid ArticleRequest articleRequest) {
        return articleService.getArticle(articleRequest);
    }



}
