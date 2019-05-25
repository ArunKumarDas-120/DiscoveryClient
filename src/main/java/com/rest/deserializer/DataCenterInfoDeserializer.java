package com.rest.deserializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.rest.model.DataCenterInfo;

public class DataCenterInfoDeserializer   extends JsonDeserializer<DataCenterInfo> {
	@Override
	public DataCenterInfo deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		ObjectCodec oc = jp.getCodec();
	    JsonNode node = oc.readTree(jp);
	    String name  = node.get("name").asText();
	    DataCenterInfo metadata = new DataCenterInfo();
	    metadata.setDataCenterName(name);
		return metadata;
	}
}
