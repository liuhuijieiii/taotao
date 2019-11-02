package com.taotao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper tbItemMapper;
	@Override
	public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
		//设置分页的信息，使用pagehelper
		if(page == null)page = 1;
		if(rows == null)rows = 30;
		PageHelper.startPage(page, rows);
		//注入mapper
		//创建example对象，不需要设置查询条件
		TbItemExample example = new TbItemExample();
		//调用mapper的查询方法
		List<TbItem> list = tbItemMapper.selectByExample(example);
		//获取分页信息
		PageInfo<TbItem> info = new PageInfo<>(list);
		//封装
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal((int)info.getTotal());
		result.setRows(info.getList());
		return result;
	}

}
