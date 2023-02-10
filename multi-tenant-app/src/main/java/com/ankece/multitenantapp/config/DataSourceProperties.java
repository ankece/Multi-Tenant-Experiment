package com.ankece.multitenantapp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Component
@ConfigurationProperties( prefix = "countrywise")
public class DataSourceProperties {

    private final Map<Object, Object> datasources = new HashMap<>();

    public Map<Object, Object> getDatasources(){
        return datasources;
    }

    public void setDatasources(Map<String, Map<String, String>> datasources){
        datasources.forEach((k,v) -> this.datasources.put(k, convert(v)));
    }

    private DataSource convert(Map<String, String> sources){

        return DataSourceBuilder.create()
                .url(sources.get("url"))
                .username(sources.get("username"))
                .password(sources.get("password"))
                .driverClassName(sources.get("driver"))
                .build();
    }
}
