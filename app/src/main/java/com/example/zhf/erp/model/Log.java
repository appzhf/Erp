package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * 
 * @author liujiancheng 日志信息类 数据中表名为英文，后期解析注意
 */
public class Log implements Serializable{

	private String logOperator;// 日志操作权限
	private String logOperator_Time;// 日志操作时间
	private String logOperation;// 日志操作

	public Log() {
	}

	public Log(String logOperator, String logOperator_Time, String logOperation) {
		this.logOperator = logOperator;
		this.logOperator_Time = logOperator_Time;
		this.logOperation = logOperation;
	}

	public String getLogOperator() {
		return logOperator;
	}

	public void setLogOperator(String logOperator) {
		this.logOperator = logOperator;
	}

	public String getLogOperator_Time() {
		return logOperator_Time;
	}

	public void setLogOperator_Time(String logOperator_Time) {
		this.logOperator_Time = logOperator_Time;
	}

	public String getLogOperation() {
		return logOperation;
	}

	public void setLogOperation(String logOperation) {
		this.logOperation = logOperation;
	}

	@Override
	public String toString() {
		return "Log{" +
				"logOperator='" + logOperator + '\'' +
				", logOperator_Time='" + logOperator_Time + '\'' +
				", logOperation='" + logOperation + '\'' +
				'}';
	}
}
