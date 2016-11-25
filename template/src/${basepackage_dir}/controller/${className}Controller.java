<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign classNameLowerAll = className?lower_case >

package ${basepackage}.web.controller; 
 
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
 
import com.xz.base.utils.ConfigValue;
import com.xz.base.utils.WebUtil;
import com.xz.base.controller.SpringBaseController;
import com.xz.base.model.JsonResult;
import com.xz.base.model.PageInfo;
import ${basepackage}.domain.entity.${className};
import ${basepackage}.service.${className}Service;

@Controller
@RequestMapping(value = "/${classNameLower}")
public class ${className}Controller extends SpringBaseController {

	@Resource
	private ${className}Service ${classNameLower}Service;
}
