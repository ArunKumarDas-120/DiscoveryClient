package com.rest.model;

public class LeaseInfo {
	private String renewalIntervalInSecs;

	private String registrationTimestamp;

	private String evictionTimestamp;

	private String lastRenewalTimestamp;

	private String durationInSecs;

	private String serviceUpTimestamp;

	public String getRenewalIntervalInSecs() {
		return renewalIntervalInSecs;
	}

	public void setRenewalIntervalInSecs(String renewalIntervalInSecs) {
		this.renewalIntervalInSecs = renewalIntervalInSecs;
	}

	public String getRegistrationTimestamp() {
		return registrationTimestamp;
	}

	public void setRegistrationTimestamp(String registrationTimestamp) {
		this.registrationTimestamp = registrationTimestamp;
	}

	public String getEvictionTimestamp() {
		return evictionTimestamp;
	}

	public void setEvictionTimestamp(String evictionTimestamp) {
		this.evictionTimestamp = evictionTimestamp;
	}

	public String getLastRenewalTimestamp() {
		return lastRenewalTimestamp;
	}

	public void setLastRenewalTimestamp(String lastRenewalTimestamp) {
		this.lastRenewalTimestamp = lastRenewalTimestamp;
	}

	public String getDurationInSecs() {
		return durationInSecs;
	}

	public void setDurationInSecs(String durationInSecs) {
		this.durationInSecs = durationInSecs;
	}

	public String getServiceUpTimestamp() {
		return serviceUpTimestamp;
	}

	public void setServiceUpTimestamp(String serviceUpTimestamp) {
		this.serviceUpTimestamp = serviceUpTimestamp;
	}

	@Override
	public String toString() {
		return "ClassPojo [renewalIntervalInSecs = " + renewalIntervalInSecs + ", registrationTimestamp = "
				+ registrationTimestamp + ", evictionTimestamp = " + evictionTimestamp + ", lastRenewalTimestamp = "
				+ lastRenewalTimestamp + ", durationInSecs = " + durationInSecs + ", serviceUpTimestamp = "
				+ serviceUpTimestamp + "]";
	}
}