package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 生产人信息类
 */
public class Member_produce implements Serializable {

	private String id;// 生产人编号
	private String name;// 生产人姓名

	public Member_produce() {
		super();
	}

	public Member_produce(String id, String name) {
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
		return "Member_produce{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}
