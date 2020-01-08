package com.infa.products.tenant.common;

public interface EndPoints {

	
	String PROJECT = "/tenantService";
	String V1_API_VERSION = "/api/v1";
	
	
	String ID = "/{id}";
	String TENANTS = "/tenants";
	String TENANTID = "/tenant/"+ID;
	String 	TENANTCREATE="/tenant/create";
	String 	TENANTUPDATE="/tenant/update"+ID;
	String 	TENANTDELETE="/tenant/delete"+ID;
	
	
}
