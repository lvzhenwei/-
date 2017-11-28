package com.example.mmaster.android_xsx_day08.fragment;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.mmaster.android_xsx_day08.R;
import com.example.mmaster.android_xsx_day08.base.BaseFragment;

/**
 * Created by mMaster on 2017/11/27.
 */

public class CFragment extends BaseFragment {
    private RecyclerView recyclerView;
    @Override
    protected void initData() {

    }

    @Override
    protected void initView(View view) {
        recyclerView = view.findViewById(R.id.recycl);
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_a;
    }
}
