package com.rest.factory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rest.constants.MediaType;
import com.rest.constants.RequestMethod;

public final class Factory {
	private static ObjectMapper objectMapper = new ObjectMapper();

	private Factory() {

	}

	public static HttpURLConnection getHttpConnection(final URL url, RequestMethod method,
			Map<String, MediaType> headers) throws IOException {
		Objects.requireNonNull(url);
		Objects.requireNonNull(method);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod(method.toString());
		con.setRequestProperty("User-Agent", "Test Application");
		con.setReadTimeout(30000);
		con.setConnectTimeout(1500);
		headers.forEach((k, v) -> con.setRequestProperty(k, v.toString()));
		return con;
	}

	public static <T> T convertStringToData(String jsonString, Class<T> clazz)
			throws JsonParseException, JsonMappingException, IOException {
		return objectMapper.readValue(jsonString, clazz);

	}
}
