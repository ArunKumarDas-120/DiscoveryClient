package com.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Instance {
	private String app;

	private String hostName;

	private String overriddenStatus;

	private String lastUpdatedTimestamp;

	private Metadata metadata;

	private Port port;

	private String healthCheckUrl;

	private String statusPageUrl;

	private String vipAddress;

	private String secureVipAddress;

	private LeaseInfo leaseInfo;

	private String lastDirtyTimestamp;

	private String homePageUrl;

	private String ipAddr;

	private String countryId;

	private String actionType;

	private String instanceId;

	private String isCoordinatingDiscoveryServer;

	private String status;

	private SecurePort securePort;

	private DataCenterInfo dataCenterInfo;

	public DataCenterInfo getDataCenterInfo() {
		return dataCenterInfo;
	}

	public void setDataCenterInfo(DataCenterInfo dataCenterInfo) {
		this.dataCenterInfo = dataCenterInfo;
	}

	public SecurePort getSecurePort() {
		return securePort;
	}

	public void setSecurePort(SecurePort securePort) {
		this.securePort = securePort;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getOverriddenStatus() {
		return overriddenStatus;
	}

	public void setOverriddenStatus(String overriddenStatus) {
		this.overriddenStatus = overriddenStatus;
	}

	public String getLastUpdatedTimestamp() {
		return lastUpdatedTimestamp;
	}

	public void setLastUpdatedTimestamp(String lastUpdatedTimestamp) {
		this.lastUpdatedTimestamp = lastUpdatedTimestamp;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public String getHealthCheckUrl() {
		return healthCheckUrl;
	}

	public void setHealthCheckUrl(String healthCheckUrl) {
		this.healthCheckUrl = healthCheckUrl;
	}

	public String getStatusPageUrl() {
		return statusPageUrl;
	}

	public void setStatusPageUrl(String statusPageUrl) {
		this.statusPageUrl = statusPageUrl;
	}

	public String getVipAddress() {
		return vipAddress;
	}

	public void setVipAddress(String vipAddress) {
		this.vipAddress = vipAddress;
	}

	public String getSecureVipAddress() {
		return secureVipAddress;
	}

	public void setSecureVipAddress(String secureVipAddress) {
		this.secureVipAddress = secureVipAddress;
	}

	public LeaseInfo getLeaseInfo() {
		return leaseInfo;
	}

	public void setLeaseInfo(LeaseInfo leaseInfo) {
		this.leaseInfo = leaseInfo;
	}

	public String getLastDirtyTimestamp() {
		return lastDirtyTimestamp;
	}

	public void setLastDirtyTimestamp(String lastDirtyTimestamp) {
		this.lastDirtyTimestamp = lastDirtyTimestamp;
	}

	public String getHomePageUrl() {
		return homePageUrl;
	}

	public void setHomePageUrl(String homePageUrl) {
		this.homePageUrl = homePageUrl;
	}

	public String getIpAddr() {
		return ipAddr;
	}

	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getIsCoordinatingDiscoveryServer() {
		return isCoordinatingDiscoveryServer;
	}

	public void setIsCoordinatingDiscoveryServer(String isCoordinatingDiscoveryServer) {
		this.isCoordinatingDiscoveryServer = isCoordinatingDiscoveryServer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Port getPort() {
		return port;
	}

	public void setPort(Port port) {
		this.port = port;
	}

}