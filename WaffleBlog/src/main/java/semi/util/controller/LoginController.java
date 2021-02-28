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
	  
    // 로그인 폼을 띄우는 부분
 	@GetMapping("/login.do")
    public String loginForm(){
        return "login/LoginForm";
    }
      
    // 로그인 처리하는 부분
 	@GetMapping("/loginCheck.do")
    public String loginCheck(HttpSession session,UserVO userVO){
        String returnURL = "";
        if ( session.getAttribute("login") != null ){
            // 기존에 login이란 세션 값이 존재한다면
            session.removeAttribute("login"); // 기존값을 제거해 준다.
        }
          
        // 로그인이 성공하면 UsersVO 객체를 반환함.
        UserVO vo = loginService.getUser(userVO);
          
        if ( vo != null ){ // 로그인 성공
            session.setAttribute("login", vo); // 세션에 login인이란 이름으로 UsersVO 객체를 저장해 놈.
            returnURL = "redirect:/main"; // 로그인 성공시 메인페이지로 이동하고
        }else { // 로그인에 실패한 경우
            returnURL = "redirect:/login"; // 로그인 폼으로 다시 가도록 함
        }
          
        return returnURL; // 위에서 설정한 returnURL 을 반환해서 이동시킴
 	}

}
