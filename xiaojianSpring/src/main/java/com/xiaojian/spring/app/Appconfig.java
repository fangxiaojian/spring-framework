package com.xiaojian.spring.app;

import com.xiaojian.spring.anno.XiaoJianScan;
import com.xiaojian.spring.dao.IndexDao;
import com.xiaojian.spring.dao.IndexDao1;
import com.xiaojian.spring.importBeanDefinitionRegistrar.MyImportBeanDefinitionRegistrar;
import com.xiaojian.spring.imports.MyImportSelector;
import org.springframework.context.annotation.Bean;
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
@Import(MyImportSelector.class)
public class Appconfig {

	@Bean
	public IndexDao indexDao(){
		return new IndexDao();
	}

	@Bean
	public IndexDao1 indexDao1(){
		indexDao();
		return new IndexDao1();
	}


}
