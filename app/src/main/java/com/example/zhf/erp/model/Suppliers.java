package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 采购信息类
 */
public class Suppliers implements Serializable {

	private int id;// 序号
	private String procureId;// 采购单号
	private String materialCode;// 物料代码
	private String materialName;// 物料名称
	private String name;// 供应商
	private int buyNumber;// 购买数量
	private int paidInNumber;// 实收数量
	private int remainNumber;// 剩余数量
	private String isInStoreage;// 是否入库
	private String bz;// 备注

	public Suppliers() {
	}

	public Suppliers(int id, String procureId, String materialCode, String materialName, String name,
					 int buyNumber, int paidInNumber, int remainNumber, String isInStoreage, String bz) {
		this.id = id;
		this.procureId = procureId;
		this.materialCode = materialCode;
		this.materialName = materialName;
		this.name = name;
		this.buyNumber = buyNumber;
		this.paidInNumber = paidInNumber;
		this.remainNumber = remainNumber;
		this.isInStoreage = isInStoreage;
		this.bz = bz;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProcureId() {
		return procureId;
	}

	public void setProcureId(String procureId) {
		this.procureId = procureId;
	}

	public String getMaterialCode() {
		return materialCode;
	}

	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBuyNumber() {
		return buyNumber;
	}

	public void setBuyNumber(int buyNumber) {
		this.buyNumber = buyNumber;
	}

	public int getPaidInNumber() {
		return paidInNumber;
	}

	public void setPaidInNumber(int paidInNumber) {
		this.paidInNumber = paidInNumber;
	}

	public int getRemainNumber() {
		return remainNumber;
	}

	public void setRemainNumber(int remainNumber) {
		this.remainNumber = remainNumber;
	}

	public String getIsInStoreage() {
		return isInStoreage;
	}

	public void setIsInStoreage(String isInStoreage) {
		this.isInStoreage = isInStoreage;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	@Override
	public String toString() {
		return "Suppliers{" +
				"id=" + id +
				", procureId='" + procureId + '\'' +
				", materialCode='" + materialCode + '\'' +
				", materialName='" + materialName + '\'' +
				", name='" + name + '\'' +
				", buyNumber=" + buyNumber +
				", paidInNumber=" + paidInNumber +
				", remainNumber=" + remainNumber +
				", isInStoreage='" + isInStoreage + '\'' +
				", bz='" + bz + '\'' +
				'}';
	}
}
