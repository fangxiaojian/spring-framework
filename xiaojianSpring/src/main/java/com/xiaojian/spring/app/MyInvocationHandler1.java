package com.xiaojian.spring.app;


import com.xiaojian.spring.anno.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 小贱
 * @create 2020-10-01 15:11
 */
public class MyInvocationHandler1 implements InvocationHandler {
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("xiaojian -- MyInvocationHandler1");
		return method.invoke(target, args);
	}

	private Object target;

	public MyInvocationHandler1(Object target) {
		this.target = target;
	}
	public MyInvocationHandler1() {
	}
}
