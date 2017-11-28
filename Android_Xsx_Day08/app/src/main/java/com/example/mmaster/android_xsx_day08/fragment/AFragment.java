package com.example.mmaster.android_xsx_day08.fragment;



import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;


import com.bartoszlipinski.recyclerviewheader.RecyclerViewHeader;
import com.bumptech.glide.Glide;
import com.example.mmaster.android_xsx_day08.R;

import com.example.mmaster.android_xsx_day08.adapter.MyRecyclAdapterOne;
import com.example.mmaster.android_xsx_day08.base.BaseFragment;
import com.example.mmaster.android_xsx_day08.bean.Headline;

import com.example.mmaster.android_xsx_day08.net.NetContract;
import com.example.mmaster.android_xsx_day08.net.NetModel;
import com.example.mmaster.android_xsx_day08.net.NetPresenter;
import com.example.mmaster.android_xsx_day08.ui.MainActivity;
import com.google.gson.Gson;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by mMaster on 2017/11/27.
 */

public class AFragment extends BaseFragment{
    @Override
    protected void initData() {
       // ((MainActivity)getActivity())
    }

    @Override
    protected void initView(View view) {

    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_a;
    }

//    private RecyclerView recyclerView;
//    private Banner banner;
//    private ArrayList<String> mList = new ArrayList<>();
//    private RecyclerViewHeader recyclerViewHeader;
//    private List<Headline.DataBean> data;
//    private MyRecyclAdapterOne myRecyclAdapterOne;
//    @Override
//    protected void initData() {
//        myRecyclAdapterOne = new MyRecyclAdapterOne(data,getActivity());
//        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerViewHeader.attachTo(recyclerView,true);
//        recyclerView.setAdapter(myRecyclAdapterOne);
//    }
//
//    @Override
//    protected void initView(View view) {
//        recyclerView = view.findViewById(R.id.recycl);
//        banner = view.findViewById(R.id.banner);
//        recyclerViewHeader = view.findViewById(R.id.recyclheader);
//
//        mList.add("http://upload.univs.cn/2017/1126/thumb_640_314_1511675972339.jpg");
//        mList.add("http://upload.univs.cn/2017/1114/1510638210291.jpg");
//        mList.add("http://upload.univs.cn/2017/0619/thumb_640_314_1497839124349.jpg");
//        banner.setImages(mList)//添加图片集合或图片url集合
//                .setDelayTime(2000)//设置轮播时间
//                .setBannerStyle(BannerConfig.CIRCLE_INDICATOR)
//                .setImageLoader(new GlideImage())//加载图片
//                .setIndicatorGravity(BannerConfig.CENTER)//设置指示器位置
//                .start();
//
//        mPresenter.getDataFromModel("http://mapi.univs.cn/mobile/index.php?app=mobile&type=mobile&controller=content&catid=11&page=1&action=index&time=0");
//    }
//    public class GlideImage extends ImageLoader {
//        @Override
//        public void displayImage(Context context, Object path, ImageView imageView) {
//            Glide.with(context.getApplicationContext()).load(path).into(imageView);
//        }
//
//    }
//    @Override
//    public int getLayoutId() {
//        return R.layout.fragment_a;
//    }
//
////    @Override
////    public void show(String ss) {
////
////    }
//
//    @Override
//    public void show(final String ss) {
//        getActivity().runOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//                Gson gson = new Gson();
//                Log.e("---------->",ss.toString());
//                Headline headline = gson.fromJson(ss, Headline.class);
//                data = headline.getData();
//
//            }
//        });
//   }
}
