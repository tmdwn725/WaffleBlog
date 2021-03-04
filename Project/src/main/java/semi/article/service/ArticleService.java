package semi.article.service;

import java.util.ArrayList;
import java.util.List;

import semi.article.bean.ArticleDivVO;

public interface ArticleService {
	
	List<ArticleDivVO> getArtDiv() throws Exception;
	
}
