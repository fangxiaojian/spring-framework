package com.xiaojian.spring.app;


import com.xiaojian.spring.anno.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 小贱
 * @create 2020-10-01 15:11
 */
public class MyInvocationHandler implements InvocationHandler {
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("xiaojian -- MyInvocationHandler");
		Method method1 = proxy.getClass().getInterfaces()[0].getMethod(method.getName(), String.class);
		Select select = method1.getDeclaredAnnotation(Select.class);
		System.out.println(select.value());
		return null;
	}

}
