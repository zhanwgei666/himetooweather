package com.example.fxplus.himetooweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("city")
    public  String   cityName;

    @SerializedName("id")
    public  String  weatherId;

   /*  public Update update;
        上下显示时间
   public class Update{
        @SerializedName("loc")
        public  String  updateTime;
    }*/
}
