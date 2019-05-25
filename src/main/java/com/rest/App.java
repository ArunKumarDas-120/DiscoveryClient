package com.rest;

import com.rest.manager.EurekaRestManager;
import com.rest.model.RootInstance;

public class App {
	public static void main(String[] args) {
		
		EurekaRestManager manager = new EurekaRestManager();
		RootInstance instance = manager.getApplicationInstance("http://localhost:8000/eureka/apps/INVENTORY_MANAGMENT_SERVICE");
		//Prepare rest End point and getData getDataFromService
	}
}
