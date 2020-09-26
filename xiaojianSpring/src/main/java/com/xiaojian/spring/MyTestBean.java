package com.xiaojian.spring;

/**
 * @author 小贱
 * @create 2020-09-22 20:07
 */
public class MyTestBean {
	private String name = "xiaojian";

	public MyTestBean(String name) {
		this.name = name;
	}

	public MyTestBean() {
	}

	@Override
	public String toString() {
		return "MyTestBean{" +
				"name='" + name + '\'' +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
