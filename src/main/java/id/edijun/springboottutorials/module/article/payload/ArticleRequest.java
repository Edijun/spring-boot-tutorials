package id.edijun.springboottutorials.module.article.payload;

import lombok.Data;

@Data
public class ArticleRequest {

	private String id;

	private String title;

	private String description;

}
