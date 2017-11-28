package com.example.mmaster.android_xsx_day08.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mmaster.android_xsx_day08.R;
import com.example.mmaster.android_xsx_day08.bean.Headline;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by mMaster on 2017/11/27.
 */

public class MyRecyclAdapterOne extends RecyclerView.Adapter<MyRecyclAdapterOne.Holder> {

    private List<Headline.DataBean> data;
    private Context context;

    public MyRecyclAdapterOne(List<Headline.DataBean> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycl_itemone,parent,false);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        Picasso.with(context).load(data.get(position).getThumb()).into(holder.imageView);
        holder.textView1.setText(data.get(position).getTitle());
        holder.textView2.setText(data.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class Holder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView textView1,textView2;
        public Holder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            textView1 = itemView.findViewById(R.id.title);
            textView2 = itemView.findViewById(R.id.content);
        }
    }
}
