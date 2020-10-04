package com.xiaojian.spring.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author 小贱
 * @create 2020-10-01 17:24
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Select {

	String value();
}
