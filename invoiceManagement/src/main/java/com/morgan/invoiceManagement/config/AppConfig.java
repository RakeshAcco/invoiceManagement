package com.morgan.invoiceManagement.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackageClasses = { 
        com.morgan.invoiceManagement.rest.PackageInfo.class, PackageInfo.class })
@EnableJpaRepositories(basePackageClasses = { com.morgan.invoiceManagement.repository.PackageInfo.class })
@EntityScan(basePackageClasses = { com.morgan.invoiceManagement.entity.PackageInfo.class })
@PropertySource("classpath:application.properties")

public class AppConfig {

}
