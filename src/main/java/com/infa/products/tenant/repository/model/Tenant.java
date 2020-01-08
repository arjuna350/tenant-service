package com.infa.products.tenant.repository.model;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table
public class Tenant {

	@PrimaryKey
	private String id;

	
	
	@Column("value")
	private String value;



	public Tenant(String id, String value) {
		super();
		this.id = id;
		this.value = value;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getValue() {
		return value;
	}



	public void setValue(String value) {
		this.value = value;
	}



	@Override
	public String toString() {
		return "Tenant [id=" + id + ", value=" + value + "]";
	}



	
	

	
}