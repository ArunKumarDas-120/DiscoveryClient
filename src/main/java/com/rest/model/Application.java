package com.rest.model;

public class Application {
	private Instance[] instance;

	private String name;

	public Instance[] getInstance() {
		return instance;
	}

	public void setInstance(Instance[] instance) {
		this.instance = instance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ClassPojo [instance = " + instance + ", name = " + name + "]";
	}
}