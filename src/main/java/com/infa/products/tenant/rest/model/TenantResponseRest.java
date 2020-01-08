package com.infa.products.tenant.rest.model;

public class TenantResponseRest {


	private String id;


	private Object value;
	
	

	public TenantResponseRest(String id, Object value) {
		super();
		this.id = id;
		this.value = value;
	}

	
	public TenantResponseRest() {
		super();
		
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "TenantProxy [id=" + id + ", value=" + value + "]";
	}

	
	
	
}