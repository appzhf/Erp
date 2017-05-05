package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * @author liujiancheng 客户类
 */
public class Customer implements Serializable{

	private String customerId;// 客户编号
	private String customerName;// 客户名称
	private String customerInvoiceHead;// 开票抬头
	private String customerUserPhone;// 联系人及电话
	private String customerInvoiceAddress;// 发货地址
	private String customerBz;// 备注

	public Customer() {
	}

	public Customer(String customerId, String customerName, String customerInvoiceHead,
					String customerUserPhone, String customerInvoiceAddress, String customerBz) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerInvoiceHead = customerInvoiceHead;
		this.customerUserPhone = customerUserPhone;
		this.customerInvoiceAddress = customerInvoiceAddress;
		this.customerBz = customerBz;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerInvoiceHead() {
		return customerInvoiceHead;
	}

	public void setCustomerInvoiceHead(String customerInvoiceHead) {
		this.customerInvoiceHead = customerInvoiceHead;
	}

	public String getCustomerUserPhone() {
		return customerUserPhone;
	}

	public void setCustomerUserPhone(String customerUserPhone) {
		this.customerUserPhone = customerUserPhone;
	}

	public String getCustomerInvoiceAddress() {
		return customerInvoiceAddress;
	}

	public void setCustomerInvoiceAddress(String customerInvoiceAddress) {
		this.customerInvoiceAddress = customerInvoiceAddress;
	}

	public String getCustomerBz() {
		return customerBz;
	}

	public void setCustomerBz(String customerBz) {
		this.customerBz = customerBz;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"customerId='" + customerId + '\'' +
				", customerName='" + customerName + '\'' +
				", customerInvoiceHead='" + customerInvoiceHead + '\'' +
				", customerUserPhone='" + customerUserPhone + '\'' +
				", customerInvoiceAddress='" + customerInvoiceAddress + '\'' +
				", customerBz='" + customerBz + '\'' +
				'}';
	}
}
