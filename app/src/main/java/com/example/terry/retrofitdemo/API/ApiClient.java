package com.example.terry.retrofitdemo.API;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Terry on 2016/5/6.
 */
public class ApiClient {
    private static final String BaseUrl = "http://v.juhe.cn/weather/";

    public static final Retrofit  retrofit= new Retrofit.Builder()
         .baseUrl(BaseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
      public MyApiService service =  retrofit.create(MyApiService.class);
}
