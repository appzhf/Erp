package com.example.zhf.erp.model;

import java.io.Serializable;

/**
 * @date 2017-3-27 客户信息类
 */

public class Client implements Serializable {
    private String clientUserId;// 客户编号
    private String clientUserName;// 客户名称
    private String clientUserPhone;// 联系人及电话
    private String clientInvoiceAddress;// 发货地址
    private String clientInvoiceHead;// 开票抬头
    private String clientOrderId;// 下单编号
    private String clientNowState;// 当前状态
    private String clientSalesuserName;// 销售员
    private String clientSalesusePhone;// 销售员联系电话
    private String clientBz;// 备注

    public Client() {
    }

    public Client(String clientUserId, String clientUserName, String clientUserPhone,
                  String clientInvoiceAddress, String clientInvoiceHead, String clientOrderId,
                  String clientNowState, String clientSalesuserName, String clientSalesusePhone,
                  String clientBz) {
        this.clientUserId = clientUserId;
        this.clientUserName = clientUserName;
        this.clientUserPhone = clientUserPhone;
        this.clientInvoiceAddress = clientInvoiceAddress;
        this.clientInvoiceHead = clientInvoiceHead;
        this.clientOrderId = clientOrderId;
        this.clientNowState = clientNowState;
        this.clientSalesuserName = clientSalesuserName;
        this.clientSalesusePhone = clientSalesusePhone;
        this.clientBz = clientBz;
    }

    public String getClientUserId() {
        return clientUserId;
    }

    public void setClientUserId(String clientUserId) {
        this.clientUserId = clientUserId;
    }

    public String getClientUserName() {
        return clientUserName;
    }

    public void setClientUserName(String clientUserName) {
        this.clientUserName = clientUserName;
    }

    public String getClientUserPhone() {
        return clientUserPhone;
    }

    public void setClientUserPhone(String clientUserPhone) {
        this.clientUserPhone = clientUserPhone;
    }

    public String getClientInvoiceAddress() {
        return clientInvoiceAddress;
    }

    public void setClientInvoiceAddress(String clientInvoiceAddress) {
        this.clientInvoiceAddress = clientInvoiceAddress;
    }

    public String getClientInvoiceHead() {
        return clientInvoiceHead;
    }

    public void setClientInvoiceHead(String clientInvoiceHead) {
        this.clientInvoiceHead = clientInvoiceHead;
    }

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public String getClientNowState() {
        return clientNowState;
    }

    public void setClientNowState(String clientNowState) {
        this.clientNowState = clientNowState;
    }

    public String getClientSalesuserName() {
        return clientSalesuserName;
    }

    public void setClientSalesuserName(String clientSalesuserName) {
        this.clientSalesuserName = clientSalesuserName;
    }

    public String getClientSalesusePhone() {
        return clientSalesusePhone;
    }

    public void setClientSalesusePhone(String clientSalesusePhone) {
        this.clientSalesusePhone = clientSalesusePhone;
    }

    public String getClientBz() {
        return clientBz;
    }

    public void setClientBz(String clientBz) {
        this.clientBz = clientBz;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientUserId='" + clientUserId + '\'' +
                ", clientUserName='" + clientUserName + '\'' +
                ", clientUserPhone='" + clientUserPhone + '\'' +
                ", clientInvoiceAddress='" + clientInvoiceAddress + '\'' +
                ", clientInvoiceHead='" + clientInvoiceHead + '\'' +
                ", clientOrderId='" + clientOrderId + '\'' +
                ", clientNowState='" + clientNowState + '\'' +
                ", clientSalesuserName='" + clientSalesuserName + '\'' +
                ", clientSalesusePhone='" + clientSalesusePhone + '\'' +
                ", clientBz='" + clientBz + '\'' +
                '}';
    }
}
