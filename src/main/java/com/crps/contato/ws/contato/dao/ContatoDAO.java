package com.crps.contato.ws.contato.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.crps.contato.ws.contato.model.Contato;
import com.crps.contato.ws.operadora.model.Operadora;

@Repository
public class ContatoDAO {

	private static Map<String, Contato> contatos;
	
	static {
		contatos = new HashMap<>();
		
		Contato contato = new Contato();
		contato.setNome("Maria da Silva");
		contato.setTelefone("3333-3333");
		contato.setOperadora(Operadora.TIM);
		contato.setData(Calendar.getInstance().getTime());
		contatos.put(contato.getTelefone(), contato);

		contato = new Contato();
		contato.setNome("João da Silva");
		contato.setTelefone("2222-2222");
		contato.setOperadora(Operadora.CLARO);
		contato.setData(Calendar.getInstance().getTime());
		contatos.put(contato.getTelefone(), contato);

		contato = new Contato();
		contato.setNome("Rosa Maria");
		contato.setTelefone("1111-1111");
		contato.setOperadora(Operadora.EMBRATEL);
		contato.setData(Calendar.getInstance().getTime());
		contatos.put(contato.getTelefone(), contato);
	}
	
	public List<Contato> buscarTodos() {
		
		return new ArrayList<>(contatos.values());
	}
	
	public Contato buscar (String telefone) {
		
		return contatos.get(telefone);
	}
	
	public Contato cadastrar (Contato contato) {
		
		contatos.put(contato.getTelefone(), contato);
		
		return contatos.get(contato.getTelefone());
	}
}
