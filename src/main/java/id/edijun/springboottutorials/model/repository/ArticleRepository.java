package id.edijun.springboottutorials.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import id.edijun.springboottutorials.model.entity.Article;

public interface ArticleRepository extends JpaRepository<Article, String> {

}
