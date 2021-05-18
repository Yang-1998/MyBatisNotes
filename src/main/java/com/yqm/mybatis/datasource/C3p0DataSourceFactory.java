package com.yqm.mybatis.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;

public class C3p0DataSourceFactory extends UnpooledDataSourceFactory {
//    继承UnpooledDataSourceFactory完成C3P0的迁入
    public C3p0DataSourceFactory(){
        this.dataSource =new ComboPooledDataSource();
        //让datasource由c3p0进行创建
    }
}
