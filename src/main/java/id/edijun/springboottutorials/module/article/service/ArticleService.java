package id.edijun.springboottutorials.module.article.service;

import id.edijun.springboottutorials.module.article.payload.ArticleRequest;
import id.edijun.springboottutorials.module.article.payload.ArticleResponse;

public interface ArticleService {
	
	void save(ArticleRequest request);
	
	ArticleResponse get(String id);

}
