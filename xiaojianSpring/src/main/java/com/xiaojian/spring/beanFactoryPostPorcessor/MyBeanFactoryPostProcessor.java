package com.xiaojian.spring.beanFactoryPostPorcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * 插手 bean 实例化过程
 * @author 小贱
 * @create 2020-09-28 22:10
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AnnotatedBeanDefinition annotatedBeanDefinition = (AnnotatedBeanDefinition) beanFactory.getBeanDefinition("indexDao");
		// 设置 bean 的属性为 原型模式， 不是单例的
		annotatedBeanDefinition.setScope("prototype");
	}
}
