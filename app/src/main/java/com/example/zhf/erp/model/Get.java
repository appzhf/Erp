package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * @author liujiancheng 领料信息类
 */
public class Get implements Serializable {
	private int getSerialId;// 序号
	private String getPickId;// 领料编号
	private String getPickDate;// 领料日期
	private String getPickUser;// 领料人
	private String getIsPick;// 是否已领料
	private String getBz;// 备注

	public Get() {
	}

	public Get(int getSerialId, String getPickId, String getPickDate, String getPickUser, String getIsPick, String getBz) {
		this.getSerialId = getSerialId;
		this.getPickId = getPickId;
		this.getPickDate = getPickDate;
		this.getPickUser = getPickUser;
		this.getIsPick = getIsPick;
		this.getBz = getBz;
	}

	public int getGetSerialId() {
		return getSerialId;
	}

	public void setGetSerialId(int getSerialId) {
		this.getSerialId = getSerialId;
	}

	public String getGetPickId() {
		return getPickId;
	}

	public void setGetPickId(String getPickId) {
		this.getPickId = getPickId;
	}

	public String getGetPickDate() {
		return getPickDate;
	}

	public void setGetPickDate(String getPickDate) {
		this.getPickDate = getPickDate;
	}

	public String getGetPickUser() {
		return getPickUser;
	}

	public void setGetPickUser(String getPickUser) {
		this.getPickUser = getPickUser;
	}

	public String getGetIsPick() {
		return getIsPick;
	}

	public void setGetIsPick(String getIsPick) {
		this.getIsPick = getIsPick;
	}

	public String getGetBz() {
		return getBz;
	}

	public void setGetBz(String getBz) {
		this.getBz = getBz;
	}

	@Override
	public String toString() {
		return "Get{" +
				"getSerialId=" + getSerialId +
				", getPickId='" + getPickId + '\'' +
				", getPickDate='" + getPickDate + '\'' +
				", getPickUser='" + getPickUser + '\'' +
				", getIsPick='" + getIsPick + '\'' +
				", getBz='" + getBz + '\'' +
				'}';
	}
}
