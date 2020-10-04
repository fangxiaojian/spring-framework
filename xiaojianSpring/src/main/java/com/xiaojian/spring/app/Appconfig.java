package com.xiaojian.spring.app;

import com.xiaojian.spring.anno.XiaoJianScan;
import com.xiaojian.spring.importBeanDefinitionRegistrar.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author 小贱
 * @create 2020-09-26 23:13
 */
@Configuration
@ComponentScan("com.xiaojian.spring")
@XiaoJianScan
public class Appconfig {
}
