package com.infa.products.tenant.beans.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

import com.infa.products.tenant.client.local.impl.TenantClientLocalImpl;
import com.infa.products.tenant.repository.TenantRepository;
import com.infa.products.tenant.serviceImpl.TenantService;

@Configuration
@EnableCassandraRepositories("com.infa.products.tenant.repository")
public class TenantBeansConfiguration {


	
	@Autowired
	TenantRepository tenantRepository;


	
	@Bean
	public TenantService tenantService()
	{
		return new TenantService();
	}
	
	@Bean
	public TenantClientLocalImpl tenantUtil()
	{
		return new TenantClientLocalImpl();
	}
	
}
