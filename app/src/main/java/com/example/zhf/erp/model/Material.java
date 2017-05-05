package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * @author liujiancheng 材料信息类
 */
public class Material implements Serializable {

    private int id;// 户号
    private String products;// 所属产品
    private String code;// 物料代码
    private String name;// 物料名称
    private String specifications;// 规格型号
    private String suppliers;// 供应商
    private String storeAddress;// 存放仓库位置
    private int needNumber;// 所需数量
    private int projectNumber;// 项目套数
    private int allNumber;// 合计数量
    private int inventoryNumber;// 库存数量
    private String attribute;// 属性
    private String bz;// 备注
    private String nowState;// 当前状态
    private int inStockNumber;// 有货判断数量
    private int remindNumber;// 提醒判断数量
    private int outStockNumber;// 缺货判断数量
    private int emergencyNumber;// 紧急判断数量
    private String isSelected;// 是否选中

    public Material() {
    }

    public Material(int id, String products, String code, String name, String specifications,
                    String suppliers, String storeAddress, int needNumber, int projectNumber,
                    int allNumber, int inventoryNumber, String attribute, String bz, String nowState,
                    int inStockNumber, int remindNumber, int outStockNumber, int emergencyNumber,
                    String isSelected) {

        this.id = id;
        this.products = products;
        this.code = code;
        this.name = name;
        this.specifications = specifications;
        this.suppliers = suppliers;
        this.storeAddress = storeAddress;
        this.needNumber = needNumber;
        this.projectNumber = projectNumber;
        this.allNumber = allNumber;
        this.inventoryNumber = inventoryNumber;
        this.attribute = attribute;
        this.bz = bz;
        this.nowState = nowState;
        this.inStockNumber = inStockNumber;
        this.remindNumber = remindNumber;
        this.outStockNumber = outStockNumber;
        this.emergencyNumber = emergencyNumber;
        this.isSelected = isSelected;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
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

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
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

    public String getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(String isSelected) {
        this.isSelected = isSelected;
    }

    @Override
    public String toString() {
        return "Material{" +
                "id=" + id +
                ", products='" + products + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", specifications='" + specifications + '\'' +
                ", suppliers='" + suppliers + '\'' +
                ", storeAddress='" + storeAddress + '\'' +
                ", needNumber=" + needNumber +
                ", projectNumber=" + projectNumber +
                ", allNumber=" + allNumber +
                ", inventoryNumber=" + inventoryNumber +
                ", attribute='" + attribute + '\'' +
                ", bz='" + bz + '\'' +
                ", nowState='" + nowState + '\'' +
                ", inStockNumber=" + inStockNumber +
                ", remindNumber=" + remindNumber +
                ", outStockNumber=" + outStockNumber +
                ", emergencyNumber=" + emergencyNumber +
                ", isSelected='" + isSelected + '\'' +
                '}';
    }
}
