package com.gouhai.baoshan.controller.publics;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gouhai.baoshan.dao.user.UserDao;
import com.gouhai.baoshan.entity.publics.News;
import com.gouhai.baoshan.entity.user.User;
import com.gouhai.baoshan.service.publics.NewsService;
import com.gouhai.baoshan.spring.PageableController;

/**
 * 投诉举报咨询台账目录  action
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value = "/news")
public class NewsController extends PageableController {
	@Autowired
	private NewsService newsService;
	@RequestMapping(value = "/list/", method = RequestMethod.GET)
	public String toIndex() {
	/*	if(!SecurityUtils.getSubject().isPermitted("news:list")){
			return "/error/unauthority";
		}*/
	
		return "redirect:/news/list/1";
	}
	@RequestMapping(value = "/list/{current}", method = RequestMethod.GET)
	public String index(Model model, @PathVariable() int current) {
		if(!SecurityUtils.getSubject().isPermitted("news:list")){
			return "/error/unauthority";
		}

		model.addAllAttributes(pageResult(newsService.getNewsList(current),newsService.getNewsCount(), current));
		return "/publics/news/index";
	}
	@RequestMapping(value="/add",method= RequestMethod.GET)
	public String toAdd(){
		if(!SecurityUtils.getSubject().isPermitted("news:list")){
			return "/error/unauthority";
		}
		return "/publics/news/add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(News news) {
		if(!SecurityUtils.getSubject().isPermitted("news:list")){
			return "/error/unauthority";
		}
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		news.setAdddate(df.format(new Date()));
		newsService.insert(news);
		return "redirect:/news/list/1";
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable String id){
		if(!SecurityUtils.getSubject().isPermitted("news:list")){
			return "/error/unauthority";
		}
		newsService.delete(id);
		return "redirect:/news/list/1";
	}
	
	
	@RequestMapping(value="/update/{id}",method= RequestMethod.GET)
	public String toUpdate(Model model,@PathVariable String id){
		if(!SecurityUtils.getSubject().isPermitted("news:list")){
			return "/error/unauthority";
		}
		model.addAttribute("news",newsService.findOne(id));
		return "/publics/news/update";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(News news1) {
		if(!SecurityUtils.getSubject().isPermitted("news:list")){
			return "/error/unauthority";
		}
		News findNews = newsService.findOne(news1.getId());
		if (findNews != null) {
			findNews.setTexts(news1.getTexts());
			findNews.setTitles(news1.getTitles());
			findNews.setType(news1.getType());
			newsService.update(findNews);
		}
		return "redirect:/news/list/1";
	}
	
	@RequestMapping(value="/detail/{id}",method= RequestMethod.GET)
	public String detail(Model model,@PathVariable String id){
	
		model.addAttribute("news",newsService.findOne(id));
		return "/publics/news/detail";
	}
	
	
	@RequestMapping(value="/listpage/{current}",method= RequestMethod.GET)
	public String list(Model model, @PathVariable() int current){
		model.addAllAttributes(pageResult(newsService.getNewsList(current),newsService.getNewsCount(), current));
		return "/publics/news/listpage";
	}
	@RequestMapping(value = "/xcxt", method = RequestMethod.GET)
	public String xcxt(Model model) {
		List<News> news=newsService.getAll();
		model.addAttribute("news",news);
		return "/publics/xcxt";
	}
}
