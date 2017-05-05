package com.example.zhf.erp.model;

/**
 * @author liujiancheng
 *         采购状态
 */
public class Status_cg {

    private String state;//采购状态

    public Status_cg() {
        super();
    }

    public Status_cg(String state) {
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
