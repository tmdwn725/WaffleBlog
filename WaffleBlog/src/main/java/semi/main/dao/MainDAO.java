package semi.main.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import semi.main.bean.MainVO;
import semi.main.dao.MainDAO;


@Repository
public class MainDAO
{
	@Inject
	SqlSession session;

	//private final String NAMESPACE = "mapper.main.MainMapper";
	public MainVO selectTest()
	{
		return session.selectOne("mapper.main.selectTest");
	}
}

