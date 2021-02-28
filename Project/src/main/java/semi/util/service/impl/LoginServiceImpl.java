package semi.util.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import semi.util.bean.UserVO;
import semi.util.dao.UserDAO;
import semi.util.dao.UserDAO;
import semi.util.service.LoginService;

@Service(value="loginService")
public class LoginServiceImpl implements LoginService{
	
	@Inject
    private UserDAO userDAO;  
     
    public UserVO getUser(UserVO  userVO) {
        return userDAO.selectUser(userVO);
    }

}
