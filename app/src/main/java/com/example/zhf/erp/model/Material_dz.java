package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 下单信息类
 */
public class Material_dz implements Serializable{

	private String name;// 产品名称
	private int id;// 序号
	private String code;// 物料代码
	private String partsName;// 零件名称
	private String dzModel;// 型号
	private String specifications;// 规格
	private String department;// 所属部门
	private int needNumber;// 所需数量
	private int projectNumber;// 项目套数
	private int allNumber;// 合计数量
	private int inventoryNumber;// 库存数量
	private String bz;// 备注
	private String nowState;// 当前状态
	private int inStockNumber;// 有货判断数量
	private int remindNumber;// 提醒判断数量
	private int outStockNumber;// 缺货判断数量
	private int emergency_number;// 紧急判断数量

	public Material_dz() {
	}

	public Material_dz(String name, int id, String code, String partsName, String dzModel,
					   String specifications, String department, int needNumber, int projectNumber,
					   int allNumber, int inventoryNumber, String bz, String nowState, int inStockNumber,
					   int remindNumber, int outStockNumber, int emergency_number) {
		this.name = name;
		this.id = id;
		this.code = code;
		this.partsName = partsName;
		this.dzModel = dzModel;
		this.specifications = specifications;
		this.department = department;
		this.needNumber = needNumber;
		this.projectNumber = projectNumber;
		this.allNumber = allNumber;
		this.inventoryNumber = inventoryNumber;
		this.bz = bz;
		this.nowState = nowState;
		this.inStockNumber = inStockNumber;
		this.remindNumber = remindNumber;
		this.outStockNumber = outStockNumber;
		this.emergency_number = emergency_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPartsName() {
		return partsName;
	}

	public void setPartsName(String partsName) {
		this.partsName = partsName;
	}

	public String getDzModel() {
		return dzModel;
	}

	public void setDzModel(String dzModel) {
		this.dzModel = dzModel;
	}

	public String getSpecifications() {
		return specifications;
	}

	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getNeedNumber() {
		return needNumber;
	}

	public void setNeedNumber(int needNumber) {
		this.needNumber = needNumber;
	}

	public int getProjectNumber() {
		return projectNumber;
	}

	public void setProjectNumber(int projectNumber) {
		this.projectNumber = projectNumber;
	}

	public int getAllNumber() {
		return allNumber;
	}

	public void setAllNumber(int allNumber) {
		this.allNumber = allNumber;
	}

	public int getInventoryNumber() {
		return inventoryNumber;
	}

	public void setInventoryNumber(int inventoryNumber) {
		this.inventoryNumber = inventoryNumber;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getNowState() {
		return nowState;
	}

	public void setNowState(String nowState) {
		this.nowState = nowState;
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

	public int getEmergency_number() {
		return emergency_number;
	}

	public void setEmergency_number(int emergency_number) {
		this.emergency_number = emergency_number;
	}

	@Override
	public String toString() {
		return "Material_dz{" +
				"name='" + name + '\'' +
				", id=" + id +
				", code='" + code + '\'' +
				", partsName='" + partsName + '\'' +
				", dzModel='" + dzModel + '\'' +
				", specifications='" + specifications + '\'' +
				", department='" + department + '\'' +
				", needNumber=" + needNumber +
				", projectNumber=" + projectNumber +
				", allNumber=" + allNumber +
				", inventoryNumber=" + inventoryNumber +
				", bz='" + bz + '\'' +
				", nowState='" + nowState + '\'' +
				", inStockNumber=" + inStockNumber +
				", remindNumber=" + remindNumber +
				", outStockNumber=" + outStockNumber +
				", emergency_number=" + emergency_number +
				'}';
	}
}
