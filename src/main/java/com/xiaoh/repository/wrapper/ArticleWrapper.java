package com.xiaoh.repository.wrapper;

import com.xiaoh.entity.Article;
import com.xiaoh.vo.ArticleVo;
import com.xiaoh.vo.PageVo;

import java.util.List;

public interface ArticleWrapper {
    List<Article> listArticles(PageVo page);

    List<Article> listArticles(ArticleVo article, PageVo page);

    List<ArticleVo> listArchives();

}
