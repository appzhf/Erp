package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 商品信息类
 */
public class Goods implements Serializable{

	private String goodsMaterialCode;// 物料代码
	private String goodsMaterialName;// 物料名称
	private String goodsSupplier;// 供应商
	private String goodsUser;// 联系人
	private String goodsUserPhone;// 联系电话
	private String goodsUserAddress;// 地址
	private String goodsBz;// 备注

	public Goods() {
	}

	public Goods(String goodsMaterialCode, String goodsMaterialName, String goodsSupplier,
				 String goodsUser, String goodsUserPhone, String goodsUserAddress, String goodsBz) {
		this.goodsMaterialCode = goodsMaterialCode;
		this.goodsMaterialName = goodsMaterialName;
		this.goodsSupplier = goodsSupplier;
		this.goodsUser = goodsUser;
		this.goodsUserPhone = goodsUserPhone;
		this.goodsUserAddress = goodsUserAddress;
		this.goodsBz = goodsBz;
	}

	public String getGoodsMaterialCode() {
		return goodsMaterialCode;
	}

	public void setGoodsMaterialCode(String goodsMaterialCode) {
		this.goodsMaterialCode = goodsMaterialCode;
	}

	public String getGoodsMaterialName() {
		return goodsMaterialName;
	}

	public void setGoodsMaterialName(String goodsMaterialName) {
		this.goodsMaterialName = goodsMaterialName;
	}

	public String getGoodsSupplier() {
		return goodsSupplier;
	}

	public void setGoodsSupplier(String goodsSupplier) {
		this.goodsSupplier = goodsSupplier;
	}

	public String getGoodsUser() {
		return goodsUser;
	}

	public void setGoodsUser(String goodsUser) {
		this.goodsUser = goodsUser;
	}

	public String getGoodsUserPhone() {
		return goodsUserPhone;
	}

	public void setGoodsUserPhone(String goodsUserPhone) {
		this.goodsUserPhone = goodsUserPhone;
	}

	public String getGoodsUserAddress() {
		return goodsUserAddress;
	}

	public void setGoodsUserAddress(String goodsUserAddress) {
		this.goodsUserAddress = goodsUserAddress;
	}

	public String getGoodsBz() {
		return goodsBz;
	}

	public void setGoodsBz(String goodsBz) {
		this.goodsBz = goodsBz;
	}

	@Override
	public String toString() {
		return "Goods{" +
				"goodsMaterialCode='" + goodsMaterialCode + '\'' +
				", goodsMaterialName='" + goodsMaterialName + '\'' +
				", goodsSupplier='" + goodsSupplier + '\'' +
				", goodsUser='" + goodsUser + '\'' +
				", goodsUserPhone='" + goodsUserPhone + '\'' +
				", goodsUserAddress='" + goodsUserAddress + '\'' +
				", goodsBz='" + goodsBz + '\'' +
				'}';
	}
}
