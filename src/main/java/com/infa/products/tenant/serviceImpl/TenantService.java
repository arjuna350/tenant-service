package com.infa.products.tenant.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.repository.support.BasicMapId;
import org.springframework.stereotype.Component;

import com.infa.products.tenant.repository.TenantRepository;
import com.infa.products.tenant.repository.model.Tenant;
import com.infa.products.tenant.service.TenantServiceInterface;

@Component
public class TenantService implements TenantServiceInterface {

	@Autowired
	TenantRepository tenantRepository;

	

	public TenantService() {
		super();
	}

	public List<Tenant> getAllTenants() {
		List<Tenant> tenants = new ArrayList<>();
		tenantRepository.findAll().forEach(tenants::add);

		return tenants;
	}

	public Tenant getTenant(String id) {

		Tenant tenantData = tenantRepository.findOne(BasicMapId.id("id", id));

		return tenantData;
	}

	public Tenant createTenant(Tenant tenant) {

		tenantRepository.save(tenant);
		return tenant;
	}

	public Tenant updateTenant(String id, Tenant tenant) {

		Tenant tenantData = tenantRepository.findOne(BasicMapId.id("id", id));
		if (tenantData == null) {
			return null;
		}
		tenantData.setValue(tenant.getValue());

		Tenant updatedTenant = tenantRepository.save(tenantData);

		return updatedTenant;
	}

	public void deleteTenant(String id) {
		tenantRepository.delete(BasicMapId.id("id", id));
	}

	public void deleteAllTenant(String id) {
		tenantRepository.deleteAll();
	}

}
