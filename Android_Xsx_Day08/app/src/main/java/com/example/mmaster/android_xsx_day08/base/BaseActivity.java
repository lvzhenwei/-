package com.example.mmaster.android_xsx_day08.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.mmaster.android_xsx_day08.ui.App;
import com.example.mmaster.android_xsx_day08.utils.TUtils;


public abstract class BaseActivity<P extends BasePresenter,M extends BaseModel> extends AppCompatActivity  {

    public P mPresenter;
    public M mModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        App.baseActivity=this;
        mPresenter = TUtils.getT(this,0);
        mModel = TUtils.getT(this,1);

        if (this instanceof BaseView ) {
            mPresenter.setVM(mModel,this);
        }
        initView();

    }

    protected abstract int getLayoutId();

    public abstract void initView() ;
}
