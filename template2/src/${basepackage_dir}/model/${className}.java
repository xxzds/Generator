<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.model;
 
import java.io.Serializable;


public class ${className} implements Serializable {

	private static final long serialVersionUID = -1L;
	
<#list table.columns as column>

	/**
	 * ${column.columnAlias}
	 */
	private ${column.javaType} ${column.columnNameLower};
</#list>
	
<@generateJavaColumns/>

<#macro generateJavaColumns>
	<#list table.columns as column>
	
	public void set${column.columnName?cap_first}(${column.javaType} ${column.columnName}) {
		this.${column.columnName} = ${column.columnName};
	}

	public ${column.javaType} get${column.columnName?cap_first}() {
		return this.${column.columnName};
	}
	</#list>
</#macro>

}