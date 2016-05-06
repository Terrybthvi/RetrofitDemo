package com.example.terry.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.terry.retrofitdemo.API.ApiClient;
import com.example.terry.retrofitdemo.Utils.Weather;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity ";
    private String key = "e534109c6354b2bd50f7748f29f95afb";
    private String format = "2";
    private String cityname = "杭州";
public TextView t;
    public TextView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView) findViewById(R.id.Date);
        w = (TextView) findViewById(R.id.Weather);
        ApiClient apiClient = new ApiClient();
        Map<String,String> map = new HashMap<String, String>();
        map.put("format",format);
        map.put("cityname",cityname);
        map.put("key", key);
        Call<Weather> call = apiClient.service.weather(map);
        call.enqueue(new Callback<Weather>() {
            @Override
            public void onResponse(Call<Weather> call, Response<Weather> response) {
                String s = response.body().getResultcode();
                t.setText(response.body().getResult().getToday().getDate_y());
                w.setText(response.body().getResult().getToday().getWeather());
                Log.e(TAG,response.body().getResult().getToday().getWeather());
                Log.e(TAG, response.body().getResult().toString());
            }

            @Override
            public void onFailure(Call<Weather> call, Throwable t) {

            }
        });

    }
}
