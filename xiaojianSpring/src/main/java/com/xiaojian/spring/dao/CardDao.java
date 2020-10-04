package com.xiaojian.spring.dao;

import com.xiaojian.spring.anno.Select;

/**
 * @author 小贱
 * @create 2020-10-01 15:08
 */
public interface CardDao {

	@Select("select * from card where card_number like '%{number}%'")
	String list(String str);
}
