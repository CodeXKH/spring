
package com.xkh.dao.bean.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.xkh.dao.bean.Users;
/**
 * 用户数据访问接口层
 * UsersMapper
 * 创建人:何雪平 
 * 时间：2017年1月12日-上午10:48:40 
 * @version 1.0.0
 *
 */
@Mapper
public interface UsersMapper {
	
	/**
	 * 根据id查询用户
	 * com.xkh.mapper 
	 * 方法名：selectUserByid
	 * 创建人：何雪平 
	 * 时间：2017年1月11日-下午6:08:08 
	 * @param id
	 * @return Users
	 * @exception 
	 * @since  1.0.0
	 */
	@Select(value = "SELECT * FROM users WHERE id=#{id,jdbcType=BIGINT}")
    @Results({
        @Result(property = "userName",  column = "userName"),
        @Result(property = "createTime", column = "createTime")
    })
	Users selectUserById(Long id);
	
	

	/**
	 * 查询所有用户
	 * com.xkh.dao.bean.mapper 
	 * 方法名：getAllUser
	 * 创建人：何雪平 
	 * 时间：2017年1月19日-上午10:19:02 
	 * @return List<Users>
	 * @exception 
	 * @since  1.0.0
	 */
    @Select("SELECT * FROM users")
    @Results({
        @Result(property = "userName",  column = "userName"),
        @Result(property = "createTime", column = "createTime")
    })
    List<Users> getAllUser();
	
	/**
	 * 添加用户
	 * com.xkh.dao.bean.mapper 
	 * 方法名：insertUser
	 * 创建人：何雪平 
	 * 时间：2017年1月19日-上午10:19:19 
	 * @param Users
	 * @return int
	 * @exception 
	 * @since  1.0.0
	 */
	@Insert(value = "insert into users (userName,createTime) values (#{userName,jdbcType=VARCHAR},#{createTime,jdbcType=TIMESTAMP})")
	int insertUser(Users Users);
	
	/**
	 * 更新用户
	 * com.xkh.dao.bean.mapper 
	 * 方法名：updateUser
	 * 创建人：何雪平 
	 * 时间：2017年1月19日-上午10:19:39 
	 * @param user void
	 * @exception 
	 * @since  1.0.0
	 */
    @Update("UPDATE users SET userName=#{userName},createTime=#{createTime} WHERE id =#{id}")
    void updateUser(Users user);

    /**
     * 删除用户
     * com.xkh.dao.bean.mapper 
     * 方法名：deleteUser
     * 创建人：何雪平 
     * 时间：2017年1月19日-上午10:19:53 
     * @param id void
     * @exception 
     * @since  1.0.0
     */
    @Delete("DELETE FROM users WHERE id =#{id}")
    void deleteUser(Long id);

}