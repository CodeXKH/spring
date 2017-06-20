package com.xkh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xkh.dao.bean.Users;
import com.xkh.dao.bean.mapper.UsersMapper;
import com.xkh.service.UserService;
/**
 * 用户服务接口实现层
 * 
 * UserServiceImpl
 * 创建人:何雪平 
 * 时间：2017年1月11日-下午6:15:51 
 * @version 1.0.0
 * 使用ehcache 缓存  配置与xml名称一致
 */
@CacheConfig(cacheNames = "roncooCache")
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UsersMapper usersMapper;

	/**
	 * 查询用户信息
	 * com.xkh.service.impl 
	 * 方法名：selectUserById
	 * 创建人：何雪平 
	 * 时间：2017年1月11日-下午6:16:18 
	 * @param id
	 * @return
	 * @see com.xkh.service.UserService#selectUserById(java.lang.Long)
	 * @exception 
	 * @since  1.0.0
	 */
	@Cacheable(key = "#p0")
	@Transactional
	@Override
	public Users selectUserById(Long id) {
		System.out.println("查询功能，缓存找不到，直接读库, id=" + id);
		return usersMapper.selectUserById(id);
	}

	/**
	 * 查询所有用户
	 * com.xkh.service.impl 
	 * 方法名：selectUserAll
	 * 创建人：何雪平 
	 * 时间：2017年1月19日-下午4:15:52 
	 * @return
	 * @see com.xkh.service.UserService#selectUserAll()
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public List<Users> selectUserAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 更新用户
	 * com.xkh.service.impl 
	 * 方法名：updateUser
	 * 创建人：何雪平 
	 * 时间：2017年1月19日-下午4:15:59 
	 * @param users
	 * @return
	 * @see com.xkh.service.UserService#updateUser(com.xkh.dao.bean.Users)
	 * @exception 
	 * @since  1.0.0
	 */
	@CachePut(key = "#p0")
	@Override
	public int updateUser(Users users) {
		System.out.println("更新功能，更新缓存，直接写库, id=" + users);
		return 0;
	}

	/**
	 * 添加用户
	 * com.xkh.service.impl 
	 * 方法名：insertUser
	 * 创建人：何雪平 
	 * 时间：2017年1月19日-下午4:16:04 
	 * @param users
	 * @return
	 * @see com.xkh.service.UserService#insertUser(com.xkh.dao.bean.Users)
	 * @exception 
	 * @since  1.0.0
	 */
	@Override
	public int insertUser(Users users) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 删除用户
	 * com.xkh.service.impl 
	 * 方法名：deleteUserById
	 * 创建人：何雪平 
	 * 时间：2017年1月19日-下午4:16:08 
	 * @param id
	 * @return
	 * @see com.xkh.service.UserService#deleteUserById(java.lang.Long)
	 * @exception 
	 * @since  1.0.0
	 */
	@CacheEvict(key = "#p0")
	@Override
	public int deleteUserById(Long id) {
		System.out.println("删除功能，删除缓存，直接写库, id=" + id);
		return 0;
	}

}
