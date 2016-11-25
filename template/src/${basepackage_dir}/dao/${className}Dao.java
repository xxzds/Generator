<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
package ${basepackage}.dao;

import com.anjz.base.dao.BaseDao;
import ${basepackage}.model.${className};

public interface ${className}Dao extends BaseDao<${className},String> {

}