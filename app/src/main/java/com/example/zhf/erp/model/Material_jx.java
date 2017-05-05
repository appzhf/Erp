package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng
 * 
 */
public class Material_jx implements Serializable {
	private String productName;// 产品名称
	private int id;// 序号
	private String code;// 物料代码
	private String name;// 零件名称
	private String parts;// 所属部门
	private String material;// 材料
	private String weight;// 单件重量
	private int needNumber;// 所需数量
	private int projectNumber;// 项目套数
	private int allNumber;// 合计数量
	private int inventoryNumber;// 库存数量
	private String bz;// 备注
	private String nowState;// 当前状态
	private int inStockNumber;// 有货判断数量
	private int remindNumber;// 提醒判断数量
	private int outStockNumber;// 缺货判断数量
	private int emergencyNumber;// 紧急判断数量

	public Material_jx() {
	}

	public Material_jx(String productName, int id, String code, String name, String parts, String material,
					   String weight, int needNumber, int projectNumber, int allNumber, int inventoryNumber,
					   String bz, String nowState, int inStockNumber, int remindNumber, int outStockNumber,
					   int emergencyNumber) {
		this.productName = productName;
		this.id = id;
		this.code = code;
		this.name = name;
		this.parts = parts;
		this.material = material;
		this.weight = weight;
		this.needNumber = needNumber;
		this.projectNumber = projectNumber;
		this.allNumber = allNumber;
		this.inventoryNumber = inventoryNumber;
		this.bz = bz;
		this.nowState = nowState;
		this.inStockNumber = inStockNumber;
		this.remindNumber = remindNumber;
		this.outStockNumber = outStockNumber;
		this.emergencyNumber = emergencyNumber;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParts() {
		return parts;
	}

	public void setParts(String parts) {
		this.parts = parts;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
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

	public int getEmergencyNumber() {
		return emergencyNumber;
	}

	public void setEmergencyNumber(int emergencyNumber) {
		this.emergencyNumber = emergencyNumber;
	}

	@Override
	public String toString() {
		return "Material_jx{" +
				"productName='" + productName + '\'' +
				", id=" + id +
				", code='" + code + '\'' +
				", name='" + name + '\'' +
				", parts='" + parts + '\'' +
				", material='" + material + '\'' +
				", weight='" + weight + '\'' +
				", needNumber=" + needNumber +
				", projectNumber=" + projectNumber +
				", allNumber=" + allNumber +
				", inventoryNumber=" + inventoryNumber +
				", bz='" + bz + '\'' +
				", nowState='" + nowState + '\'' +
				", inStockNumber=" + inStockNumber +
				", remindNumber=" + remindNumber +
				", outStockNumber=" + outStockNumber +
				", emergencyNumber=" + emergencyNumber +
				'}';
	}
}
