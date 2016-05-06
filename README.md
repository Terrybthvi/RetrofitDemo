# RetrofitDemo
This is a json demo that used Retrofit.

#use
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






{"resultcode":"200","reason":"successed!","result":{"sk":{"temp":"28","wind_direction":"东北风","wind_strength":"3级","humidity":"63%","time":"18:09"},"today":{"temperature":"18℃~29℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"东北风4-5 级","week":"星期五","city":"苏州","date_y":"2016年05月06日","dressing_index":"热","dressing_advice":"天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。","uv_index":"弱","comfort_index":"","wash_index":"不宜","travel_index":"较不宜","exercise_index":"较不宜","drying_index":""},"future":[{"temperature":"18℃~29℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"东北风4-5 级","week":"星期五","date":"20160506"},{"temperature":"15℃~24℃","weather":"雷阵雨转中雨","weather_id":{"fa":"04","fb":"08"},"wind":"东风3-4 级","week":"星期六","date":"20160507"},{"temperature":"17℃~20℃","weather":"雷阵雨转中雨","weather_id":{"fa":"04","fb":"08"},"wind":"东风微风","week":"星期日","date":"20160508"},{"temperature":"16℃~23℃","weather":"小雨转多云","weather_id":{"fa":"07","fb":"01"},"wind":"东风微风","week":"星期一","date":"20160509"},{"temperature":"18℃~26℃","weather":"多云转晴","weather_id":{"fa":"01","fb":"00"},"wind":"北风4-5 级","week":"星期二","date":"20160510"},{"temperature":"17℃~20℃","weather":"雷阵雨转中雨","weather_id":{"fa":"04","fb":"08"},"wind":"东风微风","week":"星期三","date":"20160511"},{"temperature":"15℃~24℃","weather":"雷阵雨转中雨","weather_id":{"fa":"04","fb":"08"},"wind":"东风3-4 级","week":"星期四","date":"20160512"}]},"error_code":0}

 /**
     * resultcode : 200
     * reason : 查询成功!
     * result : {"sk":{"temp":"21","wind_direction":"西风","wind_strength":"2级","humidity":"4%","time":"14:25"},"today":{"city":"天津","date_y":"2014年03月21日","week":"星期五","temperature":"8℃~20℃","weather":"晴转霾","weather_id":{"fa":"00","fb":"53"},"wind":"西南风微风","dressing_index":"较冷","dressing_advice":"建议着大衣、呢外套加毛衣、卫衣等服装。","uv_index":"中等","comfort_index":"","wash_index":"较适宜","travel_index":"适宜","exercise_index":"较适宜","drying_index":""},"future":[{"temperature":"28℃~36℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"南风3-4级","week":"星期一","date":"20140804"},{"temperature":"28℃~36℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"东南风3-4级","week":"星期二","date":"20140805"},{"temperature":"27℃~35℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"东南风3-4级","week":"星期三","date":"20140806"},{"temperature":"27℃~34℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"东南风3-4级","week":"星期四","date":"20140807"},{"temperature":"27℃~33℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"东北风4-5级","week":"星期五","date":"20140808"},{"temperature":"26℃~33℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"北风4-5级","week":"星期六","date":"20140809"},{"temperature":"26℃~33℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"北风4-5级","week":"星期日","date":"20140810"}]}
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    /**
     * sk : {"temp":"21","wind_direction":"西风","wind_strength":"2级","humidity":"4%","time":"14:25"}
     * today : {"city":"天津","date_y":"2014年03月21日","week":"星期五","temperature":"8℃~20℃","weather":"晴转霾","weather_id":{"fa":"00","fb":"53"},"wind":"西南风微风","dressing_index":"较冷","dressing_advice":"建议着大衣、呢外套加毛衣、卫衣等服装。","uv_index":"中等","comfort_index":"","wash_index":"较适宜","travel_index":"适宜","exercise_index":"较适宜","drying_index":""}
     * future : [{"temperature":"28℃~36℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"南风3-4级","week":"星期一","date":"20140804"},{"temperature":"28℃~36℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"东南风3-4级","week":"星期二","date":"20140805"},{"temperature":"27℃~35℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"东南风3-4级","week":"星期三","date":"20140806"},{"temperature":"27℃~34℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"东南风3-4级","week":"星期四","date":"20140807"},{"temperature":"27℃~33℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"东北风4-5级","week":"星期五","date":"20140808"},{"temperature":"26℃~33℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"北风4-5级","week":"星期六","date":"20140809"},{"temperature":"26℃~33℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"北风4-5级","week":"星期日","date":"20140810"}]
     */

    private ResultBean result;
    private int error_code;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * temp : 21
         * wind_direction : 西风
         * wind_strength : 2级
         * humidity : 4%
         * time : 14:25
         */

        private SkBean sk;
        /**
         * city : 天津
         * date_y : 2014年03月21日
         * week : 星期五
         * temperature : 8℃~20℃
         * weather : 晴转霾
         * weather_id : {"fa":"00","fb":"53"}
         * wind : 西南风微风
         * dressing_index : 较冷
         * dressing_advice : 建议着大衣、呢外套加毛衣、卫衣等服装。
         * uv_index : 中等
         * comfort_index :
         * wash_index : 较适宜
         * travel_index : 适宜
         * exercise_index : 较适宜
         * drying_index :
         */

        private TodayBean today;
        /**
         * temperature : 28℃~36℃
         * weather : 晴转多云
         * weather_id : {"fa":"00","fb":"01"}
         * wind : 南风3-4级
         * week : 星期一
         * date : 20140804
         */
