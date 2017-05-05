package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 操作信息日志
 */
public class Product_log implements Serializable {
	private String operationUser;// 操作人
	private String operationTime;// 操作时间
	private String operationContent;// 操作内容
	private String operationNature;// 操作性质
	private String orderId;// 下单编号
	private String productName;// 产品名称
	private String specifications;// 规格型号
	private String otherRequire;// 其他要求
	private int number;// 数量
	private String bz;// 备注

	public Product_log() {
		super();
	}

	public Product_log(String operationUser, String operationTime, String operationContent, String operationNature,
					   String orderId, String productName, String specifications, String otherRequire, int number, String bz) {
		this.operationUser = operationUser;
		this.operationTime = operationTime;
		this.operationContent = operationContent;
		this.operationNature = operationNature;
		this.orderId = orderId;
		this.productName = productName;
		this.specifications = specifications;
		this.otherRequire = otherRequire;
		this.number = number;
		this.bz = bz;
	}

	public String getOperationUser() {
		return operationUser;
	}

	public void setOperationUser(String operationUser) {
		this.operationUser = operationUser;
	}

	public String getOperationTime() {
		return operationTime;
	}

	public void setOperationTime(String operationTime) {
		this.operationTime = operationTime;
	}

	public String getOperationContent() {
		return operationContent;
	}

	public void setOperationContent(String operationContent) {
		this.operationContent = operationContent;
	}

	public String getOperationNature() {
		return operationNature;
	}

	public void setOperationNature(String operationNature) {
		this.operationNature = operationNature;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSpecifications() {
		return specifications;
	}

	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}

	public String getOtherRequire() {
		return otherRequire;
	}

	public void setOtherRequire(String otherRequire) {
		this.otherRequire = otherRequire;
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
		return "Product_log{" +
				"operationUser='" + operationUser + '\'' +
				", operationTime='" + operationTime + '\'' +
				", operationContent='" + operationContent + '\'' +
				", operationNature='" + operationNature + '\'' +
				", orderId='" + orderId + '\'' +
				", productName='" + productName + '\'' +
				", specifications='" + specifications + '\'' +
				", otherRequire='" + otherRequire + '\'' +
				", number=" + number +
				", bz='" + bz + '\'' +
				'}';
	}
}
