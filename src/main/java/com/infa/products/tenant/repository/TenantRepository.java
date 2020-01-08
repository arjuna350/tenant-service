package com.infa.products.tenant.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.infa.products.tenant.repository.model.Tenant;

@Repository
public interface TenantRepository extends CassandraRepository<Tenant> {

}