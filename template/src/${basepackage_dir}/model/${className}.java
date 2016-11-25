<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.model;

import com.anjz.base.entity.BaseEntity;

public class ${className} extends BaseEntity {

	private static final long serialVersionUID = -1L;
	
<#list table.columns as column>
<#if !column.pk>
	/**
	 * ${column.columnAlias}
	 */
	private ${column.javaType} ${column.firstLetterLowerOtherUpperCase};
</#if>
</#list>
	
<@generateJavaColumns/>

<#macro generateJavaColumns>
	<#list table.columns as column>
	<#if !column.pk>
	public void set${column.firstLetterLowerOtherUpperCase?cap_first}(${column.javaType} ${column.firstLetterLowerOtherUpperCase}) {
		this.${column.firstLetterLowerOtherUpperCase} = ${column.firstLetterLowerOtherUpperCase};
	}

	public ${column.javaType} get${column.firstLetterLowerOtherUpperCase?cap_first}() {
		return this.${column.firstLetterLowerOtherUpperCase};
	}
	</#if>
	</#list>
</#macro>

}