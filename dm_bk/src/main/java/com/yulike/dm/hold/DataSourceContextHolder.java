package com.yulike.dm.hold;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataSourceContextHolder {

    private static final Logger LOG = LoggerFactory.getLogger(DataSourceContextHolder.class);

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    public static void setDataSourceName(String dataSourceName){
        contextHolder.set(dataSourceName);
    }

    public static String getDataSourceName(){
        return contextHolder.get();
    }

    public static void clearDataSource(){
        contextHolder.remove();
    }

    public static void defaultDataSource(){
        setDataSourceName("defaultDataSource");
    }
}
