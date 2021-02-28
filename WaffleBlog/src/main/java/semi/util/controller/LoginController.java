package semi.util.controller;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import semi.main.service.MainService;
import semi.util.bean.UserVO;
import semi.util.service.LoginService;

@Controller
public class LoginController {
	
	/* @Resource(name="loginService") */
	private LoginService loginService;
	  
    // �α��� ���� ���� �κ�
 	@GetMapping("/login.do")
    public String loginForm(){
        return "login/LoginForm";
    }
      
    // �α��� ó���ϴ� �κ�
 	@GetMapping("/loginCheck.do")
    public String loginCheck(HttpSession session,UserVO userVO){
        String returnURL = "";
        if ( session.getAttribute("login") != null ){
            // ������ login�̶� ���� ���� �����Ѵٸ�
            session.removeAttribute("login"); // �������� ������ �ش�.
        }
          
        // �α����� �����ϸ� UsersVO ��ü�� ��ȯ��.
        UserVO vo = loginService.getUser(userVO);
          
        if ( vo != null ){ // �α��� ����
            session.setAttribute("login", vo); // ���ǿ� login���̶� �̸����� UsersVO ��ü�� ������ ��.
            returnURL = "redirect:/main"; // �α��� ������ ������������ �̵��ϰ�
        }else { // �α��ο� ������ ���
            returnURL = "redirect:/login"; // �α��� ������ �ٽ� ������ ��
        }
          
        return returnURL; // ������ ������ returnURL �� ��ȯ�ؼ� �̵���Ŵ
 	}

}
