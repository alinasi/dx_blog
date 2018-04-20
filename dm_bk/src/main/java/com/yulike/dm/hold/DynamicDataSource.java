package com.yulike.dm.hold;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class DynamicDataSource extends AbstractRoutingDataSource{

    private static final Logger LOG = LoggerFactory.getLogger(DynamicDataSource.class);
    private static final List<String> dataSourceNames = new ArrayList<>();

    @Override
    protected Object determineCurrentLookupKey() {
        LOG.debug("db=="+DataSourceContextHolder.getDataSourceName());
        return DataSourceContextHolder.getDataSourceName();
    }

    public void setTargetDataSources(Map<Object, Object> targetDataSources){
        if(targetDataSources != null){
            Iterator iterator = targetDataSources.keySet().iterator();
            while (iterator.hasNext()){
                String name = (String)iterator.next();
                if(!"defaultDataSource".equals(name)){
                    dataSourceNames.add(name);
                }
            }
        }
        super.setTargetDataSources(targetDataSources);
    }
}
