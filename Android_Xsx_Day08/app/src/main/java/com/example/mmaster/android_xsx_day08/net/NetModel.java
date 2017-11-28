package com.example.mmaster.android_xsx_day08.net;



import com.example.mmaster.android_xsx_day08.ui.App;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
* Created by TMVPHelper on 2017/11/17
*/
public class NetModel implements NetContract.Model{




    private static NetModel NetModel;

    private OkHttpClient client;


    public static NetModel getInstance() {
        if (NetModel == null) {
            synchronized (NetModel.class) {
                NetModel = new NetModel();
            }
        }
        return NetModel;
    }

    public NetModel() {
        client = new OkHttpClient();
    }


   /* public void getDataFromNet(String url, final CallBacks callBacks) {
        Request request = new Request.Builder().url(url).build();
        client.newCall(request).enqueue(new Callback() {
                                            @Override
                                            public void onFailure(okhttp3.Call call, IOException e) {

                                            }

                                            @Override
                                            public void onResponse(okhttp3.Call call, Response response) throws IOException {
                                                callBacks.suc(response.body().string());
                                            }
                                        }
        );

    }*/




    @Override
    public void getDataFromNet(String url, final CallBacks callBacks) {
        Request request=new Request.Builder().url(url).build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String ss=response.body().string();

                App.baseActivity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        callBacks.succ(ss);
                    }
                });

            }
        });
    }
}