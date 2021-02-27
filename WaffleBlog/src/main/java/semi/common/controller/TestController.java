package semi.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController 
{
	@GetMapping(value = "test.do")
	public ModelAndView Test()
	{
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("main/GridTest");
		
		return mav;
	}
}