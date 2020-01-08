package com.infa.products.tenant.client.model;

import com.google.gson.annotations.SerializedName;

public class SolrConfig {


	
	 private String host = null;

	
	 private String port = null;
	

	 private String defaultCollection = null;
	
	
	 private String backupCollection = null;

	
	
	
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getDefaultCollection() {
		return defaultCollection;
	}

	public void setDefaultCollection(String defaultCollection) {
		this.defaultCollection = defaultCollection;
	}

	public String getBackupCollection() {
		return backupCollection;
	}

	public void setBackupCollection(String backupCollection) {
		this.backupCollection = backupCollection;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((backupCollection == null) ? 0 : backupCollection.hashCode());
		result = prime * result + ((defaultCollection == null) ? 0 : defaultCollection.hashCode());
		result = prime * result + ((host == null) ? 0 : host.hashCode());
		result = prime * result + ((port == null) ? 0 : port.hashCode());
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
		SolrConfig other = (SolrConfig) obj;
		if (backupCollection == null) {
			if (other.backupCollection != null)
				return false;
		} else if (!backupCollection.equals(other.backupCollection))
			return false;
		if (defaultCollection == null) {
			if (other.defaultCollection != null)
				return false;
		} else if (!defaultCollection.equals(other.defaultCollection))
			return false;
		if (host == null) {
			if (other.host != null)
				return false;
		} else if (!host.equals(other.host))
			return false;
		if (port == null) {
			if (other.port != null)
				return false;
		} else if (!port.equals(other.port))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SolrConfig [host=" + host + ", port=" + port + ", defaultCollection=" + defaultCollection
				+ ", backupCollection=" + backupCollection + "]";
	}
	
	
	
}
