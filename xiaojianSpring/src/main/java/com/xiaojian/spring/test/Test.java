package com.xiaojian.spring.test;

import com.xiaojian.spring.app.Appconfig;
import com.xiaojian.spring.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 小贱
 * @create 2020-09-26 23:10
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(Appconfig.class);

		/*
		 初始化 spring 的环境
		 若注册单个 bean 则不需要调用
		 */
		annotationConfigApplicationContext.refresh();
		IndexDao indexDao = annotationConfigApplicationContext.getBean(IndexDao.class);
		indexDao.query();
	}
}
