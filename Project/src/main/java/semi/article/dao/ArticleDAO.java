package semi.article.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import semi.article.bean.ArticleDivVO;
import semi.article.bean.ArticleVO;

@Repository
public class ArticleDAO {

	@Inject
	private SqlSession sqlSession;
	
	private final String NAMESPACE = "mapper.article";
	
	public List<ArticleDivVO> selectAtcDiv() {
		
		return sqlSession.selectList(NAMESPACE + ".selectAtcDiv");
		
	}
	
	public List<ArticleVO> selectNewAtc() {
		
		return sqlSession.selectList(NAMESPACE + ".selectNewAtc");
		
	}
	
}
