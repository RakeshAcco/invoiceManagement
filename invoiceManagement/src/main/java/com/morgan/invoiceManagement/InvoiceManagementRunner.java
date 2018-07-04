package com.morgan.invoiceManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

import com.morgan.invoiceManagement.config.AppConfig;

@SpringBootApplication
@Import(AppConfig.class)
public class InvoiceManagementRunner extends SpringBootServletInitializer {

	
    @Override
    protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(InvoiceManagementRunner.class);
    }	
	
public static void main(String[] args) {
	SpringApplication.run(InvoiceManagementRunner.class, args);
}
}
