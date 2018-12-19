package com.crps.contato.ws.contato.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crps.contato.ws.contato.model.Contato;

@RestController
public class ContatoController {

	@RequestMapping(method = RequestMethod.GET, value = "/contato")
	public Contato buscarContato() {
		
		Contato contato = new Contato();
		contato.setCpf("07522735408");
		contato.setNome("Carlos Romano");
		
		return contato;
	}
}
