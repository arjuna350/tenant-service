package com.infa.products.tenant.service;

import java.util.List;

import com.infa.products.tenant.repository.model.Tenant;


public interface TenantServiceInterface {

	

	  List<Tenant> getAllTenants();

	 Tenant getTenant(String id);

	 Tenant createTenant(Tenant tenant) ;

	 Tenant updateTenant(String id, Tenant tenant) ;

	 void deleteTenant(String id) ;

	 void deleteAllTenant(String id);

}
