package com.crps.contato.ws.contato.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crps.contato.ws.contato.dao.ContatoDAO;
import com.crps.contato.ws.contato.model.Contato;

@RestController
public class ContatoController {

	@Autowired
	private ContatoDAO dao;
	
	@RequestMapping(method = RequestMethod.GET, value = "/contatos")
	public List<Contato> buscarContatos() {
		
		return dao.buscarTodos();
	}
	
	@GetMapping("/contatos/{telefone}")
	public Contato buscarContato (@PathVariable String telefone) {
		
		return dao.buscar(telefone);
	}
	
	@PostMapping("/contatos")
	public Contato cadastrar (@RequestBody Contato contato) {
		
		return dao.cadastrar(contato);
	}
}
