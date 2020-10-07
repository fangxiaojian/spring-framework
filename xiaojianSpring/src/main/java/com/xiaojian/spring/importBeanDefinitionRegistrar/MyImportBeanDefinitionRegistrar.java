package com.xiaojian.spring.importBeanDefinitionRegistrar;

import com.xiaojian.spring.app.MyInvocationHandler;
import com.xiaojian.spring.dao.CardDao;
import com.xiaojian.spring.factoryBean.MyFactoryBean;
import com.xiaojian.spring.test.Test;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.lang.reflect.Proxy;

/**
 * @author 小贱
 * @create 2020-10-01 15:05
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

		/**  1. 得到 BeanDefinition  */
		// 扫描所有接口
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(CardDao.class);
		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) builder.getBeanDefinition();
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(beanDefinition.getBeanClassName());
		beanDefinition.setBeanClass(MyFactoryBean.class);
		registry.registerBeanDefinition("cardDao", beanDefinition);
	}
}
