package com.example.zhf.erp.model;

import java.io.Serializable;

public class Hybrid implements Serializable{

	private String id;// 下单编号
	private String name;// 产品名称
	private String user;
	private String time;
	private String bz;
	
	public Hybrid() {
		super();
	}
	
	public Hybrid(String id, String name, String user, String time, String bz) {
		super();
		this.id = id;
		this.name = name;
		this.user = user;
		this.time = time;
		this.bz = bz;
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
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}

	@Override
	public String toString() {
		return "Hybrid [id=" + id + ", name=" + name + ", user=" + user
				+ ", time=" + time + ", bz=" + bz + "]";
	}
	
}
