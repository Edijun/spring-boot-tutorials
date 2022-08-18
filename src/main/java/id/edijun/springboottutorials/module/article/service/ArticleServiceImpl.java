package id.edijun.springboottutorials.module.article.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.edijun.springboottutorials.model.entity.Article;
import id.edijun.springboottutorials.model.repository.ArticleRepository;
import id.edijun.springboottutorials.module.article.payload.ArticleRequest;

@Service
public class ArticleServiceImpl implements ArticleService {
	
	@Autowired
	private ArticleRepository articleRepository;

	@Override
	public void save(ArticleRequest request) {
		
		Article article = new Article();
		article.setId(request.getId());
		article.setTitle(request.getTitle());
		article.setDescription(request.getDescription());
		
		articleRepository.save(article);
		
	}

}
