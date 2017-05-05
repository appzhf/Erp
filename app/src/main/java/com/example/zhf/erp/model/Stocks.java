package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 存货信息类
 */
public class Stocks implements Serializable {

	private String materialCode;// 物料代码
	private String materialName;// 物料名称
	private String supplier;// 供应商
	private String products;// 所属产品
	private String storeAddress;// 仓库存放位置
	private int inventoryNumber;// 库存数量
	private int virtualNumber;// 虚拟库存数量
	private String nowState;// 当前状态
	private String attrubute;// 属性
	private int inStockNumber;// 有货判断数量
	private int remindNumber;// 提醒判断数量
	private int outStockNumber;// 缺货判断数量
	private int number;// 紧急判断数量
	private String bz;// 备注

	
	public Stocks(){
		
	}

	public Stocks(String materialCode, String materialName, String supplier, String products,
				  String storeAddress, int inventoryNumber, int virtualNumber, String nowState,
				  String attrubute, int inStockNumber, int remindNumber, int outStockNumber, int number, String bz) {
		this.materialCode = materialCode;
		this.materialName = materialName;
		this.supplier = supplier;
		this.products = products;
		this.storeAddress = storeAddress;
		this.inventoryNumber = inventoryNumber;
		this.virtualNumber = virtualNumber;
		this.nowState = nowState;
		this.attrubute = attrubute;
		this.inStockNumber = inStockNumber;
		this.remindNumber = remindNumber;
		this.outStockNumber = outStockNumber;
		this.number = number;
		this.bz = bz;
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

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getProducts() {
		return products;
	}

	public void setProducts(String products) {
		this.products = products;
	}

	public String getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public int getInventoryNumber() {
		return inventoryNumber;
	}

	public void setInventoryNumber(int inventoryNumber) {
		this.inventoryNumber = inventoryNumber;
	}

	public int getVirtualNumber() {
		return virtualNumber;
	}

	public void setVirtualNumber(int virtualNumber) {
		this.virtualNumber = virtualNumber;
	}

	public String getNowState() {
		return nowState;
	}

	public void setNowState(String nowState) {
		this.nowState = nowState;
	}

	public String getAttrubute() {
		return attrubute;
	}

	public void setAttrubute(String attrubute) {
		this.attrubute = attrubute;
	}

	public int getInStockNumber() {
		return inStockNumber;
	}

	public void setInStockNumber(int inStockNumber) {
		this.inStockNumber = inStockNumber;
	}

	public int getRemindNumber() {
		return remindNumber;
	}

	public void setRemindNumber(int remindNumber) {
		this.remindNumber = remindNumber;
	}

	public int getOutStockNumber() {
		return outStockNumber;
	}

	public void setOutStockNumber(int outStockNumber) {
		this.outStockNumber = outStockNumber;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	@Override
	public String toString() {
		return "Stocks{" +
				"materialCode='" + materialCode + '\'' +
				", materialName='" + materialName + '\'' +
				", supplier='" + supplier + '\'' +
				", products='" + products + '\'' +
				", storeAddress='" + storeAddress + '\'' +
				", inventoryNumber=" + inventoryNumber +
				", virtualNumber=" + virtualNumber +
				", nowState='" + nowState + '\'' +
				", attrubute='" + attrubute + '\'' +
				", inStockNumber=" + inStockNumber +
				", remindNumber=" + remindNumber +
				", outStockNumber=" + outStockNumber +
				", number=" + number +
				", bz='" + bz + '\'' +
				'}';
	}
}
