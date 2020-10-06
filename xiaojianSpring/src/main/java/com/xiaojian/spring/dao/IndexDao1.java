package com.xiaojian.spring.dao;

import com.xiaojian.spring.app.MyInvocationHandler1;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;

/**
 * @author 小贱
 * @create 2020-10-06 22:18
 */
public class IndexDao1 implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if ("indexDao".equals(beanName)) {
			bean = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class<?>[]{Dao.class}, new MyInvocationHandler1(bean));
		}

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}
}
