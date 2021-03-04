package semi.article.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import semi.article.bean.ArticleDivVO;
import semi.article.dao.ArticleDAO;
import semi.article.service.ArticleService;

@Service(value="articleService")
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	ArticleDAO articleDAO;
	
	public List<ArticleDivVO> getArtDiv() throws Exception {				

		return (ArrayList<ArticleDivVO>) articleDAO.selectAtcDiv();
	}

}
