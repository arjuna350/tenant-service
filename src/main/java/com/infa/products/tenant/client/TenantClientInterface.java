package com.infa.products.tenant.client;

import java.util.List;

import com.infa.products.tenant.client.model.TenantResponse;

public interface TenantClientInterface {
	
    public List<TenantResponse> getTenants() ;

	 public TenantResponse getTenant(String id) ;

	 public TenantResponse createTenant( TenantResponse tenantResponse );
	
	 public TenantResponse updateTenant(String id, TenantResponse tenantResponse );
	
	 public  String  deleteTenant(String id );
	

}
