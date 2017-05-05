package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 入库人信息类
 */
public class Member_in implements Serializable {

	private String id;// 入库人编号
	private String name;// 入库人姓名

	public Member_in() {
		super();
	}

	public Member_in(String id, String name) {
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
		return "Member_in{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}
