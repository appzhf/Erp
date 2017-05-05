package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 产品信息新表类
 */
public class Product_name_new implements Serializable {

	private String id;// 产品编号
	private String code;// 产品代码
	private String name;// 产品名称
	private String bz;// 备注

	public Product_name_new() {
		super();
	}

	public Product_name_new(String id, String code, String name, String bz) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.bz = bz;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	@Override
	public String toString() {
		return "Product_name_new{" +
				"id='" + id + '\'' +
				", code='" + code + '\'' +
				", name='" + name + '\'' +
				", bz='" + bz + '\'' +
				'}';
	}
}
