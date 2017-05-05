package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 杭水材料信息表2
 */
public class Material_hs0 implements Serializable {

	private String products;// 所属产品
	private String classIfication;// 分类
	private String classIficationSon;// 分类子项
	private String partsName;// 零件代号
	private String mouldName;// 模具代号
	private String drawName;// 图纸代号
	private int id;// 序号
	private String code;// 物料代码
	private String name;// 物料名称
	private String specifications;// 规格型号
	private String suppliers;// 供应商
	private String storeAdress;// 存放仓库位置
	private int needNumber;// 所需数量
	private int projectNumber;// 项目套数
	private int allNumber;// 合计数量
	private int inventoryNumber;// 库存数量
	private int virtualNumber;// 虚拟库存数量
	private String attribute;// 属性
	private String bz;// 备注
	private String nowState;// 当前状态
	private int inStockNumber;// 有货判断数量
	private int remindNumber;// 提醒判断数量
	private int outStockNumber;// 缺货判断数量
	private int emergencyNumber;// 紧急判断数量
	private boolean isSelected;// 是否选中

	public Material_hs0() {
	}

	public String getProducts() {
		return products;
	}

	public Material_hs0(String products, String classIfication, String classIficationSon, String partsName,
						String mouldName, String drawName, int id, String code, String name, String specifications,
						String suppliers, String storeAdress, int needNumber, int projectNumber, int allNumber,
						int inventoryNumber, int virtualNumber, String attribute, String bz, String nowState,
						int inStockNumber, int remindNumber, int outStockNumber, int emergencyNumber, boolean isSelected) {
		this.products = products;
		this.classIfication = classIfication;
		this.classIficationSon = classIficationSon;
		this.partsName = partsName;
		this.mouldName = mouldName;
		this.drawName = drawName;
		this.id = id;
		this.code = code;
		this.name = name;
		this.specifications = specifications;
		this.suppliers = suppliers;
		this.storeAdress = storeAdress;
		this.needNumber = needNumber;
		this.projectNumber = projectNumber;
		this.allNumber = allNumber;
		this.inventoryNumber = inventoryNumber;
		this.virtualNumber = virtualNumber;
		this.attribute = attribute;
		this.bz = bz;
		this.nowState = nowState;
		this.inStockNumber = inStockNumber;
		this.remindNumber = remindNumber;
		this.outStockNumber = outStockNumber;
		this.emergencyNumber = emergencyNumber;
		this.isSelected = isSelected;
	}

	public void setProducts(String products) {
		this.products = products;
	}

	public String getClassIfication() {
		return classIfication;
	}

	public void setClassIfication(String classIfication) {
		this.classIfication = classIfication;
	}

	public String getClassIficationSon() {
		return classIficationSon;
	}

	public void setClassIficationSon(String classIficationSon) {
		this.classIficationSon = classIficationSon;
	}

	public String getPartsName() {
		return partsName;
	}

	public void setPartsName(String partsName) {
		this.partsName = partsName;
	}

	public String getMouldName() {
		return mouldName;
	}

	public void setMouldName(String mouldName) {
		this.mouldName = mouldName;
	}

	public String getDrawName() {
		return drawName;
	}

	public void setDrawName(String drawName) {
		this.drawName = drawName;
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

	public String getSpecifications() {
		return specifications;
	}

	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}

	public String getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(String suppliers) {
		this.suppliers = suppliers;
	}

	public String getStoreAdress() {
		return storeAdress;
	}

	public void setStoreAdress(String storeAdress) {
		this.storeAdress = storeAdress;
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

	public int getVirtualNumber() {
		return virtualNumber;
	}

	public void setVirtualNumber(int virtualNumber) {
		this.virtualNumber = virtualNumber;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
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

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean selected) {
		isSelected = selected;
	}

	@Override
	public String toString() {
		return "Material_hs0{" +
				"products='" + products + '\'' +
				", classIfication='" + classIfication + '\'' +
				", classIficationSon='" + classIficationSon + '\'' +
				", partsName='" + partsName + '\'' +
				", mouldName='" + mouldName + '\'' +
				", drawName='" + drawName + '\'' +
				", id=" + id +
				", code='" + code + '\'' +
				", name='" + name + '\'' +
				", specifications='" + specifications + '\'' +
				", suppliers='" + suppliers + '\'' +
				", storeAdress='" + storeAdress + '\'' +
				", needNumber=" + needNumber +
				", projectNumber=" + projectNumber +
				", allNumber=" + allNumber +
				", inventoryNumber=" + inventoryNumber +
				", virtualNumber=" + virtualNumber +
				", attribute='" + attribute + '\'' +
				", bz='" + bz + '\'' +
				", nowState='" + nowState + '\'' +
				", inStockNumber=" + inStockNumber +
				", remindNumber=" + remindNumber +
				", outStockNumber=" + outStockNumber +
				", emergencyNumber=" + emergencyNumber +
				", isSelected=" + isSelected +
				'}';
	}
}
