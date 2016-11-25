<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.service;


import ${basepackage}.dao.${className}Dao;
   

@Service
public class ${className}Service{

	@Resource
	private ${className}Dao ${classNameLower}Dao;
}
