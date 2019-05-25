package com.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rest.deserializer.PortDeserializer;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = PortDeserializer.class)
public class Port {
	private String portNumber;

	public String getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	private boolean enabled;
}
