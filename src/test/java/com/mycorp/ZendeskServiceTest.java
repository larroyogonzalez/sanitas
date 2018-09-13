package com.mycorp;

import org.junit.Test;

import junit.framework.TestCase;
import util.datos.UsuarioAlta;

public class ZendeskServiceTest extends TestCase {

	// TODO: explicar esto
	@Test(expected = NumberFormatException.class)
	public void testAltaTicketZendesk() {
		ZendeskService zenService = new ZendeskService();
		UsuarioAlta usuarioAlta = new UsuarioAlta();
		String userAgent = "correo@mail.com";
		zenService.altaTicketZendesk(usuarioAlta, userAgent);
	}

	// TODO: explicar esto
	@Test(expected = NumberFormatException.class)
	public void testAltaTicketZendeskConNumTarjeta() {
		ZendeskService zenService = new ZendeskService();
		UsuarioAlta usuarioAlta = new UsuarioAlta();
		usuarioAlta.setEmail("correo@mail.com");
		String userAgent = "correo@mail.com";
		usuarioAlta.setNumTarjeta("123");
		zenService.altaTicketZendesk(usuarioAlta, userAgent);
	}

	// TODO: explicar esto
	@Test(expected = NumberFormatException.class)
	public void testAltaTicketZendeskConNumPoliza() {
		ZendeskService zenService = new ZendeskService();
		UsuarioAlta usuarioAlta = new UsuarioAlta();
		usuarioAlta.setEmail("correo@mail.com");
		String userAgent = "correo@mail.com";		
		usuarioAlta.setNumPoliza("1234");
		usuarioAlta.setNumDocAcreditativo("1234");        
		zenService.altaTicketZendesk(usuarioAlta, userAgent);
	}

}
