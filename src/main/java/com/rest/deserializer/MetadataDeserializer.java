package com.rest.deserializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.rest.model.Metadata;

public class MetadataDeserializer   extends JsonDeserializer<Metadata> {
	@Override
	public Metadata deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		ObjectCodec oc = jp.getCodec();
	    JsonNode node = oc.readTree(jp);
	    String portNumber  = node.get("management.port").asText();
	    Metadata metadata = new Metadata();
	    metadata.setManagementPort(portNumber);
		return metadata;
	}
}
