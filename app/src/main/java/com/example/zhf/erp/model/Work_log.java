package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 工作信息表
 */
public class Work_log implements Serializable{

	private String orderId;// 下单编号
	private String productName;// 产品名称
	private String specifications;// 规格型号
	private String otherRequest;// 其他要求
	private String parts;// 所属部门
	private String operationUser;// 操作人员
	private String operationTime;// 操作时间
	private String operationContent;// 操作内容
	private String bz;// 备注

	public Work_log() {
	}

	public Work_log(String orderId, String productName, String specifications, String otherRequest,
					String parts, String operationUser, String operationTime, String operationContent,
					String bz) {
		this.orderId = orderId;
		this.productName = productName;
		this.specifications = specifications;
		this.otherRequest = otherRequest;
		this.parts = parts;
		this.operationUser = operationUser;
		this.operationTime = operationTime;
		this.operationContent = operationContent;
		this.bz = bz;
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

	public String getOtherRequest() {
		return otherRequest;
	}

	public void setOtherRequest(String otherRequest) {
		this.otherRequest = otherRequest;
	}

	public String getParts() {
		return parts;
	}

	public void setParts(String parts) {
		this.parts = parts;
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

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	@Override
	public String toString() {
		return "Work_log{" +
				"orderId='" + orderId + '\'' +
				", productName='" + productName + '\'' +
				", specifications='" + specifications + '\'' +
				", otherRequest='" + otherRequest + '\'' +
				", parts='" + parts + '\'' +
				", operationUser='" + operationUser + '\'' +
				", operationTime='" + operationTime + '\'' +
				", operationContent='" + operationContent + '\'' +
				", bz='" + bz + '\'' +
				'}';
	}
}
