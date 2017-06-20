package com.xkh.service;

import java.util.List;

import com.xkh.dao.bean.Users;
/**
 * 用户服务接口层
 * 
 * UserService
 * 创建人:何雪平 
 * 时间：2017年1月11日-下午6:14:34 
 * @version 1.0.0
 *
 */
public interface UserService {

	/**
	 * 查询用户信息
	 * com.xkh.service 
	 * 方法名：selectUserById
	 * 创建人：何雪平 
	 * 时间：2017年1月11日-下午6:14:59 
	 * @param id
	 * @return Users
	 * @exception 
	 * @since  1.0.0
	 */
	Users selectUserById(Long id);
	
	/**
	 * 查询所有用户
	 * com.xkh.service 
	 * 方法名：selectUserAll
	 * 创建人：何雪平 
	 * 时间：2017年1月19日-下午4:14:30 
	 * @return List<Users>
	 * @exception 
	 * @since  1.0.0
	 */
	List<Users> selectUserAll();
	
	/**
	 * 更新用户
	 * com.xkh.service 
	 * 方法名：updateUser
	 * 创建人：何雪平 
	 * 时间：2017年1月19日-下午4:14:46 
	 * @param users
	 * @return int
	 * @exception 
	 * @since  1.0.0
	 */
	int updateUser(Users users);
	
	/**
	 * 添加用户
	 * com.xkh.service 
	 * 方法名：insertUser
	 * 创建人：何雪平 
	 * 时间：2017年1月19日-下午4:15:01 
	 * @param users
	 * @return int
	 * @exception 
	 * @since  1.0.0
	 */
	int insertUser(Users users);
	
	/**
	 * 删除用户
	 * com.xkh.service 
	 * 方法名：deleteUserById
	 * 创建人：何雪平 
	 * 时间：2017年1月19日-下午4:15:18 
	 * @param id
	 * @return int
	 * @exception 
	 * @since  1.0.0
	 */
	int deleteUserById(Long id);
}
