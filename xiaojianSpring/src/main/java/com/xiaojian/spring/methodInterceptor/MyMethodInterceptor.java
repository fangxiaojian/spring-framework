package com.xiaojian.spring.methodInterceptor;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 小贱
 * @create 2020-10-11 12:05
 */
public class MyMethodInterceptor implements MethodInterceptor {

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("MyMethodInterceptor == intercept");
		return methodProxy.invokeSuper(o, objects);
	}
}
