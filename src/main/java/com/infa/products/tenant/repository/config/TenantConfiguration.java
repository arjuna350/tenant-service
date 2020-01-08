package com.infa.products.tenant.repository.config;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cassandra.core.keyspace.CreateKeyspaceSpecification;
import org.springframework.cassandra.core.keyspace.KeyspaceOption;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.config.java.AbstractCassandraConfiguration;


@Configuration
public class TenantConfiguration extends AbstractCassandraConfiguration  {

	 // @Value("${cassandra.contactpoints}")
	  @Value("${cassandra.contactpoints}")
	  private String contactPoints;
	  @Value("${cassandra.port}")
	  private int port;
	  @Value("${cassandra.keyspace}")
	  private String keySpace;
	 
	  @Override
	  protected String getKeyspaceName() {
	    return keySpace;
	  }
	  @Override
	  protected String getContactPoints() {
	    return contactPoints;
	  }
	  @Override
	  protected int getPort() {
	    return port;
	  }
	  @Override
	  public SchemaAction getSchemaAction() {
	    return SchemaAction.CREATE_IF_NOT_EXISTS;
	  }
	  
	  @Override
	  protected List<CreateKeyspaceSpecification> getKeyspaceCreations() {
	    return Collections.singletonList(CreateKeyspaceSpecification.createKeyspace(keySpace)
	                .ifNotExists()
	                .with(KeyspaceOption.DURABLE_WRITES, true)
	                .withSimpleReplication());
	  }
	  
	  @Override
	  public String[] getEntityBasePackages() {
	      return new String[]{"com.infa.products.tenant.repository.model"};
	  }
	 

}
