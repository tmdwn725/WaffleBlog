package semi.main.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import semi.main.bean.MainVO;
import semi.main.service.MainService;

//@EnableWebMvc
@Controller
public class MainController
{
	private static Logger log = LoggerFactory.getLogger(MainController.class);
	
	@Resource(name="mainService")
	private MainService mainService;
	
	@GetMapping("/Main.do")
	public String home()
	{
		log.trace("!tracd!");
		log.debug("!debug!");
		log.info("!info!");
		log.warn("!warn!");
		log.error("!error!");
		
		return "/main/Main";
	}
	
	@GetMapping("/Test.do")
	public String Test(HttpServletRequest request, Model model) throws Exception
	{
		MainVO mainVO;
		log.debug("하이");
		/*
		mainVO = mainService.Test();
		log.debug("하이2" + mainVO.getName());
		
		model.addAttribute("name", mainVO.getName());
		model.addAttribute("cd", mainVO.getTst_cd());
		*/
		
		
		return "/main/Test";
	}
}