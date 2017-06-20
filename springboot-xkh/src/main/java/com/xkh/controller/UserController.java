
package com.xkh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xkh.dao.bean.Users;
import com.xkh.service.UserService;

/**
 * 
 * 用户控制层
 * UserController
 * 创建人:何雪平 
 * 时间：2017年1月11日-下午6:14:02 
 * @version 1.0.0
 *
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * 查询用户信息
	 * com.xkh.controller 
	 * 方法名：userSelect
	 * 创建人：何雪平 
	 * 时间：2017年1月11日-下午6:14:14 
	 * @param id
	 * @return Users
	 * @exception 
	 * @since  1.0.0
	 */
	@ResponseBody
	@RequestMapping(value = "/select", method = RequestMethod.GET)
	public Users userSelect(@RequestParam Long id) {
		return userService.selectUserById(id);
	}
}
