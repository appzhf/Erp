package com.example.zhf.erp.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/5/12.
 */

public class AllData implements Serializable{

    private List<Order> orders;
    private List<Delivery> deliveries;
    private List<Procurement> procurements;
    private List<PutIn> putIns;
    private List<Quality> qualities;

    public AllData() {
    }

    public AllData(List<Order> orders, List<Delivery> deliveries, List<Procurement> procurements, List<PutIn> putIns, List<Quality> qualities) {
        this.orders = orders;
        this.deliveries = deliveries;
        this.procurements = procurements;
        this.putIns = putIns;
        this.qualities = qualities;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List<Delivery> deliveries) {
        this.deliveries = deliveries;
    }

    public List<Procurement> getProcurements() {
        return procurements;
    }

    public void setProcurements(List<Procurement> procurements) {
        this.procurements = procurements;
    }

    public List<PutIn> getPutIns() {
        return putIns;
    }

    public void setPutIns(List<PutIn> putIns) {
        this.putIns = putIns;
    }

    public List<Quality> getQualities() {
        return qualities;
    }

    public void setQualities(List<Quality> qualities) {
        this.qualities = qualities;
    }

    @Override
    public String toString() {
        return "AllData{" +
                "orders=" + orders +
                ", deliveries=" + deliveries +
                ", procurements=" + procurements +
                ", putIns=" + putIns +
                ", qualities=" + qualities +
                '}';
    }
}
