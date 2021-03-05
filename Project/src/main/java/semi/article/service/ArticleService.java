package semi.article.service;

import java.util.ArrayList;
import java.util.List;

import semi.article.bean.ArticleDivVO;
import semi.article.bean.ArticleVO;

public interface ArticleService {
	
	List<ArticleDivVO> getArtDiv() throws Exception;
	
	List<ArticleVO> getNewArt() throws Exception;
	
}
