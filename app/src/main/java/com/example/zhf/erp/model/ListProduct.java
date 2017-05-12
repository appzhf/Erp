package com.example.zhf.erp.model;

import java.util.List;

/**
 * Created by Administrator on 2017/5/11.
 */

public class ListProduct {
    private List<Product> list;

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "ListProduct{" +
                "list=" + list +
                '}';
    }
}
