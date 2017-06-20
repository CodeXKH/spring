
package com.xkh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xkh.dao.bean.Users;
import com.xkh.service.UserService;

import io.swagger.annotations.ApiOperation;

/**
 * 跨域测试 cros
 * ApiController
 * 创建人:何雪平 
 * 时间：2017年1月7日-下午3:54:00 
 * @version 1.0.0
 *
 */
@RestController
@RequestMapping(value = "/api", method = RequestMethod.POST)
public class ApiController {
	
	
	@Autowired
	private UserService userService;
	
	//http://localhost:8280/swagger-ui.html
	/**
	 * 跨域注解
	 * com.xkh.controller 
	 * 方法名：get
	 * 创建人：何雪平 
	 * 时间：2017年1月7日-下午3:54:07 
	 * @param name
	 * @return HashMap<String,Object>
	 * @exception 
	 * @since  1.0.0
	 */
	@ApiOperation(value = "查找", notes = "根据用户ID查找用户")
	@CrossOrigin(origins = "http://localhost:8180")
	@ResponseBody
	@RequestMapping(value = "/select", method = RequestMethod.POST)
	public Users userSelect(@RequestParam Long id) {
		return userService.selectUserById(id);
	}
}
