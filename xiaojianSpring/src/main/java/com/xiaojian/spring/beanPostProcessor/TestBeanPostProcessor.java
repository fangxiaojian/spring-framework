package com.xiaojian.spring.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * @author 小贱
 * @create 2020-09-27 23:27
 */
@Component
public class TestBeanPostProcessor implements BeanPostProcessor, PriorityOrdered {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if ("indexDao".equals(beanName)) {
			System.out.println("TestBeanPostProcessor  Before");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ("indexDao".equals(beanName)) {
			System.out.println("TestBeanPostProcessor  After");
		}
		return bean;
	}

	@Override
	public int getOrder() {
		return 101;
	}
}
