package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * @author Administrator
 * 下单权限
 * */
public class Order implements Serializable{

	private String id;// 下单编号
	private String name;// 产品名称
	private String otherRequire;// 其它要求
	private String orderTime;// 下单时间
	private String orderUser;// 下单人
	
	public Order() {
		super();
	}
	
	public Order(String id, String name, String otherRequire,
			 String orderTime, String orderUser) {
		super();
		this.id = id;
		this.name = name;
		this.otherRequire = otherRequire;
		this.orderTime = orderTime;
		this.orderUser = orderUser;
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
	public String getOtherRequire() {
		return otherRequire;
	}
	public void setOtherRequire(String otherRequire) {
		this.otherRequire = otherRequire;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public String getOrderUser() {
		return orderUser;
	}
	public void setOrderUser(String orderUser) {
		this.orderUser = orderUser;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", otherRequire="
				+ otherRequire + ", orderTime=" + orderTime + ", orderUser=" + orderUser + "]";
	}
	
	
}
