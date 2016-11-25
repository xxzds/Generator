package com.ebiz.generator.provider.java;

import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import com.ebiz.generator.IGeneratorModelProvider;
import com.ebiz.generator.provider.java.model.JavaClass;


public class JavaClassGeneratorModelProvider implements IGeneratorModelProvider{
	JavaClass clazz;
	
	public JavaClassGeneratorModelProvider(JavaClass clazz) {
		super();
		this.clazz = clazz;
	}

	public String getDisaplyText() {
		return "JavaClass:"+clazz.getClassName();
	}

	public void mergeFilePathModel(Map model) throws Exception {
		model.putAll(BeanUtils.describe(clazz));
	}

	public void mergeTemplateModel(Map model) throws Exception {
		model.put("clazz",clazz);
	}

}
