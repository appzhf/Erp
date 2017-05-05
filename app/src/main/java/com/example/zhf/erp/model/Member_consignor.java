package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 发货人成员信息类
 */
public class Member_consignor implements Serializable {
	private String id;// 发货人编号
	private String name;// 发货人姓名

	public Member_consignor() {
	}

	public Member_consignor(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member_consignor{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}
