package com.example.zhf.erp.model;

import java.io.Serializable;
import java.sql.Date;

/**
 * 
 * @author liujiancheng 产品信息类
 */
public class Product implements Serializable{

	private String id;// 下单编号
	private String name;// 产品名称
	private String moudel;// 规格型号
	private int number;// 数量
	private int hasProductNumber;// 已生产数量
	private int notProductNumber;// 未生产数量
	private int inspectionNumber;// 报检数量
	private int samplingNumber;// 抽检数量
	private int allRepairNumber;// 合计返修数量
	private int thisProductNumber;// 该批次生产数量
	private int qualityRepairNumber;// 质检返修数量
	private String backRepairState;// 返修状态
	private int hasInStorageNumber;// 已入库数量
	private int hasOutStorageNumber;// 已出库数量
	private int hasDeliveryNumber;// 已发货数量
	private String batchState;// 批量状态
	private String otherRequire;// 其它要求
	private String shouldDeliveryTime;// 应交付时间
	private String orderTime;// 下单时间
	private String orderUser;// 下单人
	private String orderBz;// 下单备注
	private String customerUnit;// 客户单位
	private String deliveryAddress;// 发货地址
	private String userPhone;// 联系人及电话
	private String invoiceHead;// 开票抬头
	private String nowState;// 当前状态
	private String auditUser;// 审核人
	private String auditTime;// 审核时间
	private String auditBz;// 审核备注
	private String verifyUser;// 材料核实人
	private String verifyTime;// 材料核实时间
	private String verifyBz;// 材料采购备注
	private String productUser;// 生产人
	private String startProductTime;// 开始生产时间
	private String endProductTime;// 生产完成时间
	private String productBz;// 生产备注
	private String qualityUser;// 质检人
	private String qualitTime;// 质检时间
	private String qualitBz;// 质检备注
	private String inStorageUser;// 入库人
	private String inStorageTime;// 入库时间
	private String inStorageBz;// 入库备注
	private String outStorageUser;// 出库人
	private String outStorageTime;// 出库时间
	private String outStorageBz;// 出库备注
	private String deliveryUser;// 发货人
	private String deliveryTime;// 发货时间
	private String deliveryBz;// 发货备注
	private String isNeedProduct;// 是否需要生产环节
	private String isBuySIMCard;// 是否我方购买sim卡
	private String simCardState;// sim卡购买状态
	private String bz;// 备注
	private String isHasChange;// 是否有更改
	private String licenseId;// 生产许可证编号
	private String isMakeTick;// 是否开票

	public Product() {
		super();
	}

	public Product(String id, String name, String moudel, int number, int hasProductNumber, int notProductNumber,
				   int inspectionNumber, int samplingNumber, int allRepairNumber, int thisProductNumber, int qualityRepairNumber,
				   String backRepairState, int hasInStorageNumber, int hasOutStorageNumber, int hasDeliveryNumber, String batchState,
				   String otherRequire, String shouldDeliveryTime, String orderTime, String orderUser, String orderBz, String customerUnit,
				   String deliveryAddress, String userPhone, String invoiceHead, String nowState, String auditUser, String auditTime,
				   String auditBz, String verifyUser, String verifyTime, String verifyBz, String productUser, String startProductTime,
				   String endProductTime, String productBz, String qualityUser, String qualitTime, String qualitBz, String inStorageUser,
				   String inStorageTime, String inStorageBz, String outStorageUser, String outStorageTime, String outStorageBz,
				   String deliveryUser, String deliveryTime, String deliveryBz, String isNeedProduct, String isBuySIMCard,
				   String simCardState, String bz, String isHasChange, String licenseId, String isMakeTick) {

		this.id = id;
		this.name = name;
		this.moudel = moudel;
		this.number = number;
		this.hasProductNumber = hasProductNumber;
		this.notProductNumber = notProductNumber;
		this.inspectionNumber = inspectionNumber;
		this.samplingNumber = samplingNumber;
		this.allRepairNumber = allRepairNumber;
		this.thisProductNumber = thisProductNumber;
		this.qualityRepairNumber = qualityRepairNumber;
		this.backRepairState = backRepairState;
		this.hasInStorageNumber = hasInStorageNumber;
		this.hasOutStorageNumber = hasOutStorageNumber;
		this.hasDeliveryNumber = hasDeliveryNumber;
		this.batchState = batchState;
		this.otherRequire = otherRequire;
		this.shouldDeliveryTime = shouldDeliveryTime;
		this.orderTime = orderTime;
		this.orderUser = orderUser;
		this.orderBz = orderBz;
		this.customerUnit = customerUnit;
		this.deliveryAddress = deliveryAddress;
		this.userPhone = userPhone;
		this.invoiceHead = invoiceHead;
		this.nowState = nowState;
		this.auditUser = auditUser;
		this.auditTime = auditTime;
		this.auditBz = auditBz;
		this.verifyUser = verifyUser;
		this.verifyTime = verifyTime;
		this.verifyBz = verifyBz;
		this.productUser = productUser;
		this.startProductTime = startProductTime;
		this.endProductTime = endProductTime;
		this.productBz = productBz;
		this.qualityUser = qualityUser;
		this.qualitTime = qualitTime;
		this.qualitBz = qualitBz;
		this.inStorageUser = inStorageUser;
		this.inStorageTime = inStorageTime;
		this.inStorageBz = inStorageBz;
		this.outStorageUser = outStorageUser;
		this.outStorageTime = outStorageTime;
		this.outStorageBz = outStorageBz;
		this.deliveryUser = deliveryUser;
		this.deliveryTime = deliveryTime;
		this.deliveryBz = deliveryBz;
		this.isNeedProduct = isNeedProduct;
		this.isBuySIMCard = isBuySIMCard;
		this.simCardState = simCardState;
		this.bz = bz;
		this.isHasChange = isHasChange;
		this.licenseId = licenseId;
		this.isMakeTick = isMakeTick;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMoudel() {
		return moudel;
	}

	public void setMoudel(String moudel) {
		this.moudel = moudel;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getHasProductNumber() {
		return hasProductNumber;
	}

	public void setHasProductNumber(int hasProductNumber) {
		this.hasProductNumber = hasProductNumber;
	}

	public int getNotProductNumber() {
		return notProductNumber;
	}

	public void setNotProductNumber(int notProductNumber) {
		this.notProductNumber = notProductNumber;
	}

	public int getInspectionNumber() {
		return inspectionNumber;
	}

	public void setInspectionNumber(int inspectionNumber) {
		this.inspectionNumber = inspectionNumber;
	}

	public int getSamplingNumber() {
		return samplingNumber;
	}

	public void setSamplingNumber(int samplingNumber) {
		this.samplingNumber = samplingNumber;
	}

	public int getAllRepairNumber() {
		return allRepairNumber;
	}

	public void setAllRepairNumber(int allRepairNumber) {
		this.allRepairNumber = allRepairNumber;
	}

	public int getThisProductNumber() {
		return thisProductNumber;
	}

	public void setThisProductNumber(int thisProductNumber) {
		this.thisProductNumber = thisProductNumber;
	}

	public int getQualityRepairNumber() {
		return qualityRepairNumber;
	}

	public void setQualityRepairNumber(int qualityRepairNumber) {
		this.qualityRepairNumber = qualityRepairNumber;
	}

	public String getBackRepairState() {
		return backRepairState;
	}

	public void setBackRepairState(String backRepairState) {
		this.backRepairState = backRepairState;
	}

	public int getHasInStorageNumber() {
		return hasInStorageNumber;
	}

	public void setHasInStorageNumber(int hasInStorageNumber) {
		this.hasInStorageNumber = hasInStorageNumber;
	}

	public int getHasOutStorageNumber() {
		return hasOutStorageNumber;
	}

	public void setHasOutStorageNumber(int hasOutStorageNumber) {
		this.hasOutStorageNumber = hasOutStorageNumber;
	}

	public int getHasDeliveryNumber() {
		return hasDeliveryNumber;
	}

	public void setHasDeliveryNumber(int hasDeliveryNumber) {
		this.hasDeliveryNumber = hasDeliveryNumber;
	}

	public String getBatchState() {
		return batchState;
	}

	public void setBatchState(String batchState) {
		this.batchState = batchState;
	}

	public String getOtherRequire() {
		return otherRequire;
	}

	public void setOtherRequire(String otherRequire) {
		this.otherRequire = otherRequire;
	}

	public String getShouldDeliveryTime() {
		return shouldDeliveryTime;
	}

	public void setShouldDeliveryTime(String shouldDeliveryTime) {
		this.shouldDeliveryTime = shouldDeliveryTime;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getOrderUser() {
		return orderUser;
	}

	public void setOrderUser(String orderUser) {
		this.orderUser = orderUser;
	}

	public String getOrderBz() {
		return orderBz;
	}

	public void setOrderBz(String orderBz) {
		this.orderBz = orderBz;
	}

	public String getCustomerUnit() {
		return customerUnit;
	}

	public void setCustomerUnit(String customerUnit) {
		this.customerUnit = customerUnit;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getInvoiceHead() {
		return invoiceHead;
	}

	public void setInvoiceHead(String invoiceHead) {
		this.invoiceHead = invoiceHead;
	}

	public String getNowState() {
		return nowState;
	}

	public void setNowState(String nowState) {
		this.nowState = nowState;
	}

	public String getAuditUser() {
		return auditUser;
	}

	public void setAuditUser(String auditUser) {
		this.auditUser = auditUser;
	}

	public String getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(String auditTime) {
		this.auditTime = auditTime;
	}

	public String getAuditBz() {
		return auditBz;
	}

	public void setAuditBz(String auditBz) {
		this.auditBz = auditBz;
	}

	public String getVerifyUser() {
		return verifyUser;
	}

	public void setVerifyUser(String verifyUser) {
		this.verifyUser = verifyUser;
	}

	public String getVerifyTime() {
		return verifyTime;
	}

	public void setVerifyTime(String verifyTime) {
		this.verifyTime = verifyTime;
	}

	public String getVerifyBz() {
		return verifyBz;
	}

	public void setVerifyBz(String verifyBz) {
		this.verifyBz = verifyBz;
	}

	public String getProductUser() {
		return productUser;
	}

	public void setProductUser(String productUser) {
		this.productUser = productUser;
	}

	public String getStartProductTime() {
		return startProductTime;
	}

	public void setStartProductTime(String startProductTime) {
		this.startProductTime = startProductTime;
	}

	public String getEndProductTime() {
		return endProductTime;
	}

	public void setEndProductTime(String endProductTime) {
		this.endProductTime = endProductTime;
	}

	public String getProductBz() {
		return productBz;
	}

	public void setProductBz(String productBz) {
		this.productBz = productBz;
	}

	public String getQualityUser() {
		return qualityUser;
	}

	public void setQualityUser(String qualityUser) {
		this.qualityUser = qualityUser;
	}

	public String getQualitTime() {
		return qualitTime;
	}

	public void setQualitTime(String qualitTime) {
		this.qualitTime = qualitTime;
	}

	public String getQualitBz() {
		return qualitBz;
	}

	public void setQualitBz(String qualitBz) {
		this.qualitBz = qualitBz;
	}

	public String getInStorageUser() {
		return inStorageUser;
	}

	public void setInStorageUser(String inStorageUser) {
		this.inStorageUser = inStorageUser;
	}

	public String getInStorageTime() {
		return inStorageTime;
	}

	public void setInStorageTime(String inStorageTime) {
		this.inStorageTime = inStorageTime;
	}

	public String getInStorageBz() {
		return inStorageBz;
	}

	public void setInStorageBz(String inStorageBz) {
		this.inStorageBz = inStorageBz;
	}

	public String getOutStorageUser() {
		return outStorageUser;
	}

	public void setOutStorageUser(String outStorageUser) {
		this.outStorageUser = outStorageUser;
	}

	public String getOutStorageTime() {
		return outStorageTime;
	}

	public void setOutStorageTime(String outStorageTime) {
		this.outStorageTime = outStorageTime;
	}

	public String getOutStorageBz() {
		return outStorageBz;
	}

	public void setOutStorageBz(String outStorageBz) {
		this.outStorageBz = outStorageBz;
	}

	public String getDeliveryUser() {
		return deliveryUser;
	}

	public void setDeliveryUser(String deliveryUser) {
		this.deliveryUser = deliveryUser;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getDeliveryBz() {
		return deliveryBz;
	}

	public void setDeliveryBz(String deliveryBz) {
		this.deliveryBz = deliveryBz;
	}

	public String getIsNeedProduct() {
		return isNeedProduct;
	}

	public void setIsNeedProduct(String isNeedProduct) {
		this.isNeedProduct = isNeedProduct;
	}

	public String getIsBuySIMCard() {
		return isBuySIMCard;
	}

	public void setIsBuySIMCard(String isBuySIMCard) {
		this.isBuySIMCard = isBuySIMCard;
	}

	public String getSimCardState() {
		return simCardState;
	}

	public void setSimCardState(String simCardState) {
		this.simCardState = simCardState;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getIsHasChange() {
		return isHasChange;
	}

	public void setIsHasChange(String isHasChange) {
		this.isHasChange = isHasChange;
	}

	public String getLicenseId() {
		return licenseId;
	}

	public void setLicenseId(String licenseId) {
		this.licenseId = licenseId;
	}

	public String getIsMakeTick() {
		return isMakeTick;
	}

	public void setIsMakeTick(String isMakeTick) {
		this.isMakeTick = isMakeTick;
	}
}
