package com.infa.products.tenant.client.local.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.infa.products.tenant.client.TenantClientInterface;
import com.infa.products.tenant.client.model.TenantResponse;
import com.infa.products.tenant.repository.model.Tenant;
import com.infa.products.tenant.serviceImpl.TenantService;
@Component
public class TenantClientLocalImpl implements TenantClientInterface{

	@Autowired
	TenantService tenantService;

	
	
    public List<TenantResponse> getTenants() {
		
		List<Tenant> tenantList= tenantService.getAllTenants();
		
		List<TenantResponse> tenantResponse = tenantList.stream().map(t->{
			
			TenantResponse res= new TenantResponse(t.getId(),t.getValue());
			return res;
				}).collect(Collectors.toList());;
		
        return tenantResponse;
    }

	
	 public TenantResponse getTenant(String id) {
		
			Tenant tenant =tenantService.getTenant(id);
			TenantResponse tenantResponse=null;
			if (tenant!=null)
			{
			 tenantResponse=new TenantResponse(tenant.getId(),tenant.getValue()) ;
			}
	        return tenantResponse;
	    }
	 

	
	 public  TenantResponse createTenant(TenantResponse tenantResponse )
	 {
		 Gson gson = new Gson();
		 String json = gson.toJson(tenantResponse.getValue());
		tenantService.createTenant(new Tenant(tenantResponse.getId(),json));
		return tenantResponse;
	 }
	
	
	 public  TenantResponse updateTenant( String id, TenantResponse tenantResponse )
	 {
		 Gson gson = new Gson();
		 String json = gson.toJson(tenantResponse.getValue());
		tenantService.updateTenant(id, new Tenant(tenantResponse.getId(),json));
		return tenantResponse;
	 }
	
	
	
	 public  String  deleteTenant( String id )
	 {
		tenantService.deleteTenant(id);
		return "Tenant has been deleted!";
	 }
	
	
	
	
	
}
