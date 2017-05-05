package com.example.zhf.erp.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author liujiancheng 登录信息表
 */
public class Product_login implements Serializable {

	private String loginName;// 登入名
	private String loginPwd;// 登入密码
	private String realName;// 真实姓名
	private String permission;// 权限
	private String createTime;// 创建时间
	private String orderPer;// 下单权限
	private String auditPer;// 审核权限
	private String productPer;// 生产权限
	private String qualityPer;// 质检权限
	private String inStoragePer;// 入库权限
	private String outStoragePer;// 出库权限
	private String deliveryPer;// 发货权限

	public Product_login() {
	
	}

	public Product_login(String loginName, String loginPwd, String realName, String permission, String createTime,
						 String orderPer, String auditPer, String productPer, String qualityPer, String inStoragePer,
						 String outStoragePer, String deliveryPer) {
		this.loginName = loginName;
		this.loginPwd = loginPwd;
		this.realName = realName;
		this.permission = permission;
		this.createTime = createTime;
		this.orderPer = orderPer;
		this.auditPer = auditPer;
		this.productPer = productPer;
		this.qualityPer = qualityPer;
		this.inStoragePer = inStoragePer;
		this.outStoragePer = outStoragePer;
		this.deliveryPer = deliveryPer;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getOrderPer() {
		return orderPer;
	}

	public void setOrderPer(String orderPer) {
		this.orderPer = orderPer;
	}

	public String getAuditPer() {
		return auditPer;
	}

	public void setAuditPer(String auditPer) {
		this.auditPer = auditPer;
	}

	public String getProductPer() {
		return productPer;
	}

	public void setProductPer(String productPer) {
		this.productPer = productPer;
	}

	public String getQualityPer() {
		return qualityPer;
	}

	public void setQualityPer(String qualityPer) {
		this.qualityPer = qualityPer;
	}

	public String getInStoragePer() {
		return inStoragePer;
	}

	public void setInStoragePer(String inStoragePer) {
		this.inStoragePer = inStoragePer;
	}

	public String getOutStoragePer() {
		return outStoragePer;
	}

	public void setOutStoragePer(String outStoragePer) {
		this.outStoragePer = outStoragePer;
	}

	public String getDeliveryPer() {
		return deliveryPer;
	}

	public void setDeliveryPer(String deliveryPer) {
		this.deliveryPer = deliveryPer;
	}

	@Override
	public String toString() {
		return "Product_login{" +
				"loginName='" + loginName + '\'' +
				", loginPwd='" + loginPwd + '\'' +
				", realName='" + realName + '\'' +
				", permission='" + permission + '\'' +
				", createTime='" + createTime + '\'' +
				", orderPer='" + orderPer + '\'' +
				", auditPer='" + auditPer + '\'' +
				", productPer='" + productPer + '\'' +
				", qualityPer='" + qualityPer + '\'' +
				", inStoragePer='" + inStoragePer + '\'' +
				", outStoragePer='" + outStoragePer + '\'' +
				", deliveryPer='" + deliveryPer + '\'' +
				'}';
	}
}
