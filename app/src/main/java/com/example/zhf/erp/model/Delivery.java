package com.example.zhf.erp.model;

/**
 * @author Administrator
 * 发货权限
 * */
public class Delivery {
	private String id;// 下单编号
	private String name;// 产品名称
	private String deliveryUser;// 发货人
	private String deliveryTime;// 发货时间
	private String deliveryBz;// 发货备注
	
	public Delivery() {
		super();
	}
	
	public Delivery(String id, String name, String deliveryUser,
			String deliveryTime, String deliveryBz) {
		super();
		this.id = id;
		this.name = name;
		this.deliveryUser = deliveryUser;
		this.deliveryTime = deliveryTime;
		this.deliveryBz = deliveryBz;
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
	public String getDeliveryUser() {
		return deliveryUser;
	}
	public void setDeliveryUser(String deliveryUser) {
		this.deliveryUser = deliveryUser;
	}
	public String getDeliveryTime() {
		return deliveryTime;
	}
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	public String getDeliveryBz() {
		return deliveryBz;
	}
	public void setDeliveryBz(String deliveryBz) {
		this.deliveryBz = deliveryBz;
	}

	@Override
	public String toString() {
		return "Delivery [id=" + id + ", name=" + name + ", deliveryUser="
				+ deliveryUser + ", deliveryTime=" + deliveryTime
				+ ", deliveryBz=" + deliveryBz + "]";
	}
	
}
