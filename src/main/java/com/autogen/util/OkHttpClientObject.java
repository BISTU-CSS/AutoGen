package com.autogen.util;

import okhttp3.OkHttpClient;

import java.util.concurrent.TimeUnit;

public enum OkHttpClientObject {
    CLIENT;

    private OkHttpClient clientInstance;

    private Integer connectTimeout_time = 10;
    private Integer writeTimeout_time = 10;
    private Integer readTimeout_time = 30;

    OkHttpClientObject() {
        clientInstance = new OkHttpClient.Builder()
                .connectTimeout(connectTimeout_time, TimeUnit.SECONDS)
                .writeTimeout(writeTimeout_time, TimeUnit.SECONDS)
                .readTimeout(readTimeout_time, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .build();
    }

    public OkHttpClient getClientInstance() {
        return clientInstance;
    }


}
