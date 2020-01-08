	package com.infa.products.tenant.client;

import java.util.List;

import com.infa.products.tenant.client.model.TenantDetails;
import com.infa.products.tenant.client.model.TenantResponse;
import com.infa.products.tenant.client.rest.impl.ApiClient;
import com.infa.products.tenant.client.rest.impl.ApiException;
import com.infa.products.tenant.client.rest.impl.api.TenantControllerApi;


public class TenantControllerApiTest {

	    private  TenantControllerApi api= null;
	    
	    public TenantControllerApiTest()
	    {
	    	ApiClient client= new ApiClient();
	    	client.setBasePath("http://localhost:8282");
	    	this.api=new TenantControllerApi (client);
	    }
	    
	    /**
	     * Create Tenant
	     *
	     * 
	     *
	     * @throws ApiException
	     *          if the Api call fails
	     */
	  //  @Test
	    public void createTenantUsingPOSTTest() throws ApiException {
	        TenantResponse tenantResponse = null;
	        TenantResponse response = api.createTenantUsingPOST(tenantResponse);

	        // TODO: test validations
	    }
	    
	    /**
	     * delete Tenant
	     *
	     * 
	     *
	     * @throws ApiException
	     *          if the Api call fails
	     */
	   // @Test
	    public void deleteTenantUsingDELETETest() throws ApiException {
	        String id = null;
	        String response = api.deleteTenantUsingDELETE(id);

	        // TODO: test validations
	    }
	    
	    /**
	     * Get Tenants
	     *
	     * 
	     *
	     * @throws ApiException
	     *          if the Api call fails
	     */
	  //  @Test
	    public void getTenantUsingGETTest() throws ApiException {
	        String id = null;
	        TenantResponse response = api.getTenantUsingGET(id);

	        // TODO: test validations
	    }
	    
	    /**
	     * Get Tenants
	     *
	     * 
	     *
	     * @throws ApiException
	     *          if the Api call fails
	     */
	  //  @Test
	    public void getTenantsUsingGETTest() throws ApiException {
	        List<TenantResponse> response = api.getTenantsUsingGET();
	        TenantResponse res= response.get(0);
	        
	        TenantDetails tenantDetails=res.getTenantDetails();
	        System.out.println(response);
	        System.out.println(tenantDetails);
	        // TODO: test validations
	    }
	    
	    /**
	     * Update Tenant
	     *
	     * 
	     *
	     * @throws ApiException
	     *          if the Api call fails
	     */
	 //   @Test
	    public void updateTenantUsingPUTTest() throws ApiException {
	        String id = null;
	        TenantResponse tenantResponse = null;
	        TenantResponse response = api.updateTenantUsingPUT(id, tenantResponse);

	        // TODO: test validations
	    }
	    
	    public static void main(String [] args) throws ApiException
	    {
	    	 
	    	 //System.out.println(jsonObject.toString());
	    	 
	    	TenantControllerApiTest test= new TenantControllerApiTest();
	   
	    	test.getTenantsUsingGETTest();
	    }
	    
	}
