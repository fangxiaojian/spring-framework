package com.xiaojian.spring.test;

import com.xiaojian.spring.app.Appconfig;
import com.xiaojian.spring.dao.Dao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 小贱
 * @create 2020-10-06 22:21
 */
public class Test2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext(Appconfig.class);
		Appconfig appconfig = (Appconfig) annotationConfigApplicationContext.getBean("appconfig");
	}
}
