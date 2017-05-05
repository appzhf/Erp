package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 采购人信息类
 */
public class Member_sale implements Serializable {

	private String id;// 采购人编号
	private String name;// 采购人姓名

	public Member_sale() {
		super();
	}

	public Member_sale(String id, String name) {
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
		return "Member_sale{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}
