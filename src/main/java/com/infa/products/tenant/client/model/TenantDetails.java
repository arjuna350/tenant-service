package com.infa.products.tenant.client.model;

public class TenantDetails {
	
	
	private DataConfig data = null;

	private ModelConfig model = null;

	private SolrConfig solr = null;

	public DataConfig getData() {
		return data;
	}

	public void setData(DataConfig data) {
		this.data = data;
	}

	public ModelConfig getModel() {
		return model;
	}

	public void setModel(ModelConfig model) {
		this.model = model;
	}

	public SolrConfig getSolr() {
		return solr;
	}

	public void setSolr(SolrConfig solr) {
		this.solr = solr;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((solr == null) ? 0 : solr.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TenantDetails other = (TenantDetails) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (solr == null) {
			if (other.solr != null)
				return false;
		} else if (!solr.equals(other.solr))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TenantDetails [data=" + data + ", model=" + model + ", solr=" + solr + "]";
	}
	  
	  

}
