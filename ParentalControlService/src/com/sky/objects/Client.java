package com.sky.objects;

public class Client {
	private String clientId;
	private String parentalLevel;

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getParentalLevel() {
		
	
		return parentalLevel;
	}

	public void setParentalLevel(String parentalLevel) {
		this.parentalLevel = parentalLevel;
	}

	public Client createClient(String clientId, String parentalLevel) {

		this.clientId = clientId;
		this.parentalLevel = parentalLevel;
		return this;
	}

}
