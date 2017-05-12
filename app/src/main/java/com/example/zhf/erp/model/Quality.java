package com.example.zhf.erp.model;

/**
 * @author Administrator
 * 质检权限
 * */
public class Quality {
	private String id;// 下单编号
	private String name;// 产品名称
	private String qualityUser;// 质检人
	private String qualitTime;// 质检时间
	private String orderBz;// 下单备注
	public Quality() {
		super();
	}
	
	public Quality(String id, String name, String qualityUser, String qualitTime,String orderBz) {
		super();
		this.id = id;
		this.name = name;
		this.qualityUser = qualityUser;
		this.qualitTime = qualitTime;
		this.orderBz = orderBz;
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
	public String getQualityUser() {
		return qualityUser;
	}
	public void setQualityUser(String qualityUser) {
		this.qualityUser = qualityUser;
	}
	public String getQualitTime() {
		return qualitTime;
	}
	public void setQualitTime(String qualitTime) {
		this.qualitTime = qualitTime;
	}

	public String getOrderBz() {
		return orderBz;
	}

	public void setOrderBz(String orderBz) {
		this.orderBz = orderBz;
	}

	@Override
	public String toString() {
		return "Quality [id=" + id + ", name=" + name + ", qualityUser="
				+ qualityUser + ", qualitTime=" + qualitTime + ", orderBz="
				+ orderBz + "]";
	}
	
}
