package com.bbstest.service.categoryservice;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bbstest.mybatis.dao.t_categoryMapper;
import com.bbstest.mybatis.pojo.t_category;

@Service("categoryservice")
public class CategoryServiceImpl implements ICategoryService 
{
	@Resource
	private t_categoryMapper categorymapper;
	@Override
	public boolean addCategory(String ctName) 
	{
		t_category record=new t_category();
		record.setCtName(ctName);
		categorymapper.insert(record);
		// TODO Auto-generated method stub
		return false;
	}

}
