	package com.infa.products.tenant.client;

	import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.EmbeddedServletContainerAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.ApplicationContext;

import com.infa.products.tenant.client.model.TenantDetails;
import com.infa.products.tenant.client.model.TenantResponse;
import com.infa.products.tenant.client.rest.impl.ApiException;


@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = { "com.infa.products.tenant.repository.config","com.infa.products.tenant.beans"},
	exclude = {EmbeddedServletContainerAutoConfiguration.class, 
        WebMvcAutoConfiguration.class})



	public class TenantServiceTest {
	


		
		
	
	    private  TenantClientInterface tenantUtil;
		
		
		
	   
	    public TenantServiceTest() {
	    	
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
	        List<TenantResponse> response = tenantUtil.getTenants();
	        TenantResponse res= response.get(0);
	        
	        TenantDetails tenantDetails=res.getTenantDetails();
	        System.out.println(response);
	        System.out.println(tenantDetails);
	        // TODO: test validations
	    }
	    
	    
	    public static void main(String [] args) throws ApiException
	    {
	    	TenantServiceTest test= new TenantServiceTest();
	    	
	    	ApplicationContext context=SpringApplication.run(TenantServiceTest.class, args);
	    	test.setTenantUtil(context.getBean(TenantClientInterface.class));
	    
	   
	    	test.getTenantsUsingGETTest();
	    }


		public TenantClientInterface getTenantUtil() {
			return tenantUtil;
		}


		public void setTenantUtil(TenantClientInterface tenantUtil) {
			this.tenantUtil = tenantUtil;
		}
	    
	}
