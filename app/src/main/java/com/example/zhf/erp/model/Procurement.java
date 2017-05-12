package com.example.zhf.erp.model;

/**
 * @author Administrator
 * 采购权限
 * */
public class Procurement {
	private String id;// 下单编号
	private String name;// 产品名称
	private String verifyUser;// 材料核实人
	private String verifyTime;// 材料核实时间
	private String verifyBz;// 材料采购备注
	
	public Procurement() {
		super();
	}
	
	public Procurement(String id, String name, String verifyUser,
			String verifyTime, String verifyBz) {
		super();
		this.id = id;
		this.name = name;
		this.verifyUser = verifyUser;
		this.verifyTime = verifyTime;
		this.verifyBz = verifyBz;
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
	public String getVerifyUser() {
		return verifyUser;
	}
	public void setVerifyUser(String verifyUser) {
		this.verifyUser = verifyUser;
	}
	public String getVerifyTime() {
		return verifyTime;
	}
	public void setVerifyTime(String verifyTime) {
		this.verifyTime = verifyTime;
	}
	public String getVerifyBz() {
		return verifyBz;
	}
	public void setVerifyBz(String verifyBz) {
		this.verifyBz = verifyBz;
	}

	@Override
	public String toString() {
		return "Procurement [id=" + id + ", name=" + name + ", verifyUser="
				+ verifyUser + ", verifyTime=" + verifyTime + ", verifyBz="
				+ verifyBz + "]";
	}
	
}
