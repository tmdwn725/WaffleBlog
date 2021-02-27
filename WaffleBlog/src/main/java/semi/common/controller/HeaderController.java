package semi.common.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HeaderController
{
	private static Logger log = LoggerFactory.getLogger(HeaderController.class);
	
	@GetMapping("/header")
	public String header()
	{
		return "/common/Header";
	}
}