package com.rest.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rest.deserializer.DataCenterInfoDeserializer;

@JsonDeserialize(using = DataCenterInfoDeserializer.class)
public class DataCenterInfo {

	private String dataCenterName;

	public String getDataCenterName() {
		return dataCenterName;
	}

	public void setDataCenterName(String dataCenterName) {
		this.dataCenterName = dataCenterName;
	}

}
