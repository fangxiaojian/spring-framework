package com.xiaojian.spring.test;

import com.xiaojian.spring.app.Appconfig;
import com.xiaojian.spring.beanFactoryPostPorcessor.MyBeanFactoryPostProcessor;
import com.xiaojian.spring.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 小贱
 * @create 2020-09-26 23:10
 */
public class Test {
	public static void main(String[] args) {
		/*
		 * 准备 spring 环境
		 * 1. 准备工厂 ==》 DefaultListableBeanFactory
		 * 实例化一个 bdReader 和一个 scanner
		 */
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext();

		/*
		 * 把一个 class 转成 bd，最后 put 到 map
		 * map 位置：DefaultListableBeanFactory 的属性 beanDefinitionMap
		 */
		annotationConfigApplicationContext.register(Appconfig.class);

		annotationConfigApplicationContext.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());

		/*
		 初始化 spring 的环境
		 若注册单个 bean 则不需要调用
		 */
		annotationConfigApplicationContext.refresh();
		IndexDao indexDao = annotationConfigApplicationContext.getBean(IndexDao.class);
		IndexDao indexDao1 = annotationConfigApplicationContext.getBean(IndexDao.class);
		System.out.println(indexDao.hashCode() + " ----- " + indexDao1.hashCode());
		indexDao.query();
	}
}
