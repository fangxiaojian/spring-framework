package com.xiaojian.spring.test;

import com.xiaojian.spring.app.Appconfig;
import com.xiaojian.spring.beanFactoryPostPorcessor.MyBeanFactoryPostProcessor;
import com.xiaojian.spring.dao.CardDao;
import com.xiaojian.spring.dao.IndexDao;
import com.xiaojian.spring.service.CradService;
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
		 * 然后将 5 个 BeanDefinition 存放到 DefaultListableBeanFactory 中
		 */
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext();

		/*
		 * 把一个 class 转成 bd，最后 put 到 map
		 * map 位置：DefaultListableBeanFactory 的属性 beanDefinitionMap
		 * 在 new AnnotationConfigApplicationContext(); 中 put 5 个BeanDefinition
		 * 这里添加进一个 总的 6 个
		 */
		annotationConfigApplicationContext.register(Appconfig.class);

		// 手动添加 bean 生成过程中的后置处理器
//		annotationConfigApplicationContext.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());

		/*
		 初始化 spring 的环境
		 若注册单个 bean 则不需要调用
		 */
		annotationConfigApplicationContext.refresh();
		IndexDao indexDao = annotationConfigApplicationContext.getBean(IndexDao.class);
		IndexDao indexDao1 = annotationConfigApplicationContext.getBean(IndexDao.class);
		System.out.println(indexDao.hashCode() + " ----- " + indexDao1.hashCode());
		indexDao.query();


		/*
		CardDao 是一个接口，通过 ImportBeanDefinitionRegistrar 将其实例化成类存放至 BeanDefinitionRegistry
		通过 getBean 可以将其拿出
		 */
		CardDao cardDao = (CardDao) annotationConfigApplicationContext.getBean("cardDao");
//		cardDao.list("xiaojian");
		annotationConfigApplicationContext.getBean(CradService.class).list();
	}
}
