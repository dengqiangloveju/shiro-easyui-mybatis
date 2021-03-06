package com.comsys.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.comsys.domain.Userinfo;
import com.comsys.service.UserinfoService;
import com.comsys.util.PageBean;
import com.comsys.util.PageInfo;

@Controller
@RequestMapping("background")
public class UserinfoController {
	@Resource
	private UserinfoService userinfoService;
	
	@RequestMapping("first")
	public ModelAndView queryById(int id, PageInfo pageInfo) {
		ModelAndView view = new ModelAndView();
		
		Userinfo userinfo = userinfoService.queryById(id);
		view.addObject("user", userinfo);
		
		PageBean pager = userinfoService.queryByPage(pageInfo.getPageNo(), pageInfo.getPageSize());
		view.addObject("pager", pager);
		
		view.setViewName("userinfo");
		return view;
	}
}
