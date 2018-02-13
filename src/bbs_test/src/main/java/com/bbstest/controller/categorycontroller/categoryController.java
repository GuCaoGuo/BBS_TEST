package com.bbstest.controller.categorycontroller;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bbstest.service.categoryservice.ICategoryService;

@Controller
@Scope("prototype")//默认是单例(scope="singleton")，这样设置，保证每个请求都有一个UserController对象处理
public class categoryController 
{
	@Resource(name="categoryservice")
	private ICategoryService categoryservice;
	@RequestMapping("/addcategory")
	public String addCategory(@RequestParam("categoryname")String categoryname,Model model)
	{
		System.out.println("name:"+categoryname);
		categoryservice.addCategory(categoryname);
		System.out.println("success");
		return "main";
	}

}
