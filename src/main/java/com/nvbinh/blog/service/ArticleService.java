package com.nvbinh.blog.service;

import com.nvbinh.blog.dto.request.ArticleRequest;
import com.nvbinh.blog.dto.response.ArticleResponse;

public interface ArticleService {
    ArticleResponse getArticle(ArticleRequest articleRequest);
}
