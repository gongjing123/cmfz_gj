package com.baizhi.service;

import com.baizhi.dao.ArticleDAO;
import com.baizhi.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDAO articleDAO;

    @Override
    public void add(Article article) {
        articleDAO.insert(article);
    }

    @Override
    public List<Article> findByPage(Integer page, Integer rows) {
        int start = (page-1)*rows;
        List<Article> articles = articleDAO.queryByPage(start, rows);

        return articles;
    }

    @Override
    public Long findTotals() {
        Long totals = articleDAO.queryTotals();
        return totals;
    }

    @Override
    public void remove(String id) {
        articleDAO.delete(id);

    }

    @Override
    public Article findOne(String id) {
        Article article = articleDAO.queryOne(id);
        return article;
    }

    @Override
    public void motify(Article article) {
        articleDAO.update(article);
    }
}
