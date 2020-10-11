package com.xiaojian.spring.test;

import com.xiaojian.spring.methodInterceptor.MyMethodInterceptor;
import com.xiaojian.spring.service.CradService;
import com.xiaojian.spring.service.UserService;
import org.springframework.cglib.core.SpringNamingPolicy;
import org.springframework.cglib.proxy.Enhancer;

import java.io.IOException;

/**
 * @author 小贱
 * @create 2020-10-11 12:00
 */
public class TestEnhancer {

	public static void main(String[] args) {
		/**
		 * cglib 是直接同构操作字节码生成类对象的
		 * 在线程未终止时 （ System.in.read() ）
		 * 通过 java -classpath "/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/lib/sa-jdi.jar" sun.jvm.hotspot.HSDB 命令行可以查看 cglib 生成的类
		 */

		Enhancer enhancer = new Enhancer();

		enhancer.setSuperclass(UserService.class);

		enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);

		enhancer.setCallback(new MyMethodInterceptor());

		UserService userService = (UserService) enhancer.create();

		userService.query();

		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
