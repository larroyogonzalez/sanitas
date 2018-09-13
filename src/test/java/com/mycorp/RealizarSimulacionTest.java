package com.mycorp;

import org.junit.Test;

import com.mycorp.support.Ticket;
import com.ning.http.client.AsyncHttpClient;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class RealizarSimulacionTest extends TestCase {

	private AsyncHttpClient client;
	private String password = "";
	private String token = "";
	private String url = "";
	private String username = "";

	/**
	 * Rigourous Test :-)
	 */
	@Test
	public void testApp() {
		assertTrue(true);
	}

	@Test
	public void testBuild() {
		Builder builder = new Builder("");
		Zendesk zendesk = builder.setUsername(username).setPassword(password).setToken(token).build();

		assertNotNull(zendesk);

		zendesk = builder.setUsername(username).setPassword(password).setToken(null).build();
		assertNotNull(zendesk);
	}

	@Test
	public void testCreateTicket() {
		Builder builder = new Builder("");
		Zendesk zendesk = builder.setUsername(username).setPassword(password).setToken(token).build();
		zendesk.createTicket(new Ticket());
		assertTrue(true);
	}

	@Test
	public void testSetPassword() {
		Builder builder = new Builder("");
		builder.setPassword(password);
		assertEquals(password, builder.getPassword());
	}

	@Test
	public void testSetToken() {
		Builder builder = new Builder("");
		builder.setToken(token);
		assertEquals(token, builder.getToken());
	}

	@Test
	public void testSetUsername() {
		Builder builder = new Builder("");
		builder.setUsername(username);
		assertEquals(username, builder.getUsername());
	}

	@Test
	public void testZendesk() {
		Zendesk zendesk = null;
		assertNull(zendesk);
	}
}
