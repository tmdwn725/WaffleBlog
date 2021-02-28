package semi.util.dao;

import javax.inject.Inject;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import semi.util.bean.UserVO;

@Repository
public class UserDAO {
	
	@Inject
    private SqlSession sqlSession;
     
    private static String namespace = "mapper.user";
     
    // 세션에 등록
    public UserVO selectUser(UserVO  userVO ){
        return sqlSession.selectOne(namespace+".selectUser", userVO );
    }


}
