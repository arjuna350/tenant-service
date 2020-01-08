package com.infa.products.tenant.client.model;

public class ModelConfig {

	
	 private String host = null;


	 private String port = null;
	
	
	 private String keyspacePrefix = null;
	
	

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

	public String getkeyspacePrefix() {
		return keyspacePrefix;
	}

	public void setkeyspacePrefix(String keyspacePrefix) {
		this.keyspacePrefix = keyspacePrefix;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((host == null) ? 0 : host.hashCode());
		result = prime * result + ((keyspacePrefix == null) ? 0 : keyspacePrefix.hashCode());
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
		ModelConfig other = (ModelConfig) obj;
		if (host == null) {
			if (other.host != null)
				return false;
		} else if (!host.equals(other.host))
			return false;
		if (keyspacePrefix == null) {
			if (other.keyspacePrefix != null)
				return false;
		} else if (!keyspacePrefix.equals(other.keyspacePrefix))
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
		return "DataConfig [host=" + host + ", port=" + port + ", keyspacePrefix=" + keyspacePrefix + "]";
	}
	
	
	
}
