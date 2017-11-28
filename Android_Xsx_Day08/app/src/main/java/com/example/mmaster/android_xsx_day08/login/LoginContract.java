package com.example.mmaster.android_xsx_day08.login;


import com.example.mmaster.android_xsx_day08.base.BaseModel;
import com.example.mmaster.android_xsx_day08.base.BasePresenter;
import com.example.mmaster.android_xsx_day08.base.BaseView;

/******************************************
 * 类名称：LoginContract
 * 类描述：
 * 这个是mvp的灵魂  在这里就可以吧mvp的逻辑看明白啦
 *      1、从view层点击事件。调用presenter的isLogin方法,
 *      2、在presenter的isLogin方法中调用Model层的Login方法来判断是否登录成功,然后通过
 *         view的show方法吧数据传递给activity
 * @version: 1.0
 * @author: chj
 * @time: 2017/11/17
 * @email: chj294671171@126.com
 * @github: https://github.com/cngmsy
 ******************************************/
public interface LoginContract {

    interface View extends BaseView {
      void show(String result);
    }

    interface Model extends BaseModel {
        Boolean login(String name);
    }

    abstract static class Presenter extends BasePresenter<Model, View> {
        @Override
        public void onStart() {

        }
        public abstract void isLogin(String name);

    }
}