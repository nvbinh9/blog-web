package com.nvbinh.blog.service;

import com.nvbinh.blog.dto.request.ArticleRequest;
import com.nvbinh.blog.dto.response.ArticleResponse;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService{

    @Override
    public ArticleResponse getArticle(ArticleRequest articleRequest) {
        return null;
    }
}
