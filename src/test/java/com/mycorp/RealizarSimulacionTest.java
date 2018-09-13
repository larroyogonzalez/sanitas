package com.mycorp;

import org.junit.Test;

import com.mycorp.support.Ticket;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class RealizarSimulacionTest extends TestCase {

	private String url = "url";
	private String username = "username";
	private String password = "passw";
	private String token = "token";

	@Test
	public void testZendesk() {
		Zendesk zendesk = null;
		assertNull(zendesk);
	}

	@Test
	public void testSetUsername() {
		Builder builder = new Builder(url);
		builder.setUsername(username);
		assertEquals(username, builder.getUsername());
	}

	@Test
	public void testSetPassword() {
		Builder builder = new Builder(url);
		builder.setPassword(password);
		assertEquals(password, builder.getPassword());
	}

	@Test
	public void testSetToken() {
		Builder builder = new Builder(url);
		builder.setToken(token);
		assertEquals(token, builder.getToken());
	}

	@Test
	public void testBuild() {
		Builder builder = new Builder(url);
		Zendesk zendesk = builder.setUsername(username).setPassword(password).setToken(token).build();
		assertNotNull(zendesk);
		zendesk = builder.setUsername(username).setPassword(password).setToken(null).build();
		assertNotNull(zendesk);
	}

	@Test
	public void testCreateTicket() {
		Builder builder = new Builder(url);
		Zendesk zendesk = builder.setUsername(username).setPassword(password).setToken(token).build();
		Ticket ticket = zendesk.createTicket(new Ticket());
		assertNotNull(ticket);
	}

}
