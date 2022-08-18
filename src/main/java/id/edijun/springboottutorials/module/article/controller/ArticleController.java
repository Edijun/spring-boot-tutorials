package id.edijun.springboottutorials.module.article.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.edijun.springboottutorials.module.article.payload.ArticleRequest;
import id.edijun.springboottutorials.module.article.payload.ArticleResponse;
import id.edijun.springboottutorials.module.article.service.ArticleService;

@RestController
@RequestMapping(value = "article")
public class ArticleController {

	@Autowired
	private ArticleService articleService;

	@PostMapping
	String save(@RequestBody ArticleRequest request) {
		articleService.save(request);
		return "success";
	}

	@GetMapping("{id}")
	ArticleResponse get(@PathVariable("id") String id) {
		return articleService.get(id);
	}



}
