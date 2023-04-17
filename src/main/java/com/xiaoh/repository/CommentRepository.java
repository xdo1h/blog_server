package com.xiaoh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xiaoh.entity.Article;
import com.xiaoh.entity.Comment;

/**
 * @author shimh
 * <p>
 * 2018年1月25日
 */
public interface CommentRepository extends JpaRepository<Comment, Integer> {

    List<Comment> findByArticleAndLevelOrderByCreateDateDesc(Article a, String level);


}
