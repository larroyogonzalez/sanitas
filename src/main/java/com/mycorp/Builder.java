package com.mycorp;

import com.ning.http.client.AsyncHttpClient;

public final class Builder {
	private static AsyncHttpClient client = null;
	private String oauthToken = null;
	private String password = null;
	private String token = null;
	private String url;
	private String username = null;

	public Builder(String url) {
		this.url = url;
	}

	public Zendesk build() {
		if (token != null) {
			return new Zendesk(client, url, username + "/token", token);
		}
		return new Zendesk(client, url, username, password);
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	public Builder setPassword(String password) {
		this.password = password;
		if (password != null) {
			this.token = null;
			this.oauthToken = null;
		}
		return this;
	}

	public Builder setToken(String token) {
		this.token = token;
		if (token != null) {
			this.password = null;
			this.oauthToken = null;
		}
		return this;
	}

	public Builder setUsername(String username) {
		this.username = username;
		return this;
	}

}