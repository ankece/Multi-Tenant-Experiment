package com.ankece.multitenantapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationProperties {

    @Value("countrywise.datasource.uk.url")
    private String datasourceUrlUk;
    @Value("countrywise.datasource.uk.username")
    private String datasourceUsernameUk;
    @Value("countrywise.datasource.uk.password")
    private String datasourcePasswordUk;
    @Value("countrywise.datasource.uk.driver")
    private String datasourceDriverUk;

    @Value("countrywise.datasource.us.url")
    private String datasourceUrlUs;
    @Value("countrywise.datasource.us.username")
    private String datasourceUsernameUs;
    @Value("countrywise.datasource.us.password")
    private String datasourcePasswordUs;
    @Value("countrywise.datasource.us.driver")
    private String datasourceDriverUs;

}