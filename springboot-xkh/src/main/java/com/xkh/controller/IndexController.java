
package com.xkh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页控制层
 * 
 * IndexController
 * 创建人:何雪平 
 * 时间：2017年1月7日-下午3:55:25 
 * @version 1.0.0
 *
 */
@Controller
public class IndexController {

	@RequestMapping(value={"index","/"})
	public String index(ModelMap map) {
		map.put("title", "thymeleaf hello word");
		return "index";
	}

}
