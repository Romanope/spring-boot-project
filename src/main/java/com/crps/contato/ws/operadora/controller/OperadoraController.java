package com.crps.contato.ws.operadora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crps.contato.ws.operadora.dao.OperadoraDAO;
import com.crps.contato.ws.operadora.model.Operadora;

@RestController
public class OperadoraController {

	@Autowired
	private OperadoraDAO dao;
	
	@GetMapping("/operadoras")
	public List<Operadora> buscarOperadoras () {
		
		return dao.buscarOperadoras();
	}
	
	@GetMapping("/operadoras/{codigo}")
	public Operadora buscarOperadora (@PathVariable String codigo) {
		
		return dao.buscarOperadora(codigo);
	}
	
	@PostMapping("/operadoras")
	public Operadora cadastrar (Operadora operadora) {
		
		return dao.cadastrar(operadora);
	}
}
