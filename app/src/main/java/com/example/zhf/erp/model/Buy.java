package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * 购买类
 */
public class Buy implements Serializable{
	private int buyId; // 采购单号
	private String buyDate; // 采购
	private String buyUser; // 采购人
	private String buyIsPutInStorage; // 是否已入库
	private String buyBz; // 备注

	public Buy() {
	}

	public Buy(int buyId, String buyDate, String buyUser, String buyIsPutInStorage, String buyBz) {
		this.buyId = buyId;
		this.buyDate = buyDate;
		this.buyUser = buyUser;
		this.buyIsPutInStorage = buyIsPutInStorage;
		this.buyBz = buyBz;
	}

	public int getBuyId() {
		return buyId;
	}

	public void setBuyId(int buyId) {
		this.buyId = buyId;
	}

	public String getBuyDate() {
		return buyDate;
	}

	public void setBuyDate(String buyDate) {
		this.buyDate = buyDate;
	}

	public String getBuyUser() {
		return buyUser;
	}

	public void setBuyUser(String buyUser) {
		this.buyUser = buyUser;
	}

	public String getBuyIsPutInStorage() {
		return buyIsPutInStorage;
	}

	public void setBuyIsPutInStorage(String buyIsPutInStorage) {
		this.buyIsPutInStorage = buyIsPutInStorage;
	}

	public String getBuyBz() {
		return buyBz;
	}

	public void setBuyBz(String buyBz) {
		this.buyBz = buyBz;
	}

	@Override
	public String toString() {
		return "Buy{" +
				"buyId=" + buyId +
				", buyDate='" + buyDate + '\'' +
				", buyUser='" + buyUser + '\'' +
				", buyIsPutInStorage='" + buyIsPutInStorage + '\'' +
				", buyBz='" + buyBz + '\'' +
				'}';
	}
}
