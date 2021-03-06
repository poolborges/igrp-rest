package igrp.oauth2.util;
/**
 * Iekiny Marcel
 * Jan 23, 2018
 */
public enum Scope {

	LOGIN("login", "Description of the scope"),
	SESSION_READ("session:read", "Description of the scope"),
	
	USER_WRITE("user:write", "Description of the scope"),
	USER_READ("user:read", "Description of the scope");
	
	private String value;
	private String description;
	
	Scope(){}
	
	Scope(String value, String description){
		this.value = value;
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public String getValue() {
		return this.value;
	}
	
	public String toString() {
		return this.value;
	}
	
}
