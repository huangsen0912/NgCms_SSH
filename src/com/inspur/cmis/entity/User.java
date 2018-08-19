package com.inspur.cmis.entity;


import javax.persistence.Entity;


/**
 * 用户实体类
 */
@Entity
//@Table(name = "pop_user", schema = "popular_bank_dev")
public class User {
	private int id;// 用户编号
	private String loginName;// 用户登录名
	private String passWord;// 用户密码
	private String name;// 用户名称
	private String groupId;// 机构名称
	private String description;// 描述
	private String valid;//是否有效
	private String locked;//是否锁定
	private String modifiedTime;// 修改时间
	private String createdTime;//建立日期
	private Integer createduserid;// 建立者
	private Integer modifieduserid;//修改者
	private String roleid;//角色 1 管理员 2 客户经理


	public User() {
	}

	public User(String loginName,String name ,String passWord ) {
		this.loginName = loginName;
		this.name = name;
		this.passWord = passWord;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getValid() {
		return valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

	public String getLocked() {
		return locked;
	}

	public void setLocked(String locked) {
		this.locked = locked;
	}

	public String getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(String modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public Integer getCreateduserid() {
		return createduserid;
	}

	public void setCreateduserid(Integer createduserid) {
		this.createduserid = createduserid;
	}

	public Integer getModifieduserid() {
		return modifieduserid;
	}

	public void setModifieduserid(Integer modifieduserid) {
		this.modifieduserid = modifieduserid;
	}

	public String getRoleid() {
		return roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}
}
