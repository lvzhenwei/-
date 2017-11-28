package com.example.mmaster.android_xsx_day08.net;


import com.example.mmaster.android_xsx_day08.base.BaseModel;
import com.example.mmaster.android_xsx_day08.base.BasePresenter;
import com.example.mmaster.android_xsx_day08.base.BaseView;

/******************************************
 * 类名称：NetContract
 * 类描述：
 *
 * @version: 1.0
 * @author: chj
 * @time: 2017/11/17
 * @email: chj294671171@126.com
 * @github: https://github.com/cngmsy
 ******************************************/
public interface NetContract {

    interface View extends BaseView {
      void show(String ss);
    }

    interface Model extends BaseModel {
        void getDataFromNet(String url, CallBacks callBacks);
    }

    abstract static class Presenter extends BasePresenter<Model, View> {

        @Override
        public void onStart() {

        }

        public abstract void getDataFromModel(String url);
        
    }
}