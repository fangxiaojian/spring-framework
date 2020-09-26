package com.xiaojian.spring.test;

import com.xiaojian.spring.MyTestBean;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author 小贱
 * @create 2020-09-22 20:10
 */
public class AppTest {

	public static void main(String[] args) {
		ClassPathResource res = new ClassPathResource("spring-config.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(res);
		System.out.println(factory.getBean(MyTestBean.class).getName());
	}
}
