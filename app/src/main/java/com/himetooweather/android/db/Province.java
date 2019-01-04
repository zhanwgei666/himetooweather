package com.himetooweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by FX PLUS on 2019/1/4.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    private int getId(){
        return id;
    }
    public void setId(int id){
        this.id =id;
    }

    private String getprovinceName(){
        return provinceName;
    }
    public void setprovinceName(String provinceName){
        this.provinceName = provinceName;
    }

    private int getprovinceCode(){
        return provinceCode;
    }
    public void setprovinceCode(int provinceCode){
        this.provinceCode =provinceCode;
    }


}
