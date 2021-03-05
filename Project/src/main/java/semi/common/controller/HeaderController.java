package semi.common.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import semi.article.bean.ArticleDivVO;
import semi.article.bean.ArticleVO;
import semi.article.service.ArticleService;

@Controller
public class HeaderController
{
	private static Logger log = LoggerFactory.getLogger(HeaderController.class);
	
	@Autowired
	ArticleService articleService;
	
	@GetMapping("/header")
	public String header(Model model) throws Exception
	{
		
		List<ArticleDivVO> atcDiv = articleService.getArtDiv();
		List<ArticleVO> newAtc = articleService.getNewArt();
		
		model.addAttribute(newAtc);
		model.addAttribute(atcDiv);
		return "/common/Header";
	}
}