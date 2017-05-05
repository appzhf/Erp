package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 卖方信息类
 */
public class Seller implements Serializable{

	private String name;// 姓名
	private String position;// 职务
	private String telPhone;// 手机
	private String email;// 邮箱
	private String phone;// 电话
	private String fax;// 传真
	private String bz;// 备注

	public Seller() {
		super();
	}

	public Seller(String name, String position, String telPhone, String email, String phone, String fax, String bz) {
		this.name = name;
		this.position = position;
		this.telPhone = telPhone;
		this.email = email;
		this.phone = phone;
		this.fax = fax;
		this.bz = bz;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getTelPhone() {
		return telPhone;
	}

	public void setTelPhone(String telPhone) {
		this.telPhone = telPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	@Override
	public String toString() {
		return "Seller{" +
				"name='" + name + '\'' +
				", position='" + position + '\'' +
				", telPhone='" + telPhone + '\'' +
				", email='" + email + '\'' +
				", phone='" + phone + '\'' +
				", fax='" + fax + '\'' +
				", bz='" + bz + '\'' +
				'}';
	}
}
