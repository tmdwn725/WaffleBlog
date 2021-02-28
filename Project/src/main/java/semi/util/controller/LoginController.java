package semi.util.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import semi.main.controller.MainController;
import semi.util.bean.UserVO;
import semi.util.service.LoginService;

@Controller
public class LoginController {
		
	private static Logger log = LoggerFactory.getLogger(MainController.class);
	
	@Resource(name="loginService")
	private LoginService loginService;
	  
    // �α��� ���� ���� �κ�
 	@GetMapping("/login.do")
    public String loginForm(){
        return "/login/LoginForm";
    }
      
    // �α��� ó���ϴ� �κ�
 	@PostMapping("/loginCheck.do")
    public String loginCheck(HttpSession session, UserVO userVO
    		, HttpServletRequest request){
        String returnURL = "";
        if ( session.getAttribute("login") != null ){
            // ������ login�̶� ���� ���� �����Ѵٸ�
            session.removeAttribute("login"); // �������� ������ �ش�.
        }
        
        String id = request.getParameter("userId");
        String pw = request.getParameter("userPw");
    	
    	userVO.setId(id);
    	userVO.setPw(pw);
        
        // �α����� �����ϸ� UsersVO ��ü�� ��ȯ��.
        UserVO vo = loginService.getUser(userVO);
          
        if ( vo != null ){ // �α��� ����
            session.setAttribute("login", vo); // ���ǿ� login���̶� �̸����� UsersVO ��ü�� ������ ��.
            returnURL = "redirect:/main.do"; // �α��� ������ ������������ �̵��ϰ�
        }else { // �α��ο� ������ ���
            returnURL = "redirect:/login.do"; // �α��� ������ �ٽ� ������ ��
        }
          
        return returnURL; // ������ ������ returnURL �� ��ȯ�ؼ� �̵���Ŵ
 	}

}
