package com.example.zhf.erp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.zhf.erp.R;
import com.example.zhf.erp.model.Hybrid;

import java.util.List;

/**
 * Created by Administrator on 2017/5/11.
 */

public class MainHybridAdapter extends BaseAdapter {
    private LayoutInflater li;
    private List<Hybrid> list;

    public MainHybridAdapter(Context context, List<Hybrid> list) {
        this.list = list;
        li = LayoutInflater.from(context);
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
        ViewHolder vh = null;
        if (null == convertView) {
            vh = new ViewHolder();
            convertView = li.inflate(R.layout.main_item, null);
            vh.main_look = (LinearLayout) convertView.findViewById(R.id.main_look);
            vh.main_id = (TextView) convertView.findViewById(R.id.main_id);
            vh.main_name = (TextView) convertView.findViewById(R.id.main_name);
            vh.main_product1 = (TextView) convertView.findViewById(R.id.main_product1);
            vh.main_product2 = (TextView) convertView.findViewById(R.id.main_product2);
            vh.main_user = (TextView) convertView.findViewById(R.id.main_user);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }
        vh.main_id.setText(list.get(position).getId());
        vh.main_name.setText(list.get(position).getName());
        if(list.get(position).getBz().equals("")){
            vh.main_product1.setText("无");
        }else{
            vh.main_product1.setText(list.get(position).getBz());
        }
        vh.main_product2.setText(list.get(position).getTime());
        vh.main_user.setText(list.get(position).getUser());
        //查看更多
        vh.main_look.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("点击查看更多");
            }
        });
        return convertView;
    }

    class ViewHolder {
        private LinearLayout main_look;//查看所有
        private TextView main_id, main_name, main_product1, main_product2;//产品id，产品名字，对应操作1,2
        private TextView main_user;//对应操作,操作人
    }
}
