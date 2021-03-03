package semi.article.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import semi.article.service.ArticleService;
import semi.main.controller.MainController;

@Controller
public class ArticleController {
	
	private static Logger log = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	private ArticleService articleService;
	
	@GetMapping("s.do")
	ArrayList<String> getArtDiv() {
		
		ArrayList<String> artDiv = new ArrayList<String>();
		
		return  artDiv;
	}

}
