package com.example.zhf.erp.model;

/**
 * @author liujiancheng 状态信息
 */
public class Status {
    String state;// 状态

    public Status() {
        super();
    }

    public Status(String state) {
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
