package com.example.mmaster.android_xsx_day08.login;

/**
* Created by TMVPHelper on 2017/11/17
*/
public class LoginPresenter extends LoginContract.Presenter{
    @Override
    public void isLogin(String name) {
        if (baseModel.login(name)) {
            baseView.show("登录成功");
        }
    }


}