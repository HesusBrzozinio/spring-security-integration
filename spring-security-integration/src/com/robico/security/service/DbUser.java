package com.robico.security.service;

/**
 * User domain
 */
public class DbUser {

	/**
	 * The username
	 */
	private String username;

	/**
	 * The password as an MD5 value
	 */
	private String password;

	/**
	 * Access level of the user. 1 = Admin user 2 = Regular user
	 */
	private Integer access;

	public String getUsername() {
		return username;
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public Integer getAccess() {
		return access;
	}

	public void setAccess(final Integer access) {
		this.access = access;
	}
}