package semi.main.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import semi.main.bean.MainVO;
import semi.main.service.MainService;

//@EnableWebMvc
@Controller
public class MainController
{
	private static Logger log = LoggerFactory.getLogger(MainController.class);
	
	@Resource(name="mainService")
	private MainService mainService;
	
	@GetMapping("/main.do")
	public String main()
	{
		log.trace("!tracd!");
		log.debug("!debug!");
		log.info("!info!");
		log.warn("!warn!");
		log.error("!error!");
		
		return "/main/Main";
	}
}