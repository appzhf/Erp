package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 产品类型类
 */
public class Product_type implements Serializable{

	private String specifications;// 规格型号

	public Product_type() {
	}

	public Product_type(String specifications) {
		this.specifications = specifications;
	}

	public String getSpecifications() {
		return specifications;
	}

	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}
}
