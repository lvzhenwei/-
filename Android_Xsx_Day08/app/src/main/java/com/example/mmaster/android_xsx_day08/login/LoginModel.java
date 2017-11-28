package com.example.mmaster.android_xsx_day08.login;

/**
* Created by TMVPHelper on 2017/11/17
*/
public class LoginModel implements LoginContract.Model{

    @Override
    public Boolean login(String name) {
        if (name.equals("aaa")) {
            return true;
        }
        return false;
    }
}