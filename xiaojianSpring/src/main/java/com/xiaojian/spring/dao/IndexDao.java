package com.xiaojian.spring.dao;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * @author 小贱
 * @create 2020-09-26 23:14
 */
@Repository
public class IndexDao implements Dao {

	public IndexDao() {
		System.out.println("IndexDao 构造方法");
	}

	@PostConstruct
	public void init(){
		System.out.println("IndexDao init");
	}

	@Override
	public void query() {
		System.out.println("IndexDao query");
	}
}
