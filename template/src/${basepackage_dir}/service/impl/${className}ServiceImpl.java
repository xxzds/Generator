<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.xz.base.model.JsonResult;
import com.xz.base.model.PageInfo; 
import ${basepackage}.dao.${className}Dao;
import ${basepackage}.domain.entity.${className};   

@Service
public class ${className}Service{

	@Resource
	private ${className}Dao ${classNameLower}Dao;

	/**
	 * @Description 根据Id获取实体
	 * @param id
	 * @return ${className}    
	 * @author davidwan 
	 */
	public ${className} findById(Integer id) {
		${className} entity = new ${className}(id);
		return ${classNameLower}Dao.selectEntity(entity);
	}

	/**
	 * @Description 根据条件获取实体
	 * @param entity
	 * @return ${className}    
	 * @author davidwan 
	 */
	public ${className} find(${className} entity) {
		return ${classNameLower}Dao.selectEntity(entity);
	}
	
	/**
	 * @Description 根据条件获取列表 
	 * @param entity
	 * @return List<${className}>    
	 * @author davidwan 
	 */
	public List<${className}> queryList(${className} entity){
		return ${classNameLower}Dao.selectEntityList(entity);
	}
	
	/**
	 * @Description 根据条件获取分页列表 
	 * @param entity
	 * @param pageIndex
	 * @param pageSize
	 * @return PageInfo<${className}>    
	 * @author davidwan 
	 */
	public PageInfo<${className}> queryPageList(${className} entity, int pageIndex, int pageSize){
		return ${classNameLower}Dao.selectEntityPageList(entity, pageIndex, pageSize);
	}

	/**
	 * @Description 添加
	 * @param entity
	 * @return JsonResult    
	 * @author davidwan 
	 */
	public JsonResult create(${className} entity) {
		// 若要获取id，请使用entity.getId();
		int result = ${classNameLower}Dao.insertEntity(entity);
		if (result > 0) {
			return new JsonResult(true);
		} else {
			return new JsonResult(false);
		}
	}

	/**
	 * @Description 修改 
	 * @param entity
	 * @return JsonResult    
	 * @author davidwan 
	 */
	public JsonResult modify(${className} entity) {
		int result = ${classNameLower}Dao.updateEntity(entity);
		if (result > 0) {
			return new JsonResult(true);
		} else {
			return new JsonResult(false);
		}
	}

	/**
	 * @Description 根据Id删除 
	 * @param id
	 * @return JsonResult    
	 * @author davidwan 
	 */
	public JsonResult removeById(Integer id) {
		${className} entity = new ${className}(id);
		int result = ${classNameLower}Dao.deleteEntity(entity);
		if (result > 0) {
			return new JsonResult(true);
		} else {
			return new JsonResult(false);
		}
	}
	
	/**
	 * @Description 根据多个Id删除 
	 * @param ids
	 * @return JsonResult    
	 * @author davidwan 
	 */
	public JsonResult removeByIds(String ids) {
		${className} entity = new ${className}();
		entity.getMap().put("ids", ids.split(","));
		int result = ${classNameLower}Dao.deleteEntity(entity);
		if (result > 0) {
			return new JsonResult(true);
		} else {
			return new JsonResult(false);
		}
	}

	/**
	 * @Description 根据指定条件删除 
	 * @param entity
	 * @return JsonResult    
	 * @author davidwan 
	 */
	public JsonResult remove(${className} entity) { 
		int result = ${classNameLower}Dao.deleteEntity(entity);
		if (result > 0) {
			return new JsonResult(true);
		} else {
			return new JsonResult(false);
		}
	}

}
