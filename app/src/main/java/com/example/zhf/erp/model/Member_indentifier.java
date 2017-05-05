package com.example.zhf.erp.model;

import java.io.Serializable;

public class Member_indentifier implements Serializable{

	private String id;// 质检人编号
	private String name;// 质检人姓名

	public Member_indentifier() {
		super();
	}

	public Member_indentifier(String id, String name) {
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
		return "Member_indentifier{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}
