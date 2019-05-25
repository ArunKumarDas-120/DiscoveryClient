package com.rest.manager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.rest.constants.MediaType;
import com.rest.constants.RequestMethod;
import com.rest.factory.Factory;
import com.rest.model.RootInstance;

public class EurekaRestManager {

	public RootInstance getApplicationInstance(String eurkaUrl) {
		RootInstance rootInstance = null;
		StringBuilder response = new StringBuilder();
		HttpURLConnection con = null;
		BufferedReader br = null;
		try {
			Map<String, MediaType> headers = new HashMap<>();
			headers.put("Content-Type", MediaType.JSON);
			headers.put("Accept", MediaType.JSON);
			con = Factory.getHttpConnection(new URL(eurkaUrl), RequestMethod.GET, headers);
			br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			br.lines().forEach(r -> response.append(r));
			rootInstance = Factory.convertStringToData(response.toString(), RootInstance.class);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (Objects.nonNull(br))
					br.close();

			} catch (IOException e) {
				System.err.println("Error in closing inputStream");
			}

			con.disconnect();
		}
		return rootInstance;
	}

	public void getDataFromService(String restEndPoint) {

		StringBuilder response = new StringBuilder();
		HttpURLConnection con = null;
		BufferedReader br = null;
		try {
			Map<String, MediaType> headers = new HashMap<>();
			headers.put("Content-Type", MediaType.JSON);
			headers.put("Accept", MediaType.JSON);
			con = Factory.getHttpConnection(new URL(restEndPoint), RequestMethod.GET, headers);
			br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			br.lines().forEach(r -> response.append(r));
			Factory.convertStringToData(response.toString(), RootInstance.class);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (Objects.nonNull(br))
					br.close();

			} catch (IOException e) {
				System.err.println("Error in closing inputStream");
			}

			con.disconnect();
		}
	}
}
