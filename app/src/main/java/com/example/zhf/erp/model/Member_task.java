package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 下单人信息类
 */
public class Member_task implements Serializable {

	private String id;// 下单人编号
	private String name;// 下单人姓名

	public Member_task() {
		super();
	}

	public Member_task(String id, String name) {
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
		return "Member_task{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}
