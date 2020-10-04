package com.xiaojian.spring.factoryBean;

import com.xiaojian.spring.app.MyInvocationHandler;
import com.xiaojian.spring.dao.CardDao;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

/**
 * @author 小贱
 * @create 2020-10-01 16:33
 */
public class MyFactoryBean implements FactoryBean<Object> {

	private Class<?> clazz;

	public MyFactoryBean(Class<?> clazz) {
		this.clazz = clazz;
	}

	@Override
	public Object getObject() throws Exception {
		Class<?>[] clazzs = new Class<?>[]{clazz};
		Object proxy = Proxy.newProxyInstance(this.getClass().getClassLoader(), clazzs, new MyInvocationHandler());
		return proxy;
	}

	@Override
	public Class<?> getObjectType() {
		return clazz;
	}
}
