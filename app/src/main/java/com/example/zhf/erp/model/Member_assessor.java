package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 审核人信息类
 */
public class Member_assessor implements Serializable {
	private String userId;//审核人编号
	private String userName;//审核人姓名

	public Member_assessor() {
	}

	public Member_assessor(String userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Member_assessor{" +
				"userId='" + userId + '\'' +
				", userName='" + userName + '\'' +
				'}';
	}
}
