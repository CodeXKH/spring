/*
 * Users.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-23 Created
 */
package com.xkh.dao.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 * 
 * @author 菠萝大象
 * @version 1.0 2016-12-23
 */
public class Users implements Serializable {

    /**
     * 账号编号
     */
    private Long id;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 手机号
     */
    private String userTel;
    /**
     * 1 男 2 女
     */
    private Byte sex;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 账户密码
     */
    private String userPwd;
    /**
     * 加盐
     */
    private String userSalt;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 最后登录时间
     */
    private Date lastLogTime;
    /**
     * 省份
     */
    private Integer porovince;
    /**
     * 用户类型（1：普通，2：商家，3：名家）
     */
    private Byte userType;
    /**
     * 用户收藏店铺数量
     */
    private Integer userShopNum;
    /**
     * 用户收藏商品数量
     */
    private Integer userProdNum;
    /**
     * 用户来源（1：书画PC，2：书画移动，3：健康PC，4：健康移动，5：商超PC，6：商超移动）
     */
    private Byte userSource;
    /**
     * 城市
     */
    private Integer city;
    /**
     * 删除标记（1：正常 ，2：删除 ，3：锁定）
     */
    private Byte isDel;
    /**
     * 是否修改用户名（0：未修改，1：已修改）
     */
    private Byte isChangeName;
    /**
     * 是否第一次登陆   0：否  1：是
     */
    private Byte isFirstLogin;
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
    public String getUserTel() {
        return userTel;
    }
    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }
    public Byte getSex() {
        return sex;
    }
    public void setSex(Byte sex) {
        this.sex = sex;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
    public String getUserPwd() {
        return userPwd;
    }
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }
    public String getUserSalt() {
        return userSalt;
    }
    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt == null ? null : userSalt.trim();
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public Date getLastLogTime() {
        return lastLogTime;
    }
    public void setLastLogTime(Date lastLogTime) {
        this.lastLogTime = lastLogTime;
    }
    public Integer getPorovince() {
        return porovince;
    }
    public void setPorovince(Integer porovince) {
        this.porovince = porovince;
    }
    public Byte getUserType() {
        return userType;
    }
    public void setUserType(Byte userType) {
        this.userType = userType;
    }
    public Integer getUserShopNum() {
        return userShopNum;
    }
    public void setUserShopNum(Integer userShopNum) {
        this.userShopNum = userShopNum;
    }
    public Integer getUserProdNum() {
        return userProdNum;
    }
    public void setUserProdNum(Integer userProdNum) {
        this.userProdNum = userProdNum;
    }
    public Byte getUserSource() {
        return userSource;
    }
    public void setUserSource(Byte userSource) {
        this.userSource = userSource;
    }
    public Integer getCity() {
        return city;
    }
    public void setCity(Integer city) {
        this.city = city;
    }
    public Byte getIsDel() {
        return isDel;
    }
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }
    public Byte getIsChangeName() {
        return isChangeName;
    }
    public void setIsChangeName(Byte isChangeName) {
        this.isChangeName = isChangeName;
    }
    public Byte getIsFirstLogin() {
        return isFirstLogin;
    }
    public void setIsFirstLogin(Byte isFirstLogin) {
        this.isFirstLogin = isFirstLogin;
    }
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Users other = (Users) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getUserTel() == null ? other.getUserTel() == null : this.getUserTel().equals(other.getUserTel()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserPwd() == null ? other.getUserPwd() == null : this.getUserPwd().equals(other.getUserPwd()))
            && (this.getUserSalt() == null ? other.getUserSalt() == null : this.getUserSalt().equals(other.getUserSalt()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getLastLogTime() == null ? other.getLastLogTime() == null : this.getLastLogTime().equals(other.getLastLogTime()))
            && (this.getPorovince() == null ? other.getPorovince() == null : this.getPorovince().equals(other.getPorovince()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getUserShopNum() == null ? other.getUserShopNum() == null : this.getUserShopNum().equals(other.getUserShopNum()))
            && (this.getUserProdNum() == null ? other.getUserProdNum() == null : this.getUserProdNum().equals(other.getUserProdNum()))
            && (this.getUserSource() == null ? other.getUserSource() == null : this.getUserSource().equals(other.getUserSource()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()))
            && (this.getIsChangeName() == null ? other.getIsChangeName() == null : this.getIsChangeName().equals(other.getIsChangeName()))
            && (this.getIsFirstLogin() == null ? other.getIsFirstLogin() == null : this.getIsFirstLogin().equals(other.getIsFirstLogin()));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getUserTel() == null) ? 0 : getUserTel().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserPwd() == null) ? 0 : getUserPwd().hashCode());
        result = prime * result + ((getUserSalt() == null) ? 0 : getUserSalt().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getLastLogTime() == null) ? 0 : getLastLogTime().hashCode());
        result = prime * result + ((getPorovince() == null) ? 0 : getPorovince().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getUserShopNum() == null) ? 0 : getUserShopNum().hashCode());
        result = prime * result + ((getUserProdNum() == null) ? 0 : getUserProdNum().hashCode());
        result = prime * result + ((getUserSource() == null) ? 0 : getUserSource().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        result = prime * result + ((getIsChangeName() == null) ? 0 : getIsChangeName().hashCode());
        result = prime * result + ((getIsFirstLogin() == null) ? 0 : getIsFirstLogin().hashCode());
        return result;
    }
}