package com.example.zhf.erp.model;

/**
 * @author Administrator
 * 入库权限
 * */
public class PutIn {
	
	private String id;// 下单编号
	private String name;// 产品名称
	private String inStorageUser;// 入库人
	private String inStorageTime;// 入库时间
	private String inStorageBz;// 入库备注
	
	public PutIn() {
		super();
	}
	
	public PutIn(String id, String name, String inStorageUser,
			String inStorageTime, String inStorageBz) {
		super();
		this.id = id;
		this.name = name;
		this.inStorageUser = inStorageUser;
		this.inStorageTime = inStorageTime;
		this.inStorageBz = inStorageBz;
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
	public String getInStorageUser() {
		return inStorageUser;
	}
	public void setInStorageUser(String inStorageUser) {
		this.inStorageUser = inStorageUser;
	}
	public String getInStorageTime() {
		return inStorageTime;
	}
	public void setInStorageTime(String inStorageTime) {
		this.inStorageTime = inStorageTime;
	}
	public String getInStorageBz() {
		return inStorageBz;
	}
	public void setInStorageBz(String inStorageBz) {
		this.inStorageBz = inStorageBz;
	}

	@Override
	public String toString() {
		return "PutIn [id=" + id + ", name=" + name + ", inStorageUser="
				+ inStorageUser + ", inStorageTime=" + inStorageTime
				+ ", inStorageBz=" + inStorageBz + "]";
	}
	
	
}
