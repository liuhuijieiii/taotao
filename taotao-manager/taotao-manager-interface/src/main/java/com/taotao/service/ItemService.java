package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;

/**
 * 商品相关的service
 * @author 刘慧杰
 *
 */
public interface ItemService {
	/**
	 * 根据当前的页码和行数进行查询
	 * @param page
	 * @param rows
	 * @return
	 */
	public EasyUIDataGridResult getItemList(Integer page,Integer rows);
}
