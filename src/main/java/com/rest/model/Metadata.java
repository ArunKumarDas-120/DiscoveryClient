package com.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rest.deserializer.MetadataDeserializer;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = MetadataDeserializer.class)
public class Metadata {

	private String managementPort;

	public String getManagementPort() {
		return managementPort;
	}

	public void setManagementPort(String managementPort) {
		this.managementPort = managementPort;
	}

}