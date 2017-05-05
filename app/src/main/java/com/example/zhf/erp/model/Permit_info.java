package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 计量信息类
 */
public class Permit_info implements Serializable{
	private String model;// 型号
	private String name;// 计量器具名称
	private String specifications;// 规格
	private String accuracy;// 准确度
	private String level;// 相关等级
	private String bz;// 备注

	public Permit_info() {
		super();
	}

	public Permit_info(String model, String name, String specifications, String accuracy, String level, String bz) {
		this.model = model;
		this.name = name;
		this.specifications = specifications;
		this.accuracy = accuracy;
		this.level = level;
		this.bz = bz;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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

	public String getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	@Override
	public String toString() {
		return "Permit_info{" +
				"model='" + model + '\'' +
				", name='" + name + '\'' +
				", specifications='" + specifications + '\'' +
				", accuracy='" + accuracy + '\'' +
				", level='" + level + '\'' +
				", bz='" + bz + '\'' +
				'}';
	}
}
