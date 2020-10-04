package com.xiaojian.spring.anno;

import com.xiaojian.spring.importBeanDefinitionRegistrar.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author 小贱
 * @create 2020-10-01 17:13
 */

@Retention(RetentionPolicy.RUNTIME)
@Import(MyImportBeanDefinitionRegistrar.class)
public @interface XiaoJianScan {
}
