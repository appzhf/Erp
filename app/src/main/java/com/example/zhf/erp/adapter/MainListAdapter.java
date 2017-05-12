package com.example.zhf.erp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.zhf.erp.R;
import com.example.zhf.erp.model.AllData;
import com.example.zhf.erp.model.Delivery;
import com.example.zhf.erp.model.Hybrid;
import com.example.zhf.erp.model.Order;
import com.example.zhf.erp.model.Procurement;
import com.example.zhf.erp.model.PutIn;
import com.example.zhf.erp.model.Quality;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/11.
 */

public class MainListAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater li;
    private AllData data;//管理员
    private List<Hybrid> list;
    private String str[];
    public MainListAdapter(Context context,AllData data) {
        this.context = context;
        this.data = data;
        list = new ArrayList<>();
        li = LayoutInflater.from(context);
        setData();
    }
    public void setData(){
        Hybrid hb = null;
        List<Order> orders = data.getOrders();
        for (Order order : orders) {
            hb = new Hybrid();
            hb.setId(order.getId());
            hb.setName(order.getName());
            hb.setTime(order.getOrderTime());
            hb.setUser(order.getOrderUser());
            hb.setBz(order.getOtherRequire());
            list.add(hb);
            hb = null;
        }
        List<Delivery> deliveries = data.getDeliveries();
        for (Delivery delivery : deliveries) {
            hb = new Hybrid();
            hb.setId(delivery.getId());
            hb.setName(delivery.getName());
            hb.setTime(delivery.getDeliveryTime());
            hb.setUser(delivery.getDeliveryUser());
            hb.setBz(delivery.getDeliveryBz());
            list.add(hb);
            hb = null;
        }
        List<Procurement> procurements = data.getProcurements();
        for (Procurement procurement : procurements) {
            hb = new Hybrid();
            hb.setId(procurement.getId());
            hb.setName(procurement.getName());
            hb.setTime(procurement.getVerifyTime());
            hb.setUser(procurement.getVerifyUser());
            hb.setBz(procurement.getVerifyBz());
            list.add(hb);
            hb = null;
        }
        List<PutIn> putIns = data.getPutIns();
        for (PutIn putIn : putIns) {
            hb = new Hybrid();
            hb.setId(putIn.getId());
            hb.setName(putIn.getName());
            hb.setTime(putIn.getInStorageTime());
            hb.setUser(putIn.getInStorageUser());
            hb.setBz(putIn.getInStorageBz());
            list.add(hb);
            hb = null;
        }
        List<Quality> qualities = data.getQualities();
        for (Quality quality : qualities) {
            hb = new Hybrid();
            hb.setId(quality.getId());
            hb.setName(quality.getName());
            hb.setTime(quality.getQualitTime());
            hb.setUser(quality.getQualityUser());
            hb.setBz(quality.getOrderBz());
            list.add(hb);
            hb = null;
        }
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyTag mt = null;
        final int index = position;
        if (null == convertView) {
            mt = new MyTag();
            convertView = li.inflate(R.layout.main_item, null);
            mt.main_look = (LinearLayout) convertView.findViewById(R.id.main_look);
            mt.main_id = (TextView) convertView.findViewById(R.id.main_id);
            mt.main_name = (TextView) convertView.findViewById(R.id.main_name);
            mt.main_product1 = (TextView) convertView.findViewById(R.id.main_product1);
            mt.main_product2 = (TextView) convertView.findViewById(R.id.main_product2);
            mt.main_user = (TextView) convertView.findViewById(R.id.main_user);

            convertView.setTag(mt);
        } else {
            mt = (MyTag) convertView.getTag();
        }
        mt.main_id.setText(list.get(position).getId());
        mt.main_name.setText(list.get(position).getName());
        if(list.get(position).getBz()==null){
            mt.main_product1.setText("无");
        }else {
            mt.main_product1.setText(list.get(position).getBz());
        }
        if(list.get(position).getTime()==null){
            mt.main_product2.setText("无");
        }else{
            mt.main_product2.setText(list.get(position).getTime());
        }
        if(list.get(position).getUser()==null){
            mt.main_user.setText("无");
        }else {
            mt.main_user.setText(list.get(position).getUser());
        }

        //管理员查看更多
        mt.main_look.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //System.out.println(list.get(index));
            }
        });
        return convertView;
    }

    class MyTag {
        private LinearLayout main_look;//查看所有
        private TextView main_id, main_name, main_product1, main_product2;//产品id，产品名字，对应操作1,2
        private TextView main_user;//对应操作,操作人
    }
}
