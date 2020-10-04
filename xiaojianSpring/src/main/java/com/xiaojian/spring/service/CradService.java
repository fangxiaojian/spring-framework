package com.xiaojian.spring.service;

import com.xiaojian.spring.dao.CardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 小贱
 * @create 2020-10-01 17:17
 */
@Service
public class CradService {
	@Autowired
	private CardDao dao;

	public void list(){
		System.out.println(dao.list("xiaojian"));
	}

}
