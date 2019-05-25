package com.rest.deserializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.rest.model.Port;

public class PortDeserializer extends JsonDeserializer<Port> {

	@Override
	public Port deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		ObjectCodec oc = jp.getCodec();
	    JsonNode node = oc.readTree(jp);
	    String portNumber  = node.get("$").asText();
	    boolean enabled = node.get("@enabled").asBoolean();
	    Port port = new Port();
	    port.setEnabled(enabled);
	    port.setPortNumber(portNumber);
		return port;
	}

}
