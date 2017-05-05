package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 出库人信息类
 */
public class Member_out implements Serializable{

	private String id;// 出库人编号
	private String name;// 出库人姓名

	public Member_out() {

	}

	public Member_out(String id, String name) {
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
		return "Member_out{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}
