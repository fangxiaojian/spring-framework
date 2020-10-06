package com.xiaojian.spring.imports;

import com.xiaojian.spring.dao.IndexDao1;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author 小贱
 * @create 2020-10-06 22:17
 */
public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{IndexDao1.class.getName()};
	}
}
