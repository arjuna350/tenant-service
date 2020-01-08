package com.infa.products.tenant.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.infa.products.tenant.client.model.ErrorDetails;
import com.infa.products.tenant.common.EndPoints;
import com.infa.products.tenant.repository.model.Tenant;
import com.infa.products.tenant.rest.model.TenantResponseRest;
import com.infa.products.tenant.serviceImpl.TenantService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author shaising
 */

@RestController
@Api(value = "v1_tennant", description = "Tenant Operations")
@RequestMapping(value = EndPoints.PROJECT+EndPoints.V1_API_VERSION, produces = MediaType.APPLICATION_JSON_VALUE)
public class TenantController {
	
	@Autowired
	TenantService tenantService;

	
	@ApiOperation(value = "Get Tenants")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"),
	@ApiResponse(code = 400, message = "Invalid request", response = ErrorDetails.class),
    @ApiResponse(code = 401, message = "Unauthorized", response = ErrorDetails.class),
    @ApiResponse(code = 403, message = "Forbidden", response = ErrorDetails.class) })
	@RequestMapping(value = EndPoints.TENANTS, method = RequestMethod.GET)
    public ResponseEntity<List<TenantResponseRest>> getTenants() {
		
		List<Tenant> tenantList= tenantService.getAllTenants();
		
		List<TenantResponseRest> tenantResponse = tenantList.stream().map(t->{
			
			TenantResponseRest res= new TenantResponseRest(t.getId(),t.getValue());
			return res;
				}).collect(Collectors.toList());;
		
        return ResponseEntity.ok(tenantResponse);
    }

	
	@ApiOperation(value = "Get Tenants")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"),
	@ApiResponse(code = 400, message = "Invalid request", response = ErrorDetails.class),
    @ApiResponse(code = 401, message = "Unauthorized", response = ErrorDetails.class),
    @ApiResponse(code = 403, message = "Forbidden", response = ErrorDetails.class) })
	@RequestMapping(value = EndPoints.TENANTID, method = RequestMethod.GET)
	 public ResponseEntity<TenantResponseRest> getTenant(@PathVariable String id) {
		
			Tenant tenant =tenantService.getTenant(id);
			TenantResponseRest tenantResponse=null;
			if (tenant!=null)
			{
			 tenantResponse=new TenantResponseRest(tenant.getId(),tenant.getValue()) ;
			}
	        return ResponseEntity.ok(tenantResponse);
	    }
	 

	@ApiOperation(value = "Create Tenant")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"),
	@ApiResponse(code = 400, message = "Invalid request", response = ErrorDetails.class),
    @ApiResponse(code = 401, message = "Unauthorized", response = ErrorDetails.class),
    @ApiResponse(code = 403, message = "Forbidden", response = ErrorDetails.class) })
	@RequestMapping(value = EndPoints.TENANTCREATE, method = RequestMethod.POST)
	 public  ResponseEntity<TenantResponseRest> createTenant(@RequestBody TenantResponseRest tenantResponse )
	 {
		 Gson gson = new Gson();
		 String json = gson.toJson(tenantResponse.getValue());
		tenantService.createTenant(new Tenant(tenantResponse.getId(),json));
		return ResponseEntity.ok(tenantResponse);
	 }
	
	@ApiOperation(value = "Update Tenant")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"),
	@ApiResponse(code = 400, message = "Invalid request", response = ErrorDetails.class),
    @ApiResponse(code = 401, message = "Unauthorized", response = ErrorDetails.class),
    @ApiResponse(code = 403, message = "Forbidden", response = ErrorDetails.class) })
	@RequestMapping(value = EndPoints.TENANTUPDATE, method = RequestMethod.PUT)
	 public  ResponseEntity<TenantResponseRest> updateTenant(@PathVariable("id") String id, @RequestBody TenantResponseRest tenantResponse )
	 {
		 Gson gson = new Gson();
		 String json = gson.toJson(tenantResponse.getValue());
		tenantService.updateTenant(id, new Tenant(tenantResponse.getId(),json));
		return ResponseEntity.ok(tenantResponse);
	 }
	
	
	@ApiOperation(value = "delete Tenant")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"),
	@ApiResponse(code = 400, message = "Invalid request", response = ErrorDetails.class),
    @ApiResponse(code = 401, message = "Unauthorized", response = ErrorDetails.class),
    @ApiResponse(code = 403, message = "Forbidden", response = ErrorDetails.class) })
	@RequestMapping(value = EndPoints.TENANTDELETE, method = RequestMethod.DELETE)
	 public  ResponseEntity<String>  deleteTenant(@PathVariable("id") String id )
	 {
		tenantService.deleteTenant(id);
		return ResponseEntity.ok("Tenant has been deleted!");
	 }
	
	
	
	
}