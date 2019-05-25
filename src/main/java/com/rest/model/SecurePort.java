package com.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rest.deserializer.SecurePortDeserializer;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = SecurePortDeserializer.class)
public class SecurePort {

	private String securePort;
	private boolean enabled;

	public String getSecurePort() {
		return securePort;
	}

	public void setSecurePort(String securePort) {
		this.securePort = securePort;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
