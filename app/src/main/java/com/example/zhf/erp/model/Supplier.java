package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 供应商信息类
 */
public class Supplier implements Serializable{

	private String name;// 供应商
	private String user;// 联系人
	private String phone;// 联系电话
	private String address;// 地址
	private String bz;// 备注

	public Supplier() {
		super();
	}

	public Supplier(String name, String user, String phone, String address, String bz) {
		this.name = name;
		this.user = user;
		this.phone = phone;
		this.address = address;
		this.bz = bz;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	@Override
	public String toString() {
		return "Supplier{" +
				"name='" + name + '\'' +
				", user='" + user + '\'' +
				", phone='" + phone + '\'' +
				", address='" + address + '\'' +
				", bz='" + bz + '\'' +
				'}';
	}
}
