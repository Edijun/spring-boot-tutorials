package id.edijun.springboottutorials.module.article.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ArticleRequest {

	private String id;

	private String title;

	private String description;

}
