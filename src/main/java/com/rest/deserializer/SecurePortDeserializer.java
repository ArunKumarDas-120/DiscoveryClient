package com.rest.deserializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.rest.model.SecurePort;

public class SecurePortDeserializer extends JsonDeserializer<SecurePort> {

	@Override
	public SecurePort deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		ObjectCodec oc = jp.getCodec();
	    JsonNode node = oc.readTree(jp);
	    String portNumber  = node.get("$").asText();
	    boolean enabled = node.get("@enabled").asBoolean();
	    SecurePort port = new SecurePort();
	    port.setEnabled(enabled);
	    port.setSecurePort(portNumber);
		return port;
	}

}
