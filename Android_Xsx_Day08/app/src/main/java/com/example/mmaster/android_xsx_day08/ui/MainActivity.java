package com.example.mmaster.android_xsx_day08.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.example.mmaster.android_xsx_day08.R;
import com.example.mmaster.android_xsx_day08.adapter.MyPagerAdapter;
import com.example.mmaster.android_xsx_day08.base.BaseActivity;
import com.example.mmaster.android_xsx_day08.fragment.AFragment;
import com.example.mmaster.android_xsx_day08.fragment.BFragment;
import com.example.mmaster.android_xsx_day08.fragment.CFragment;
import com.example.mmaster.android_xsx_day08.fragment.DFragment;
import com.example.mmaster.android_xsx_day08.fragment.EFragment;
import com.example.mmaster.android_xsx_day08.fragment.FFragment;
import com.example.mmaster.android_xsx_day08.net.NetModel;
import com.example.mmaster.android_xsx_day08.net.NetPresenter;

import java.util.ArrayList;

/**
 * Created by mMaster on 2017/11/28.
 */

public class MainActivity extends BaseActivity<NetPresenter,NetModel> {
    private TextView toolbar_title;
    private Toolbar tool;
    private TabLayout tab;
    private ViewPager pager;
    private ArrayList<Fragment> mList = new ArrayList<>();
    private MyPagerAdapter myPagerAdapter;
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        initView();
//
//    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    public void initView() {
        toolbar_title = (TextView) findViewById(R.id.toolbar_title);
        tool = (Toolbar) findViewById(R.id.tool);
        tab = (TabLayout) findViewById(R.id.tab);
        pager = (ViewPager) findViewById(R.id.pager);
        tab.addTab(tab.newTab().setText("头条"));
        tab.addTab(tab.newTab().setText("校园"));
        tab.addTab(tab.newTab().setText("就业"));
        tab.addTab(tab.newTab().setText("课堂"));
        tab.addTab(tab.newTab().setText("活动"));
        tab.addTab(tab.newTab().setText("一节一推选"));
        mList.add(new AFragment());
        mList.add(new BFragment());
        mList.add(new CFragment());
        mList.add(new DFragment());
        mList.add(new EFragment());
        mList.add(new FFragment());
        myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager(),mList);
        pager.setAdapter(myPagerAdapter);
        tab.setupWithViewPager(pager);
        tab.getTabAt(0).setText("头条");
        tab.getTabAt(1).setText("校园");
        tab.getTabAt(2).setText("就业");
        tab.getTabAt(3).setText("课堂");
        tab.getTabAt(4).setText("活动");
        tab.getTabAt(5).setText("一节一推选");
    }
}
