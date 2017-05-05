package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 存货信息日志类
 */
public class Stocks_log implements Serializable {

	private String operationUser;// 操作人
	private String operationTime;// 操作时间
	private String operationContent;// 操作内容
	private String operationNature;// 操作性质
	private String bz;// 备注
	private String materialCode;// 物料代码
	private String materialName;// 物料名称
	private String operationNumber;// 操作数量
	private String inventoryNumber;// 库存数量

	
	public Stocks_log(){
		super();
	}

	public Stocks_log(String operationUser, String operationTime, String operationContent, String operationNature,
					  String bz, String materialCode, String materialName, String operationNumber, String inventoryNumber) {
		this.operationUser = operationUser;
		this.operationTime = operationTime;
		this.operationContent = operationContent;
		this.operationNature = operationNature;
		this.bz = bz;
		this.materialCode = materialCode;
		this.materialName = materialName;
		this.operationNumber = operationNumber;
		this.inventoryNumber = inventoryNumber;
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

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
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

	public String getOperationNumber() {
		return operationNumber;
	}

	public void setOperationNumber(String operationNumber) {
		this.operationNumber = operationNumber;
	}

	public String getInventoryNumber() {
		return inventoryNumber;
	}

	public void setInventoryNumber(String inventoryNumber) {
		this.inventoryNumber = inventoryNumber;
	}

	@Override
	public String toString() {
		return "Stocks_log{" +
				"operationUser='" + operationUser + '\'' +
				", operationTime='" + operationTime + '\'' +
				", operationContent='" + operationContent + '\'' +
				", operationNature='" + operationNature + '\'' +
				", bz='" + bz + '\'' +
				", materialCode='" + materialCode + '\'' +
				", materialName='" + materialName + '\'' +
				", operationNumber='" + operationNumber + '\'' +
				", inventoryNumber='" + inventoryNumber + '\'' +
				'}';
	}
}
