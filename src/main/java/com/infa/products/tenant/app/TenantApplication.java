package com.infa.products.tenant.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.infa.products.tenant.repository.config","com.infa.products.tenant.beans", "com.infa.products.tenant.controller"})
public class TenantApplication {

	
    public static void main(String[] args) {
        SpringApplication.run(TenantApplication.class, args);
    }


}
